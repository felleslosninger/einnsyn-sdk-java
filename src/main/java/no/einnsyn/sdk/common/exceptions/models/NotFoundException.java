// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

public class NotFoundException extends EInnsynException {

  public String getType() {
    return type;
  }

  public NotFoundException(String message, Throwable cause) {
    super(message, cause, "notFound");
  }

  public NotFoundException(NotFoundException.DTO object) {
    super(object);
  }

  public static class DTO extends EInnsynException.DTO {

    public String getType() {
      return type;
    }
  }
}
