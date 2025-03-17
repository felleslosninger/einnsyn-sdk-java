// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

public class ConflictException extends EInnsynException {

  public String getType() {
    return type;
  }

  public ConflictException(String message, Throwable cause) {
    super(message, cause, "conflict");
  }

  public ConflictException(ConflictException.DTO object) {
    super(object);
  }

  public static class DTO extends EInnsynException.DTO {

    public String getType() {
      return type;
    }
  }
}
