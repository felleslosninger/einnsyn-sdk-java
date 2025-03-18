// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.dokumentbeskrivelse.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.dokumentobjekt.models.DokumentobjektRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;

/** Dokumentbeskrivelse */
public class DokumentbeskrivelseRequest extends ArkivBaseRequest {
  /** The title of the document, with sensitive information redacted. */
  protected String tittel;

  /** The title of the document, with sensitive information included. */
  protected String tittelSensitiv;

  protected Integer dokumentnummer;

  protected String dokumenttype;

  protected String tilknyttetRegistreringSom;

  protected List<ExpandableField<DokumentobjektRequest>> dokumentobjekt;

  public DokumentbeskrivelseRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String tittel,
      String tittelSensitiv,
      Integer dokumentnummer,
      String dokumenttype,
      String tilknyttetRegistreringSom,
      List<ExpandableField<DokumentobjektRequest>> dokumentobjekt) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.tittel = tittel;
    this.tittelSensitiv = tittelSensitiv;
    this.dokumentnummer = dokumentnummer;
    this.dokumenttype = dokumenttype;
    this.tilknyttetRegistreringSom = tilknyttetRegistreringSom;
    this.dokumentobjekt = dokumentobjekt;
  }

  /** The title of the document, with sensitive information redacted. */
  public String getTittel() {
    return tittel;
  }

  /** The title of the document, with sensitive information included. */
  public String getTittelSensitiv() {
    return tittelSensitiv;
  }

  public Integer getDokumentnummer() {
    return dokumentnummer;
  }

  public String getDokumenttype() {
    return dokumenttype;
  }

  public String getTilknyttetRegistreringSom() {
    return tilknyttetRegistreringSom;
  }

  public List<ExpandableField<DokumentobjektRequest>> getDokumentobjekt() {
    return dokumentobjekt;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static DokumentbeskrivelseRequest of(Function<Builder, Builder> builderFunction) {
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

    /** The title of the document, with sensitive information redacted. */
    protected String tittel;

    /** The title of the document, with sensitive information included. */
    protected String tittelSensitiv;

    protected Integer dokumentnummer;

    protected String dokumenttype;

    protected String tilknyttetRegistreringSom;

    protected List<ExpandableField<DokumentobjektRequest>> dokumentobjekt;

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

    /** The title of the document, with sensitive information redacted. */
    public String getTittel() {
      return tittel;
    }

    /** The title of the document, with sensitive information included. */
    public String getTittelSensitiv() {
      return tittelSensitiv;
    }

    public Integer getDokumentnummer() {
      return dokumentnummer;
    }

    public String getDokumenttype() {
      return dokumenttype;
    }

    public String getTilknyttetRegistreringSom() {
      return tilknyttetRegistreringSom;
    }

    public List<ExpandableField<DokumentobjektRequest>> getDokumentobjekt() {
      return dokumentobjekt;
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

    /** The title of the document, with sensitive information redacted. */
    public Builder tittel(String tittel) {
      this.tittel = tittel;
      return this;
    }

    /** The title of the document, with sensitive information included. */
    public Builder tittelSensitiv(String tittelSensitiv) {
      this.tittelSensitiv = tittelSensitiv;
      return this;
    }

    public Builder dokumentnummer(Integer dokumentnummer) {
      this.dokumentnummer = dokumentnummer;
      return this;
    }

    public Builder dokumenttype(String dokumenttype) {
      this.dokumenttype = dokumenttype;
      return this;
    }

    public Builder tilknyttetRegistreringSom(String tilknyttetRegistreringSom) {
      this.tilknyttetRegistreringSom = tilknyttetRegistreringSom;
      return this;
    }

    public Builder dokumentobjekt(List<DokumentobjektRequest> dokumentobjekt) {
      this.dokumentobjekt =
          dokumentobjekt.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    public Builder addDokumentobjekt(DokumentobjektRequest dokumentobjekt) {
      if (this.dokumentobjekt == null) {
        this.dokumentobjekt = new ArrayList<>();
      }
      this.dokumentobjekt.add(new ExpandableField<DokumentobjektRequest>(dokumentobjekt));
      return this;
    }

    public Builder addDokumentobjekt(
        Function<DokumentobjektRequest.Builder, DokumentobjektRequest.Builder> builderFunction) {
      if (this.dokumentobjekt == null) {
        this.dokumentobjekt = new ArrayList<>();
      }
      this.dokumentobjekt.add(
          new ExpandableField<>(
              builderFunction.apply(new DokumentobjektRequest.Builder()).build()));
      return this;
    }

    public Builder addDokumentobjekt(String id) {
      if (this.dokumentobjekt == null) {
        this.dokumentobjekt = new ArrayList<>();
      }
      this.dokumentobjekt.add(new ExpandableField<>(id));
      return this;
    }

    public DokumentbeskrivelseRequest build() {
      return new DokumentbeskrivelseRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.tittel,
          this.tittelSensitiv,
          this.dokumentnummer,
          this.dokumenttype,
          this.tilknyttetRegistreringSom,
          this.dokumentobjekt);
    }
  }
}
