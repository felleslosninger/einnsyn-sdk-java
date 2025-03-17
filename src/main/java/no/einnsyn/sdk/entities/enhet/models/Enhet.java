// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.enhet.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.Base;

/** eInnsyn Enhet */
public class Enhet extends Base {
  protected final String entity = "Enhet";

  protected String navn;

  protected String navnNynorsk;

  protected String navnEngelsk;

  protected String navnSami;

  protected String orgnummer;

  protected String enhetskode;

  protected String kontaktpunktAdresse;

  protected String kontaktpunktEpost;

  protected String kontaktpunktTelefon;

  protected String innsynskravEpost;

  protected EnhetstypeEnum enhetstype;

  protected String avsluttetDato;

  protected Boolean skjult;

  protected Boolean eFormidling;

  protected Boolean teknisk;

  protected Boolean skalKonvertereId;

  protected Boolean skalMottaKvittering;

  protected Boolean visToppnode;

  protected Integer orderXmlVersjon;

  protected List<ExpandableField<Enhet>> underenhet;

  protected ExpandableField<Enhet> handteresAv;

  protected ExpandableField<Enhet> parent;

  public String getEntity() {
    return entity;
  }

  public String getNavn() {
    return navn;
  }

  public String getNavnNynorsk() {
    return navnNynorsk;
  }

  public String getNavnEngelsk() {
    return navnEngelsk;
  }

  public String getNavnSami() {
    return navnSami;
  }

  public String getOrgnummer() {
    return orgnummer;
  }

  public String getEnhetskode() {
    return enhetskode;
  }

  public String getKontaktpunktAdresse() {
    return kontaktpunktAdresse;
  }

  public String getKontaktpunktEpost() {
    return kontaktpunktEpost;
  }

  public String getKontaktpunktTelefon() {
    return kontaktpunktTelefon;
  }

  public String getInnsynskravEpost() {
    return innsynskravEpost;
  }

  public EnhetstypeEnum getEnhetstype() {
    return enhetstype;
  }

  public String getAvsluttetDato() {
    return avsluttetDato;
  }

  public Boolean getSkjult() {
    return skjult;
  }

  public Boolean getEFormidling() {
    return eFormidling;
  }

  public Boolean getTeknisk() {
    return teknisk;
  }

  public Boolean getSkalKonvertereId() {
    return skalKonvertereId;
  }

  public Boolean getSkalMottaKvittering() {
    return skalMottaKvittering;
  }

  public Boolean getVisToppnode() {
    return visToppnode;
  }

  public Integer getOrderXmlVersjon() {
    return orderXmlVersjon;
  }

  public List<ExpandableField<Enhet>> getUnderenhet() {
    return underenhet;
  }

  public ExpandableField<Enhet> getHandteresAv() {
    return handteresAv;
  }

  public ExpandableField<Enhet> getParent() {
    return parent;
  }
}
