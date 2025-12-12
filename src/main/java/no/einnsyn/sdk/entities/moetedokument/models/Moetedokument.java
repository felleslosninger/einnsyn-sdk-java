// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetedokument.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.moetemappe.models.Moetemappe;
import no.einnsyn.sdk.entities.registrering.models.Registrering;

/** Represents a document related to a meeting, such as an agenda or minutes. */
public class Moetedokument extends Registrering {
  protected final String entity = "Moetedokument";

  /** The type of meeting document (e.g., 'Agenda', 'Minutes'). */
  protected String moetedokumenttype;

  /** The case officer responsible for the document. */
  protected String saksbehandler;

  /** The case officer responsible for the document, including sensitive information. */
  protected String saksbehandlerSensitiv;

  /** The meeting this document belongs to. */
  protected ExpandableField<Moetemappe> moetemappe;

  public String getEntity() {
    return entity;
  }

  /** The type of meeting document (e.g., 'Agenda', 'Minutes'). */
  public String getMoetedokumenttype() {
    return moetedokumenttype;
  }

  /** The case officer responsible for the document. */
  public String getSaksbehandler() {
    return saksbehandler;
  }

  /** The case officer responsible for the document, including sensitive information. */
  public String getSaksbehandlerSensitiv() {
    return saksbehandlerSensitiv;
  }

  /** The meeting this document belongs to. */
  public ExpandableField<Moetemappe> getMoetemappe() {
    return moetemappe;
  }
}
