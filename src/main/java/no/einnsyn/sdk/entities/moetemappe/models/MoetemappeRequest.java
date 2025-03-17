// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetemappe.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;
import no.einnsyn.sdk.entities.klasse.models.KlasseRequest;
import no.einnsyn.sdk.entities.mappe.models.MappeRequest;
import no.einnsyn.sdk.entities.moetedokument.models.MoetedokumentRequest;
import no.einnsyn.sdk.entities.moetesak.models.MoetesakRequest;

/** Moetemappe */
public class MoetemappeRequest extends MappeRequest {
  protected String moetenummer;

  protected String utvalg;

  protected String moetedato;

  protected String moetested;

  protected String videoLink;

  protected ExpandableField<MoetemappeRequest> referanseForrigeMoete;

  protected ExpandableField<MoetemappeRequest> referanseNesteMoete;

  protected List<ExpandableField<MoetedokumentRequest>> moetedokument;

  protected List<ExpandableField<MoetesakRequest>> moetesak;

  public MoetemappeRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String offentligTittel,
      String offentligTittelSensitiv,
      String beskrivelse,
      String noekkelord,
      String publisertDato,
      String oppdatertDato,
      ExpandableField<KlasseRequest> klasse,
      String moetenummer,
      String utvalg,
      String moetedato,
      String moetested,
      String videoLink,
      ExpandableField<MoetemappeRequest> referanseForrigeMoete,
      ExpandableField<MoetemappeRequest> referanseNesteMoete,
      List<ExpandableField<MoetedokumentRequest>> moetedokument,
      List<ExpandableField<MoetesakRequest>> moetesak) {
    super(
        externalId,
        accessibleAfter,
        systemId,
        journalenhet,
        offentligTittel,
        offentligTittelSensitiv,
        beskrivelse,
        noekkelord,
        publisertDato,
        oppdatertDato,
        klasse);
    this.moetenummer = moetenummer;
    this.utvalg = utvalg;
    this.moetedato = moetedato;
    this.moetested = moetested;
    this.videoLink = videoLink;
    this.referanseForrigeMoete = referanseForrigeMoete;
    this.referanseNesteMoete = referanseNesteMoete;
    this.moetedokument = moetedokument;
    this.moetesak = moetesak;
  }

  public String getMoetenummer() {
    return moetenummer;
  }

  public String getUtvalg() {
    return utvalg;
  }

  public String getMoetedato() {
    return moetedato;
  }

  public String getMoetested() {
    return moetested;
  }

  public String getVideoLink() {
    return videoLink;
  }

  public ExpandableField<MoetemappeRequest> getReferanseForrigeMoete() {
    return referanseForrigeMoete;
  }

  public ExpandableField<MoetemappeRequest> getReferanseNesteMoete() {
    return referanseNesteMoete;
  }

  public List<ExpandableField<MoetedokumentRequest>> getMoetedokument() {
    return moetedokument;
  }

  public List<ExpandableField<MoetesakRequest>> getMoetesak() {
    return moetesak;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MoetemappeRequest of(Function<Builder, Builder> builderFunction) {
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

    protected String moetenummer;

    protected String utvalg;

    protected String moetedato;

    protected String moetested;

    protected String videoLink;

    protected ExpandableField<MoetemappeRequest> referanseForrigeMoete;

    protected ExpandableField<MoetemappeRequest> referanseNesteMoete;

    protected List<ExpandableField<MoetedokumentRequest>> moetedokument;

    protected List<ExpandableField<MoetesakRequest>> moetesak;

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

    public String getMoetenummer() {
      return moetenummer;
    }

    public String getUtvalg() {
      return utvalg;
    }

    public String getMoetedato() {
      return moetedato;
    }

    public String getMoetested() {
      return moetested;
    }

    public String getVideoLink() {
      return videoLink;
    }

    public ExpandableField<MoetemappeRequest> getReferanseForrigeMoete() {
      return referanseForrigeMoete;
    }

    public ExpandableField<MoetemappeRequest> getReferanseNesteMoete() {
      return referanseNesteMoete;
    }

    public List<ExpandableField<MoetedokumentRequest>> getMoetedokument() {
      return moetedokument;
    }

    public List<ExpandableField<MoetesakRequest>> getMoetesak() {
      return moetesak;
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

    public Builder moetenummer(String moetenummer) {
      this.moetenummer = moetenummer;
      return this;
    }

    public Builder utvalg(String utvalg) {
      this.utvalg = utvalg;
      return this;
    }

    public Builder moetedato(String moetedato) {
      this.moetedato = moetedato;
      return this;
    }

    public Builder moetested(String moetested) {
      this.moetested = moetested;
      return this;
    }

    public Builder videoLink(String videoLink) {
      this.videoLink = videoLink;
      return this;
    }

    public Builder referanseForrigeMoete(MoetemappeRequest referanseForrigeMoete) {
      this.referanseForrigeMoete = new ExpandableField<>(referanseForrigeMoete);
      return this;
    }

    public Builder referanseForrigeMoete(String id) {
      this.referanseForrigeMoete = new ExpandableField<>(id);
      return this;
    }

    public Builder referanseNesteMoete(MoetemappeRequest referanseNesteMoete) {
      this.referanseNesteMoete = new ExpandableField<>(referanseNesteMoete);
      return this;
    }

    public Builder referanseNesteMoete(String id) {
      this.referanseNesteMoete = new ExpandableField<>(id);
      return this;
    }

    public Builder moetedokument(List<MoetedokumentRequest> moetedokument) {
      this.moetedokument =
          moetedokument.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    public Builder addMoetedokument(MoetedokumentRequest moetedokument) {
      if (this.moetedokument == null) {
        this.moetedokument = new ArrayList<>();
      }
      this.moetedokument.add(new ExpandableField<MoetedokumentRequest>(moetedokument));
      return this;
    }

    public Builder addMoetedokument(
        Function<MoetedokumentRequest.Builder, MoetedokumentRequest.Builder> builderFunction) {
      if (this.moetedokument == null) {
        this.moetedokument = new ArrayList<>();
      }
      this.moetedokument.add(
          new ExpandableField<>(builderFunction.apply(new MoetedokumentRequest.Builder()).build()));
      return this;
    }

    public Builder addMoetedokument(String id) {
      if (this.moetedokument == null) {
        this.moetedokument = new ArrayList<>();
      }
      this.moetedokument.add(new ExpandableField<>(id));
      return this;
    }

    public Builder moetesak(List<MoetesakRequest> moetesak) {
      this.moetesak = moetesak.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    public Builder addMoetesak(MoetesakRequest moetesak) {
      if (this.moetesak == null) {
        this.moetesak = new ArrayList<>();
      }
      this.moetesak.add(new ExpandableField<MoetesakRequest>(moetesak));
      return this;
    }

    public Builder addMoetesak(
        Function<MoetesakRequest.Builder, MoetesakRequest.Builder> builderFunction) {
      if (this.moetesak == null) {
        this.moetesak = new ArrayList<>();
      }
      this.moetesak.add(
          new ExpandableField<>(builderFunction.apply(new MoetesakRequest.Builder()).build()));
      return this;
    }

    public Builder addMoetesak(String id) {
      if (this.moetesak == null) {
        this.moetesak = new ArrayList<>();
      }
      this.moetesak.add(new ExpandableField<>(id));
      return this;
    }

    public MoetemappeRequest build() {
      return new MoetemappeRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.offentligTittel,
          this.offentligTittelSensitiv,
          this.beskrivelse,
          this.noekkelord,
          this.publisertDato,
          this.oppdatertDato,
          this.klasse,
          this.moetenummer,
          this.utvalg,
          this.moetedato,
          this.moetested,
          this.videoLink,
          this.referanseForrigeMoete,
          this.referanseNesteMoete,
          this.moetedokument,
          this.moetesak);
    }
  }
}
