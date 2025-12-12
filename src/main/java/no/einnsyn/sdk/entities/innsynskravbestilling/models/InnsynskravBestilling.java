// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.innsynskravbestilling.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.entities.bruker.models.Bruker;
import no.einnsyn.sdk.entities.innsynskrav.models.Innsynskrav;

/** Represents an order containing one or more access requests (Innsynskrav). */
public class InnsynskravBestilling extends Base {
  protected final String entity = "InnsynskravBestilling";

  /** The email address of the person who placed the order. */
  protected String email;

  /** The list of individual access requests in this order. */
  protected List<ExpandableField<Innsynskrav>> innsynskrav;

  /** Indicates whether the email address has been verified. */
  protected Boolean verified;

  /** The user who placed the order, if authenticated. */
  protected ExpandableField<Bruker> bruker;

  /** The preferred language for communication. */
  protected LanguageEnum language;

  public String getEntity() {
    return entity;
  }

  /** The email address of the person who placed the order. */
  public String getEmail() {
    return email;
  }

  /** The list of individual access requests in this order. */
  public List<ExpandableField<Innsynskrav>> getInnsynskrav() {
    return innsynskrav;
  }

  /** Indicates whether the email address has been verified. */
  public Boolean getVerified() {
    return verified;
  }

  /** The user who placed the order, if authenticated. */
  public ExpandableField<Bruker> getBruker() {
    return bruker;
  }

  /** The preferred language for communication. */
  public LanguageEnum getLanguage() {
    return language;
  }
}
