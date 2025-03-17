// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.apikey.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.entities.enhet.models.Enhet;

/** An API key used to authenticate requests to the eInnsyn API. */
public class ApiKey extends Base {
  protected final String entity = "ApiKey";

  /**
   * A name for the API key. This can be used to identify the key, in case you have multiple keys
   * for multiple systems.
   */
  protected String name;

  /**
   * The API key used to authenticate requests. This will only be shown once, and we will only store
   * a hashed version.
   */
  protected String secretKey;

  /** The Enhet that requests using this key will be associated with. */
  protected ExpandableField<Enhet> enhet;

  public String getEntity() {
    return entity;
  }

  /**
   * A name for the API key. This can be used to identify the key, in case you have multiple keys
   * for multiple systems.
   */
  public String getName() {
    return name;
  }

  /**
   * The API key used to authenticate requests. This will only be shown once, and we will only store
   * a hashed version.
   */
  public String getSecretKey() {
    return secretKey;
  }

  /** The Enhet that requests using this key will be associated with. */
  public ExpandableField<Enhet> getEnhet() {
    return enhet;
  }
}
