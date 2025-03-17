// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetedeltaker.models;

import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;

/** Moetedeltaker */
public class Moetedeltaker extends ArkivBase {
  protected final String entity = "Moetedeltaker";

  protected String moetedeltakerNavn;

  protected String moetedeltakerFunksjon;

  public String getEntity() {
    return entity;
  }

  public String getMoetedeltakerNavn() {
    return moetedeltakerNavn;
  }

  public String getMoetedeltakerFunksjon() {
    return moetedeltakerFunksjon;
  }
}
