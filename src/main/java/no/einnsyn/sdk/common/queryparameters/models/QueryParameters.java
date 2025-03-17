// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.queryparameters.models;

import java.util.function.Function;

public class QueryParameters {

  public QueryParameters() {
    super();
  }

  public static Builder builder() {
    return new Builder();
  }

  public static QueryParameters of(Function<Builder, Builder> builderFunction) {
    return builderFunction.apply(new Builder()).build();
  }

  public static class Builder {

    public QueryParameters build() {
      return new QueryParameters();
    }
  }
}
