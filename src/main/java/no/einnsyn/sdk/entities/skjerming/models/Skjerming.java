// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.skjerming.models;

import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;

/** Skjerming */
public class Skjerming extends ArkivBase {
  protected final String entity = "Skjerming";

  protected String tilgangsrestriksjon;

  protected String skjermingshjemmel;

  public String getEntity() {
    return entity;
  }

  public String getTilgangsrestriksjon() {
    return tilgangsrestriksjon;
  }

  public String getSkjermingshjemmel() {
    return skjermingshjemmel;
  }
}
