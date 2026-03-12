// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.dokumentbeskrivelse.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.dokumentobjekt.models.Dokumentobjekt;

/**
 * Represents the metadata for a document. It is connected to a registry entry and describes a
 * single document.
 */
public class Dokumentbeskrivelse extends ArkivBase {
  protected final String entity = "Dokumentbeskrivelse";

  /** The title of the document, with sensitive information redacted. */
  protected String tittel;

  /** The title of the document, with sensitive information included. */
  protected String tittelSensitiv;

  /** The document number within the parent registry entry. */
  protected Integer dokumentnummer;

  /** The type of document (e.g., 'letter', 'invoice'). */
  protected String dokumenttype;

  /**
   * Describes the document's role in relation to the registry entry (e.g., 'main document',
   * 'attachment').
   */
  protected String tilknyttetRegistreringSom;

  /** The associated electronic document(s). */
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

  /** The document number within the parent registry entry. */
  public Integer getDokumentnummer() {
    return dokumentnummer;
  }

  /** The type of document (e.g., 'letter', 'invoice'). */
  public String getDokumenttype() {
    return dokumenttype;
  }

  /**
   * Describes the document's role in relation to the registry entry (e.g., 'main document',
   * 'attachment').
   */
  public String getTilknyttetRegistreringSom() {
    return tilknyttetRegistreringSom;
  }

  /** The associated electronic document(s). */
  public List<ExpandableField<Dokumentobjekt>> getDokumentobjekt() {
    return dokumentobjekt;
  }
}
