// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.behandlingsprotokoll.models;

import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;

/** Behandlingsprotokoll */
public class Behandlingsprotokoll extends ArkivBase {
  protected final String entity = "Behandlingsprotokoll";

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
