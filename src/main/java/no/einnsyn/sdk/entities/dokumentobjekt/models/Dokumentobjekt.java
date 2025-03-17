// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.dokumentobjekt.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.Dokumentbeskrivelse;

public class Dokumentobjekt extends ArkivBase {
  protected final String entity = "Dokumentobjekt";

  protected String referanseDokumentfil;

  protected String format;

  protected String sjekksum;

  protected String sjekksumAlgoritme;

  protected ExpandableField<Dokumentbeskrivelse> dokumentbeskrivelse;

  public String getEntity() {
    return entity;
  }

  public String getReferanseDokumentfil() {
    return referanseDokumentfil;
  }

  public String getFormat() {
    return format;
  }

  public String getSjekksum() {
    return sjekksum;
  }

  public String getSjekksumAlgoritme() {
    return sjekksumAlgoritme;
  }

  public ExpandableField<Dokumentbeskrivelse> getDokumentbeskrivelse() {
    return dokumentbeskrivelse;
  }
}
