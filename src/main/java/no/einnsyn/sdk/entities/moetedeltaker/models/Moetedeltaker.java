// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetedeltaker.models;

import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;

/** Represents a participant in a meeting. */
public class Moetedeltaker extends ArkivBase {
  protected final String entity = "Moetedeltaker";

  /** The name of the meeting participant. */
  protected String moetedeltakerNavn;

  /** The function or role of the participant in the meeting (e.g., 'Chairperson'). */
  protected String moetedeltakerFunksjon;

  public String getEntity() {
    return entity;
  }

  /** The name of the meeting participant. */
  public String getMoetedeltakerNavn() {
    return moetedeltakerNavn;
  }

  /** The function or role of the participant in the meeting (e.g., 'Chairperson'). */
  public String getMoetedeltakerFunksjon() {
    return moetedeltakerFunksjon;
  }
}
