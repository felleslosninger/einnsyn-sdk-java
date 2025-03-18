// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.base.models;

public class BaseRequest {
  /**
   * An external ID for the resource. This is similar to "systemId", but will be used for legacy
   * IRIs that were used in earlier eInnsyn versions.
   */
  protected String externalId;

  /** This object should not be accessible to the public before the given dateTime. */
  protected String accessibleAfter;

  public BaseRequest(String externalId, String accessibleAfter) {
    super();
    this.externalId = externalId;
    this.accessibleAfter = accessibleAfter;
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

  public static class Builder {
    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     */
    protected String externalId;

    /** This object should not be accessible to the public before the given dateTime. */
    protected String accessibleAfter;

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

    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    /** This object should not be accessible to the public before the given dateTime. */
    public Builder accessibleAfter(String accessibleAfter) {
      this.accessibleAfter = accessibleAfter;
      return this;
    }

    public BaseRequest build() {
      return new BaseRequest(this.externalId, this.accessibleAfter);
    }
  }
}
