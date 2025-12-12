// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.enhet.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.Base;

/**
 * Represents an organizational unit within the public sector, such as a municipality, a government
 * agency, or a department. This is a central model for identifying the public entities that own and
 * manage the information in eInnsyn.
 */
public class Enhet extends Base {
  protected final String entity = "Enhet";

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
  protected List<ExpandableField<Enhet>> underenhet;

  /** The unit that is responsible for handling tasks on behalf of this unit. */
  protected ExpandableField<Enhet> handteresAv;

  /** The parent unit in the organizational hierarchy. */
  protected ExpandableField<Enhet> parent;

  public String getEntity() {
    return entity;
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
  public List<ExpandableField<Enhet>> getUnderenhet() {
    return underenhet;
  }

  /** The unit that is responsible for handling tasks on behalf of this unit. */
  public ExpandableField<Enhet> getHandteresAv() {
    return handteresAv;
  }

  /** The parent unit in the organizational hierarchy. */
  public ExpandableField<Enhet> getParent() {
    return parent;
  }
}
