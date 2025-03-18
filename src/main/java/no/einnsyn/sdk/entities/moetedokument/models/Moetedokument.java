// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetedokument.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.moetemappe.models.Moetemappe;
import no.einnsyn.sdk.entities.registrering.models.Registrering;

/** Moetedokument */
public class Moetedokument extends Registrering {
  protected final String entity = "Moetedokument";

  protected String moetedokumenttype;

  protected String saksbehandler;

  protected String saksbehandlerSensitiv;

  protected ExpandableField<Moetemappe> moetemappe;

  public String getEntity() {
    return entity;
  }

  public String getMoetedokumenttype() {
    return moetedokumenttype;
  }

  public String getSaksbehandler() {
    return saksbehandler;
  }

  public String getSaksbehandlerSensitiv() {
    return saksbehandlerSensitiv;
  }

  public ExpandableField<Moetemappe> getMoetemappe() {
    return moetemappe;
  }
}
