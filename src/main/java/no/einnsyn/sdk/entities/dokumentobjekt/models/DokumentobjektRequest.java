// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.dokumentobjekt.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.DokumentbeskrivelseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;

public class DokumentobjektRequest extends ArkivBaseRequest {
  protected String referanseDokumentfil;

  protected String format;

  protected String sjekksum;

  protected String sjekksumAlgoritme;

  protected ExpandableField<DokumentbeskrivelseRequest> dokumentbeskrivelse;

  public DokumentobjektRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String referanseDokumentfil,
      String format,
      String sjekksum,
      String sjekksumAlgoritme,
      ExpandableField<DokumentbeskrivelseRequest> dokumentbeskrivelse) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.referanseDokumentfil = referanseDokumentfil;
    this.format = format;
    this.sjekksum = sjekksum;
    this.sjekksumAlgoritme = sjekksumAlgoritme;
    this.dokumentbeskrivelse = dokumentbeskrivelse;
  }

  public String getReferanseDokumentfil() {
    return referanseDokumentfil;
  }

  public String getFormat() {
    return format;
  }

  public String getSjekksum() {
    return sjekksum;
  }

  public String getSjekksumAlgoritme() {
    return sjekksumAlgoritme;
  }

  public ExpandableField<DokumentbeskrivelseRequest> getDokumentbeskrivelse() {
    return dokumentbeskrivelse;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static DokumentobjektRequest of(Function<Builder, Builder> builderFunction) {
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

    protected String referanseDokumentfil;

    protected String format;

    protected String sjekksum;

    protected String sjekksumAlgoritme;

    protected ExpandableField<DokumentbeskrivelseRequest> dokumentbeskrivelse;

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

    public String getReferanseDokumentfil() {
      return referanseDokumentfil;
    }

    public String getFormat() {
      return format;
    }

    public String getSjekksum() {
      return sjekksum;
    }

    public String getSjekksumAlgoritme() {
      return sjekksumAlgoritme;
    }

    public ExpandableField<DokumentbeskrivelseRequest> getDokumentbeskrivelse() {
      return dokumentbeskrivelse;
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

    public Builder referanseDokumentfil(String referanseDokumentfil) {
      this.referanseDokumentfil = referanseDokumentfil;
      return this;
    }

    public Builder format(String format) {
      this.format = format;
      return this;
    }

    public Builder sjekksum(String sjekksum) {
      this.sjekksum = sjekksum;
      return this;
    }

    public Builder sjekksumAlgoritme(String sjekksumAlgoritme) {
      this.sjekksumAlgoritme = sjekksumAlgoritme;
      return this;
    }

    public Builder dokumentbeskrivelse(DokumentbeskrivelseRequest dokumentbeskrivelse) {
      this.dokumentbeskrivelse = new ExpandableField<>(dokumentbeskrivelse);
      return this;
    }

    public Builder dokumentbeskrivelse(String id) {
      this.dokumentbeskrivelse = new ExpandableField<>(id);
      return this;
    }

    public DokumentobjektRequest build() {
      return new DokumentobjektRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.referanseDokumentfil,
          this.format,
          this.sjekksum,
          this.sjekksumAlgoritme,
          this.dokumentbeskrivelse);
    }
  }
}
