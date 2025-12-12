// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.mappe.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;
import no.einnsyn.sdk.entities.klasse.models.KlasseRequest;

/**
 * An abstract base model for case files (Saksmappe) and meeting records (Moetemappe). It contains
 * common properties for these folder-like structures.
 */
public class MappeRequest extends ArkivBaseRequest {
  /** A URL-friendly unique slug for the resource. */
  protected String slug;

  /** The title of the Mappe, with sensitive information redacted. */
  protected String offentligTittel;

  /** The title of the Mappe, with sensitive information included. */
  protected String offentligTittelSensitiv;

  protected String beskrivelse;

  protected String noekkelord;

  /**
   * The date the resource was published. This field is updated automatically, but can be set
   * manually by admins.
   */
  protected String publisertDato;

  /**
   * The date the resource was last updated. This field is updated automatically, but can be set
   * manually by admins.
   */
  protected String oppdatertDato;

  /** An optional Klasse for this Mappe. */
  protected ExpandableField<KlasseRequest> klasse;

  public MappeRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String slug,
      String offentligTittel,
      String offentligTittelSensitiv,
      String beskrivelse,
      String noekkelord,
      String publisertDato,
      String oppdatertDato,
      ExpandableField<KlasseRequest> klasse) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.slug = slug;
    this.offentligTittel = offentligTittel;
    this.offentligTittelSensitiv = offentligTittelSensitiv;
    this.beskrivelse = beskrivelse;
    this.noekkelord = noekkelord;
    this.publisertDato = publisertDato;
    this.oppdatertDato = oppdatertDato;
    this.klasse = klasse;
  }

  /** A URL-friendly unique slug for the resource. */
  public String getSlug() {
    return slug;
  }

  /** The title of the Mappe, with sensitive information redacted. */
  public String getOffentligTittel() {
    return offentligTittel;
  }

  /** The title of the Mappe, with sensitive information included. */
  public String getOffentligTittelSensitiv() {
    return offentligTittelSensitiv;
  }

  public String getBeskrivelse() {
    return beskrivelse;
  }

  public String getNoekkelord() {
    return noekkelord;
  }

  /**
   * The date the resource was published. This field is updated automatically, but can be set
   * manually by admins.
   */
  public String getPublisertDato() {
    return publisertDato;
  }

  /**
   * The date the resource was last updated. This field is updated automatically, but can be set
   * manually by admins.
   */
  public String getOppdatertDato() {
    return oppdatertDato;
  }

  /** An optional Klasse for this Mappe. */
  public ExpandableField<KlasseRequest> getKlasse() {
    return klasse;
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

    /** A URL-friendly unique slug for the resource. */
    protected String slug;

    /** The title of the Mappe, with sensitive information redacted. */
    protected String offentligTittel;

    /** The title of the Mappe, with sensitive information included. */
    protected String offentligTittelSensitiv;

    protected String beskrivelse;

    protected String noekkelord;

    /**
     * The date the resource was published. This field is updated automatically, but can be set
     * manually by admins.
     */
    protected String publisertDato;

    /**
     * The date the resource was last updated. This field is updated automatically, but can be set
     * manually by admins.
     */
    protected String oppdatertDato;

    /** An optional Klasse for this Mappe. */
    protected ExpandableField<KlasseRequest> klasse;

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

    /** A URL-friendly unique slug for the resource. */
    public String getSlug() {
      return slug;
    }

    /** The title of the Mappe, with sensitive information redacted. */
    public String getOffentligTittel() {
      return offentligTittel;
    }

    /** The title of the Mappe, with sensitive information included. */
    public String getOffentligTittelSensitiv() {
      return offentligTittelSensitiv;
    }

    public String getBeskrivelse() {
      return beskrivelse;
    }

    public String getNoekkelord() {
      return noekkelord;
    }

    /**
     * The date the resource was published. This field is updated automatically, but can be set
     * manually by admins.
     */
    public String getPublisertDato() {
      return publisertDato;
    }

    /**
     * The date the resource was last updated. This field is updated automatically, but can be set
     * manually by admins.
     */
    public String getOppdatertDato() {
      return oppdatertDato;
    }

    /** An optional Klasse for this Mappe. */
    public ExpandableField<KlasseRequest> getKlasse() {
      return klasse;
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

    /** A URL-friendly unique slug for the resource. */
    public Builder slug(String slug) {
      this.slug = slug;
      return this;
    }

    /** The title of the Mappe, with sensitive information redacted. */
    public Builder offentligTittel(String offentligTittel) {
      this.offentligTittel = offentligTittel;
      return this;
    }

    /** The title of the Mappe, with sensitive information included. */
    public Builder offentligTittelSensitiv(String offentligTittelSensitiv) {
      this.offentligTittelSensitiv = offentligTittelSensitiv;
      return this;
    }

    public Builder beskrivelse(String beskrivelse) {
      this.beskrivelse = beskrivelse;
      return this;
    }

    public Builder noekkelord(String noekkelord) {
      this.noekkelord = noekkelord;
      return this;
    }

    /**
     * The date the resource was published. This field is updated automatically, but can be set
     * manually by admins.
     */
    public Builder publisertDato(String publisertDato) {
      this.publisertDato = publisertDato;
      return this;
    }

    /**
     * The date the resource was last updated. This field is updated automatically, but can be set
     * manually by admins.
     */
    public Builder oppdatertDato(String oppdatertDato) {
      this.oppdatertDato = oppdatertDato;
      return this;
    }

    /** An optional Klasse for this Mappe. */
    public Builder klasse(KlasseRequest klasse) {
      this.klasse = new ExpandableField<>(klasse);
      return this;
    }

    /** An optional Klasse for this Mappe. */
    public Builder klasse(String id) {
      this.klasse = new ExpandableField<>(id);
      return this;
    }

    public MappeRequest build() {
      return new MappeRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.slug,
          this.offentligTittel,
          this.offentligTittelSensitiv,
          this.beskrivelse,
          this.noekkelord,
          this.publisertDato,
          this.oppdatertDato,
          this.klasse);
    }
  }
}
