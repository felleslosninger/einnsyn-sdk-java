// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.skjerming.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;

/**
 * Represents access control information for a resource, specifying restrictions and the legal basis
 * for them.
 */
public class SkjermingRequest extends ArkivBaseRequest {
  /** The code for the access restriction. */
  protected String tilgangsrestriksjon;

  /** The legal basis for the access restriction (a reference to a law or regulation). */
  protected String skjermingshjemmel;

  public SkjermingRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String tilgangsrestriksjon,
      String skjermingshjemmel) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.tilgangsrestriksjon = tilgangsrestriksjon;
    this.skjermingshjemmel = skjermingshjemmel;
  }

  /** The code for the access restriction. */
  public String getTilgangsrestriksjon() {
    return tilgangsrestriksjon;
  }

  /** The legal basis for the access restriction (a reference to a law or regulation). */
  public String getSkjermingshjemmel() {
    return skjermingshjemmel;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static SkjermingRequest of(Function<Builder, Builder> builderFunction) {
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

    /** The unique identifier for the resource, given by the user's system. */
    protected String systemId;

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    protected ExpandableField<EnhetRequest> journalenhet;

    /** The code for the access restriction. */
    protected String tilgangsrestriksjon;

    /** The legal basis for the access restriction (a reference to a law or regulation). */
    protected String skjermingshjemmel;

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

    /** The unique identifier for the resource, given by the user's system. */
    public String getSystemId() {
      return systemId;
    }

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    public ExpandableField<EnhetRequest> getJournalenhet() {
      return journalenhet;
    }

    /** The code for the access restriction. */
    public String getTilgangsrestriksjon() {
      return tilgangsrestriksjon;
    }

    /** The legal basis for the access restriction (a reference to a law or regulation). */
    public String getSkjermingshjemmel() {
      return skjermingshjemmel;
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

    /** The unique identifier for the resource, given by the user's system. */
    public Builder systemId(String systemId) {
      this.systemId = systemId;
      return this;
    }

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    public Builder journalenhet(EnhetRequest journalenhet) {
      this.journalenhet = new ExpandableField<>(journalenhet);
      return this;
    }

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    public Builder journalenhet(String id) {
      this.journalenhet = new ExpandableField<>(id);
      return this;
    }

    /** The code for the access restriction. */
    public Builder tilgangsrestriksjon(String tilgangsrestriksjon) {
      this.tilgangsrestriksjon = tilgangsrestriksjon;
      return this;
    }

    /** The legal basis for the access restriction (a reference to a law or regulation). */
    public Builder skjermingshjemmel(String skjermingshjemmel) {
      this.skjermingshjemmel = skjermingshjemmel;
      return this;
    }

    public SkjermingRequest build() {
      return new SkjermingRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.tilgangsrestriksjon,
          this.skjermingshjemmel);
    }
  }
}
