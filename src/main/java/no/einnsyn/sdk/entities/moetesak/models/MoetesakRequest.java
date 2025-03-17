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

/** Moetesak */
public class MoetesakRequest extends RegistreringRequest {
  protected MoetesakstypeEnum moetesakstype;

  protected Integer moetesaksaar;

  protected Integer moetesakssekvensnummer;

  protected String utvalg;

  protected String videoLink;

  protected ExpandableField<UtredningRequest> utredning;

  protected ExpandableField<MoetesaksbeskrivelseRequest> innstilling;

  protected ExpandableField<VedtakRequest> vedtak;

  protected ExpandableField<MoetemappeRequest> moetemappe;

  protected String legacyMoetesakstype;

  protected String legacyReferanseTilMoetesak;

  public MoetesakRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
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

  public MoetesakstypeEnum getMoetesakstype() {
    return moetesakstype;
  }

  public Integer getMoetesaksaar() {
    return moetesaksaar;
  }

  public Integer getMoetesakssekvensnummer() {
    return moetesakssekvensnummer;
  }

  public String getUtvalg() {
    return utvalg;
  }

  public String getVideoLink() {
    return videoLink;
  }

  public ExpandableField<UtredningRequest> getUtredning() {
    return utredning;
  }

  public ExpandableField<MoetesaksbeskrivelseRequest> getInnstilling() {
    return innstilling;
  }

  public ExpandableField<VedtakRequest> getVedtak() {
    return vedtak;
  }

  public ExpandableField<MoetemappeRequest> getMoetemappe() {
    return moetemappe;
  }

  public String getLegacyMoetesakstype() {
    return legacyMoetesakstype;
  }

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

    protected MoetesakstypeEnum moetesakstype;

    protected Integer moetesaksaar;

    protected Integer moetesakssekvensnummer;

    protected String utvalg;

    protected String videoLink;

    protected ExpandableField<UtredningRequest> utredning;

    protected ExpandableField<MoetesaksbeskrivelseRequest> innstilling;

    protected ExpandableField<VedtakRequest> vedtak;

    protected ExpandableField<MoetemappeRequest> moetemappe;

    protected String legacyMoetesakstype;

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

    public MoetesakstypeEnum getMoetesakstype() {
      return moetesakstype;
    }

    public Integer getMoetesaksaar() {
      return moetesaksaar;
    }

    public Integer getMoetesakssekvensnummer() {
      return moetesakssekvensnummer;
    }

    public String getUtvalg() {
      return utvalg;
    }

    public String getVideoLink() {
      return videoLink;
    }

    public ExpandableField<UtredningRequest> getUtredning() {
      return utredning;
    }

    public ExpandableField<MoetesaksbeskrivelseRequest> getInnstilling() {
      return innstilling;
    }

    public ExpandableField<VedtakRequest> getVedtak() {
      return vedtak;
    }

    public ExpandableField<MoetemappeRequest> getMoetemappe() {
      return moetemappe;
    }

    public String getLegacyMoetesakstype() {
      return legacyMoetesakstype;
    }

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

    public Builder moetesakstype(MoetesakstypeEnum moetesakstype) {
      this.moetesakstype = moetesakstype;
      return this;
    }

    public Builder moetesaksaar(Integer moetesaksaar) {
      this.moetesaksaar = moetesaksaar;
      return this;
    }

    public Builder moetesakssekvensnummer(Integer moetesakssekvensnummer) {
      this.moetesakssekvensnummer = moetesakssekvensnummer;
      return this;
    }

    public Builder utvalg(String utvalg) {
      this.utvalg = utvalg;
      return this;
    }

    public Builder videoLink(String videoLink) {
      this.videoLink = videoLink;
      return this;
    }

    public Builder utredning(UtredningRequest utredning) {
      this.utredning = new ExpandableField<>(utredning);
      return this;
    }

    public Builder utredning(String id) {
      this.utredning = new ExpandableField<>(id);
      return this;
    }

    public Builder innstilling(MoetesaksbeskrivelseRequest innstilling) {
      this.innstilling = new ExpandableField<>(innstilling);
      return this;
    }

    public Builder innstilling(String id) {
      this.innstilling = new ExpandableField<>(id);
      return this;
    }

    public Builder vedtak(VedtakRequest vedtak) {
      this.vedtak = new ExpandableField<>(vedtak);
      return this;
    }

    public Builder vedtak(String id) {
      this.vedtak = new ExpandableField<>(id);
      return this;
    }

    public Builder moetemappe(MoetemappeRequest moetemappe) {
      this.moetemappe = new ExpandableField<>(moetemappe);
      return this;
    }

    public Builder moetemappe(String id) {
      this.moetemappe = new ExpandableField<>(id);
      return this;
    }

    public Builder legacyMoetesakstype(String legacyMoetesakstype) {
      this.legacyMoetesakstype = legacyMoetesakstype;
      return this;
    }

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
