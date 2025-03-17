// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.votering.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;
import no.einnsyn.sdk.entities.identifikator.models.IdentifikatorRequest;
import no.einnsyn.sdk.entities.moetedeltaker.models.MoetedeltakerRequest;

/** Votering */
public class VoteringRequest extends ArkivBaseRequest {
  protected ExpandableField<MoetedeltakerRequest> moetedeltaker;

  protected StemmeEnum stemme;

  protected ExpandableField<IdentifikatorRequest> representerer;

  public VoteringRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      ExpandableField<MoetedeltakerRequest> moetedeltaker,
      StemmeEnum stemme,
      ExpandableField<IdentifikatorRequest> representerer) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.moetedeltaker = moetedeltaker;
    this.stemme = stemme;
    this.representerer = representerer;
  }

  public ExpandableField<MoetedeltakerRequest> getMoetedeltaker() {
    return moetedeltaker;
  }

  public StemmeEnum getStemme() {
    return stemme;
  }

  public ExpandableField<IdentifikatorRequest> getRepresenterer() {
    return representerer;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static VoteringRequest of(Function<Builder, Builder> builderFunction) {
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

    protected ExpandableField<MoetedeltakerRequest> moetedeltaker;

    protected StemmeEnum stemme;

    protected ExpandableField<IdentifikatorRequest> representerer;

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

    public ExpandableField<MoetedeltakerRequest> getMoetedeltaker() {
      return moetedeltaker;
    }

    public StemmeEnum getStemme() {
      return stemme;
    }

    public ExpandableField<IdentifikatorRequest> getRepresenterer() {
      return representerer;
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

    public Builder moetedeltaker(MoetedeltakerRequest moetedeltaker) {
      this.moetedeltaker = new ExpandableField<>(moetedeltaker);
      return this;
    }

    public Builder moetedeltaker(String id) {
      this.moetedeltaker = new ExpandableField<>(id);
      return this;
    }

    public Builder stemme(StemmeEnum stemme) {
      this.stemme = stemme;
      return this;
    }

    public Builder representerer(IdentifikatorRequest representerer) {
      this.representerer = new ExpandableField<>(representerer);
      return this;
    }

    public Builder representerer(String id) {
      this.representerer = new ExpandableField<>(id);
      return this;
    }

    public VoteringRequest build() {
      return new VoteringRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.moetedeltaker,
          this.stemme,
          this.representerer);
    }
  }
}
