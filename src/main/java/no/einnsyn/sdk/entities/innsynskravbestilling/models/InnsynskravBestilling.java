// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.innsynskravbestilling.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.entities.bruker.models.Bruker;
import no.einnsyn.sdk.entities.innsynskrav.models.Innsynskrav;

/** Innsynskrav */
public class InnsynskravBestilling extends Base {
  protected final String entity = "InnsynskravBestilling";

  protected String email;

  protected List<ExpandableField<Innsynskrav>> innsynskrav;

  protected Boolean verified;

  protected ExpandableField<Bruker> bruker;

  protected LanguageEnum language;

  public String getEntity() {
    return entity;
  }

  public String getEmail() {
    return email;
  }

  public List<ExpandableField<Innsynskrav>> getInnsynskrav() {
    return innsynskrav;
  }

  public Boolean getVerified() {
    return verified;
  }

  public ExpandableField<Bruker> getBruker() {
    return bruker;
  }

  public LanguageEnum getLanguage() {
    return language;
  }
}
