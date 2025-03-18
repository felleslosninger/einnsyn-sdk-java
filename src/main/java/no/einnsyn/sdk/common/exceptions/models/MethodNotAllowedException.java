// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

public class MethodNotAllowedException extends EInnsynException {

  public String getType() {
    return type;
  }

  public MethodNotAllowedException(String message, Throwable cause) {
    super(message, cause, "methodNotAllowed");
  }

  public MethodNotAllowedException(MethodNotAllowedException.DTO object) {
    super(object);
  }

  public static class DTO extends EInnsynException.DTO {

    public String getType() {
      return type;
    }
  }
}
