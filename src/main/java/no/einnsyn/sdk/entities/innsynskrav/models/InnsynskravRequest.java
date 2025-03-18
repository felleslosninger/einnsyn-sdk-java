// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.innsynskrav.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.BaseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;
import no.einnsyn.sdk.entities.innsynskravbestilling.models.InnsynskravBestillingRequest;
import no.einnsyn.sdk.entities.journalpost.models.JournalpostRequest;

/** Innsynskrav */
public class InnsynskravRequest extends BaseRequest {
  protected ExpandableField<InnsynskravBestillingRequest> innsynskravBestilling;

  protected ExpandableField<JournalpostRequest> journalpost;

  protected ExpandableField<EnhetRequest> enhet;

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

  public ExpandableField<InnsynskravBestillingRequest> getInnsynskravBestilling() {
    return innsynskravBestilling;
  }

  public ExpandableField<JournalpostRequest> getJournalpost() {
    return journalpost;
  }

  public ExpandableField<EnhetRequest> getEnhet() {
    return enhet;
  }

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

    protected ExpandableField<InnsynskravBestillingRequest> innsynskravBestilling;

    protected ExpandableField<JournalpostRequest> journalpost;

    protected ExpandableField<EnhetRequest> enhet;

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

    public ExpandableField<InnsynskravBestillingRequest> getInnsynskravBestilling() {
      return innsynskravBestilling;
    }

    public ExpandableField<JournalpostRequest> getJournalpost() {
      return journalpost;
    }

    public ExpandableField<EnhetRequest> getEnhet() {
      return enhet;
    }

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

    public Builder innsynskravBestilling(InnsynskravBestillingRequest innsynskravBestilling) {
      this.innsynskravBestilling = new ExpandableField<>(innsynskravBestilling);
      return this;
    }

    public Builder innsynskravBestilling(String id) {
      this.innsynskravBestilling = new ExpandableField<>(id);
      return this;
    }

    public Builder journalpost(JournalpostRequest journalpost) {
      this.journalpost = new ExpandableField<>(journalpost);
      return this;
    }

    public Builder journalpost(String id) {
      this.journalpost = new ExpandableField<>(id);
      return this;
    }

    public Builder enhet(EnhetRequest enhet) {
      this.enhet = new ExpandableField<>(enhet);
      return this;
    }

    public Builder enhet(String id) {
      this.enhet = new ExpandableField<>(id);
      return this;
    }

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
