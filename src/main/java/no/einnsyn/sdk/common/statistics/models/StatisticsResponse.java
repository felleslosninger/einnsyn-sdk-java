// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.statistics.models;

import java.util.List;
import java.util.function.Function;

public class StatisticsResponse {
  /** Aggregated summary of statistics over the entire queried period */
  protected Summary summary;

  protected Metadata metadata;

  /**
   * Time series data showing statistics broken down by the specified aggregation interval. Each
   * entry represents metrics for a specific time period.
   */
  protected List<TimeSeries> timeSeries;

  public StatisticsResponse() {
    super();
  }

  /** Aggregated summary of statistics over the entire queried period */
  public Summary getSummary() {
    return summary;
  }

  public Metadata getMetadata() {
    return metadata;
  }

  /**
   * Time series data showing statistics broken down by the specified aggregation interval. Each
   * entry represents metrics for a specific time period.
   */
  public List<TimeSeries> getTimeSeries() {
    return timeSeries;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static StatisticsResponse of(Function<Builder, Builder> builderFunction) {
    return builderFunction.apply(new Builder()).build();
  }

  public static class Builder {

    public StatisticsResponse build() {
      return new StatisticsResponse();
    }
  }

  public static class Summary {
    /** Total number of entities created in the period */
    protected Integer createdCount;

    /** Total number of entities created with fulltext content in the period */
    protected Integer createdWithFulltextCount;

    /** Total number of innsynskrav (access requests) created in the period */
    protected Integer createdInnsynskravCount;

    /** Total number of document downloads in the period */
    protected Integer downloadCount;

    public Summary() {
      super();
    }

    /** Total number of entities created in the period */
    public Integer getCreatedCount() {
      return createdCount;
    }

    /** Total number of entities created with fulltext content in the period */
    public Integer getCreatedWithFulltextCount() {
      return createdWithFulltextCount;
    }

    /** Total number of innsynskrav (access requests) created in the period */
    public Integer getCreatedInnsynskravCount() {
      return createdInnsynskravCount;
    }

    /** Total number of document downloads in the period */
    public Integer getDownloadCount() {
      return downloadCount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static Summary of(Function<Builder, Builder> builderFunction) {
      return builderFunction.apply(new Builder()).build();
    }

    public static class Builder {

      public Summary build() {
        return new Summary();
      }
    }
  }

  public static class Metadata {
    /** The aggregation interval used for the time series data */
    protected String aggregateInterval;

    /** The start date for the aggregated statistics */
    protected String aggregateFrom;

    /** The end date for the aggregated statistics */
    protected String aggregateTo;

    public Metadata() {
      super();
    }

    /** The aggregation interval used for the time series data */
    public String getAggregateInterval() {
      return aggregateInterval;
    }

    /** The start date for the aggregated statistics */
    public String getAggregateFrom() {
      return aggregateFrom;
    }

    /** The end date for the aggregated statistics */
    public String getAggregateTo() {
      return aggregateTo;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static Metadata of(Function<Builder, Builder> builderFunction) {
      return builderFunction.apply(new Builder()).build();
    }

    public static class Builder {

      public Metadata build() {
        return new Metadata();
      }
    }
  }

  public static class TimeSeries {
    /** The timestamp for this time series data point */
    protected String time;

    /** Number of entities created during this time interval */
    protected Integer createdCount;

    /** Number of entities created with fulltext content during this time interval */
    protected Integer createdWithFulltextCount;

    /** Number of innsynskrav (access requests) created during this time interval */
    protected Integer createdInnsynskravCount;

    /** Number of document downloads during this time interval */
    protected Integer downloadCount;

    public TimeSeries() {
      super();
    }

    /** The timestamp for this time series data point */
    public String getTime() {
      return time;
    }

    /** Number of entities created during this time interval */
    public Integer getCreatedCount() {
      return createdCount;
    }

    /** Number of entities created with fulltext content during this time interval */
    public Integer getCreatedWithFulltextCount() {
      return createdWithFulltextCount;
    }

    /** Number of innsynskrav (access requests) created during this time interval */
    public Integer getCreatedInnsynskravCount() {
      return createdInnsynskravCount;
    }

    /** Number of document downloads during this time interval */
    public Integer getDownloadCount() {
      return downloadCount;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static TimeSeries of(Function<Builder, Builder> builderFunction) {
      return builderFunction.apply(new Builder()).build();
    }

    public static class Builder {

      public TimeSeries build() {
        return new TimeSeries();
      }
    }
  }
}
