// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.arkiv.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;

/** Represents a top-level archive in the Noark structure. */
public class Arkiv extends ArkivBase {
  protected final String entity = "Arkiv";

  /** The title of the archive. */
  protected String tittel;

  /** The parent archive to which this archive belongs. */
  protected ExpandableField<Arkiv> arkiv;

  public String getEntity() {
    return entity;
  }

  /** The title of the archive. */
  public String getTittel() {
    return tittel;
  }

  /** The parent archive to which this archive belongs. */
  public ExpandableField<Arkiv> getArkiv() {
    return arkiv;
  }
}
