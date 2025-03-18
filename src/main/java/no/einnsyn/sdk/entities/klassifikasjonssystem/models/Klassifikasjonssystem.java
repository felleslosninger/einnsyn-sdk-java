// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.klassifikasjonssystem.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.arkivdel.models.Arkivdel;

/** Klassifikasjonssystem */
public class Klassifikasjonssystem extends ArkivBase {
  protected final String entity = "Klassifikasjonssystem";

  protected String tittel;

  /** The parent arkivdel. */
  protected ExpandableField<Arkivdel> arkivdel;

  public String getEntity() {
    return entity;
  }

  public String getTittel() {
    return tittel;
  }

  /** The parent arkivdel. */
  public ExpandableField<Arkivdel> getArkivdel() {
    return arkivdel;
  }
}
