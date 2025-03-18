// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.base.models;

import no.einnsyn.sdk.common.entity.HasId;
import no.einnsyn.sdk.common.entity.Resource;

public class Base extends Resource implements HasId {
  /**
   * The unique identifier for the resource. This is is assigned by the system when the resource is
   * created.
   */
  protected String id;

  /**
   * This field is only present if the resource has been deleted. If present, it will always be
   * `true`.
   */
  protected Boolean deleted;

  /**
   * An external ID for the resource. This is similar to "systemId", but will be used for legacy
   * IRIs that were used in earlier eInnsyn versions.
   */
  protected String externalId;

  /** This object should not be accessible to the public before the given dateTime. */
  protected String accessibleAfter;

  /**
   * The unique identifier for the resource. This is is assigned by the system when the resource is
   * created.
   */
  public String getId() {
    return id;
  }

  /**
   * This field is only present if the resource has been deleted. If present, it will always be
   * `true`.
   */
  public Boolean getDeleted() {
    return deleted;
  }

  /**
   * An external ID for the resource. This is similar to "systemId", but will be used for legacy
   * IRIs that were used in earlier eInnsyn versions.
   */
  public String getExternalId() {
    return externalId;
  }

  /** This object should not be accessible to the public before the given dateTime. */
  public String getAccessibleAfter() {
    return accessibleAfter;
  }
}
