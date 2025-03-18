// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetesaksbeskrivelse.models;

import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;

/** Moetesaksbeskrivelse */
public class Moetesaksbeskrivelse extends ArkivBase {
  protected final String entity = "Moetesaksbeskrivelse";

  protected String tekstInnhold;

  protected String tekstFormat;

  public String getEntity() {
    return entity;
  }

  public String getTekstInnhold() {
    return tekstInnhold;
  }

  public String getTekstFormat() {
    return tekstFormat;
  }
}
