// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.enhet.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.BaseRequest;

/**
 * Represents an organizational unit within the public sector, such as a municipality, a government
 * agency, or a department. This is a central model for identifying the public entities that own and
 * manage the information in eInnsyn.
 */
public class EnhetRequest extends BaseRequest {
  /** A URL-friendly unique slug for the resource. */
  protected String slug;

  /** The official name of the unit in Norwegian bokmål. */
  protected String navn;

  /** The name of the unit in Norwegian nynorsk. */
  protected String navnNynorsk;

  /** The name of the unit in English. */
  protected String navnEngelsk;

  /** The name of the unit in Sami. */
  protected String navnSami;

  /** The 9-digit organization number from the Brønnøysund Register Centre. */
  protected String orgnummer;

  /** An internal code or identifier for the unit. */
  protected String enhetskode;

  /** The postal address for the unit's contact point. */
  protected String kontaktpunktAdresse;

  /** The primary contact email address for the unit. */
  protected String kontaktpunktEpost;

  /** The primary contact phone number for the unit. */
  protected String kontaktpunktTelefon;

  /** The dedicated email address for receiving Freedom of Information (FOI) requests. */
  protected String innsynskravEpost;

  /** The type of the organizational unit. */
  protected EnhetstypeEnum enhetstype;

  /** The date when the unit was officially dissolved or became inactive. */
  protected String avsluttetDato;

  /** If true, this unit should be hidden from public view. */
  protected Boolean skjult;

  /** If true, this unit is configured to use the eFormidling platform for digital communication. */
  protected Boolean eFormidling;

  /** If true, this is a technical or system-internal unit, not a real-world organizational unit. */
  protected Boolean teknisk;

  /** A flag indicating if legacy identifiers for this unit should be converted. */
  protected Boolean skalKonvertereId;

  /** A flag indicating if the unit should receive receipts for submissions. */
  protected Boolean skalMottaKvittering;

  /** A UI hint to display this unit as a top-level node in a hierarchy. */
  protected Boolean visToppnode;

  /** The version of the order XML format used by this unit. */
  protected Integer orderXmlVersjon;

  /** A list of sub-units belonging to this unit. */
  protected List<ExpandableField<EnhetRequest>> underenhet;

  /** The unit that is responsible for handling tasks on behalf of this unit. */
  protected ExpandableField<EnhetRequest> handteresAv;

  /** The parent unit in the organizational hierarchy. */
  protected ExpandableField<EnhetRequest> parent;

  public EnhetRequest(
      String externalId,
      String accessibleAfter,
      String slug,
      String navn,
      String navnNynorsk,
      String navnEngelsk,
      String navnSami,
      String orgnummer,
      String enhetskode,
      String kontaktpunktAdresse,
      String kontaktpunktEpost,
      String kontaktpunktTelefon,
      String innsynskravEpost,
      EnhetstypeEnum enhetstype,
      String avsluttetDato,
      Boolean skjult,
      Boolean eFormidling,
      Boolean teknisk,
      Boolean skalKonvertereId,
      Boolean skalMottaKvittering,
      Boolean visToppnode,
      Integer orderXmlVersjon,
      List<ExpandableField<EnhetRequest>> underenhet,
      ExpandableField<EnhetRequest> handteresAv,
      ExpandableField<EnhetRequest> parent) {
    super(externalId, accessibleAfter);
    this.slug = slug;
    this.navn = navn;
    this.navnNynorsk = navnNynorsk;
    this.navnEngelsk = navnEngelsk;
    this.navnSami = navnSami;
    this.orgnummer = orgnummer;
    this.enhetskode = enhetskode;
    this.kontaktpunktAdresse = kontaktpunktAdresse;
    this.kontaktpunktEpost = kontaktpunktEpost;
    this.kontaktpunktTelefon = kontaktpunktTelefon;
    this.innsynskravEpost = innsynskravEpost;
    this.enhetstype = enhetstype;
    this.avsluttetDato = avsluttetDato;
    this.skjult = skjult;
    this.eFormidling = eFormidling;
    this.teknisk = teknisk;
    this.skalKonvertereId = skalKonvertereId;
    this.skalMottaKvittering = skalMottaKvittering;
    this.visToppnode = visToppnode;
    this.orderXmlVersjon = orderXmlVersjon;
    this.underenhet = underenhet;
    this.handteresAv = handteresAv;
    this.parent = parent;
  }

  /** A URL-friendly unique slug for the resource. */
  public String getSlug() {
    return slug;
  }

  /** The official name of the unit in Norwegian bokmål. */
  public String getNavn() {
    return navn;
  }

  /** The name of the unit in Norwegian nynorsk. */
  public String getNavnNynorsk() {
    return navnNynorsk;
  }

  /** The name of the unit in English. */
  public String getNavnEngelsk() {
    return navnEngelsk;
  }

  /** The name of the unit in Sami. */
  public String getNavnSami() {
    return navnSami;
  }

  /** The 9-digit organization number from the Brønnøysund Register Centre. */
  public String getOrgnummer() {
    return orgnummer;
  }

  /** An internal code or identifier for the unit. */
  public String getEnhetskode() {
    return enhetskode;
  }

  /** The postal address for the unit's contact point. */
  public String getKontaktpunktAdresse() {
    return kontaktpunktAdresse;
  }

  /** The primary contact email address for the unit. */
  public String getKontaktpunktEpost() {
    return kontaktpunktEpost;
  }

  /** The primary contact phone number for the unit. */
  public String getKontaktpunktTelefon() {
    return kontaktpunktTelefon;
  }

  /** The dedicated email address for receiving Freedom of Information (FOI) requests. */
  public String getInnsynskravEpost() {
    return innsynskravEpost;
  }

  /** The type of the organizational unit. */
  public EnhetstypeEnum getEnhetstype() {
    return enhetstype;
  }

  /** The date when the unit was officially dissolved or became inactive. */
  public String getAvsluttetDato() {
    return avsluttetDato;
  }

  /** If true, this unit should be hidden from public view. */
  public Boolean getSkjult() {
    return skjult;
  }

  /** If true, this unit is configured to use the eFormidling platform for digital communication. */
  public Boolean getEFormidling() {
    return eFormidling;
  }

  /** If true, this is a technical or system-internal unit, not a real-world organizational unit. */
  public Boolean getTeknisk() {
    return teknisk;
  }

  /** A flag indicating if legacy identifiers for this unit should be converted. */
  public Boolean getSkalKonvertereId() {
    return skalKonvertereId;
  }

  /** A flag indicating if the unit should receive receipts for submissions. */
  public Boolean getSkalMottaKvittering() {
    return skalMottaKvittering;
  }

  /** A UI hint to display this unit as a top-level node in a hierarchy. */
  public Boolean getVisToppnode() {
    return visToppnode;
  }

  /** The version of the order XML format used by this unit. */
  public Integer getOrderXmlVersjon() {
    return orderXmlVersjon;
  }

  /** A list of sub-units belonging to this unit. */
  public List<ExpandableField<EnhetRequest>> getUnderenhet() {
    return underenhet;
  }

  /** The unit that is responsible for handling tasks on behalf of this unit. */
  public ExpandableField<EnhetRequest> getHandteresAv() {
    return handteresAv;
  }

  /** The parent unit in the organizational hierarchy. */
  public ExpandableField<EnhetRequest> getParent() {
    return parent;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static EnhetRequest of(Function<Builder, Builder> builderFunction) {
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

    /** A URL-friendly unique slug for the resource. */
    protected String slug;

    /** The official name of the unit in Norwegian bokmål. */
    protected String navn;

    /** The name of the unit in Norwegian nynorsk. */
    protected String navnNynorsk;

    /** The name of the unit in English. */
    protected String navnEngelsk;

    /** The name of the unit in Sami. */
    protected String navnSami;

    /** The 9-digit organization number from the Brønnøysund Register Centre. */
    protected String orgnummer;

    /** An internal code or identifier for the unit. */
    protected String enhetskode;

    /** The postal address for the unit's contact point. */
    protected String kontaktpunktAdresse;

    /** The primary contact email address for the unit. */
    protected String kontaktpunktEpost;

    /** The primary contact phone number for the unit. */
    protected String kontaktpunktTelefon;

    /** The dedicated email address for receiving Freedom of Information (FOI) requests. */
    protected String innsynskravEpost;

    /** The type of the organizational unit. */
    protected EnhetstypeEnum enhetstype;

    /** The date when the unit was officially dissolved or became inactive. */
    protected String avsluttetDato;

    /** If true, this unit should be hidden from public view. */
    protected Boolean skjult;

    /**
     * If true, this unit is configured to use the eFormidling platform for digital communication.
     */
    protected Boolean eFormidling;

    /**
     * If true, this is a technical or system-internal unit, not a real-world organizational unit.
     */
    protected Boolean teknisk;

    /** A flag indicating if legacy identifiers for this unit should be converted. */
    protected Boolean skalKonvertereId;

    /** A flag indicating if the unit should receive receipts for submissions. */
    protected Boolean skalMottaKvittering;

    /** A UI hint to display this unit as a top-level node in a hierarchy. */
    protected Boolean visToppnode;

    /** The version of the order XML format used by this unit. */
    protected Integer orderXmlVersjon;

    /** A list of sub-units belonging to this unit. */
    protected List<ExpandableField<EnhetRequest>> underenhet;

    /** The unit that is responsible for handling tasks on behalf of this unit. */
    protected ExpandableField<EnhetRequest> handteresAv;

    /** The parent unit in the organizational hierarchy. */
    protected ExpandableField<EnhetRequest> parent;

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

    /** A URL-friendly unique slug for the resource. */
    public String getSlug() {
      return slug;
    }

    /** The official name of the unit in Norwegian bokmål. */
    public String getNavn() {
      return navn;
    }

    /** The name of the unit in Norwegian nynorsk. */
    public String getNavnNynorsk() {
      return navnNynorsk;
    }

    /** The name of the unit in English. */
    public String getNavnEngelsk() {
      return navnEngelsk;
    }

    /** The name of the unit in Sami. */
    public String getNavnSami() {
      return navnSami;
    }

    /** The 9-digit organization number from the Brønnøysund Register Centre. */
    public String getOrgnummer() {
      return orgnummer;
    }

    /** An internal code or identifier for the unit. */
    public String getEnhetskode() {
      return enhetskode;
    }

    /** The postal address for the unit's contact point. */
    public String getKontaktpunktAdresse() {
      return kontaktpunktAdresse;
    }

    /** The primary contact email address for the unit. */
    public String getKontaktpunktEpost() {
      return kontaktpunktEpost;
    }

    /** The primary contact phone number for the unit. */
    public String getKontaktpunktTelefon() {
      return kontaktpunktTelefon;
    }

    /** The dedicated email address for receiving Freedom of Information (FOI) requests. */
    public String getInnsynskravEpost() {
      return innsynskravEpost;
    }

    /** The type of the organizational unit. */
    public EnhetstypeEnum getEnhetstype() {
      return enhetstype;
    }

    /** The date when the unit was officially dissolved or became inactive. */
    public String getAvsluttetDato() {
      return avsluttetDato;
    }

    /** If true, this unit should be hidden from public view. */
    public Boolean getSkjult() {
      return skjult;
    }

    /**
     * If true, this unit is configured to use the eFormidling platform for digital communication.
     */
    public Boolean getEFormidling() {
      return eFormidling;
    }

    /**
     * If true, this is a technical or system-internal unit, not a real-world organizational unit.
     */
    public Boolean getTeknisk() {
      return teknisk;
    }

    /** A flag indicating if legacy identifiers for this unit should be converted. */
    public Boolean getSkalKonvertereId() {
      return skalKonvertereId;
    }

    /** A flag indicating if the unit should receive receipts for submissions. */
    public Boolean getSkalMottaKvittering() {
      return skalMottaKvittering;
    }

    /** A UI hint to display this unit as a top-level node in a hierarchy. */
    public Boolean getVisToppnode() {
      return visToppnode;
    }

    /** The version of the order XML format used by this unit. */
    public Integer getOrderXmlVersjon() {
      return orderXmlVersjon;
    }

    /** A list of sub-units belonging to this unit. */
    public List<ExpandableField<EnhetRequest>> getUnderenhet() {
      return underenhet;
    }

    /** The unit that is responsible for handling tasks on behalf of this unit. */
    public ExpandableField<EnhetRequest> getHandteresAv() {
      return handteresAv;
    }

    /** The parent unit in the organizational hierarchy. */
    public ExpandableField<EnhetRequest> getParent() {
      return parent;
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

    /** A URL-friendly unique slug for the resource. */
    public Builder slug(String slug) {
      this.slug = slug;
      return this;
    }

    /** The official name of the unit in Norwegian bokmål. */
    public Builder navn(String navn) {
      this.navn = navn;
      return this;
    }

    /** The name of the unit in Norwegian nynorsk. */
    public Builder navnNynorsk(String navnNynorsk) {
      this.navnNynorsk = navnNynorsk;
      return this;
    }

    /** The name of the unit in English. */
    public Builder navnEngelsk(String navnEngelsk) {
      this.navnEngelsk = navnEngelsk;
      return this;
    }

    /** The name of the unit in Sami. */
    public Builder navnSami(String navnSami) {
      this.navnSami = navnSami;
      return this;
    }

    /** The 9-digit organization number from the Brønnøysund Register Centre. */
    public Builder orgnummer(String orgnummer) {
      this.orgnummer = orgnummer;
      return this;
    }

    /** An internal code or identifier for the unit. */
    public Builder enhetskode(String enhetskode) {
      this.enhetskode = enhetskode;
      return this;
    }

    /** The postal address for the unit's contact point. */
    public Builder kontaktpunktAdresse(String kontaktpunktAdresse) {
      this.kontaktpunktAdresse = kontaktpunktAdresse;
      return this;
    }

    /** The primary contact email address for the unit. */
    public Builder kontaktpunktEpost(String kontaktpunktEpost) {
      this.kontaktpunktEpost = kontaktpunktEpost;
      return this;
    }

    /** The primary contact phone number for the unit. */
    public Builder kontaktpunktTelefon(String kontaktpunktTelefon) {
      this.kontaktpunktTelefon = kontaktpunktTelefon;
      return this;
    }

    /** The dedicated email address for receiving Freedom of Information (FOI) requests. */
    public Builder innsynskravEpost(String innsynskravEpost) {
      this.innsynskravEpost = innsynskravEpost;
      return this;
    }

    /** The type of the organizational unit. */
    public Builder enhetstype(EnhetstypeEnum enhetstype) {
      this.enhetstype = enhetstype;
      return this;
    }

    /** The date when the unit was officially dissolved or became inactive. */
    public Builder avsluttetDato(String avsluttetDato) {
      this.avsluttetDato = avsluttetDato;
      return this;
    }

    /** If true, this unit should be hidden from public view. */
    public Builder skjult(Boolean skjult) {
      this.skjult = skjult;
      return this;
    }

    /**
     * If true, this unit is configured to use the eFormidling platform for digital communication.
     */
    public Builder eFormidling(Boolean eFormidling) {
      this.eFormidling = eFormidling;
      return this;
    }

    /**
     * If true, this is a technical or system-internal unit, not a real-world organizational unit.
     */
    public Builder teknisk(Boolean teknisk) {
      this.teknisk = teknisk;
      return this;
    }

    /** A flag indicating if legacy identifiers for this unit should be converted. */
    public Builder skalKonvertereId(Boolean skalKonvertereId) {
      this.skalKonvertereId = skalKonvertereId;
      return this;
    }

    /** A flag indicating if the unit should receive receipts for submissions. */
    public Builder skalMottaKvittering(Boolean skalMottaKvittering) {
      this.skalMottaKvittering = skalMottaKvittering;
      return this;
    }

    /** A UI hint to display this unit as a top-level node in a hierarchy. */
    public Builder visToppnode(Boolean visToppnode) {
      this.visToppnode = visToppnode;
      return this;
    }

    /** The version of the order XML format used by this unit. */
    public Builder orderXmlVersjon(Integer orderXmlVersjon) {
      this.orderXmlVersjon = orderXmlVersjon;
      return this;
    }

    /** A list of sub-units belonging to this unit. */
    public Builder underenhet(List<EnhetRequest> underenhet) {
      this.underenhet = underenhet.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    /** A list of sub-units belonging to this unit. */
    public Builder addUnderenhet(EnhetRequest underenhet) {
      if (this.underenhet == null) {
        this.underenhet = new ArrayList<>();
      }
      this.underenhet.add(new ExpandableField<EnhetRequest>(underenhet));
      return this;
    }

    /** A list of sub-units belonging to this unit. */
    public Builder addUnderenhet(
        Function<EnhetRequest.Builder, EnhetRequest.Builder> builderFunction) {
      if (this.underenhet == null) {
        this.underenhet = new ArrayList<>();
      }
      this.underenhet.add(
          new ExpandableField<>(builderFunction.apply(new EnhetRequest.Builder()).build()));
      return this;
    }

    /** A list of sub-units belonging to this unit. */
    public Builder addUnderenhet(String id) {
      if (this.underenhet == null) {
        this.underenhet = new ArrayList<>();
      }
      this.underenhet.add(new ExpandableField<>(id));
      return this;
    }

    /** The unit that is responsible for handling tasks on behalf of this unit. */
    public Builder handteresAv(EnhetRequest handteresAv) {
      this.handteresAv = new ExpandableField<>(handteresAv);
      return this;
    }

    /** The unit that is responsible for handling tasks on behalf of this unit. */
    public Builder handteresAv(String id) {
      this.handteresAv = new ExpandableField<>(id);
      return this;
    }

    /** The parent unit in the organizational hierarchy. */
    public Builder parent(EnhetRequest parent) {
      this.parent = new ExpandableField<>(parent);
      return this;
    }

    /** The parent unit in the organizational hierarchy. */
    public Builder parent(String id) {
      this.parent = new ExpandableField<>(id);
      return this;
    }

    public EnhetRequest build() {
      return new EnhetRequest(
          this.externalId,
          this.accessibleAfter,
          this.slug,
          this.navn,
          this.navnNynorsk,
          this.navnEngelsk,
          this.navnSami,
          this.orgnummer,
          this.enhetskode,
          this.kontaktpunktAdresse,
          this.kontaktpunktEpost,
          this.kontaktpunktTelefon,
          this.innsynskravEpost,
          this.enhetstype,
          this.avsluttetDato,
          this.skjult,
          this.eFormidling,
          this.teknisk,
          this.skalKonvertereId,
          this.skalMottaKvittering,
          this.visToppnode,
          this.orderXmlVersjon,
          this.underenhet,
          this.handteresAv,
          this.parent);
    }
  }
}
