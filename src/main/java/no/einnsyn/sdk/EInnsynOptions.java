package no.einnsyn.sdk;

import java.util.function.Function;

public class EInnsynOptions {
  private final String apiKey;
  private final String baseUrl;
  private final String actingAs;
  private final Integer connectTimeout;
  private final Integer maxNetworkRetries;
  private final Integer networkRetryDelay;
  private final String appInfo;

  public final String getApiKey() {
    return apiKey;
  }

  public final String getBaseUrl() {
    return baseUrl;
  }

  public final String getActingAs() {
    return actingAs;
  }

  public final Integer getConnectTimeout() {
    return connectTimeout;
  }

  public final Integer getMaxNetworkRetries() {
    return maxNetworkRetries;
  }

  public final Integer getNetworkRetryDelay() {
    return networkRetryDelay;
  }

  public final String getAppInfo() {
    return appInfo;
  }

  public static final Builder builder() {
    return new EInnsynOptions.Builder();
  }

  public static final EInnsynOptions of(
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> options) {
    return options.apply(new EInnsynOptions.Builder()).build();
  }

  public static final EInnsynOptions of(EInnsynOptions... options) {
    EInnsynOptions.Builder builder = new EInnsynOptions.Builder();
    for (EInnsynOptions option : options) {
      if (option.getApiKey() != null) builder.apiKey(option.getApiKey());
      if (option.getBaseUrl() != null) builder.baseUrl(option.getBaseUrl());
      if (option.getActingAs() != null) builder.actingAs(option.getActingAs());
      if (option.getConnectTimeout() != null) builder.connectTimeout(option.getConnectTimeout());
      if (option.getMaxNetworkRetries() != null)
        builder.maxNetworkRetries(option.getMaxNetworkRetries());
      if (option.getNetworkRetryDelay() != null)
        builder.networkRetryDelay(option.getNetworkRetryDelay());
      if (option.getAppInfo() != null) builder.appInfo(option.getAppInfo());
    }
    return builder.build();
  }

  public EInnsynOptions(
      String apiKey,
      String baseUrl,
      String actingAs,
      Integer connectTimeout,
      Integer maxNetworkRetries,
      Integer networkRetryDelay,
      String appInfo) {
    this.apiKey = apiKey;
    this.baseUrl = baseUrl;
    this.actingAs = actingAs;
    this.connectTimeout = connectTimeout;
    this.maxNetworkRetries = maxNetworkRetries;
    this.networkRetryDelay = networkRetryDelay;
    this.appInfo = appInfo;
  }

  public static class Builder {
    private String apiKey;
    private String baseUrl;
    private String actingAs;
    private Integer connectTimeout;
    private Integer maxNetworkRetries;
    private Integer networkRetryDelay;
    private String appInfo;

    public Builder() {}

    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    public Builder baseUrl(String baseUrl) {
      this.baseUrl = baseUrl;
      return this;
    }

    public Builder actingAs(String actingAs) {
      this.actingAs = actingAs;
      return this;
    }

    public Builder connectTimeout(Integer connectTimeout) {
      this.connectTimeout = connectTimeout;
      return this;
    }

    public Builder maxNetworkRetries(Integer maxNetworkRetries) {
      this.maxNetworkRetries = maxNetworkRetries;
      return this;
    }

    public Builder networkRetryDelay(Integer networkRetryDelay) {
      this.networkRetryDelay = networkRetryDelay;
      return this;
    }

    public Builder appInfo(String appInfo) {
      this.appInfo = appInfo;
      return this;
    }

    public EInnsynOptions build() {
      return new EInnsynOptions(
          apiKey, baseUrl, actingAs, connectTimeout, maxNetworkRetries, networkRetryDelay, appInfo);
    }
  }
}
