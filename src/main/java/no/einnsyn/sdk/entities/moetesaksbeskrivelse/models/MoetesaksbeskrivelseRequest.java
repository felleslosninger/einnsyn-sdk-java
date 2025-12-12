// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetesaksbeskrivelse.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;

/**
 * Represents a textual description related to a meeting case, such as a recommendation or a report.
 */
public class MoetesaksbeskrivelseRequest extends ArkivBaseRequest {
  /** The text content of the description. */
  protected String tekstInnhold;

  /** The format of the text content (e.g., "text/html"). */
  protected String tekstFormat;

  public MoetesaksbeskrivelseRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String tekstInnhold,
      String tekstFormat) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.tekstInnhold = tekstInnhold;
    this.tekstFormat = tekstFormat;
  }

  /** The text content of the description. */
  public String getTekstInnhold() {
    return tekstInnhold;
  }

  /** The format of the text content (e.g., "text/html"). */
  public String getTekstFormat() {
    return tekstFormat;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MoetesaksbeskrivelseRequest of(Function<Builder, Builder> builderFunction) {
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

    /** The unique identifier for the resource, given by the user's system. */
    protected String systemId;

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    protected ExpandableField<EnhetRequest> journalenhet;

    /** The text content of the description. */
    protected String tekstInnhold;

    /** The format of the text content (e.g., "text/html"). */
    protected String tekstFormat;

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

    /** The unique identifier for the resource, given by the user's system. */
    public String getSystemId() {
      return systemId;
    }

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    public ExpandableField<EnhetRequest> getJournalenhet() {
      return journalenhet;
    }

    /** The text content of the description. */
    public String getTekstInnhold() {
      return tekstInnhold;
    }

    /** The format of the text content (e.g., "text/html"). */
    public String getTekstFormat() {
      return tekstFormat;
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

    /** The unique identifier for the resource, given by the user's system. */
    public Builder systemId(String systemId) {
      this.systemId = systemId;
      return this;
    }

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    public Builder journalenhet(EnhetRequest journalenhet) {
      this.journalenhet = new ExpandableField<>(journalenhet);
      return this;
    }

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    public Builder journalenhet(String id) {
      this.journalenhet = new ExpandableField<>(id);
      return this;
    }

    /** The text content of the description. */
    public Builder tekstInnhold(String tekstInnhold) {
      this.tekstInnhold = tekstInnhold;
      return this;
    }

    /** The format of the text content (e.g., "text/html"). */
    public Builder tekstFormat(String tekstFormat) {
      this.tekstFormat = tekstFormat;
      return this;
    }

    public MoetesaksbeskrivelseRequest build() {
      return new MoetesaksbeskrivelseRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.tekstInnhold,
          this.tekstFormat);
    }
  }
}
