// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

public class EInnsynException extends Exception {
  protected String type = "eInnsynException";

  public String getType() {
    return type;
  }

  public EInnsynException(String message, Throwable cause, String type) {
    super(message, cause);
    this.type = type;
  }

  public EInnsynException(EInnsynException.DTO object) {
    super(object.getMessage());
    this.type = object.getType();
  }

  public static class DTO {
    protected String type = "eInnsynException";

    protected String message;

    public String getType() {
      return type;
    }

    public String getMessage() {
      return message;
    }
  }
}
