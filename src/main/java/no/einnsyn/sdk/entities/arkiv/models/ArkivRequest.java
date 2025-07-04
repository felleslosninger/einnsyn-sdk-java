// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.arkiv.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;

/** Represents a top-level archive in the Noark structure. */
public class ArkivRequest extends ArkivBaseRequest {
  /** The title of the archive. */
  protected String tittel;

  /** The parent archive to which this archive belongs. */
  protected ExpandableField<ArkivRequest> arkiv;

  public ArkivRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String tittel,
      ExpandableField<ArkivRequest> arkiv) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.tittel = tittel;
    this.arkiv = arkiv;
  }

  /** The title of the archive. */
  public String getTittel() {
    return tittel;
  }

  /** The parent archive to which this archive belongs. */
  public ExpandableField<ArkivRequest> getArkiv() {
    return arkiv;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ArkivRequest of(Function<Builder, Builder> builderFunction) {
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

    /** The title of the archive. */
    protected String tittel;

    /** The parent archive to which this archive belongs. */
    protected ExpandableField<ArkivRequest> arkiv;

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

    /** The title of the archive. */
    public String getTittel() {
      return tittel;
    }

    /** The parent archive to which this archive belongs. */
    public ExpandableField<ArkivRequest> getArkiv() {
      return arkiv;
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

    /** The title of the archive. */
    public Builder tittel(String tittel) {
      this.tittel = tittel;
      return this;
    }

    /** The parent archive to which this archive belongs. */
    public Builder arkiv(ArkivRequest arkiv) {
      this.arkiv = new ExpandableField<>(arkiv);
      return this;
    }

    /** The parent archive to which this archive belongs. */
    public Builder arkiv(String id) {
      this.arkiv = new ExpandableField<>(id);
      return this;
    }

    public ArkivRequest build() {
      return new ArkivRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.tittel,
          this.arkiv);
    }
  }
}
