// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.bruker.models;

import java.util.function.Function;
import no.einnsyn.sdk.entities.base.models.BaseRequest;

/** eInnsyn bruker */
public class BrukerRequest extends BaseRequest {
  protected String email;

  protected String password;

  protected LanguageEnum language;

  public BrukerRequest(
      String externalId,
      String accessibleAfter,
      String email,
      String password,
      LanguageEnum language) {
    super(externalId, accessibleAfter);
    this.email = email;
    this.password = password;
    this.language = language;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public LanguageEnum getLanguage() {
    return language;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static BrukerRequest of(Function<Builder, Builder> builderFunction) {
    return builderFunction.apply(new Builder()).build();
  }

  public static class Builder {
    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     */
    protected String externalId;

    /** This object should not be accessible to the public before the given dateTime. */
    protected String accessibleAfter;

    protected String email;

    protected String password;

    protected LanguageEnum language;

    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     */
    public String getExternalId() {
      return externalId;
    }

    /** This object should not be accessible to the public before the given dateTime. */
    public String getAccessibleAfter() {
      return accessibleAfter;
    }

    public String getEmail() {
      return email;
    }

    public String getPassword() {
      return password;
    }

    public LanguageEnum getLanguage() {
      return language;
    }

    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    /** This object should not be accessible to the public before the given dateTime. */
    public Builder accessibleAfter(String accessibleAfter) {
      this.accessibleAfter = accessibleAfter;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder password(String password) {
      this.password = password;
      return this;
    }

    public Builder language(LanguageEnum language) {
      this.language = language;
      return this;
    }

    public BrukerRequest build() {
      return new BrukerRequest(
          this.externalId, this.accessibleAfter, this.email, this.password, this.language);
    }
  }
}
