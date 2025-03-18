// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.identifikator.models;

import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;

/** Identifikator */
public class Identifikator extends ArkivBase {
  protected final String entity = "Identifikator";

  protected String navn;

  protected String identifikator;

  protected String initialer;

  protected String epostadresse;

  public String getEntity() {
    return entity;
  }

  public String getNavn() {
    return navn;
  }

  public String getIdentifikator() {
    return identifikator;
  }

  public String getInitialer() {
    return initialer;
  }

  public String getEpostadresse() {
    return epostadresse;
  }
}
