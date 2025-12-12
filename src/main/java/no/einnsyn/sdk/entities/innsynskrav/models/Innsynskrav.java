// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.innsynskrav.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.entities.innsynskravbestilling.models.InnsynskravBestilling;
import no.einnsyn.sdk.entities.journalpost.models.Journalpost;

/** Represents a request for access to a specific registry entry (Journalpost). */
public class Innsynskrav extends Base {
  protected final String entity = "Innsynskrav";

  /** The order containing this access request. */
  protected ExpandableField<InnsynskravBestilling> innsynskravBestilling;

  /** The registry entry being requested. */
  protected ExpandableField<Journalpost> journalpost;

  /** The public authority responsible for handling the request. */
  protected ExpandableField<Enhet> enhet;

  /** The email address of the requester. */
  protected String email;

  /** The timestamp when the request was sent to the public authority. */
  protected String sent;

  public String getEntity() {
    return entity;
  }

  /** The order containing this access request. */
  public ExpandableField<InnsynskravBestilling> getInnsynskravBestilling() {
    return innsynskravBestilling;
  }

  /** The registry entry being requested. */
  public ExpandableField<Journalpost> getJournalpost() {
    return journalpost;
  }

  /** The public authority responsible for handling the request. */
  public ExpandableField<Enhet> getEnhet() {
    return enhet;
  }

  /** The email address of the requester. */
  public String getEmail() {
    return email;
  }

  /** The timestamp when the request was sent to the public authority. */
  public String getSent() {
    return sent;
  }
}
