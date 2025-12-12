// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

public class TooManyUnverifiedOrdersException extends EInnsynException {

  public String getType() {
    return type;
  }

  public TooManyUnverifiedOrdersException(String message, Throwable cause) {
    super(message, cause, "tooManyUnverifiedOrders");
  }

  public TooManyUnverifiedOrdersException(TooManyUnverifiedOrdersException.DTO object) {
    super(object);
  }

  public static class DTO extends EInnsynException.DTO {

    public String getType() {
      return type;
    }
  }
}
