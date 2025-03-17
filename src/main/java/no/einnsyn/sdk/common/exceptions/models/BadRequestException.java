// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

public class BadRequestException extends EInnsynException {

  public String getType() {
    return type;
  }

  public BadRequestException(String message, Throwable cause) {
    super(message, cause, "badRequest");
  }

  public BadRequestException(BadRequestException.DTO object) {
    super(object);
  }

  public static class DTO extends EInnsynException.DTO {

    public String getType() {
      return type;
    }
  }
}
