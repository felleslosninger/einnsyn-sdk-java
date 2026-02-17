// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.lagretsak.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.BaseRequest;
import no.einnsyn.sdk.entities.moetemappe.models.MoetemappeRequest;
import no.einnsyn.sdk.entities.saksmappe.models.SaksmappeRequest;

/** Represents a case file (Saksmappe or Moetemappe) that a user has saved for quick access. */
public class LagretSakRequest extends BaseRequest {
  /** The saksmappe that has been saved. */
  protected ExpandableField<SaksmappeRequest> saksmappe;

  /** The moetemappe that has been saved. */
  protected ExpandableField<MoetemappeRequest> moetemappe;

  /** Specifies whether the user wants to receive notifications about this sak. */
  protected Boolean subscribe;

  public LagretSakRequest(
      String externalId,
      String accessibleAfter,
      ExpandableField<SaksmappeRequest> saksmappe,
      ExpandableField<MoetemappeRequest> moetemappe,
      Boolean subscribe) {
    super(externalId, accessibleAfter);
    this.saksmappe = saksmappe;
    this.moetemappe = moetemappe;
    this.subscribe = subscribe;
  }

  /** The saksmappe that has been saved. */
  public ExpandableField<SaksmappeRequest> getSaksmappe() {
    return saksmappe;
  }

  /** The moetemappe that has been saved. */
  public ExpandableField<MoetemappeRequest> getMoetemappe() {
    return moetemappe;
  }

  /** Specifies whether the user wants to receive notifications about this sak. */
  public Boolean getSubscribe() {
    return subscribe;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static LagretSakRequest of(Function<Builder, Builder> builderFunction) {
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

    /** The saksmappe that has been saved. */
    protected ExpandableField<SaksmappeRequest> saksmappe;

    /** The moetemappe that has been saved. */
    protected ExpandableField<MoetemappeRequest> moetemappe;

    /** Specifies whether the user wants to receive notifications about this sak. */
    protected Boolean subscribe;

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

    /** The saksmappe that has been saved. */
    public ExpandableField<SaksmappeRequest> getSaksmappe() {
      return saksmappe;
    }

    /** The moetemappe that has been saved. */
    public ExpandableField<MoetemappeRequest> getMoetemappe() {
      return moetemappe;
    }

    /** Specifies whether the user wants to receive notifications about this sak. */
    public Boolean getSubscribe() {
      return subscribe;
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

    /** The saksmappe that has been saved. */
    public Builder saksmappe(SaksmappeRequest saksmappe) {
      this.saksmappe = new ExpandableField<>(saksmappe);
      return this;
    }

    /** The saksmappe that has been saved. */
    public Builder saksmappe(String id) {
      this.saksmappe = new ExpandableField<>(id);
      return this;
    }

    /** The moetemappe that has been saved. */
    public Builder moetemappe(MoetemappeRequest moetemappe) {
      this.moetemappe = new ExpandableField<>(moetemappe);
      return this;
    }

    /** The moetemappe that has been saved. */
    public Builder moetemappe(String id) {
      this.moetemappe = new ExpandableField<>(id);
      return this;
    }

    /** Specifies whether the user wants to receive notifications about this sak. */
    public Builder subscribe(Boolean subscribe) {
      this.subscribe = subscribe;
      return this;
    }

    public LagretSakRequest build() {
      return new LagretSakRequest(
          this.externalId, this.accessibleAfter, this.saksmappe, this.moetemappe, this.subscribe);
    }
  }
}
