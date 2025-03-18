// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.klasse.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.arkivdel.models.Arkivdel;
import no.einnsyn.sdk.entities.klassifikasjonssystem.models.Klassifikasjonssystem;

/** Klasse */
public class Klasse extends ArkivBase {
  protected final String entity = "Klasse";

  /** The title of the class. */
  protected String tittel;

  /** An optional parent klassifikasjonssystem */
  protected ExpandableField<Klassifikasjonssystem> klassifikasjonssystem;

  /** An optional parent klasse */
  protected ExpandableField<Klasse> klasse;

  /** An optional parent arkivdel (non-standard field, due to legacy data) */
  protected ExpandableField<Arkivdel> arkivdel;

  public String getEntity() {
    return entity;
  }

  /** The title of the class. */
  public String getTittel() {
    return tittel;
  }

  /** An optional parent klassifikasjonssystem */
  public ExpandableField<Klassifikasjonssystem> getKlassifikasjonssystem() {
    return klassifikasjonssystem;
  }

  /** An optional parent klasse */
  public ExpandableField<Klasse> getKlasse() {
    return klasse;
  }

  /** An optional parent arkivdel (non-standard field, due to legacy data) */
  public ExpandableField<Arkivdel> getArkivdel() {
    return arkivdel;
  }
}
