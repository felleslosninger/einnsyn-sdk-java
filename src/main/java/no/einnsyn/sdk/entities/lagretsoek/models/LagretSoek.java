// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.lagretsoek.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.common.search.models.SearchParameters;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.entities.bruker.models.Bruker;

/** LagretSoek */
public class LagretSoek extends Base {
  protected final String entity = "LagretSoek";

  protected ExpandableField<Bruker> bruker;

  protected String label;

  protected Boolean subscribe;

  protected SearchParameters searchParameters;

  protected String legacyQuery;

  public String getEntity() {
    return entity;
  }

  public ExpandableField<Bruker> getBruker() {
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
}
