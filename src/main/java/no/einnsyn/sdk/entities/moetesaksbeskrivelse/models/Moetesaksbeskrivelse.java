// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetesaksbeskrivelse.models;

import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;

/**
 * Represents a textual description related to a meeting case, such as a recommendation or a report.
 */
public class Moetesaksbeskrivelse extends ArkivBase {
  protected final String entity = "Moetesaksbeskrivelse";

  /** The text content of the description. */
  protected String tekstInnhold;

  /** The format of the text content (e.g., "text/html"). */
  protected String tekstFormat;

  public String getEntity() {
    return entity;
  }

  /** The text content of the description. */
  public String getTekstInnhold() {
    return tekstInnhold;
  }

  /** The format of the text content (e.g., "text/html"). */
  public String getTekstFormat() {
    return tekstFormat;
  }
}
