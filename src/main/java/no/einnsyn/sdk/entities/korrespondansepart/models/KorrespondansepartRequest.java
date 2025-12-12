// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.korrespondansepart.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;

/** Represents a correspondent, which is a sender or recipient of a document. */
public class KorrespondansepartRequest extends ArkivBaseRequest {
  /** The name of the Korrespondansepart, with sensitive parts redacted. */
  protected String korrespondansepartNavn;

  /** The name of the Korrespondansepart, with all parts included. */
  protected String korrespondansepartNavnSensitiv;

  /** The type of correspondent (e.g., 'sender', 'recipient'). */
  protected String korrespondanseparttype;

  /** The case officer associated with this correspondent. */
  protected String saksbehandler;

  /** The email address of the correspondent. */
  protected String epostadresse;

  /** The postal code of the correspondent. */
  protected String postnummer;

  /** Indicates if the correspondent is the data controller. */
  protected Boolean erBehandlingsansvarlig;

  /** The code for the administrative Enhet associated with this Korrespondansepart. */
  protected String administrativEnhet;

  public KorrespondansepartRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String korrespondansepartNavn,
      String korrespondansepartNavnSensitiv,
      String korrespondanseparttype,
      String saksbehandler,
      String epostadresse,
      String postnummer,
      Boolean erBehandlingsansvarlig,
      String administrativEnhet) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.korrespondansepartNavn = korrespondansepartNavn;
    this.korrespondansepartNavnSensitiv = korrespondansepartNavnSensitiv;
    this.korrespondanseparttype = korrespondanseparttype;
    this.saksbehandler = saksbehandler;
    this.epostadresse = epostadresse;
    this.postnummer = postnummer;
    this.erBehandlingsansvarlig = erBehandlingsansvarlig;
    this.administrativEnhet = administrativEnhet;
  }

  /** The name of the Korrespondansepart, with sensitive parts redacted. */
  public String getKorrespondansepartNavn() {
    return korrespondansepartNavn;
  }

  /** The name of the Korrespondansepart, with all parts included. */
  public String getKorrespondansepartNavnSensitiv() {
    return korrespondansepartNavnSensitiv;
  }

  /** The type of correspondent (e.g., 'sender', 'recipient'). */
  public String getKorrespondanseparttype() {
    return korrespondanseparttype;
  }

  /** The case officer associated with this correspondent. */
  public String getSaksbehandler() {
    return saksbehandler;
  }

  /** The email address of the correspondent. */
  public String getEpostadresse() {
    return epostadresse;
  }

  /** The postal code of the correspondent. */
  public String getPostnummer() {
    return postnummer;
  }

  /** Indicates if the correspondent is the data controller. */
  public Boolean getErBehandlingsansvarlig() {
    return erBehandlingsansvarlig;
  }

  /** The code for the administrative Enhet associated with this Korrespondansepart. */
  public String getAdministrativEnhet() {
    return administrativEnhet;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static KorrespondansepartRequest of(Function<Builder, Builder> builderFunction) {
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

    /** The name of the Korrespondansepart, with sensitive parts redacted. */
    protected String korrespondansepartNavn;

    /** The name of the Korrespondansepart, with all parts included. */
    protected String korrespondansepartNavnSensitiv;

    /** The type of correspondent (e.g., 'sender', 'recipient'). */
    protected String korrespondanseparttype;

    /** The case officer associated with this correspondent. */
    protected String saksbehandler;

    /** The email address of the correspondent. */
    protected String epostadresse;

    /** The postal code of the correspondent. */
    protected String postnummer;

    /** Indicates if the correspondent is the data controller. */
    protected Boolean erBehandlingsansvarlig;

    /** The code for the administrative Enhet associated with this Korrespondansepart. */
    protected String administrativEnhet;

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

    /** The name of the Korrespondansepart, with sensitive parts redacted. */
    public String getKorrespondansepartNavn() {
      return korrespondansepartNavn;
    }

    /** The name of the Korrespondansepart, with all parts included. */
    public String getKorrespondansepartNavnSensitiv() {
      return korrespondansepartNavnSensitiv;
    }

    /** The type of correspondent (e.g., 'sender', 'recipient'). */
    public String getKorrespondanseparttype() {
      return korrespondanseparttype;
    }

    /** The case officer associated with this correspondent. */
    public String getSaksbehandler() {
      return saksbehandler;
    }

    /** The email address of the correspondent. */
    public String getEpostadresse() {
      return epostadresse;
    }

    /** The postal code of the correspondent. */
    public String getPostnummer() {
      return postnummer;
    }

    /** Indicates if the correspondent is the data controller. */
    public Boolean getErBehandlingsansvarlig() {
      return erBehandlingsansvarlig;
    }

    /** The code for the administrative Enhet associated with this Korrespondansepart. */
    public String getAdministrativEnhet() {
      return administrativEnhet;
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

    /** The name of the Korrespondansepart, with sensitive parts redacted. */
    public Builder korrespondansepartNavn(String korrespondansepartNavn) {
      this.korrespondansepartNavn = korrespondansepartNavn;
      return this;
    }

    /** The name of the Korrespondansepart, with all parts included. */
    public Builder korrespondansepartNavnSensitiv(String korrespondansepartNavnSensitiv) {
      this.korrespondansepartNavnSensitiv = korrespondansepartNavnSensitiv;
      return this;
    }

    /** The type of correspondent (e.g., 'sender', 'recipient'). */
    public Builder korrespondanseparttype(String korrespondanseparttype) {
      this.korrespondanseparttype = korrespondanseparttype;
      return this;
    }

    /** The case officer associated with this correspondent. */
    public Builder saksbehandler(String saksbehandler) {
      this.saksbehandler = saksbehandler;
      return this;
    }

    /** The email address of the correspondent. */
    public Builder epostadresse(String epostadresse) {
      this.epostadresse = epostadresse;
      return this;
    }

    /** The postal code of the correspondent. */
    public Builder postnummer(String postnummer) {
      this.postnummer = postnummer;
      return this;
    }

    /** Indicates if the correspondent is the data controller. */
    public Builder erBehandlingsansvarlig(Boolean erBehandlingsansvarlig) {
      this.erBehandlingsansvarlig = erBehandlingsansvarlig;
      return this;
    }

    /** The code for the administrative Enhet associated with this Korrespondansepart. */
    public Builder administrativEnhet(String administrativEnhet) {
      this.administrativEnhet = administrativEnhet;
      return this;
    }

    public KorrespondansepartRequest build() {
      return new KorrespondansepartRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.korrespondansepartNavn,
          this.korrespondansepartNavnSensitiv,
          this.korrespondanseparttype,
          this.saksbehandler,
          this.epostadresse,
          this.postnummer,
          this.erBehandlingsansvarlig,
          this.administrativEnhet);
    }
  }
}
