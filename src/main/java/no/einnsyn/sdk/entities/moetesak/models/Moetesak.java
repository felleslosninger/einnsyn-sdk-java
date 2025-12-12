// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetesak.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.entities.moetemappe.models.Moetemappe;
import no.einnsyn.sdk.entities.moetesaksbeskrivelse.models.Moetesaksbeskrivelse;
import no.einnsyn.sdk.entities.registrering.models.Registrering;
import no.einnsyn.sdk.entities.utredning.models.Utredning;
import no.einnsyn.sdk.entities.vedtak.models.Vedtak;

/** Represents a case discussed in a meeting. */
public class Moetesak extends Registrering {
  protected final String entity = "Moetesak";

  /** The type of meeting case. */
  protected MoetesakstypeEnum moetesakstype;

  /** The year of the meeting case. */
  protected Integer moetesaksaar;

  /** The sequence number of the meeting case within the year. */
  protected Integer moetesakssekvensnummer;

  /** The name of the committee or board handling the case. */
  protected String utvalg;

  /** The committee or board handling the case. */
  protected ExpandableField<Enhet> utvalgObjekt;

  /** A link to a video recording of the case discussion. */
  protected String videoLink;

  /** The report or investigation related to the case. */
  protected ExpandableField<Utredning> utredning;

  /** The recommendation or proposition for the case. */
  protected ExpandableField<Moetesaksbeskrivelse> innstilling;

  /** The decision made in the case. */
  protected ExpandableField<Vedtak> vedtak;

  /** The meeting record this case belongs to. */
  protected ExpandableField<Moetemappe> moetemappe;

  /** Legacy field for the meeting case type. */
  protected String legacyMoetesakstype;

  /** Legacy field for a reference to another meeting case. */
  protected String legacyReferanseTilMoetesak;

  public String getEntity() {
    return entity;
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

  /** The committee or board handling the case. */
  public ExpandableField<Enhet> getUtvalgObjekt() {
    return utvalgObjekt;
  }

  /** A link to a video recording of the case discussion. */
  public String getVideoLink() {
    return videoLink;
  }

  /** The report or investigation related to the case. */
  public ExpandableField<Utredning> getUtredning() {
    return utredning;
  }

  /** The recommendation or proposition for the case. */
  public ExpandableField<Moetesaksbeskrivelse> getInnstilling() {
    return innstilling;
  }

  /** The decision made in the case. */
  public ExpandableField<Vedtak> getVedtak() {
    return vedtak;
  }

  /** The meeting record this case belongs to. */
  public ExpandableField<Moetemappe> getMoetemappe() {
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
}
