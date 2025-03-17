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

/** Moetesak */
public class Moetesak extends Registrering {
  protected final String entity = "Moetesak";

  protected MoetesakstypeEnum moetesakstype;

  protected Integer moetesaksaar;

  protected Integer moetesakssekvensnummer;

  protected String utvalg;

  protected ExpandableField<Enhet> utvalgObjekt;

  protected String videoLink;

  protected ExpandableField<Utredning> utredning;

  protected ExpandableField<Moetesaksbeskrivelse> innstilling;

  protected ExpandableField<Vedtak> vedtak;

  protected ExpandableField<Moetemappe> moetemappe;

  protected String legacyMoetesakstype;

  protected String legacyReferanseTilMoetesak;

  public String getEntity() {
    return entity;
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

  public ExpandableField<Enhet> getUtvalgObjekt() {
    return utvalgObjekt;
  }

  public String getVideoLink() {
    return videoLink;
  }

  public ExpandableField<Utredning> getUtredning() {
    return utredning;
  }

  public ExpandableField<Moetesaksbeskrivelse> getInnstilling() {
    return innstilling;
  }

  public ExpandableField<Vedtak> getVedtak() {
    return vedtak;
  }

  public ExpandableField<Moetemappe> getMoetemappe() {
    return moetemappe;
  }

  public String getLegacyMoetesakstype() {
    return legacyMoetesakstype;
  }

  public String getLegacyReferanseTilMoetesak() {
    return legacyReferanseTilMoetesak;
  }
}
