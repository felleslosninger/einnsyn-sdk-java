// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.innsynskrav.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.BaseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;
import no.einnsyn.sdk.entities.innsynskravbestilling.models.InnsynskravBestillingRequest;
import no.einnsyn.sdk.entities.journalpost.models.JournalpostRequest;

/** Represents a request for access to a specific registry entry (Journalpost). */
public class InnsynskravRequest extends BaseRequest {
  /** The order containing this access request. */
  protected ExpandableField<InnsynskravBestillingRequest> innsynskravBestilling;

  /** The registry entry being requested. */
  protected ExpandableField<JournalpostRequest> journalpost;

  /** The public authority responsible for handling the request. */
  protected ExpandableField<EnhetRequest> enhet;

  /** The timestamp when the request was sent to the public authority. */
  protected String sent;

  public InnsynskravRequest(
      String externalId,
      String accessibleAfter,
      ExpandableField<InnsynskravBestillingRequest> innsynskravBestilling,
      ExpandableField<JournalpostRequest> journalpost,
      ExpandableField<EnhetRequest> enhet,
      String sent) {
    super(externalId, accessibleAfter);
    this.innsynskravBestilling = innsynskravBestilling;
    this.journalpost = journalpost;
    this.enhet = enhet;
    this.sent = sent;
  }

  /** The order containing this access request. */
  public ExpandableField<InnsynskravBestillingRequest> getInnsynskravBestilling() {
    return innsynskravBestilling;
  }

  /** The registry entry being requested. */
  public ExpandableField<JournalpostRequest> getJournalpost() {
    return journalpost;
  }

  /** The public authority responsible for handling the request. */
  public ExpandableField<EnhetRequest> getEnhet() {
    return enhet;
  }

  /** The timestamp when the request was sent to the public authority. */
  public String getSent() {
    return sent;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static InnsynskravRequest of(Function<Builder, Builder> builderFunction) {
    return builderFunction.apply(new Builder()).build();
  }

  public static class Builder {
    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     */
    protected String externalId;

    /** This object should not be accessible to the public before the given dateTime. */
    protected String accessibleAfter;

    /** The order containing this access request. */
    protected ExpandableField<InnsynskravBestillingRequest> innsynskravBestilling;

    /** The registry entry being requested. */
    protected ExpandableField<JournalpostRequest> journalpost;

    /** The public authority responsible for handling the request. */
    protected ExpandableField<EnhetRequest> enhet;

    /** The timestamp when the request was sent to the public authority. */
    protected String sent;

    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     */
    public String getExternalId() {
      return externalId;
    }

    /** This object should not be accessible to the public before the given dateTime. */
    public String getAccessibleAfter() {
      return accessibleAfter;
    }

    /** The order containing this access request. */
    public ExpandableField<InnsynskravBestillingRequest> getInnsynskravBestilling() {
      return innsynskravBestilling;
    }

    /** The registry entry being requested. */
    public ExpandableField<JournalpostRequest> getJournalpost() {
      return journalpost;
    }

    /** The public authority responsible for handling the request. */
    public ExpandableField<EnhetRequest> getEnhet() {
      return enhet;
    }

    /** The timestamp when the request was sent to the public authority. */
    public String getSent() {
      return sent;
    }

    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    /** This object should not be accessible to the public before the given dateTime. */
    public Builder accessibleAfter(String accessibleAfter) {
      this.accessibleAfter = accessibleAfter;
      return this;
    }

    /** The order containing this access request. */
    public Builder innsynskravBestilling(InnsynskravBestillingRequest innsynskravBestilling) {
      this.innsynskravBestilling = new ExpandableField<>(innsynskravBestilling);
      return this;
    }

    /** The order containing this access request. */
    public Builder innsynskravBestilling(String id) {
      this.innsynskravBestilling = new ExpandableField<>(id);
      return this;
    }

    /** The registry entry being requested. */
    public Builder journalpost(JournalpostRequest journalpost) {
      this.journalpost = new ExpandableField<>(journalpost);
      return this;
    }

    /** The registry entry being requested. */
    public Builder journalpost(String id) {
      this.journalpost = new ExpandableField<>(id);
      return this;
    }

    /** The public authority responsible for handling the request. */
    public Builder enhet(EnhetRequest enhet) {
      this.enhet = new ExpandableField<>(enhet);
      return this;
    }

    /** The public authority responsible for handling the request. */
    public Builder enhet(String id) {
      this.enhet = new ExpandableField<>(id);
      return this;
    }

    /** The timestamp when the request was sent to the public authority. */
    public Builder sent(String sent) {
      this.sent = sent;
      return this;
    }

    public InnsynskravRequest build() {
      return new InnsynskravRequest(
          this.externalId,
          this.accessibleAfter,
          this.innsynskravBestilling,
          this.journalpost,
          this.enhet,
          this.sent);
    }
  }
}
