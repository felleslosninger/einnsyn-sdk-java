// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.innsynskrav.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.entities.innsynskravbestilling.models.InnsynskravBestilling;
import no.einnsyn.sdk.entities.journalpost.models.Journalpost;

/** Innsynskrav */
public class Innsynskrav extends Base {
  protected final String entity = "Innsynskrav";

  protected ExpandableField<InnsynskravBestilling> innsynskravBestilling;

  protected ExpandableField<Journalpost> journalpost;

  protected ExpandableField<Enhet> enhet;

  protected String email;

  protected String sent;

  public String getEntity() {
    return entity;
  }

  public ExpandableField<InnsynskravBestilling> getInnsynskravBestilling() {
    return innsynskravBestilling;
  }

  public ExpandableField<Journalpost> getJournalpost() {
    return journalpost;
  }

  public ExpandableField<Enhet> getEnhet() {
    return enhet;
  }

  public String getEmail() {
    return email;
  }

  public String getSent() {
    return sent;
  }
}
