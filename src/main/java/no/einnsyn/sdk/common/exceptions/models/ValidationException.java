// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.exceptions.models;

import java.util.List;

public class ValidationException extends EInnsynException {
  protected List<FieldError> fieldError;

  public String getType() {
    return type;
  }

  public List<FieldError> getFieldError() {
    return fieldError;
  }

  public ValidationException(String message, Throwable cause, List<FieldError> fieldError) {
    super(message, cause, "validationError");
    this.fieldError = fieldError;
  }

  public ValidationException(ValidationException.DTO object) {
    super(object);
    this.fieldError = object.getFieldError();
  }

  public static class FieldError {
    protected String fieldName;

    protected String value;

    protected String message;

    public String getFieldName() {
      return fieldName;
    }

    public String getValue() {
      return value;
    }

    public String getMessage() {
      return message;
    }
  }

  public static class DTO extends EInnsynException.DTO {
    protected List<FieldError> fieldError;

    public String getType() {
      return type;
    }

    public List<FieldError> getFieldError() {
      return fieldError;
    }
  }
}
