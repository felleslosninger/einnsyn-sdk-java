// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.dokumentobjekt.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.Dokumentbeskrivelse;

/**
 * Represents an electronic document or file. It contains information needed to locate and render
 * the document.
 */
public class Dokumentobjekt extends ArkivBase {
  protected final String entity = "Dokumentobjekt";

  /** A reference (URL) to the document file. */
  protected String referanseDokumentfil;

  /** The file format of the document (e.g., 'PDF/A'). */
  protected String format;

  /** The checksum of the document file, for integrity verification. */
  protected String sjekksum;

  /** The algorithm used to calculate the checksum (e.g., 'SHA-256'). */
  protected String sjekksumAlgoritme;

  /** The document description this object belongs to. */
  protected ExpandableField<Dokumentbeskrivelse> dokumentbeskrivelse;

  public String getEntity() {
    return entity;
  }

  /** A reference (URL) to the document file. */
  public String getReferanseDokumentfil() {
    return referanseDokumentfil;
  }

  /** The file format of the document (e.g., 'PDF/A'). */
  public String getFormat() {
    return format;
  }

  /** The checksum of the document file, for integrity verification. */
  public String getSjekksum() {
    return sjekksum;
  }

  /** The algorithm used to calculate the checksum (e.g., 'SHA-256'). */
  public String getSjekksumAlgoritme() {
    return sjekksumAlgoritme;
  }

  /** The document description this object belongs to. */
  public ExpandableField<Dokumentbeskrivelse> getDokumentbeskrivelse() {
    return dokumentbeskrivelse;
  }
}
