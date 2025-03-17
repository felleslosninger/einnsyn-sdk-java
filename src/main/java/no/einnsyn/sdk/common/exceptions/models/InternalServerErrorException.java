// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

public class InternalServerErrorException extends EInnsynException {

  public String getType() {
    return type;
  }

  public InternalServerErrorException(String message, Throwable cause) {
    super(message, cause, "internalServerError");
  }

  public InternalServerErrorException(InternalServerErrorException.DTO object) {
    super(object);
  }

  public static class DTO extends EInnsynException.DTO {

    public String getType() {
      return type;
    }
  }
}
