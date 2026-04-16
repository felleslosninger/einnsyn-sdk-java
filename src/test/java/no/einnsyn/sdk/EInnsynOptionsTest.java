package no.einnsyn.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class EInnsynOptionsTest {

  @Test
  void builderStoresConfiguredValues() {
    EInnsynOptions options =
        EInnsynOptions.builder()
            .apiKey("secret")
            .baseUrl("https://example.com")
            .actingAs("enh_123")
            .connectTimeout(5)
            .maxNetworkRetries(7)
            .networkRetryDelay(200)
            .appInfo("Test App")
            .build();

    assertEquals("secret", options.getApiKey());
    assertEquals("https://example.com", options.getBaseUrl());
    assertEquals("enh_123", options.getActingAs());
    assertEquals(Integer.valueOf(5), options.getConnectTimeout());
    assertEquals(Integer.valueOf(7), options.getMaxNetworkRetries());
    assertEquals(Integer.valueOf(200), options.getNetworkRetryDelay());
    assertEquals("Test App", options.getAppInfo());
  }

  @Test
  void ofMergesOptionsAndLetsLaterValuesOverrideEarlierOnes() {
    EInnsynOptions merged =
        EInnsynOptions.of(
            EInnsynOptions.builder()
                .apiKey("first-secret")
                .baseUrl("https://first.test")
                .maxNetworkRetries(1)
                .build(),
            EInnsynOptions.builder().baseUrl("https://second.test").appInfo("Test App").build(),
            EInnsynOptions.builder().apiKey("last-secret").networkRetryDelay(500).build());

    assertEquals("last-secret", merged.getApiKey());
    assertEquals("https://second.test", merged.getBaseUrl());
    assertEquals(Integer.valueOf(1), merged.getMaxNetworkRetries());
    assertEquals(Integer.valueOf(500), merged.getNetworkRetryDelay());
    assertEquals("Test App", merged.getAppInfo());
    assertNull(merged.getActingAs());
  }
}
