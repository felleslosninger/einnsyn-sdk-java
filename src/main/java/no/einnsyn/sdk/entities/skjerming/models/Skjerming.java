// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.skjerming.models;

import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;

/**
 * Represents access control information for a resource, specifying restrictions and the legal basis
 * for them.
 */
public class Skjerming extends ArkivBase {
  protected final String entity = "Skjerming";

  /** The code for the access restriction. */
  protected String tilgangsrestriksjon;

  /** The legal basis for the access restriction (a reference to a law or regulation). */
  protected String skjermingshjemmel;

  public String getEntity() {
    return entity;
  }

  /** The code for the access restriction. */
  public String getTilgangsrestriksjon() {
    return tilgangsrestriksjon;
  }

  /** The legal basis for the access restriction (a reference to a law or regulation). */
  public String getSkjermingshjemmel() {
    return skjermingshjemmel;
  }
}
