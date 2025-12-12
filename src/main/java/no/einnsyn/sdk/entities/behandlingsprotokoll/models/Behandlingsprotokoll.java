// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.behandlingsprotokoll.models;

import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;

/** Represents a record of proceedings, often related to a decision-making process in a meeting. */
public class Behandlingsprotokoll extends ArkivBase {
  protected final String entity = "Behandlingsprotokoll";

  /** The content of the protocol. */
  protected String tekstInnhold;

  /** The format of the content (e.g., "text/html"). */
  protected String tekstFormat;

  public String getEntity() {
    return entity;
  }

  /** The content of the protocol. */
  public String getTekstInnhold() {
    return tekstInnhold;
  }

  /** The format of the content (e.g., "text/html"). */
  public String getTekstFormat() {
    return tekstFormat;
  }
}
