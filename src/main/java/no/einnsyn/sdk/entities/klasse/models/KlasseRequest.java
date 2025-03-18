// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.klasse.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.arkivdel.models.ArkivdelRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;
import no.einnsyn.sdk.entities.klassifikasjonssystem.models.KlassifikasjonssystemRequest;

/** Klasse */
public class KlasseRequest extends ArkivBaseRequest {
  /** The title of the class. */
  protected String tittel;

  /** An optional parent klassifikasjonssystem */
  protected ExpandableField<KlassifikasjonssystemRequest> klassifikasjonssystem;

  /** An optional parent klasse */
  protected ExpandableField<KlasseRequest> klasse;

  /** An optional parent arkivdel (non-standard field, due to legacy data) */
  protected ExpandableField<ArkivdelRequest> arkivdel;

  public KlasseRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String tittel,
      ExpandableField<KlassifikasjonssystemRequest> klassifikasjonssystem,
      ExpandableField<KlasseRequest> klasse,
      ExpandableField<ArkivdelRequest> arkivdel) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.tittel = tittel;
    this.klassifikasjonssystem = klassifikasjonssystem;
    this.klasse = klasse;
    this.arkivdel = arkivdel;
  }

  /** The title of the class. */
  public String getTittel() {
    return tittel;
  }

  /** An optional parent klassifikasjonssystem */
  public ExpandableField<KlassifikasjonssystemRequest> getKlassifikasjonssystem() {
    return klassifikasjonssystem;
  }

  /** An optional parent klasse */
  public ExpandableField<KlasseRequest> getKlasse() {
    return klasse;
  }

  /** An optional parent arkivdel (non-standard field, due to legacy data) */
  public ExpandableField<ArkivdelRequest> getArkivdel() {
    return arkivdel;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static KlasseRequest of(Function<Builder, Builder> builderFunction) {
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

    /** The title of the class. */
    protected String tittel;

    /** An optional parent klassifikasjonssystem */
    protected ExpandableField<KlassifikasjonssystemRequest> klassifikasjonssystem;

    /** An optional parent klasse */
    protected ExpandableField<KlasseRequest> klasse;

    /** An optional parent arkivdel (non-standard field, due to legacy data) */
    protected ExpandableField<ArkivdelRequest> arkivdel;

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

    /** The title of the class. */
    public String getTittel() {
      return tittel;
    }

    /** An optional parent klassifikasjonssystem */
    public ExpandableField<KlassifikasjonssystemRequest> getKlassifikasjonssystem() {
      return klassifikasjonssystem;
    }

    /** An optional parent klasse */
    public ExpandableField<KlasseRequest> getKlasse() {
      return klasse;
    }

    /** An optional parent arkivdel (non-standard field, due to legacy data) */
    public ExpandableField<ArkivdelRequest> getArkivdel() {
      return arkivdel;
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

    /** The title of the class. */
    public Builder tittel(String tittel) {
      this.tittel = tittel;
      return this;
    }

    /** An optional parent klassifikasjonssystem */
    public Builder klassifikasjonssystem(KlassifikasjonssystemRequest klassifikasjonssystem) {
      this.klassifikasjonssystem = new ExpandableField<>(klassifikasjonssystem);
      return this;
    }

    /** An optional parent klassifikasjonssystem */
    public Builder klassifikasjonssystem(String id) {
      this.klassifikasjonssystem = new ExpandableField<>(id);
      return this;
    }

    /** An optional parent klasse */
    public Builder klasse(KlasseRequest klasse) {
      this.klasse = new ExpandableField<>(klasse);
      return this;
    }

    /** An optional parent klasse */
    public Builder klasse(String id) {
      this.klasse = new ExpandableField<>(id);
      return this;
    }

    /** An optional parent arkivdel (non-standard field, due to legacy data) */
    public Builder arkivdel(ArkivdelRequest arkivdel) {
      this.arkivdel = new ExpandableField<>(arkivdel);
      return this;
    }

    /** An optional parent arkivdel (non-standard field, due to legacy data) */
    public Builder arkivdel(String id) {
      this.arkivdel = new ExpandableField<>(id);
      return this;
    }

    public KlasseRequest build() {
      return new KlasseRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.tittel,
          this.klassifikasjonssystem,
          this.klasse,
          this.arkivdel);
    }
  }
}
