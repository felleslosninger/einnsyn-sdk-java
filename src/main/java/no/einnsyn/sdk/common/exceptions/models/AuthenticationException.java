// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

public class AuthenticationException extends EInnsynException {

  public String getType() {
    return type;
  }

  public AuthenticationException(String message, Throwable cause) {
    super(message, cause, "authenticationError");
  }

  public AuthenticationException(AuthenticationException.DTO object) {
    super(object);
  }

  public static class DTO extends EInnsynException.DTO {

    public String getType() {
      return type;
    }
  }
}
