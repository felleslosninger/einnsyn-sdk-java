// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.apikey.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.BaseRequest;
import no.einnsyn.sdk.entities.bruker.models.BrukerRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;

/** An API key used to authenticate requests to the eInnsyn API. */
public class ApiKeyRequest extends BaseRequest {
  /**
   * A name for the API key. This can be used to identify the key, in case you have multiple keys
   * for multiple systems.
   */
  protected String name;

  /** An Enhet that requests using this key will be associated with. */
  protected ExpandableField<EnhetRequest> enhet;

  /** A Bruker that requests using this key will be associated with. */
  protected ExpandableField<BrukerRequest> bruker;

  /**
   * Specifies the expiration date of the API key. If this is set, the key will not be usable after
   * this date.
   */
  protected String expiresAt;

  public ApiKeyRequest(
      String externalId,
      String accessibleAfter,
      String name,
      ExpandableField<EnhetRequest> enhet,
      ExpandableField<BrukerRequest> bruker,
      String expiresAt) {
    super(externalId, accessibleAfter);
    this.name = name;
    this.enhet = enhet;
    this.bruker = bruker;
    this.expiresAt = expiresAt;
  }

  /**
   * A name for the API key. This can be used to identify the key, in case you have multiple keys
   * for multiple systems.
   */
  public String getName() {
    return name;
  }

  /** An Enhet that requests using this key will be associated with. */
  public ExpandableField<EnhetRequest> getEnhet() {
    return enhet;
  }

  /** A Bruker that requests using this key will be associated with. */
  public ExpandableField<BrukerRequest> getBruker() {
    return bruker;
  }

  /**
   * Specifies the expiration date of the API key. If this is set, the key will not be usable after
   * this date.
   */
  public String getExpiresAt() {
    return expiresAt;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ApiKeyRequest of(Function<Builder, Builder> builderFunction) {
    return builderFunction.apply(new Builder()).build();
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
     * A name for the API key. This can be used to identify the key, in case you have multiple keys
     * for multiple systems.
     */
    protected String name;

    /** An Enhet that requests using this key will be associated with. */
    protected ExpandableField<EnhetRequest> enhet;

    /** A Bruker that requests using this key will be associated with. */
    protected ExpandableField<BrukerRequest> bruker;

    /**
     * Specifies the expiration date of the API key. If this is set, the key will not be usable
     * after this date.
     */
    protected String expiresAt;

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
     * A name for the API key. This can be used to identify the key, in case you have multiple keys
     * for multiple systems.
     */
    public String getName() {
      return name;
    }

    /** An Enhet that requests using this key will be associated with. */
    public ExpandableField<EnhetRequest> getEnhet() {
      return enhet;
    }

    /** A Bruker that requests using this key will be associated with. */
    public ExpandableField<BrukerRequest> getBruker() {
      return bruker;
    }

    /**
     * Specifies the expiration date of the API key. If this is set, the key will not be usable
     * after this date.
     */
    public String getExpiresAt() {
      return expiresAt;
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

    /**
     * A name for the API key. This can be used to identify the key, in case you have multiple keys
     * for multiple systems.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /** An Enhet that requests using this key will be associated with. */
    public Builder enhet(EnhetRequest enhet) {
      this.enhet = new ExpandableField<>(enhet);
      return this;
    }

    /** An Enhet that requests using this key will be associated with. */
    public Builder enhet(String id) {
      this.enhet = new ExpandableField<>(id);
      return this;
    }

    /** A Bruker that requests using this key will be associated with. */
    public Builder bruker(BrukerRequest bruker) {
      this.bruker = new ExpandableField<>(bruker);
      return this;
    }

    /** A Bruker that requests using this key will be associated with. */
    public Builder bruker(String id) {
      this.bruker = new ExpandableField<>(id);
      return this;
    }

    /**
     * Specifies the expiration date of the API key. If this is set, the key will not be usable
     * after this date.
     */
    public Builder expiresAt(String expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    public ApiKeyRequest build() {
      return new ApiKeyRequest(
          this.externalId,
          this.accessibleAfter,
          this.name,
          this.enhet,
          this.bruker,
          this.expiresAt);
    }
  }
}
