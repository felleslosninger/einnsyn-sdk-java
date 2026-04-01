// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

public class TooManyRequestsException extends EInnsynException {

  public String getType() {
    return type;
  }

  public TooManyRequestsException(String message, Throwable cause) {
    super(message, cause, "tooManyRequests");
  }

  public TooManyRequestsException(TooManyRequestsException.DTO object) {
    super(object);
  }

  public static class DTO extends EInnsynException.DTO {

    public String getType() {
      return type;
    }
  }
}
