// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.lagretsoek.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.common.search.models.SearchParameters;
import no.einnsyn.sdk.entities.base.models.BaseRequest;
import no.einnsyn.sdk.entities.bruker.models.BrukerRequest;

/** Represents a search query saved by a user. */
public class LagretSoekRequest extends BaseRequest {
  /** The user who saved the search. */
  protected ExpandableField<BrukerRequest> bruker;

  /** A user-defined label for the saved search. */
  protected String label;

  /**
   * Specifies whether the user wants to receive notifications for new results matching this search.
   */
  protected Boolean subscribe;

  /** The parameters of the saved search. */
  protected SearchParameters searchParameters;

  /** A legacy field for storing the raw query string. */
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

  /** The user who saved the search. */
  public ExpandableField<BrukerRequest> getBruker() {
    return bruker;
  }

  /** A user-defined label for the saved search. */
  public String getLabel() {
    return label;
  }

  /**
   * Specifies whether the user wants to receive notifications for new results matching this search.
   */
  public Boolean getSubscribe() {
    return subscribe;
  }

  /** The parameters of the saved search. */
  public SearchParameters getSearchParameters() {
    return searchParameters;
  }

  /** A legacy field for storing the raw query string. */
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

    /** The user who saved the search. */
    protected ExpandableField<BrukerRequest> bruker;

    /** A user-defined label for the saved search. */
    protected String label;

    /**
     * Specifies whether the user wants to receive notifications for new results matching this
     * search.
     */
    protected Boolean subscribe;

    /** The parameters of the saved search. */
    protected SearchParameters searchParameters;

    /** A legacy field for storing the raw query string. */
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

    /** The user who saved the search. */
    public ExpandableField<BrukerRequest> getBruker() {
      return bruker;
    }

    /** A user-defined label for the saved search. */
    public String getLabel() {
      return label;
    }

    /**
     * Specifies whether the user wants to receive notifications for new results matching this
     * search.
     */
    public Boolean getSubscribe() {
      return subscribe;
    }

    /** The parameters of the saved search. */
    public SearchParameters getSearchParameters() {
      return searchParameters;
    }

    /** A legacy field for storing the raw query string. */
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

    /** The user who saved the search. */
    public Builder bruker(BrukerRequest bruker) {
      this.bruker = new ExpandableField<>(bruker);
      return this;
    }

    /** The user who saved the search. */
    public Builder bruker(String id) {
      this.bruker = new ExpandableField<>(id);
      return this;
    }

    /** A user-defined label for the saved search. */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Specifies whether the user wants to receive notifications for new results matching this
     * search.
     */
    public Builder subscribe(Boolean subscribe) {
      this.subscribe = subscribe;
      return this;
    }

    /** The parameters of the saved search. */
    public Builder searchParameters(SearchParameters searchParameters) {
      this.searchParameters = searchParameters;
      return this;
    }

    /** A legacy field for storing the raw query string. */
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
