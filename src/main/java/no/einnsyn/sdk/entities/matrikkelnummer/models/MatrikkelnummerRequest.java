// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.matrikkelnummer.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;

/**
 * Identifies a property unit (matrikkelenhet) in the Norwegian cadastre, following Kartverket's
 * standard format.
 */
public class MatrikkelnummerRequest extends ArkivBaseRequest {
  /** Four-digit municipality number (kommunenummer). */
  protected String kommunenummer;

  /** Garden number (gaardsnummer). */
  protected Integer gaardsnummer;

  /** Bruk number (bruksnummer). */
  protected Integer bruksnummer;

  /** Leasehold number (festenummer). 0 means no leasehold. */
  protected Integer festenummer;

  /** Section number (seksjonsnummer). 0 means no section. */
  protected Integer seksjonsnummer;

  public MatrikkelnummerRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String kommunenummer,
      Integer gaardsnummer,
      Integer bruksnummer,
      Integer festenummer,
      Integer seksjonsnummer) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.kommunenummer = kommunenummer;
    this.gaardsnummer = gaardsnummer;
    this.bruksnummer = bruksnummer;
    this.festenummer = festenummer;
    this.seksjonsnummer = seksjonsnummer;
  }

  /** Four-digit municipality number (kommunenummer). */
  public String getKommunenummer() {
    return kommunenummer;
  }

  /** Garden number (gaardsnummer). */
  public Integer getGaardsnummer() {
    return gaardsnummer;
  }

  /** Bruk number (bruksnummer). */
  public Integer getBruksnummer() {
    return bruksnummer;
  }

  /** Leasehold number (festenummer). 0 means no leasehold. */
  public Integer getFestenummer() {
    return festenummer;
  }

  /** Section number (seksjonsnummer). 0 means no section. */
  public Integer getSeksjonsnummer() {
    return seksjonsnummer;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MatrikkelnummerRequest of(Function<Builder, Builder> builderFunction) {
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

    /** Four-digit municipality number (kommunenummer). */
    protected String kommunenummer;

    /** Garden number (gaardsnummer). */
    protected Integer gaardsnummer;

    /** Bruk number (bruksnummer). */
    protected Integer bruksnummer;

    /** Leasehold number (festenummer). 0 means no leasehold. */
    protected Integer festenummer;

    /** Section number (seksjonsnummer). 0 means no section. */
    protected Integer seksjonsnummer;

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

    /** Four-digit municipality number (kommunenummer). */
    public String getKommunenummer() {
      return kommunenummer;
    }

    /** Garden number (gaardsnummer). */
    public Integer getGaardsnummer() {
      return gaardsnummer;
    }

    /** Bruk number (bruksnummer). */
    public Integer getBruksnummer() {
      return bruksnummer;
    }

    /** Leasehold number (festenummer). 0 means no leasehold. */
    public Integer getFestenummer() {
      return festenummer;
    }

    /** Section number (seksjonsnummer). 0 means no section. */
    public Integer getSeksjonsnummer() {
      return seksjonsnummer;
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

    /** Four-digit municipality number (kommunenummer). */
    public Builder kommunenummer(String kommunenummer) {
      this.kommunenummer = kommunenummer;
      return this;
    }

    /** Garden number (gaardsnummer). */
    public Builder gaardsnummer(Integer gaardsnummer) {
      this.gaardsnummer = gaardsnummer;
      return this;
    }

    /** Bruk number (bruksnummer). */
    public Builder bruksnummer(Integer bruksnummer) {
      this.bruksnummer = bruksnummer;
      return this;
    }

    /** Leasehold number (festenummer). 0 means no leasehold. */
    public Builder festenummer(Integer festenummer) {
      this.festenummer = festenummer;
      return this;
    }

    /** Section number (seksjonsnummer). 0 means no section. */
    public Builder seksjonsnummer(Integer seksjonsnummer) {
      this.seksjonsnummer = seksjonsnummer;
      return this;
    }

    public MatrikkelnummerRequest build() {
      return new MatrikkelnummerRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.kommunenummer,
          this.gaardsnummer,
          this.bruksnummer,
          this.festenummer,
          this.seksjonsnummer);
    }
  }
}
