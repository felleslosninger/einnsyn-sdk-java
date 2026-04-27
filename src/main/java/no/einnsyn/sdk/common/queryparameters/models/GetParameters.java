// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.queryparameters.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GetParameters {
  /** Specifies which fields in the response should be expanded. Maximum 100 values. */
  protected List<String> expand;

  public GetParameters(List<String> expand) {
    super();
    this.expand = expand;
  }

  /** Specifies which fields in the response should be expanded. Maximum 100 values. */
  public List<String> getExpand() {
    return expand;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static GetParameters of(Function<Builder, Builder> builderFunction) {
    return builderFunction.apply(new Builder()).build();
  }

  public static class Builder {
    /** Specifies which fields in the response should be expanded. Maximum 100 values. */
    protected List<String> expand;

    /** Specifies which fields in the response should be expanded. Maximum 100 values. */
    public List<String> getExpand() {
      return expand;
    }

    /** Specifies which fields in the response should be expanded. Maximum 100 values. */
    public Builder expand(List<String> expand) {
      this.expand = expand;
      return this;
    }

    /** Specifies which fields in the response should be expanded. Maximum 100 values. */
    public Builder addExpand(String expand) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(expand);
      return this;
    }

    public GetParameters build() {
      return new GetParameters(this.expand);
    }
  }
}
