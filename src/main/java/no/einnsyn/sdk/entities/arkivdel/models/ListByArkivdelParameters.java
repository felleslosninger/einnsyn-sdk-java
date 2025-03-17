// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.arkivdel.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ListByArkivdelParameters {
  /** Specifies which fields in the response should be expanded. */
  protected List<String> expand;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  protected Integer limit;

  /** The sort order of the result set. The default is ascending. */
  protected SortOrderEnum sortOrder;

  /**
   * A cursor for use in pagination. StartingAfter is a resource ID that defines your place in the
   * list.
   */
  protected String startingAfter;

  /**
   * A cursor for use in pagination. EndingBefore is a resource ID that defines your place in the
   * list.
   */
  protected String endingBefore;

  /**
   * A list of resource IDs to be returned. If this parameter is used, the other parameters will be
   * ignored.
   */
  protected List<String> ids;

  /**
   * A list of external IDs to be returned. If this parameter is used, the other parameters will be
   * ignored.
   */
  protected List<String> externalIds;

  /** The Journalenhet to filter the result set by. */
  protected String journalenhet;

  protected String id;

  protected String arkivdelId;

  public ListByArkivdelParameters(
      List<String> expand,
      Integer limit,
      SortOrderEnum sortOrder,
      String startingAfter,
      String endingBefore,
      List<String> ids,
      List<String> externalIds,
      String journalenhet,
      String id,
      String arkivdelId) {
    super();
    this.expand = expand;
    this.limit = limit;
    this.sortOrder = sortOrder;
    this.startingAfter = startingAfter;
    this.endingBefore = endingBefore;
    this.ids = ids;
    this.externalIds = externalIds;
    this.journalenhet = journalenhet;
    this.id = id;
    this.arkivdelId = arkivdelId;
  }

  /** Specifies which fields in the response should be expanded. */
  public List<String> getExpand() {
    return expand;
  }

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  public Integer getLimit() {
    return limit;
  }

  /** The sort order of the result set. The default is ascending. */
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }

  /**
   * A cursor for use in pagination. StartingAfter is a resource ID that defines your place in the
   * list.
   */
  public String getStartingAfter() {
    return startingAfter;
  }

  /**
   * A cursor for use in pagination. EndingBefore is a resource ID that defines your place in the
   * list.
   */
  public String getEndingBefore() {
    return endingBefore;
  }

  /**
   * A list of resource IDs to be returned. If this parameter is used, the other parameters will be
   * ignored.
   */
  public List<String> getIds() {
    return ids;
  }

  /**
   * A list of external IDs to be returned. If this parameter is used, the other parameters will be
   * ignored.
   */
  public List<String> getExternalIds() {
    return externalIds;
  }

  /** The Journalenhet to filter the result set by. */
  public String getJournalenhet() {
    return journalenhet;
  }

  public String getId() {
    return id;
  }

  public String getArkivdelId() {
    return arkivdelId;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ListByArkivdelParameters of(Function<Builder, Builder> builderFunction) {
    return builderFunction.apply(new Builder()).build();
  }

  public static class Builder {
    /** Specifies which fields in the response should be expanded. */
    protected List<String> expand;

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    protected Integer limit;

    /** The sort order of the result set. The default is ascending. */
    protected SortOrderEnum sortOrder;

    /**
     * A cursor for use in pagination. StartingAfter is a resource ID that defines your place in the
     * list.
     */
    protected String startingAfter;

    /**
     * A cursor for use in pagination. EndingBefore is a resource ID that defines your place in the
     * list.
     */
    protected String endingBefore;

    /**
     * A list of resource IDs to be returned. If this parameter is used, the other parameters will
     * be ignored.
     */
    protected List<String> ids;

    /**
     * A list of external IDs to be returned. If this parameter is used, the other parameters will
     * be ignored.
     */
    protected List<String> externalIds;

    /** The Journalenhet to filter the result set by. */
    protected String journalenhet;

    protected String id;

    protected String arkivdelId;

    /** Specifies which fields in the response should be expanded. */
    public List<String> getExpand() {
      return expand;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Integer getLimit() {
      return limit;
    }

    /** The sort order of the result set. The default is ascending. */
    public SortOrderEnum getSortOrder() {
      return sortOrder;
    }

    /**
     * A cursor for use in pagination. StartingAfter is a resource ID that defines your place in the
     * list.
     */
    public String getStartingAfter() {
      return startingAfter;
    }

    /**
     * A cursor for use in pagination. EndingBefore is a resource ID that defines your place in the
     * list.
     */
    public String getEndingBefore() {
      return endingBefore;
    }

    /**
     * A list of resource IDs to be returned. If this parameter is used, the other parameters will
     * be ignored.
     */
    public List<String> getIds() {
      return ids;
    }

    /**
     * A list of external IDs to be returned. If this parameter is used, the other parameters will
     * be ignored.
     */
    public List<String> getExternalIds() {
      return externalIds;
    }

    /** The Journalenhet to filter the result set by. */
    public String getJournalenhet() {
      return journalenhet;
    }

    public String getId() {
      return id;
    }

    public String getArkivdelId() {
      return arkivdelId;
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

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder limit(Integer limit) {
      this.limit = limit;
      return this;
    }

    /** The sort order of the result set. The default is ascending. */
    public Builder sortOrder(SortOrderEnum sortOrder) {
      this.sortOrder = sortOrder;
      return this;
    }

    /**
     * A cursor for use in pagination. StartingAfter is a resource ID that defines your place in the
     * list.
     */
    public Builder startingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /**
     * A cursor for use in pagination. EndingBefore is a resource ID that defines your place in the
     * list.
     */
    public Builder endingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * A list of resource IDs to be returned. If this parameter is used, the other parameters will
     * be ignored.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      return this;
    }

    /**
     * A list of resource IDs to be returned. If this parameter is used, the other parameters will
     * be ignored.
     */
    public Builder addIds(String ids) {
      if (this.ids == null) {
        this.ids = new ArrayList<>();
      }
      this.ids.add(ids);
      return this;
    }

    /**
     * A list of external IDs to be returned. If this parameter is used, the other parameters will
     * be ignored.
     */
    public Builder externalIds(List<String> externalIds) {
      this.externalIds = externalIds;
      return this;
    }

    /**
     * A list of external IDs to be returned. If this parameter is used, the other parameters will
     * be ignored.
     */
    public Builder addExternalIds(String externalIds) {
      if (this.externalIds == null) {
        this.externalIds = new ArrayList<>();
      }
      this.externalIds.add(externalIds);
      return this;
    }

    /** The Journalenhet to filter the result set by. */
    public Builder journalenhet(String journalenhet) {
      this.journalenhet = journalenhet;
      return this;
    }

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder arkivdelId(String arkivdelId) {
      this.arkivdelId = arkivdelId;
      return this;
    }

    public ListByArkivdelParameters build() {
      return new ListByArkivdelParameters(
          this.expand,
          this.limit,
          this.sortOrder,
          this.startingAfter,
          this.endingBefore,
          this.ids,
          this.externalIds,
          this.journalenhet,
          this.id,
          this.arkivdelId);
    }
  }
}
