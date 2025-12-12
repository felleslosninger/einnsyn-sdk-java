// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.votering.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.identifikator.models.Identifikator;
import no.einnsyn.sdk.entities.moetedeltaker.models.Moetedeltaker;

/** Represents a vote cast by a participant in a meeting. */
public class Votering extends ArkivBase {
  protected final String entity = "Votering";

  /** The meeting participant who cast the vote. */
  protected ExpandableField<Moetedeltaker> moetedeltaker;

  /** The vote cast ('Ja' for yes, 'Nei' for no, 'Blankt' for blank). */
  protected StemmeEnum stemme;

  /** The person or party the participant is representing, if applicable. */
  protected ExpandableField<Identifikator> representerer;

  public String getEntity() {
    return entity;
  }

  /** The meeting participant who cast the vote. */
  public ExpandableField<Moetedeltaker> getMoetedeltaker() {
    return moetedeltaker;
  }

  /** The vote cast ('Ja' for yes, 'Nei' for no, 'Blankt' for blank). */
  public StemmeEnum getStemme() {
    return stemme;
  }

  /** The person or party the participant is representing, if applicable. */
  public ExpandableField<Identifikator> getRepresenterer() {
    return representerer;
  }
}
