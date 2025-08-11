// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.authinfo.models;

import java.util.function.Function;

public class AuthInfoResponse {
  protected final String entity = "AuthInfo";

  protected AuthTypeEnum authType;

  protected TypeEnum type;

  protected String id;

  protected String orgnummer;

  protected String email;

  public AuthInfoResponse() {
    super();
  }

  public String getEntity() {
    return entity;
  }

  public AuthTypeEnum getAuthType() {
    return authType;
  }

  public TypeEnum getType() {
    return type;
  }

  public String getId() {
    return id;
  }

  public String getOrgnummer() {
    return orgnummer;
  }

  public String getEmail() {
    return email;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AuthInfoResponse of(Function<Builder, Builder> builderFunction) {
    return builderFunction.apply(new Builder()).build();
  }

  public static class Builder {

    public AuthInfoResponse build() {
      return new AuthInfoResponse();
    }
  }
}
