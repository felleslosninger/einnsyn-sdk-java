// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.arkivdel.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkiv.models.Arkiv;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;

/**
 * Represents a subdivision of an archive (Arkiv). In the Noark 5 standard, an archive can be
 * divided into one or more archive parts.
 */
public class Arkivdel extends ArkivBase {
  protected final String entity = "Arkivdel";

  /** The title of the Arkivdel. */
  protected String tittel;

  /** The parent Arkiv to which this Arkivdel belongs. */
  protected ExpandableField<Arkiv> arkiv;

  public String getEntity() {
    return entity;
  }

  /** The title of the Arkivdel. */
  public String getTittel() {
    return tittel;
  }

  /** The parent Arkiv to which this Arkivdel belongs. */
  public ExpandableField<Arkiv> getArkiv() {
    return arkiv;
  }
}
