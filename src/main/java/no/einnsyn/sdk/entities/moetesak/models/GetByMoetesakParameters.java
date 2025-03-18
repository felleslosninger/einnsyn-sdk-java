// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetesak.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GetByMoetesakParameters {
  /** Specifies which fields in the response should be expanded. */
  protected List<String> expand;

  protected String id;

  protected String moetesakId;

  public GetByMoetesakParameters(List<String> expand, String id, String moetesakId) {
    super();
    this.expand = expand;
    this.id = id;
    this.moetesakId = moetesakId;
  }

  /** Specifies which fields in the response should be expanded. */
  public List<String> getExpand() {
    return expand;
  }

  public String getId() {
    return id;
  }

  public String getMoetesakId() {
    return moetesakId;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static GetByMoetesakParameters of(Function<Builder, Builder> builderFunction) {
    return builderFunction.apply(new Builder()).build();
  }

  public static class Builder {
    /** Specifies which fields in the response should be expanded. */
    protected List<String> expand;

    protected String id;

    protected String moetesakId;

    /** Specifies which fields in the response should be expanded. */
    public List<String> getExpand() {
      return expand;
    }

    public String getId() {
      return id;
    }

    public String getMoetesakId() {
      return moetesakId;
    }

    /** Specifies which fields in the response should be expanded. */
    public Builder expand(List<String> expand) {
      this.expand = expand;
      return this;
    }

    /** Specifies which fields in the response should be expanded. */
    public Builder addExpand(String expand) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(expand);
      return this;
    }

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder moetesakId(String moetesakId) {
      this.moetesakId = moetesakId;
      return this;
    }

    public GetByMoetesakParameters build() {
      return new GetByMoetesakParameters(this.expand, this.id, this.moetesakId);
    }
  }
}
