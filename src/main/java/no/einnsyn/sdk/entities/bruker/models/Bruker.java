// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.bruker.models;

import no.einnsyn.sdk.entities.base.models.Base;

/** eInnsyn bruker */
public class Bruker extends Base {
  protected final String entity = "Bruker";

  protected String email;

  protected Boolean active;

  protected String password;

  protected LanguageEnum language;

  public String getEntity() {
    return entity;
  }

  public String getEmail() {
    return email;
  }

  public Boolean getActive() {
    return active;
  }

  public String getPassword() {
    return password;
  }

  public LanguageEnum getLanguage() {
    return language;
  }
}
