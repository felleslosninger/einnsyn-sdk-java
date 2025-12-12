// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.lagretsoek.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.common.search.models.SearchParameters;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.entities.bruker.models.Bruker;

/** Represents a search query saved by a user. */
public class LagretSoek extends Base {
  protected final String entity = "LagretSoek";

  /** The user who saved the search. */
  protected ExpandableField<Bruker> bruker;

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

  public String getEntity() {
    return entity;
  }

  /** The user who saved the search. */
  public ExpandableField<Bruker> getBruker() {
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
}
