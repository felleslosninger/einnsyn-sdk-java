// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

public class ErrorResponse extends Exception {
  protected String type = "eInnsynException";

  protected String message;

  public String getType() {
    return type;
  }

  public String getMessage() {
    return message;
  }

  public ErrorResponse(String message, Throwable cause, String type) {
    super(message, cause);
    this.type = type;
  }

  public ErrorResponse(ErrorResponse.DTO object) {
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
