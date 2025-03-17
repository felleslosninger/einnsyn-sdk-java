// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

public class AuthorizationException extends EInnsynException {

  public String getType() {
    return type;
  }

  public AuthorizationException(String message, Throwable cause) {
    super(message, cause, "authorizationError");
  }

  public AuthorizationException(AuthorizationException.DTO object) {
    super(object);
  }

  public static class DTO extends EInnsynException.DTO {

    public String getType() {
      return type;
    }
  }
}
