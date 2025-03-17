// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.statistics.models;

import java.util.List;
import java.util.function.Function;

public class StatisticsResponse {
  protected Innsynskrav innsynskrav;

  protected Download download;

  public StatisticsResponse() {
    super();
  }

  public Innsynskrav getInnsynskrav() {
    return innsynskrav;
  }

  public Download getDownload() {
    return download;
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

  public static class Innsynskrav {
    protected Integer count;

    protected Integer interval;

    protected List<Bucket> bucket;

    public Innsynskrav() {
      super();
    }

    public Integer getCount() {
      return count;
    }

    public Integer getInterval() {
      return interval;
    }

    public List<Bucket> getBucket() {
      return bucket;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static Innsynskrav of(Function<Builder, Builder> builderFunction) {
      return builderFunction.apply(new Builder()).build();
    }

    public static class Builder {

      public Innsynskrav build() {
        return new Innsynskrav();
      }
    }

    public static class Bucket {
      protected String time;

      protected Integer count;

      public Bucket() {
        super();
      }

      public String getTime() {
        return time;
      }

      public Integer getCount() {
        return count;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static Bucket of(Function<Builder, Builder> builderFunction) {
        return builderFunction.apply(new Builder()).build();
      }

      public static class Builder {

        public Bucket build() {
          return new Bucket();
        }
      }
    }
  }

  public static class Download {
    protected Integer count;

    protected Integer interval;

    protected List<Bucket> bucket;

    public Download() {
      super();
    }

    public Integer getCount() {
      return count;
    }

    public Integer getInterval() {
      return interval;
    }

    public List<Bucket> getBucket() {
      return bucket;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static Download of(Function<Builder, Builder> builderFunction) {
      return builderFunction.apply(new Builder()).build();
    }

    public static class Builder {

      public Download build() {
        return new Download();
      }
    }

    public static class Bucket {
      protected String time;

      protected Integer count;

      public Bucket() {
        super();
      }

      public String getTime() {
        return time;
      }

      public Integer getCount() {
        return count;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static Bucket of(Function<Builder, Builder> builderFunction) {
        return builderFunction.apply(new Builder()).build();
      }

      public static class Builder {

        public Bucket build() {
          return new Bucket();
        }
      }
    }
  }
}
