// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.queryparameters.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FilterParameters {
  /**
   * A query string to filter by. Quotes can be used to search for exact matches or phrases. Words
   * can be excluded by prefixing them with a minus sign.
   */
  protected String query;

  /** A list of enhet IDs to filter by. This will also match subenhets. */
  protected List<String> administrativEnhet;

  /** A list of enhet IDs to filter by. This will only match the specified enhets, not subenhets. */
  protected List<String> administrativEnhetExact;

  /** A list of enhet IDs to exclude from the result set. This will also exclude subenhets. */
  protected List<String> excludeAdministrativEnhet;

  /**
   * A list of enhet IDs to exclude from the result set. This will only exclude the specified
   * enhets, not subenhets.
   */
  protected List<String> excludeAdministrativEnhetExact;

  /** Filter by the published date of the document. */
  protected String publisertDatoBefore;

  /** Filter by the published date of the document. */
  protected String publisertDatoAfter;

  /** Filter by the updated date of the document. */
  protected String oppdatertDatoBefore;

  /** Filter by the updated date of the document. */
  protected String oppdatertDatoAfter;

  /** Filter by the date of a meeting. */
  protected String moetedatoBefore;

  /** Filter by the date of a meeting. */
  protected String moetedatoAfter;

  /** Filter by the entity type. */
  protected List<EntityEnum> entity;

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

  /** Match documents with (or without) fulltext. */
  protected Boolean fulltext;

  public FilterParameters(
      String query,
      List<String> administrativEnhet,
      List<String> administrativEnhetExact,
      List<String> excludeAdministrativEnhet,
      List<String> excludeAdministrativEnhetExact,
      String publisertDatoBefore,
      String publisertDatoAfter,
      String oppdatertDatoBefore,
      String oppdatertDatoAfter,
      String moetedatoBefore,
      String moetedatoAfter,
      List<EntityEnum> entity,
      List<String> ids,
      List<String> externalIds,
      String journalenhet,
      Boolean fulltext) {
    super();
    this.query = query;
    this.administrativEnhet = administrativEnhet;
    this.administrativEnhetExact = administrativEnhetExact;
    this.excludeAdministrativEnhet = excludeAdministrativEnhet;
    this.excludeAdministrativEnhetExact = excludeAdministrativEnhetExact;
    this.publisertDatoBefore = publisertDatoBefore;
    this.publisertDatoAfter = publisertDatoAfter;
    this.oppdatertDatoBefore = oppdatertDatoBefore;
    this.oppdatertDatoAfter = oppdatertDatoAfter;
    this.moetedatoBefore = moetedatoBefore;
    this.moetedatoAfter = moetedatoAfter;
    this.entity = entity;
    this.ids = ids;
    this.externalIds = externalIds;
    this.journalenhet = journalenhet;
    this.fulltext = fulltext;
  }

  /**
   * A query string to filter by. Quotes can be used to search for exact matches or phrases. Words
   * can be excluded by prefixing them with a minus sign.
   */
  public String getQuery() {
    return query;
  }

  /** A list of enhet IDs to filter by. This will also match subenhets. */
  public List<String> getAdministrativEnhet() {
    return administrativEnhet;
  }

  /** A list of enhet IDs to filter by. This will only match the specified enhets, not subenhets. */
  public List<String> getAdministrativEnhetExact() {
    return administrativEnhetExact;
  }

  /** A list of enhet IDs to exclude from the result set. This will also exclude subenhets. */
  public List<String> getExcludeAdministrativEnhet() {
    return excludeAdministrativEnhet;
  }

  /**
   * A list of enhet IDs to exclude from the result set. This will only exclude the specified
   * enhets, not subenhets.
   */
  public List<String> getExcludeAdministrativEnhetExact() {
    return excludeAdministrativEnhetExact;
  }

  /** Filter by the published date of the document. */
  public String getPublisertDatoBefore() {
    return publisertDatoBefore;
  }

  /** Filter by the published date of the document. */
  public String getPublisertDatoAfter() {
    return publisertDatoAfter;
  }

  /** Filter by the updated date of the document. */
  public String getOppdatertDatoBefore() {
    return oppdatertDatoBefore;
  }

  /** Filter by the updated date of the document. */
  public String getOppdatertDatoAfter() {
    return oppdatertDatoAfter;
  }

  /** Filter by the date of a meeting. */
  public String getMoetedatoBefore() {
    return moetedatoBefore;
  }

  /** Filter by the date of a meeting. */
  public String getMoetedatoAfter() {
    return moetedatoAfter;
  }

  /** Filter by the entity type. */
  public List<EntityEnum> getEntity() {
    return entity;
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

  /** Match documents with (or without) fulltext. */
  public Boolean getFulltext() {
    return fulltext;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static FilterParameters of(Function<Builder, Builder> builderFunction) {
    return builderFunction.apply(new Builder()).build();
  }

  public static class Builder {
    /**
     * A query string to filter by. Quotes can be used to search for exact matches or phrases. Words
     * can be excluded by prefixing them with a minus sign.
     */
    protected String query;

    /** A list of enhet IDs to filter by. This will also match subenhets. */
    protected List<String> administrativEnhet;

    /**
     * A list of enhet IDs to filter by. This will only match the specified enhets, not subenhets.
     */
    protected List<String> administrativEnhetExact;

    /** A list of enhet IDs to exclude from the result set. This will also exclude subenhets. */
    protected List<String> excludeAdministrativEnhet;

    /**
     * A list of enhet IDs to exclude from the result set. This will only exclude the specified
     * enhets, not subenhets.
     */
    protected List<String> excludeAdministrativEnhetExact;

    /** Filter by the published date of the document. */
    protected String publisertDatoBefore;

    /** Filter by the published date of the document. */
    protected String publisertDatoAfter;

    /** Filter by the updated date of the document. */
    protected String oppdatertDatoBefore;

    /** Filter by the updated date of the document. */
    protected String oppdatertDatoAfter;

    /** Filter by the date of a meeting. */
    protected String moetedatoBefore;

    /** Filter by the date of a meeting. */
    protected String moetedatoAfter;

    /** Filter by the entity type. */
    protected List<EntityEnum> entity;

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

    /** Match documents with (or without) fulltext. */
    protected Boolean fulltext;

    /**
     * A query string to filter by. Quotes can be used to search for exact matches or phrases. Words
     * can be excluded by prefixing them with a minus sign.
     */
    public String getQuery() {
      return query;
    }

    /** A list of enhet IDs to filter by. This will also match subenhets. */
    public List<String> getAdministrativEnhet() {
      return administrativEnhet;
    }

    /**
     * A list of enhet IDs to filter by. This will only match the specified enhets, not subenhets.
     */
    public List<String> getAdministrativEnhetExact() {
      return administrativEnhetExact;
    }

    /** A list of enhet IDs to exclude from the result set. This will also exclude subenhets. */
    public List<String> getExcludeAdministrativEnhet() {
      return excludeAdministrativEnhet;
    }

    /**
     * A list of enhet IDs to exclude from the result set. This will only exclude the specified
     * enhets, not subenhets.
     */
    public List<String> getExcludeAdministrativEnhetExact() {
      return excludeAdministrativEnhetExact;
    }

    /** Filter by the published date of the document. */
    public String getPublisertDatoBefore() {
      return publisertDatoBefore;
    }

    /** Filter by the published date of the document. */
    public String getPublisertDatoAfter() {
      return publisertDatoAfter;
    }

    /** Filter by the updated date of the document. */
    public String getOppdatertDatoBefore() {
      return oppdatertDatoBefore;
    }

    /** Filter by the updated date of the document. */
    public String getOppdatertDatoAfter() {
      return oppdatertDatoAfter;
    }

    /** Filter by the date of a meeting. */
    public String getMoetedatoBefore() {
      return moetedatoBefore;
    }

    /** Filter by the date of a meeting. */
    public String getMoetedatoAfter() {
      return moetedatoAfter;
    }

    /** Filter by the entity type. */
    public List<EntityEnum> getEntity() {
      return entity;
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

    /** Match documents with (or without) fulltext. */
    public Boolean getFulltext() {
      return fulltext;
    }

    /**
     * A query string to filter by. Quotes can be used to search for exact matches or phrases. Words
     * can be excluded by prefixing them with a minus sign.
     */
    public Builder query(String query) {
      this.query = query;
      return this;
    }

    /** A list of enhet IDs to filter by. This will also match subenhets. */
    public Builder administrativEnhet(List<String> administrativEnhet) {
      this.administrativEnhet = administrativEnhet;
      return this;
    }

    /** A list of enhet IDs to filter by. This will also match subenhets. */
    public Builder addAdministrativEnhet(String administrativEnhet) {
      if (this.administrativEnhet == null) {
        this.administrativEnhet = new ArrayList<>();
      }
      this.administrativEnhet.add(administrativEnhet);
      return this;
    }

    /**
     * A list of enhet IDs to filter by. This will only match the specified enhets, not subenhets.
     */
    public Builder administrativEnhetExact(List<String> administrativEnhetExact) {
      this.administrativEnhetExact = administrativEnhetExact;
      return this;
    }

    /**
     * A list of enhet IDs to filter by. This will only match the specified enhets, not subenhets.
     */
    public Builder addAdministrativEnhetExact(String administrativEnhetExact) {
      if (this.administrativEnhetExact == null) {
        this.administrativEnhetExact = new ArrayList<>();
      }
      this.administrativEnhetExact.add(administrativEnhetExact);
      return this;
    }

    /** A list of enhet IDs to exclude from the result set. This will also exclude subenhets. */
    public Builder excludeAdministrativEnhet(List<String> excludeAdministrativEnhet) {
      this.excludeAdministrativEnhet = excludeAdministrativEnhet;
      return this;
    }

    /** A list of enhet IDs to exclude from the result set. This will also exclude subenhets. */
    public Builder addExcludeAdministrativEnhet(String excludeAdministrativEnhet) {
      if (this.excludeAdministrativEnhet == null) {
        this.excludeAdministrativEnhet = new ArrayList<>();
      }
      this.excludeAdministrativEnhet.add(excludeAdministrativEnhet);
      return this;
    }

    /**
     * A list of enhet IDs to exclude from the result set. This will only exclude the specified
     * enhets, not subenhets.
     */
    public Builder excludeAdministrativEnhetExact(List<String> excludeAdministrativEnhetExact) {
      this.excludeAdministrativEnhetExact = excludeAdministrativEnhetExact;
      return this;
    }

    /**
     * A list of enhet IDs to exclude from the result set. This will only exclude the specified
     * enhets, not subenhets.
     */
    public Builder addExcludeAdministrativEnhetExact(String excludeAdministrativEnhetExact) {
      if (this.excludeAdministrativEnhetExact == null) {
        this.excludeAdministrativEnhetExact = new ArrayList<>();
      }
      this.excludeAdministrativEnhetExact.add(excludeAdministrativEnhetExact);
      return this;
    }

    /** Filter by the published date of the document. */
    public Builder publisertDatoBefore(String publisertDatoBefore) {
      this.publisertDatoBefore = publisertDatoBefore;
      return this;
    }

    /** Filter by the published date of the document. */
    public Builder publisertDatoAfter(String publisertDatoAfter) {
      this.publisertDatoAfter = publisertDatoAfter;
      return this;
    }

    /** Filter by the updated date of the document. */
    public Builder oppdatertDatoBefore(String oppdatertDatoBefore) {
      this.oppdatertDatoBefore = oppdatertDatoBefore;
      return this;
    }

    /** Filter by the updated date of the document. */
    public Builder oppdatertDatoAfter(String oppdatertDatoAfter) {
      this.oppdatertDatoAfter = oppdatertDatoAfter;
      return this;
    }

    /** Filter by the date of a meeting. */
    public Builder moetedatoBefore(String moetedatoBefore) {
      this.moetedatoBefore = moetedatoBefore;
      return this;
    }

    /** Filter by the date of a meeting. */
    public Builder moetedatoAfter(String moetedatoAfter) {
      this.moetedatoAfter = moetedatoAfter;
      return this;
    }

    /** Filter by the entity type. */
    public Builder entity(List<EntityEnum> entity) {
      this.entity = entity;
      return this;
    }

    /** Filter by the entity type. */
    public Builder addEntity(EntityEnum entity) {
      if (this.entity == null) {
        this.entity = new ArrayList<>();
      }
      this.entity.add(entity);
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

    /** Match documents with (or without) fulltext. */
    public Builder fulltext(Boolean fulltext) {
      this.fulltext = fulltext;
      return this;
    }

    public FilterParameters build() {
      return new FilterParameters(
          this.query,
          this.administrativEnhet,
          this.administrativEnhetExact,
          this.excludeAdministrativEnhet,
          this.excludeAdministrativEnhetExact,
          this.publisertDatoBefore,
          this.publisertDatoAfter,
          this.oppdatertDatoBefore,
          this.oppdatertDatoAfter,
          this.moetedatoBefore,
          this.moetedatoAfter,
          this.entity,
          this.ids,
          this.externalIds,
          this.journalenhet,
          this.fulltext);
    }
  }
}
