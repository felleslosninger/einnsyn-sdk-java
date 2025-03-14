package no.einnsyn.sdk.net;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import no.einnsyn.sdk.EInnsynClient;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.exceptions.models.AuthenticationException;
import no.einnsyn.sdk.common.exceptions.models.AuthorizationException;
import no.einnsyn.sdk.common.exceptions.models.BadRequestException;
import no.einnsyn.sdk.common.exceptions.models.ConflictException;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.exceptions.models.InternalServerErrorException;
import no.einnsyn.sdk.common.exceptions.models.NetworkException;
import no.einnsyn.sdk.common.exceptions.models.NotFoundException;
import no.einnsyn.sdk.common.exceptions.models.ValidationException;
import no.einnsyn.sdk.net.parsing.ExpandableFieldTypeAdapterFactory;
import no.einnsyn.sdk.net.parsing.PaginatedListTypeAdapterFactory;
import no.einnsyn.sdk.net.parsing.ResourceTypeAdapterFactory;
import no.einnsyn.sdk.utils.QuerystringSerializer;

public class ApiRequester {

  private final Gson gson;
  private final Gson gsonPretty;
  private final HttpClient httpClient;

  private final EInnsynOptions defaultOptions =
      new EInnsynOptions(null, "https://api.einnsyn.no", null, null, 3, 1000, null);
  private final EInnsynOptions clientOptions;

  public ApiRequester(EInnsynOptions clientOptions) {
    this.clientOptions = EInnsynOptions.of(defaultOptions, clientOptions);
    this.gson = createGson(this, false);
    this.gsonPretty = createGson(this, true);

    HttpClient.Builder clientBuilder = HttpClient.newBuilder();

    Integer connectTimeout = clientOptions.getConnectTimeout();
    if (connectTimeout != null) {
      clientBuilder.connectTimeout(Duration.ofSeconds(connectTimeout));
    }

    this.httpClient = clientBuilder.build();
  }

  public <T> T request(
      ApiRequestMethod requestMethod,
      String url,
      Object query,
      Object body,
      EInnsynOptions requestOptions,
      Type type)
      throws EInnsynException {

    EInnsynOptions options =
        requestOptions != null ? EInnsynOptions.of(clientOptions, requestOptions) : clientOptions;
    String baseUrl = options.getBaseUrl();
    String querystring = QuerystringSerializer.serialize(query);
    String bodyString = serialize(body);
    String requestUrl = baseUrl + url + querystring;
    Integer maxNetworkRetries = options.getMaxNetworkRetries();
    Integer networkRetryDelay = options.getNetworkRetryDelay();

    String responseBody = null;
    int responseCode = -1;
    Exception requestException = null;

    for (int retry = 0; retry < maxNetworkRetries; retry++) {
      requestException = null;
      responseBody = null;
      responseCode = -1;
      try {
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder().uri(new URI(requestUrl));
        setRequestHeaders(requestBuilder, options);
        setRequestMethod(requestBuilder, requestMethod, bodyString);
        HttpRequest request = requestBuilder.build();
        HttpResponse<String> response =
            httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        responseCode = response.statusCode();
        responseBody = response.body();
        requestException = null;
      } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        throw new NetworkException("Request was interrupted", ie, baseUrl);
      } catch (Exception e) {
        requestException = e;
      }

      if (!shouldRetry(requestMethod, requestException, responseCode)) {
        break;
      }

      try {
        Thread.sleep(networkRetryDelay);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }

    if (requestException != null) {
      throw new NetworkException("Failed to send request", requestException, baseUrl);
    }

    // Handle error responses
    if (responseCode >= 400) {
      try {
        JsonElement responseException = deserialize(responseBody, JsonElement.class);
        String exceptionType = responseException.getAsJsonObject().get("type").getAsString();
        // Parsed exceptions will not be Throwable instances
        switch (exceptionType) {
          case "authenticationError":
            throw new AuthenticationException(
                deserialize(responseBody, AuthenticationException.DTO.class));
          case "authorizationError":
            throw new AuthorizationException(
                deserialize(responseBody, AuthorizationException.DTO.class));
          case "badRequest":
            throw new BadRequestException(deserialize(responseBody, BadRequestException.DTO.class));
          case "conflict":
            throw new ConflictException(deserialize(responseBody, ConflictException.DTO.class));
          case "internalServerError":
            throw new InternalServerErrorException(
                deserialize(responseBody, InternalServerErrorException.DTO.class));
          case "networkError":
            throw new NetworkException(deserialize(responseBody, NetworkException.DTO.class));
          case "notFound":
            throw new NotFoundException(deserialize(responseBody, NotFoundException.DTO.class));
          case "validationError":
            throw new ValidationException(deserialize(responseBody, ValidationException.DTO.class));
        }
        throw new EInnsynException("An unknown error occurred", null, null);
      } catch (JsonSyntaxException e) {
        throw new EInnsynException("Failed to parse error response", e, null);
      } catch (NullPointerException e) {
        throw new EInnsynException("Failed to parse error response", e, null);
      }
    }

    // Parse JSON
    try {
      return gson.fromJson(responseBody, type);
    } catch (Exception e) {
      throw new EInnsynException("Failed to parse response", e, null);
    }
  }

  boolean shouldRetry(ApiRequestMethod method, Exception exception, int responseCode) {
    // Retry after rate limit
    if (responseCode == 429) {
      return true;
    }

    // Retry all server errors
    if (responseCode >= 500) {
      return true;
    }

    // Bad request, don't retry
    if (responseCode >= 400) {
      return false;
    }

    // Retry GET requests, and requests without a valid response code
    if (responseCode < 200 || (exception != null && method == ApiRequestMethod.GET)) {
      return true;
    }

    return false;
  }

  void setRequestHeaders(HttpRequest.Builder requestBuilder, EInnsynOptions options) {
    String apiKey = options.getApiKey();
    String actingAs = options.getActingAs();
    String appInfo = options.getAppInfo();

    requestBuilder.header("Accept", "application/json");
    requestBuilder.header("Content-Type", "application/json");
    if (apiKey != null) {
      requestBuilder.header("API-KEY", apiKey);
    }
    if (actingAs != null) {
      requestBuilder.header("ACTING-AS", actingAs);
    }
    if (appInfo != null && appInfo.isEmpty()) {
      requestBuilder.header("User-Agent", "eInnsyn Java Client " + EInnsynClient.VERSION);
    } else {
      requestBuilder.header(
          "User-Agent", appInfo + " - eInnsyn Java Client " + EInnsynClient.VERSION);
    }
  }

  void setRequestMethod(HttpRequest.Builder requestBuilder, ApiRequestMethod method, String body) {
    switch (method) {
      case GET:
        requestBuilder.GET();
        break;
      case POST:
        requestBuilder.POST(HttpRequest.BodyPublishers.ofString(body));
        break;
      case PATCH:
        requestBuilder.method("PATCH", HttpRequest.BodyPublishers.ofString(body));
        break;
      case DELETE:
        requestBuilder.DELETE();
        break;
      default:
        throw new IllegalArgumentException("Unknown request method: " + method);
    }
  }

  public String serialize(Object object) {
    return serialize(object, false);
  }

  public String serialize(Object object, boolean prettyPrint) {
    return prettyPrint ? gsonPretty.toJson(object) : gson.toJson(object);
  }

  public <T> T deserialize(String json, Type type) {
    return gson.fromJson(json, type);
  }

  private static Gson createGson(ApiRequester requester, boolean prettyPrint) {
    GsonBuilder gsonBuilder = new GsonBuilder();

    gsonBuilder.registerTypeAdapterFactory(new PaginatedListTypeAdapterFactory());
    gsonBuilder.registerTypeAdapterFactory(new ExpandableFieldTypeAdapterFactory());

    // The last bound TypeAdapter is executed first
    gsonBuilder.registerTypeAdapterFactory(new ResourceTypeAdapterFactory(requester));

    if (prettyPrint) {
      gsonBuilder.setPrettyPrinting();
    }

    return gsonBuilder.create();
  }

  public Gson getGson() {
    return gson;
  }
}
