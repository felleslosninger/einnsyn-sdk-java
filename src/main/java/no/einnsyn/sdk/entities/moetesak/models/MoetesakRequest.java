// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetesak.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.DokumentbeskrivelseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;
import no.einnsyn.sdk.entities.korrespondansepart.models.KorrespondansepartRequest;
import no.einnsyn.sdk.entities.moetemappe.models.MoetemappeRequest;
import no.einnsyn.sdk.entities.moetesaksbeskrivelse.models.MoetesaksbeskrivelseRequest;
import no.einnsyn.sdk.entities.registrering.models.RegistreringRequest;
import no.einnsyn.sdk.entities.utredning.models.UtredningRequest;
import no.einnsyn.sdk.entities.vedtak.models.VedtakRequest;

/** Represents a case discussed in a meeting. */
public class MoetesakRequest extends RegistreringRequest {
  /** The type of meeting case. */
  protected MoetesakstypeEnum moetesakstype;

  /** The year of the meeting case. */
  protected Integer moetesaksaar;

  /** The sequence number of the meeting case within the year. */
  protected Integer moetesakssekvensnummer;

  /** The name of the committee or board handling the case. */
  protected String utvalg;

  /** A link to a video recording of the case discussion. */
  protected String videoLink;

  /** The report or investigation related to the case. */
  protected ExpandableField<UtredningRequest> utredning;

  /** The recommendation or proposition for the case. */
  protected ExpandableField<MoetesaksbeskrivelseRequest> innstilling;

  /** The decision made in the case. */
  protected ExpandableField<VedtakRequest> vedtak;

  /** The meeting record this case belongs to. */
  protected ExpandableField<MoetemappeRequest> moetemappe;

  /** Legacy field for the meeting case type. */
  protected String legacyMoetesakstype;

  /** Legacy field for a reference to another meeting case. */
  protected String legacyReferanseTilMoetesak;

  public MoetesakRequest(
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
      MoetesakstypeEnum moetesakstype,
      Integer moetesaksaar,
      Integer moetesakssekvensnummer,
      String utvalg,
      String videoLink,
      ExpandableField<UtredningRequest> utredning,
      ExpandableField<MoetesaksbeskrivelseRequest> innstilling,
      ExpandableField<VedtakRequest> vedtak,
      ExpandableField<MoetemappeRequest> moetemappe,
      String legacyMoetesakstype,
      String legacyReferanseTilMoetesak) {
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
    this.moetesakstype = moetesakstype;
    this.moetesaksaar = moetesaksaar;
    this.moetesakssekvensnummer = moetesakssekvensnummer;
    this.utvalg = utvalg;
    this.videoLink = videoLink;
    this.utredning = utredning;
    this.innstilling = innstilling;
    this.vedtak = vedtak;
    this.moetemappe = moetemappe;
    this.legacyMoetesakstype = legacyMoetesakstype;
    this.legacyReferanseTilMoetesak = legacyReferanseTilMoetesak;
  }

  /** The type of meeting case. */
  public MoetesakstypeEnum getMoetesakstype() {
    return moetesakstype;
  }

  /** The year of the meeting case. */
  public Integer getMoetesaksaar() {
    return moetesaksaar;
  }

  /** The sequence number of the meeting case within the year. */
  public Integer getMoetesakssekvensnummer() {
    return moetesakssekvensnummer;
  }

  /** The name of the committee or board handling the case. */
  public String getUtvalg() {
    return utvalg;
  }

  /** A link to a video recording of the case discussion. */
  public String getVideoLink() {
    return videoLink;
  }

  /** The report or investigation related to the case. */
  public ExpandableField<UtredningRequest> getUtredning() {
    return utredning;
  }

  /** The recommendation or proposition for the case. */
  public ExpandableField<MoetesaksbeskrivelseRequest> getInnstilling() {
    return innstilling;
  }

  /** The decision made in the case. */
  public ExpandableField<VedtakRequest> getVedtak() {
    return vedtak;
  }

  /** The meeting record this case belongs to. */
  public ExpandableField<MoetemappeRequest> getMoetemappe() {
    return moetemappe;
  }

  /** Legacy field for the meeting case type. */
  public String getLegacyMoetesakstype() {
    return legacyMoetesakstype;
  }

  /** Legacy field for a reference to another meeting case. */
  public String getLegacyReferanseTilMoetesak() {
    return legacyReferanseTilMoetesak;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MoetesakRequest of(Function<Builder, Builder> builderFunction) {
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

    /** The type of meeting case. */
    protected MoetesakstypeEnum moetesakstype;

    /** The year of the meeting case. */
    protected Integer moetesaksaar;

    /** The sequence number of the meeting case within the year. */
    protected Integer moetesakssekvensnummer;

    /** The name of the committee or board handling the case. */
    protected String utvalg;

    /** A link to a video recording of the case discussion. */
    protected String videoLink;

    /** The report or investigation related to the case. */
    protected ExpandableField<UtredningRequest> utredning;

    /** The recommendation or proposition for the case. */
    protected ExpandableField<MoetesaksbeskrivelseRequest> innstilling;

    /** The decision made in the case. */
    protected ExpandableField<VedtakRequest> vedtak;

    /** The meeting record this case belongs to. */
    protected ExpandableField<MoetemappeRequest> moetemappe;

    /** Legacy field for the meeting case type. */
    protected String legacyMoetesakstype;

    /** Legacy field for a reference to another meeting case. */
    protected String legacyReferanseTilMoetesak;

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

    /** The type of meeting case. */
    public MoetesakstypeEnum getMoetesakstype() {
      return moetesakstype;
    }

    /** The year of the meeting case. */
    public Integer getMoetesaksaar() {
      return moetesaksaar;
    }

    /** The sequence number of the meeting case within the year. */
    public Integer getMoetesakssekvensnummer() {
      return moetesakssekvensnummer;
    }

    /** The name of the committee or board handling the case. */
    public String getUtvalg() {
      return utvalg;
    }

    /** A link to a video recording of the case discussion. */
    public String getVideoLink() {
      return videoLink;
    }

    /** The report or investigation related to the case. */
    public ExpandableField<UtredningRequest> getUtredning() {
      return utredning;
    }

    /** The recommendation or proposition for the case. */
    public ExpandableField<MoetesaksbeskrivelseRequest> getInnstilling() {
      return innstilling;
    }

    /** The decision made in the case. */
    public ExpandableField<VedtakRequest> getVedtak() {
      return vedtak;
    }

    /** The meeting record this case belongs to. */
    public ExpandableField<MoetemappeRequest> getMoetemappe() {
      return moetemappe;
    }

    /** Legacy field for the meeting case type. */
    public String getLegacyMoetesakstype() {
      return legacyMoetesakstype;
    }

    /** Legacy field for a reference to another meeting case. */
    public String getLegacyReferanseTilMoetesak() {
      return legacyReferanseTilMoetesak;
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

    /** The type of meeting case. */
    public Builder moetesakstype(MoetesakstypeEnum moetesakstype) {
      this.moetesakstype = moetesakstype;
      return this;
    }

    /** The year of the meeting case. */
    public Builder moetesaksaar(Integer moetesaksaar) {
      this.moetesaksaar = moetesaksaar;
      return this;
    }

    /** The sequence number of the meeting case within the year. */
    public Builder moetesakssekvensnummer(Integer moetesakssekvensnummer) {
      this.moetesakssekvensnummer = moetesakssekvensnummer;
      return this;
    }

    /** The name of the committee or board handling the case. */
    public Builder utvalg(String utvalg) {
      this.utvalg = utvalg;
      return this;
    }

    /** A link to a video recording of the case discussion. */
    public Builder videoLink(String videoLink) {
      this.videoLink = videoLink;
      return this;
    }

    /** The report or investigation related to the case. */
    public Builder utredning(UtredningRequest utredning) {
      this.utredning = new ExpandableField<>(utredning);
      return this;
    }

    /** The report or investigation related to the case. */
    public Builder utredning(String id) {
      this.utredning = new ExpandableField<>(id);
      return this;
    }

    /** The recommendation or proposition for the case. */
    public Builder innstilling(MoetesaksbeskrivelseRequest innstilling) {
      this.innstilling = new ExpandableField<>(innstilling);
      return this;
    }

    /** The recommendation or proposition for the case. */
    public Builder innstilling(String id) {
      this.innstilling = new ExpandableField<>(id);
      return this;
    }

    /** The decision made in the case. */
    public Builder vedtak(VedtakRequest vedtak) {
      this.vedtak = new ExpandableField<>(vedtak);
      return this;
    }

    /** The decision made in the case. */
    public Builder vedtak(String id) {
      this.vedtak = new ExpandableField<>(id);
      return this;
    }

    /** The meeting record this case belongs to. */
    public Builder moetemappe(MoetemappeRequest moetemappe) {
      this.moetemappe = new ExpandableField<>(moetemappe);
      return this;
    }

    /** The meeting record this case belongs to. */
    public Builder moetemappe(String id) {
      this.moetemappe = new ExpandableField<>(id);
      return this;
    }

    /** Legacy field for the meeting case type. */
    public Builder legacyMoetesakstype(String legacyMoetesakstype) {
      this.legacyMoetesakstype = legacyMoetesakstype;
      return this;
    }

    /** Legacy field for a reference to another meeting case. */
    public Builder legacyReferanseTilMoetesak(String legacyReferanseTilMoetesak) {
      this.legacyReferanseTilMoetesak = legacyReferanseTilMoetesak;
      return this;
    }

    public MoetesakRequest build() {
      return new MoetesakRequest(
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
          this.moetesakstype,
          this.moetesaksaar,
          this.moetesakssekvensnummer,
          this.utvalg,
          this.videoLink,
          this.utredning,
          this.innstilling,
          this.vedtak,
          this.moetemappe,
          this.legacyMoetesakstype,
          this.legacyReferanseTilMoetesak);
    }
  }
}
