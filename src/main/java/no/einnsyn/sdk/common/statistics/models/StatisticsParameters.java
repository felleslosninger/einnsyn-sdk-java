// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.statistics.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StatisticsParameters {
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

  /** Filter by saksaar */
  protected List<String> saksaar;

  /** Filter by sakssekvensnummer */
  protected List<String> sakssekvensnummer;

  /** Filter by saksnummer */
  protected List<String> saksnummer;

  /** Filter by journalpostnummer */
  protected List<String> journalpostnummer;

  /** Filter by journalsekvensnummer */
  protected List<String> journalsekvensnummer;

  /** Filter by moetesaksaar */
  protected List<String> moetesaksaar;

  /** Filter by moetesakssekvensnummer */
  protected List<String> moetesakssekvensnummer;

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

  protected String aggregateFrom;

  protected String aggregateTo;

  public StatisticsParameters(
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
      List<String> saksaar,
      List<String> sakssekvensnummer,
      List<String> saksnummer,
      List<String> journalpostnummer,
      List<String> journalsekvensnummer,
      List<String> moetesaksaar,
      List<String> moetesakssekvensnummer,
      List<EntityEnum> entity,
      List<String> ids,
      List<String> externalIds,
      String journalenhet,
      Boolean fulltext,
      String aggregateFrom,
      String aggregateTo) {
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
    this.saksaar = saksaar;
    this.sakssekvensnummer = sakssekvensnummer;
    this.saksnummer = saksnummer;
    this.journalpostnummer = journalpostnummer;
    this.journalsekvensnummer = journalsekvensnummer;
    this.moetesaksaar = moetesaksaar;
    this.moetesakssekvensnummer = moetesakssekvensnummer;
    this.entity = entity;
    this.ids = ids;
    this.externalIds = externalIds;
    this.journalenhet = journalenhet;
    this.fulltext = fulltext;
    this.aggregateFrom = aggregateFrom;
    this.aggregateTo = aggregateTo;
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

  /** Filter by saksaar */
  public List<String> getSaksaar() {
    return saksaar;
  }

  /** Filter by sakssekvensnummer */
  public List<String> getSakssekvensnummer() {
    return sakssekvensnummer;
  }

  /** Filter by saksnummer */
  public List<String> getSaksnummer() {
    return saksnummer;
  }

  /** Filter by journalpostnummer */
  public List<String> getJournalpostnummer() {
    return journalpostnummer;
  }

  /** Filter by journalsekvensnummer */
  public List<String> getJournalsekvensnummer() {
    return journalsekvensnummer;
  }

  /** Filter by moetesaksaar */
  public List<String> getMoetesaksaar() {
    return moetesaksaar;
  }

  /** Filter by moetesakssekvensnummer */
  public List<String> getMoetesakssekvensnummer() {
    return moetesakssekvensnummer;
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

  public String getAggregateFrom() {
    return aggregateFrom;
  }

  public String getAggregateTo() {
    return aggregateTo;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static StatisticsParameters of(Function<Builder, Builder> builderFunction) {
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

    /** Filter by saksaar */
    protected List<String> saksaar;

    /** Filter by sakssekvensnummer */
    protected List<String> sakssekvensnummer;

    /** Filter by saksnummer */
    protected List<String> saksnummer;

    /** Filter by journalpostnummer */
    protected List<String> journalpostnummer;

    /** Filter by journalsekvensnummer */
    protected List<String> journalsekvensnummer;

    /** Filter by moetesaksaar */
    protected List<String> moetesaksaar;

    /** Filter by moetesakssekvensnummer */
    protected List<String> moetesakssekvensnummer;

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

    protected String aggregateFrom;

    protected String aggregateTo;

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

    /** Filter by saksaar */
    public List<String> getSaksaar() {
      return saksaar;
    }

    /** Filter by sakssekvensnummer */
    public List<String> getSakssekvensnummer() {
      return sakssekvensnummer;
    }

    /** Filter by saksnummer */
    public List<String> getSaksnummer() {
      return saksnummer;
    }

    /** Filter by journalpostnummer */
    public List<String> getJournalpostnummer() {
      return journalpostnummer;
    }

    /** Filter by journalsekvensnummer */
    public List<String> getJournalsekvensnummer() {
      return journalsekvensnummer;
    }

    /** Filter by moetesaksaar */
    public List<String> getMoetesaksaar() {
      return moetesaksaar;
    }

    /** Filter by moetesakssekvensnummer */
    public List<String> getMoetesakssekvensnummer() {
      return moetesakssekvensnummer;
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

    public String getAggregateFrom() {
      return aggregateFrom;
    }

    public String getAggregateTo() {
      return aggregateTo;
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

    /** Filter by saksaar */
    public Builder saksaar(List<String> saksaar) {
      this.saksaar = saksaar;
      return this;
    }

    /** Filter by saksaar */
    public Builder addSaksaar(String saksaar) {
      if (this.saksaar == null) {
        this.saksaar = new ArrayList<>();
      }
      this.saksaar.add(saksaar);
      return this;
    }

    /** Filter by sakssekvensnummer */
    public Builder sakssekvensnummer(List<String> sakssekvensnummer) {
      this.sakssekvensnummer = sakssekvensnummer;
      return this;
    }

    /** Filter by sakssekvensnummer */
    public Builder addSakssekvensnummer(String sakssekvensnummer) {
      if (this.sakssekvensnummer == null) {
        this.sakssekvensnummer = new ArrayList<>();
      }
      this.sakssekvensnummer.add(sakssekvensnummer);
      return this;
    }

    /** Filter by saksnummer */
    public Builder saksnummer(List<String> saksnummer) {
      this.saksnummer = saksnummer;
      return this;
    }

    /** Filter by saksnummer */
    public Builder addSaksnummer(String saksnummer) {
      if (this.saksnummer == null) {
        this.saksnummer = new ArrayList<>();
      }
      this.saksnummer.add(saksnummer);
      return this;
    }

    /** Filter by journalpostnummer */
    public Builder journalpostnummer(List<String> journalpostnummer) {
      this.journalpostnummer = journalpostnummer;
      return this;
    }

    /** Filter by journalpostnummer */
    public Builder addJournalpostnummer(String journalpostnummer) {
      if (this.journalpostnummer == null) {
        this.journalpostnummer = new ArrayList<>();
      }
      this.journalpostnummer.add(journalpostnummer);
      return this;
    }

    /** Filter by journalsekvensnummer */
    public Builder journalsekvensnummer(List<String> journalsekvensnummer) {
      this.journalsekvensnummer = journalsekvensnummer;
      return this;
    }

    /** Filter by journalsekvensnummer */
    public Builder addJournalsekvensnummer(String journalsekvensnummer) {
      if (this.journalsekvensnummer == null) {
        this.journalsekvensnummer = new ArrayList<>();
      }
      this.journalsekvensnummer.add(journalsekvensnummer);
      return this;
    }

    /** Filter by moetesaksaar */
    public Builder moetesaksaar(List<String> moetesaksaar) {
      this.moetesaksaar = moetesaksaar;
      return this;
    }

    /** Filter by moetesaksaar */
    public Builder addMoetesaksaar(String moetesaksaar) {
      if (this.moetesaksaar == null) {
        this.moetesaksaar = new ArrayList<>();
      }
      this.moetesaksaar.add(moetesaksaar);
      return this;
    }

    /** Filter by moetesakssekvensnummer */
    public Builder moetesakssekvensnummer(List<String> moetesakssekvensnummer) {
      this.moetesakssekvensnummer = moetesakssekvensnummer;
      return this;
    }

    /** Filter by moetesakssekvensnummer */
    public Builder addMoetesakssekvensnummer(String moetesakssekvensnummer) {
      if (this.moetesakssekvensnummer == null) {
        this.moetesakssekvensnummer = new ArrayList<>();
      }
      this.moetesakssekvensnummer.add(moetesakssekvensnummer);
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

    public Builder aggregateFrom(String aggregateFrom) {
      this.aggregateFrom = aggregateFrom;
      return this;
    }

    public Builder aggregateTo(String aggregateTo) {
      this.aggregateTo = aggregateTo;
      return this;
    }

    public StatisticsParameters build() {
      return new StatisticsParameters(
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
          this.saksaar,
          this.sakssekvensnummer,
          this.saksnummer,
          this.journalpostnummer,
          this.journalsekvensnummer,
          this.moetesaksaar,
          this.moetesakssekvensnummer,
          this.entity,
          this.ids,
          this.externalIds,
          this.journalenhet,
          this.fulltext,
          this.aggregateFrom,
          this.aggregateTo);
    }
  }
}
