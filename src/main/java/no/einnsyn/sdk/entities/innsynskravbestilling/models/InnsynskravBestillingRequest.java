// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.innsynskravbestilling.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.BaseRequest;
import no.einnsyn.sdk.entities.innsynskrav.models.InnsynskravRequest;

/** Innsynskrav */
public class InnsynskravBestillingRequest extends BaseRequest {
  protected String email;

  protected List<ExpandableField<InnsynskravRequest>> innsynskrav;

  protected LanguageEnum language;

  public InnsynskravBestillingRequest(
      String externalId,
      String accessibleAfter,
      String email,
      List<ExpandableField<InnsynskravRequest>> innsynskrav,
      LanguageEnum language) {
    super(externalId, accessibleAfter);
    this.email = email;
    this.innsynskrav = innsynskrav;
    this.language = language;
  }

  public String getEmail() {
    return email;
  }

  public List<ExpandableField<InnsynskravRequest>> getInnsynskrav() {
    return innsynskrav;
  }

  public LanguageEnum getLanguage() {
    return language;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static InnsynskravBestillingRequest of(Function<Builder, Builder> builderFunction) {
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

    protected List<ExpandableField<InnsynskravRequest>> innsynskrav;

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

    public List<ExpandableField<InnsynskravRequest>> getInnsynskrav() {
      return innsynskrav;
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

    public Builder innsynskrav(List<InnsynskravRequest> innsynskrav) {
      this.innsynskrav =
          innsynskrav.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    public Builder addInnsynskrav(InnsynskravRequest innsynskrav) {
      if (this.innsynskrav == null) {
        this.innsynskrav = new ArrayList<>();
      }
      this.innsynskrav.add(new ExpandableField<InnsynskravRequest>(innsynskrav));
      return this;
    }

    public Builder addInnsynskrav(
        Function<InnsynskravRequest.Builder, InnsynskravRequest.Builder> builderFunction) {
      if (this.innsynskrav == null) {
        this.innsynskrav = new ArrayList<>();
      }
      this.innsynskrav.add(
          new ExpandableField<>(builderFunction.apply(new InnsynskravRequest.Builder()).build()));
      return this;
    }

    public Builder addInnsynskrav(String id) {
      if (this.innsynskrav == null) {
        this.innsynskrav = new ArrayList<>();
      }
      this.innsynskrav.add(new ExpandableField<>(id));
      return this;
    }

    public Builder language(LanguageEnum language) {
      this.language = language;
      return this;
    }

    public InnsynskravBestillingRequest build() {
      return new InnsynskravBestillingRequest(
          this.externalId, this.accessibleAfter, this.email, this.innsynskrav, this.language);
    }
  }
}
