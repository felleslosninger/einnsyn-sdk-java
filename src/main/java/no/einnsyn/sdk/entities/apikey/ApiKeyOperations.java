// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.apikey;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.apikey.models.ApiKey;
import no.einnsyn.sdk.entities.apikey.models.ApiKeyRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class ApiKeyOperations extends ApiEntityOperations<ApiKey, ApiKeyRequest> {

  public ApiKeyOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<ApiKey> list() throws EInnsynException {
    String url = "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<ApiKey>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<ApiKey> list(EInnsynOptions options) throws EInnsynException {
    String url = "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<ApiKey>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<ApiKey> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<ApiKey>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<ApiKey> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<ApiKey>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<ApiKey> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<ApiKey>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<ApiKey> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<ApiKey>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public ApiKey delete(String id) throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public ApiKey delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public ApiKey delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public ApiKey get(String id) throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public ApiKey get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public ApiKey get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public ApiKey get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public ApiKey get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public ApiKey get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public ApiKey update(String id, ApiKeyRequest body) throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public ApiKey update(
      String id, Function<ApiKeyRequest.Builder, ApiKeyRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ApiKeyRequest.Builder()).build(),
        null,
        type);
  }

  public ApiKey update(String id, ApiKeyRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public ApiKey update(
      String id,
      Function<ApiKeyRequest.Builder, ApiKeyRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/apiKey/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ApiKeyRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
