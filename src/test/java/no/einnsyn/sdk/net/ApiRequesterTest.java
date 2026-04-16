package no.einnsyn.sdk.net;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;
import java.net.http.HttpRequest;
import no.einnsyn.sdk.EInnsynClient;
import no.einnsyn.sdk.EInnsynOptions;
import org.junit.jupiter.api.Test;

class ApiRequesterTest {

  @Test
  void shouldRetryOnlyRetryableFailures() {
    ApiRequester requester = new ApiRequester(EInnsynOptions.builder().build());

    assertTrue(requester.shouldRetry(ApiRequestMethod.GET, new RuntimeException("error"), -1));
    assertFalse(requester.shouldRetry(ApiRequestMethod.POST, new RuntimeException("error"), -1));
    assertTrue(requester.shouldRetry(ApiRequestMethod.POST, null, 429));
    assertTrue(requester.shouldRetry(ApiRequestMethod.POST, null, 503));
    assertFalse(requester.shouldRetry(ApiRequestMethod.GET, null, 404));
    assertFalse(requester.shouldRetry(ApiRequestMethod.GET, null, 200));
  }

  @Test
  void setRequestHeadersUsesDefaultUserAgentWhenAppInfoIsMissing() {
    ApiRequester requester = new ApiRequester(EInnsynOptions.builder().build());
    HttpRequest.Builder requestBuilder =
        HttpRequest.newBuilder().uri(URI.create("https://example.com"));
    EInnsynOptions.Builder optionsBuilder =
        EInnsynOptions.builder().apiKey("secret").actingAs("enh_123");

    requester.setRequestHeaders(requestBuilder, optionsBuilder.build());

    HttpRequest request = requestBuilder.build();
    assertEquals("application/json", header(request, "Accept"));
    assertEquals("application/json", header(request, "Content-Type"));
    assertEquals("secret", header(request, "API-KEY"));
    assertEquals("enh_123", header(request, "ACTING-AS"));
    assertEquals("eInnsyn Java Client " + EInnsynClient.VERSION, header(request, "User-Agent"));
  }

  @Test
  void setRequestHeadersPrefixesUserAgentWhenAppInfoIsProvided() {
    ApiRequester requester = new ApiRequester(EInnsynOptions.builder().build());
    HttpRequest.Builder builder = HttpRequest.newBuilder().uri(URI.create("https://example.com"));

    requester.setRequestHeaders(builder, EInnsynOptions.builder().appInfo("Test App").build());

    HttpRequest request = builder.build();
    assertEquals(
        "Test App - eInnsyn Java Client " + EInnsynClient.VERSION, header(request, "User-Agent"));
    assertFalse(request.headers().firstValue("API-KEY").isPresent());
  }

  private static String header(HttpRequest request, String name) {
    return request.headers().firstValue(name).orElseThrow();
  }
}
