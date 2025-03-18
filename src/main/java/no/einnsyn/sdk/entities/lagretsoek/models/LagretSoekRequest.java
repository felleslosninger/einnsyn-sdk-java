// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.lagretsoek.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.common.search.models.SearchParameters;
import no.einnsyn.sdk.entities.base.models.BaseRequest;
import no.einnsyn.sdk.entities.bruker.models.BrukerRequest;

/** LagretSoek */
public class LagretSoekRequest extends BaseRequest {
  protected ExpandableField<BrukerRequest> bruker;

  protected String label;

  protected Boolean subscribe;

  protected SearchParameters searchParameters;

  protected String legacyQuery;

  public LagretSoekRequest(
      String externalId,
      String accessibleAfter,
      ExpandableField<BrukerRequest> bruker,
      String label,
      Boolean subscribe,
      SearchParameters searchParameters,
      String legacyQuery) {
    super(externalId, accessibleAfter);
    this.bruker = bruker;
    this.label = label;
    this.subscribe = subscribe;
    this.searchParameters = searchParameters;
    this.legacyQuery = legacyQuery;
  }

  public ExpandableField<BrukerRequest> getBruker() {
    return bruker;
  }

  public String getLabel() {
    return label;
  }

  public Boolean getSubscribe() {
    return subscribe;
  }

  public SearchParameters getSearchParameters() {
    return searchParameters;
  }

  public String getLegacyQuery() {
    return legacyQuery;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static LagretSoekRequest of(Function<Builder, Builder> builderFunction) {
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

    protected ExpandableField<BrukerRequest> bruker;

    protected String label;

    protected Boolean subscribe;

    protected SearchParameters searchParameters;

    protected String legacyQuery;

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

    public ExpandableField<BrukerRequest> getBruker() {
      return bruker;
    }

    public String getLabel() {
      return label;
    }

    public Boolean getSubscribe() {
      return subscribe;
    }

    public SearchParameters getSearchParameters() {
      return searchParameters;
    }

    public String getLegacyQuery() {
      return legacyQuery;
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

    public Builder bruker(BrukerRequest bruker) {
      this.bruker = new ExpandableField<>(bruker);
      return this;
    }

    public Builder bruker(String id) {
      this.bruker = new ExpandableField<>(id);
      return this;
    }

    public Builder label(String label) {
      this.label = label;
      return this;
    }

    public Builder subscribe(Boolean subscribe) {
      this.subscribe = subscribe;
      return this;
    }

    public Builder searchParameters(SearchParameters searchParameters) {
      this.searchParameters = searchParameters;
      return this;
    }

    public Builder legacyQuery(String legacyQuery) {
      this.legacyQuery = legacyQuery;
      return this;
    }

    public LagretSoekRequest build() {
      return new LagretSoekRequest(
          this.externalId,
          this.accessibleAfter,
          this.bruker,
          this.label,
          this.subscribe,
          this.searchParameters,
          this.legacyQuery);
    }
  }
}
