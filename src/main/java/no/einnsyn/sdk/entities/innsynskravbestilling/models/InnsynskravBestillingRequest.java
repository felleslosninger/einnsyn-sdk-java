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

/** Represents an order containing one or more access requests (Innsynskrav). */
public class InnsynskravBestillingRequest extends BaseRequest {
  /** The email address of the person who placed the order. */
  protected String email;

  /** The list of individual access requests in this order. */
  protected List<ExpandableField<InnsynskravRequest>> innsynskrav;

  /** The preferred language for communication. */
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

  /** The email address of the person who placed the order. */
  public String getEmail() {
    return email;
  }

  /** The list of individual access requests in this order. */
  public List<ExpandableField<InnsynskravRequest>> getInnsynskrav() {
    return innsynskrav;
  }

  /** The preferred language for communication. */
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

    /** The email address of the person who placed the order. */
    protected String email;

    /** The list of individual access requests in this order. */
    protected List<ExpandableField<InnsynskravRequest>> innsynskrav;

    /** The preferred language for communication. */
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

    /** The email address of the person who placed the order. */
    public String getEmail() {
      return email;
    }

    /** The list of individual access requests in this order. */
    public List<ExpandableField<InnsynskravRequest>> getInnsynskrav() {
      return innsynskrav;
    }

    /** The preferred language for communication. */
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

    /** The email address of the person who placed the order. */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /** The list of individual access requests in this order. */
    public Builder innsynskrav(List<InnsynskravRequest> innsynskrav) {
      this.innsynskrav =
          innsynskrav.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    /** The list of individual access requests in this order. */
    public Builder addInnsynskrav(InnsynskravRequest innsynskrav) {
      if (this.innsynskrav == null) {
        this.innsynskrav = new ArrayList<>();
      }
      this.innsynskrav.add(new ExpandableField<InnsynskravRequest>(innsynskrav));
      return this;
    }

    /** The list of individual access requests in this order. */
    public Builder addInnsynskrav(
        Function<InnsynskravRequest.Builder, InnsynskravRequest.Builder> builderFunction) {
      if (this.innsynskrav == null) {
        this.innsynskrav = new ArrayList<>();
      }
      this.innsynskrav.add(
          new ExpandableField<>(builderFunction.apply(new InnsynskravRequest.Builder()).build()));
      return this;
    }

    /** The list of individual access requests in this order. */
    public Builder addInnsynskrav(String id) {
      if (this.innsynskrav == null) {
        this.innsynskrav = new ArrayList<>();
      }
      this.innsynskrav.add(new ExpandableField<>(id));
      return this;
    }

    /** The preferred language for communication. */
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
