// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.journalpost.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.DokumentbeskrivelseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;
import no.einnsyn.sdk.entities.korrespondansepart.models.KorrespondansepartRequest;
import no.einnsyn.sdk.entities.registrering.models.RegistreringRequest;
import no.einnsyn.sdk.entities.saksmappe.models.SaksmappeRequest;
import no.einnsyn.sdk.entities.skjerming.models.SkjermingRequest;

/**
 * Represents a registry entry for a document, corresponding to the Journalpost in the Noark 5
 * standard. It is a record of an incoming, outgoing, or internal document.
 */
public class JournalpostRequest extends RegistreringRequest {
  /** The year the registry entry was created. */
  protected Integer journalaar;

  /** The sequence number of the registry entry within the journal year. */
  protected Integer journalsekvensnummer;

  /** The post number within the journal. */
  protected Integer journalpostnummer;

  /** The type of registry entry. */
  protected JournalposttypeEnum journalposttype;

  /** The date the registry entry was recorded. */
  protected String journaldato;

  /** The date of the document itself. */
  protected String dokumentetsDato;

  /** Access control information for the registry entry. */
  protected ExpandableField<SkjermingRequest> skjerming;

  /** Legacy field for the journal post type. */
  protected String legacyJournalposttype;

  /** Legacy field for references to related cases. */
  protected List<String> legacyFoelgsakenReferanse;

  /** The identifier of the administrative unit responsible for the registry entry. */
  protected String administrativEnhet;

  /**
   * The full administrative unit object responsible for the registry entry (expandable reference).
   */
  protected ExpandableField<EnhetRequest> administrativEnhetObjekt;

  /** The case this record belongs to. */
  protected ExpandableField<SaksmappeRequest> saksmappe;

  public JournalpostRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String slug,
      String offentligTittel,
      String offentligTittelSensitiv,
      String beskrivelse,
      String publisertDato,
      String oppdatertDato,
      List<ExpandableField<KorrespondansepartRequest>> korrespondansepart,
      List<ExpandableField<DokumentbeskrivelseRequest>> dokumentbeskrivelse,
      ExpandableField<EnhetRequest> avhendetTil,
      Integer journalaar,
      Integer journalsekvensnummer,
      Integer journalpostnummer,
      JournalposttypeEnum journalposttype,
      String journaldato,
      String dokumentetsDato,
      ExpandableField<SkjermingRequest> skjerming,
      String legacyJournalposttype,
      List<String> legacyFoelgsakenReferanse,
      String administrativEnhet,
      ExpandableField<EnhetRequest> administrativEnhetObjekt,
      ExpandableField<SaksmappeRequest> saksmappe) {
    super(
        externalId,
        accessibleAfter,
        systemId,
        journalenhet,
        slug,
        offentligTittel,
        offentligTittelSensitiv,
        beskrivelse,
        publisertDato,
        oppdatertDato,
        korrespondansepart,
        dokumentbeskrivelse,
        avhendetTil);
    this.journalaar = journalaar;
    this.journalsekvensnummer = journalsekvensnummer;
    this.journalpostnummer = journalpostnummer;
    this.journalposttype = journalposttype;
    this.journaldato = journaldato;
    this.dokumentetsDato = dokumentetsDato;
    this.skjerming = skjerming;
    this.legacyJournalposttype = legacyJournalposttype;
    this.legacyFoelgsakenReferanse = legacyFoelgsakenReferanse;
    this.administrativEnhet = administrativEnhet;
    this.administrativEnhetObjekt = administrativEnhetObjekt;
    this.saksmappe = saksmappe;
  }

  /** The year the registry entry was created. */
  public Integer getJournalaar() {
    return journalaar;
  }

  /** The sequence number of the registry entry within the journal year. */
  public Integer getJournalsekvensnummer() {
    return journalsekvensnummer;
  }

  /** The post number within the journal. */
  public Integer getJournalpostnummer() {
    return journalpostnummer;
  }

  /** The type of registry entry. */
  public JournalposttypeEnum getJournalposttype() {
    return journalposttype;
  }

  /** The date the registry entry was recorded. */
  public String getJournaldato() {
    return journaldato;
  }

  /** The date of the document itself. */
  public String getDokumentetsDato() {
    return dokumentetsDato;
  }

  /** Access control information for the registry entry. */
  public ExpandableField<SkjermingRequest> getSkjerming() {
    return skjerming;
  }

  /** Legacy field for the journal post type. */
  public String getLegacyJournalposttype() {
    return legacyJournalposttype;
  }

  /** Legacy field for references to related cases. */
  public List<String> getLegacyFoelgsakenReferanse() {
    return legacyFoelgsakenReferanse;
  }

  /** The identifier of the administrative unit responsible for the registry entry. */
  public String getAdministrativEnhet() {
    return administrativEnhet;
  }

  /**
   * The full administrative unit object responsible for the registry entry (expandable reference).
   */
  public ExpandableField<EnhetRequest> getAdministrativEnhetObjekt() {
    return administrativEnhetObjekt;
  }

  /** The case this record belongs to. */
  public ExpandableField<SaksmappeRequest> getSaksmappe() {
    return saksmappe;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static JournalpostRequest of(Function<Builder, Builder> builderFunction) {
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

    /** A URL-friendly unique slug for the resource. */
    protected String slug;

    /** The title of the resource, with sensitive information redacted. */
    protected String offentligTittel;

    /** The title of the resource, with sensitive information included. */
    protected String offentligTittelSensitiv;

    protected String beskrivelse;

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

    protected List<ExpandableField<KorrespondansepartRequest>> korrespondansepart;

    protected List<ExpandableField<DokumentbeskrivelseRequest>> dokumentbeskrivelse;

    /** The administrative unit that has been handed the responsibility for this resource. */
    protected ExpandableField<EnhetRequest> avhendetTil;

    /** The year the registry entry was created. */
    protected Integer journalaar;

    /** The sequence number of the registry entry within the journal year. */
    protected Integer journalsekvensnummer;

    /** The post number within the journal. */
    protected Integer journalpostnummer;

    /** The type of registry entry. */
    protected JournalposttypeEnum journalposttype;

    /** The date the registry entry was recorded. */
    protected String journaldato;

    /** The date of the document itself. */
    protected String dokumentetsDato;

    /** Access control information for the registry entry. */
    protected ExpandableField<SkjermingRequest> skjerming;

    /** Legacy field for the journal post type. */
    protected String legacyJournalposttype;

    /** Legacy field for references to related cases. */
    protected List<String> legacyFoelgsakenReferanse;

    /** The identifier of the administrative unit responsible for the registry entry. */
    protected String administrativEnhet;

    /**
     * The full administrative unit object responsible for the registry entry (expandable
     * reference).
     */
    protected ExpandableField<EnhetRequest> administrativEnhetObjekt;

    /** The case this record belongs to. */
    protected ExpandableField<SaksmappeRequest> saksmappe;

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

    /** The title of the resource, with sensitive information redacted. */
    public String getOffentligTittel() {
      return offentligTittel;
    }

    /** The title of the resource, with sensitive information included. */
    public String getOffentligTittelSensitiv() {
      return offentligTittelSensitiv;
    }

    public String getBeskrivelse() {
      return beskrivelse;
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

    public List<ExpandableField<KorrespondansepartRequest>> getKorrespondansepart() {
      return korrespondansepart;
    }

    public List<ExpandableField<DokumentbeskrivelseRequest>> getDokumentbeskrivelse() {
      return dokumentbeskrivelse;
    }

    /** The administrative unit that has been handed the responsibility for this resource. */
    public ExpandableField<EnhetRequest> getAvhendetTil() {
      return avhendetTil;
    }

    /** The year the registry entry was created. */
    public Integer getJournalaar() {
      return journalaar;
    }

    /** The sequence number of the registry entry within the journal year. */
    public Integer getJournalsekvensnummer() {
      return journalsekvensnummer;
    }

    /** The post number within the journal. */
    public Integer getJournalpostnummer() {
      return journalpostnummer;
    }

    /** The type of registry entry. */
    public JournalposttypeEnum getJournalposttype() {
      return journalposttype;
    }

    /** The date the registry entry was recorded. */
    public String getJournaldato() {
      return journaldato;
    }

    /** The date of the document itself. */
    public String getDokumentetsDato() {
      return dokumentetsDato;
    }

    /** Access control information for the registry entry. */
    public ExpandableField<SkjermingRequest> getSkjerming() {
      return skjerming;
    }

    /** Legacy field for the journal post type. */
    public String getLegacyJournalposttype() {
      return legacyJournalposttype;
    }

    /** Legacy field for references to related cases. */
    public List<String> getLegacyFoelgsakenReferanse() {
      return legacyFoelgsakenReferanse;
    }

    /** The identifier of the administrative unit responsible for the registry entry. */
    public String getAdministrativEnhet() {
      return administrativEnhet;
    }

    /**
     * The full administrative unit object responsible for the registry entry (expandable
     * reference).
     */
    public ExpandableField<EnhetRequest> getAdministrativEnhetObjekt() {
      return administrativEnhetObjekt;
    }

    /** The case this record belongs to. */
    public ExpandableField<SaksmappeRequest> getSaksmappe() {
      return saksmappe;
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

    /** The title of the resource, with sensitive information redacted. */
    public Builder offentligTittel(String offentligTittel) {
      this.offentligTittel = offentligTittel;
      return this;
    }

    /** The title of the resource, with sensitive information included. */
    public Builder offentligTittelSensitiv(String offentligTittelSensitiv) {
      this.offentligTittelSensitiv = offentligTittelSensitiv;
      return this;
    }

    public Builder beskrivelse(String beskrivelse) {
      this.beskrivelse = beskrivelse;
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

    public Builder korrespondansepart(List<KorrespondansepartRequest> korrespondansepart) {
      this.korrespondansepart =
          korrespondansepart.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    public Builder addKorrespondansepart(KorrespondansepartRequest korrespondansepart) {
      if (this.korrespondansepart == null) {
        this.korrespondansepart = new ArrayList<>();
      }
      this.korrespondansepart.add(
          new ExpandableField<KorrespondansepartRequest>(korrespondansepart));
      return this;
    }

    public Builder addKorrespondansepart(
        Function<KorrespondansepartRequest.Builder, KorrespondansepartRequest.Builder>
            builderFunction) {
      if (this.korrespondansepart == null) {
        this.korrespondansepart = new ArrayList<>();
      }
      this.korrespondansepart.add(
          new ExpandableField<>(
              builderFunction.apply(new KorrespondansepartRequest.Builder()).build()));
      return this;
    }

    public Builder addKorrespondansepart(String id) {
      if (this.korrespondansepart == null) {
        this.korrespondansepart = new ArrayList<>();
      }
      this.korrespondansepart.add(new ExpandableField<>(id));
      return this;
    }

    public Builder dokumentbeskrivelse(List<DokumentbeskrivelseRequest> dokumentbeskrivelse) {
      this.dokumentbeskrivelse =
          dokumentbeskrivelse.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    public Builder addDokumentbeskrivelse(DokumentbeskrivelseRequest dokumentbeskrivelse) {
      if (this.dokumentbeskrivelse == null) {
        this.dokumentbeskrivelse = new ArrayList<>();
      }
      this.dokumentbeskrivelse.add(
          new ExpandableField<DokumentbeskrivelseRequest>(dokumentbeskrivelse));
      return this;
    }

    public Builder addDokumentbeskrivelse(
        Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
            builderFunction) {
      if (this.dokumentbeskrivelse == null) {
        this.dokumentbeskrivelse = new ArrayList<>();
      }
      this.dokumentbeskrivelse.add(
          new ExpandableField<>(
              builderFunction.apply(new DokumentbeskrivelseRequest.Builder()).build()));
      return this;
    }

    public Builder addDokumentbeskrivelse(String id) {
      if (this.dokumentbeskrivelse == null) {
        this.dokumentbeskrivelse = new ArrayList<>();
      }
      this.dokumentbeskrivelse.add(new ExpandableField<>(id));
      return this;
    }

    /** The administrative unit that has been handed the responsibility for this resource. */
    public Builder avhendetTil(EnhetRequest avhendetTil) {
      this.avhendetTil = new ExpandableField<>(avhendetTil);
      return this;
    }

    /** The administrative unit that has been handed the responsibility for this resource. */
    public Builder avhendetTil(String id) {
      this.avhendetTil = new ExpandableField<>(id);
      return this;
    }

    /** The year the registry entry was created. */
    public Builder journalaar(Integer journalaar) {
      this.journalaar = journalaar;
      return this;
    }

    /** The sequence number of the registry entry within the journal year. */
    public Builder journalsekvensnummer(Integer journalsekvensnummer) {
      this.journalsekvensnummer = journalsekvensnummer;
      return this;
    }

    /** The post number within the journal. */
    public Builder journalpostnummer(Integer journalpostnummer) {
      this.journalpostnummer = journalpostnummer;
      return this;
    }

    /** The type of registry entry. */
    public Builder journalposttype(JournalposttypeEnum journalposttype) {
      this.journalposttype = journalposttype;
      return this;
    }

    /** The date the registry entry was recorded. */
    public Builder journaldato(String journaldato) {
      this.journaldato = journaldato;
      return this;
    }

    /** The date of the document itself. */
    public Builder dokumentetsDato(String dokumentetsDato) {
      this.dokumentetsDato = dokumentetsDato;
      return this;
    }

    /** Access control information for the registry entry. */
    public Builder skjerming(SkjermingRequest skjerming) {
      this.skjerming = new ExpandableField<>(skjerming);
      return this;
    }

    /** Access control information for the registry entry. */
    public Builder skjerming(String id) {
      this.skjerming = new ExpandableField<>(id);
      return this;
    }

    /** Legacy field for the journal post type. */
    public Builder legacyJournalposttype(String legacyJournalposttype) {
      this.legacyJournalposttype = legacyJournalposttype;
      return this;
    }

    /** Legacy field for references to related cases. */
    public Builder legacyFoelgsakenReferanse(List<String> legacyFoelgsakenReferanse) {
      this.legacyFoelgsakenReferanse = legacyFoelgsakenReferanse;
      return this;
    }

    /** Legacy field for references to related cases. */
    public Builder addLegacyFoelgsakenReferanse(String legacyFoelgsakenReferanse) {
      if (this.legacyFoelgsakenReferanse == null) {
        this.legacyFoelgsakenReferanse = new ArrayList<>();
      }
      this.legacyFoelgsakenReferanse.add(legacyFoelgsakenReferanse);
      return this;
    }

    /** The identifier of the administrative unit responsible for the registry entry. */
    public Builder administrativEnhet(String administrativEnhet) {
      this.administrativEnhet = administrativEnhet;
      return this;
    }

    /**
     * The full administrative unit object responsible for the registry entry (expandable
     * reference).
     */
    public Builder administrativEnhetObjekt(EnhetRequest administrativEnhetObjekt) {
      this.administrativEnhetObjekt = new ExpandableField<>(administrativEnhetObjekt);
      return this;
    }

    /**
     * The full administrative unit object responsible for the registry entry (expandable
     * reference).
     */
    public Builder administrativEnhetObjekt(String id) {
      this.administrativEnhetObjekt = new ExpandableField<>(id);
      return this;
    }

    /** The case this record belongs to. */
    public Builder saksmappe(SaksmappeRequest saksmappe) {
      this.saksmappe = new ExpandableField<>(saksmappe);
      return this;
    }

    /** The case this record belongs to. */
    public Builder saksmappe(String id) {
      this.saksmappe = new ExpandableField<>(id);
      return this;
    }

    public JournalpostRequest build() {
      return new JournalpostRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.slug,
          this.offentligTittel,
          this.offentligTittelSensitiv,
          this.beskrivelse,
          this.publisertDato,
          this.oppdatertDato,
          this.korrespondansepart,
          this.dokumentbeskrivelse,
          this.avhendetTil,
          this.journalaar,
          this.journalsekvensnummer,
          this.journalpostnummer,
          this.journalposttype,
          this.journaldato,
          this.dokumentetsDato,
          this.skjerming,
          this.legacyJournalposttype,
          this.legacyFoelgsakenReferanse,
          this.administrativEnhet,
          this.administrativEnhetObjekt,
          this.saksmappe);
    }
  }
}
