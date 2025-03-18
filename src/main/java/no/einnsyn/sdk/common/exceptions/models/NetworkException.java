// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

public class NetworkException extends EInnsynException {
  protected String baseUrl;

  public String getType() {
    return type;
  }

  public String getBaseUrl() {
    return baseUrl;
  }

  public NetworkException(String message, Throwable cause, String baseUrl) {
    super(message, cause, "networkError");
    this.baseUrl = baseUrl;
  }

  public NetworkException(NetworkException.DTO object) {
    super(object);
    this.baseUrl = object.getBaseUrl();
  }

  public static class DTO extends EInnsynException.DTO {
    protected String baseUrl;

    public String getType() {
      return type;
    }

    public String getBaseUrl() {
      return baseUrl;
    }
  }
}
