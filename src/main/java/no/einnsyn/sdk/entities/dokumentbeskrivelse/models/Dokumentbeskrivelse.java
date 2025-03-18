// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.dokumentbeskrivelse.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.dokumentobjekt.models.Dokumentobjekt;

/** Dokumentbeskrivelse */
public class Dokumentbeskrivelse extends ArkivBase {
  protected final String entity = "Dokumentbeskrivelse";

  /** The title of the document, with sensitive information redacted. */
  protected String tittel;

  /** The title of the document, with sensitive information included. */
  protected String tittelSensitiv;

  protected Integer dokumentnummer;

  protected String dokumenttype;

  protected String tilknyttetRegistreringSom;

  protected List<ExpandableField<Dokumentobjekt>> dokumentobjekt;

  public String getEntity() {
    return entity;
  }

  /** The title of the document, with sensitive information redacted. */
  public String getTittel() {
    return tittel;
  }

  /** The title of the document, with sensitive information included. */
  public String getTittelSensitiv() {
    return tittelSensitiv;
  }

  public Integer getDokumentnummer() {
    return dokumentnummer;
  }

  public String getDokumenttype() {
    return dokumenttype;
  }

  public String getTilknyttetRegistreringSom() {
    return tilknyttetRegistreringSom;
  }

  public List<ExpandableField<Dokumentobjekt>> getDokumentobjekt() {
    return dokumentobjekt;
  }
}
