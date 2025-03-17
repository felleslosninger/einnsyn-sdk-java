// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.saksmappe.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;
import no.einnsyn.sdk.entities.journalpost.models.JournalpostRequest;
import no.einnsyn.sdk.entities.klasse.models.KlasseRequest;
import no.einnsyn.sdk.entities.mappe.models.MappeRequest;

/** Saksmappe */
public class SaksmappeRequest extends MappeRequest {
  protected Integer saksaar;

  protected Integer sakssekvensnummer;

  protected String saksnummer;

  protected String saksdato;

  protected List<ExpandableField<JournalpostRequest>> journalpost;

  /** A code for the administrative Enhet associated with this Saksmappe. */
  protected String administrativEnhet;

  public SaksmappeRequest(
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
      Integer saksaar,
      Integer sakssekvensnummer,
      String saksnummer,
      String saksdato,
      List<ExpandableField<JournalpostRequest>> journalpost,
      String administrativEnhet) {
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
    this.saksaar = saksaar;
    this.sakssekvensnummer = sakssekvensnummer;
    this.saksnummer = saksnummer;
    this.saksdato = saksdato;
    this.journalpost = journalpost;
    this.administrativEnhet = administrativEnhet;
  }

  public Integer getSaksaar() {
    return saksaar;
  }

  public Integer getSakssekvensnummer() {
    return sakssekvensnummer;
  }

  public String getSaksnummer() {
    return saksnummer;
  }

  public String getSaksdato() {
    return saksdato;
  }

  public List<ExpandableField<JournalpostRequest>> getJournalpost() {
    return journalpost;
  }

  /** A code for the administrative Enhet associated with this Saksmappe. */
  public String getAdministrativEnhet() {
    return administrativEnhet;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static SaksmappeRequest of(Function<Builder, Builder> builderFunction) {
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

    protected Integer saksaar;

    protected Integer sakssekvensnummer;

    protected String saksnummer;

    protected String saksdato;

    protected List<ExpandableField<JournalpostRequest>> journalpost;

    /** A code for the administrative Enhet associated with this Saksmappe. */
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

    public Integer getSaksaar() {
      return saksaar;
    }

    public Integer getSakssekvensnummer() {
      return sakssekvensnummer;
    }

    public String getSaksnummer() {
      return saksnummer;
    }

    public String getSaksdato() {
      return saksdato;
    }

    public List<ExpandableField<JournalpostRequest>> getJournalpost() {
      return journalpost;
    }

    /** A code for the administrative Enhet associated with this Saksmappe. */
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

    public Builder saksaar(Integer saksaar) {
      this.saksaar = saksaar;
      return this;
    }

    public Builder sakssekvensnummer(Integer sakssekvensnummer) {
      this.sakssekvensnummer = sakssekvensnummer;
      return this;
    }

    public Builder saksnummer(String saksnummer) {
      this.saksnummer = saksnummer;
      return this;
    }

    public Builder saksdato(String saksdato) {
      this.saksdato = saksdato;
      return this;
    }

    public Builder journalpost(List<JournalpostRequest> journalpost) {
      this.journalpost =
          journalpost.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    public Builder addJournalpost(JournalpostRequest journalpost) {
      if (this.journalpost == null) {
        this.journalpost = new ArrayList<>();
      }
      this.journalpost.add(new ExpandableField<JournalpostRequest>(journalpost));
      return this;
    }

    public Builder addJournalpost(
        Function<JournalpostRequest.Builder, JournalpostRequest.Builder> builderFunction) {
      if (this.journalpost == null) {
        this.journalpost = new ArrayList<>();
      }
      this.journalpost.add(
          new ExpandableField<>(builderFunction.apply(new JournalpostRequest.Builder()).build()));
      return this;
    }

    public Builder addJournalpost(String id) {
      if (this.journalpost == null) {
        this.journalpost = new ArrayList<>();
      }
      this.journalpost.add(new ExpandableField<>(id));
      return this;
    }

    /** A code for the administrative Enhet associated with this Saksmappe. */
    public Builder administrativEnhet(String administrativEnhet) {
      this.administrativEnhet = administrativEnhet;
      return this;
    }

    public SaksmappeRequest build() {
      return new SaksmappeRequest(
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
          this.saksaar,
          this.sakssekvensnummer,
          this.saksnummer,
          this.saksdato,
          this.journalpost,
          this.administrativEnhet);
    }
  }
}
