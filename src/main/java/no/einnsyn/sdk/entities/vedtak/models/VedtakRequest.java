// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.vedtak.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.behandlingsprotokoll.models.BehandlingsprotokollRequest;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.DokumentbeskrivelseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;
import no.einnsyn.sdk.entities.moetesaksbeskrivelse.models.MoetesaksbeskrivelseRequest;
import no.einnsyn.sdk.entities.votering.models.VoteringRequest;

/** Vedtak */
public class VedtakRequest extends ArkivBaseRequest {
  protected ExpandableField<MoetesaksbeskrivelseRequest> vedtakstekst;

  protected List<ExpandableField<VoteringRequest>> votering;

  protected ExpandableField<BehandlingsprotokollRequest> behandlingsprotokoll;

  protected List<ExpandableField<DokumentbeskrivelseRequest>> vedtaksdokument;

  protected String dato;

  public VedtakRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      ExpandableField<MoetesaksbeskrivelseRequest> vedtakstekst,
      List<ExpandableField<VoteringRequest>> votering,
      ExpandableField<BehandlingsprotokollRequest> behandlingsprotokoll,
      List<ExpandableField<DokumentbeskrivelseRequest>> vedtaksdokument,
      String dato) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.vedtakstekst = vedtakstekst;
    this.votering = votering;
    this.behandlingsprotokoll = behandlingsprotokoll;
    this.vedtaksdokument = vedtaksdokument;
    this.dato = dato;
  }

  public ExpandableField<MoetesaksbeskrivelseRequest> getVedtakstekst() {
    return vedtakstekst;
  }

  public List<ExpandableField<VoteringRequest>> getVotering() {
    return votering;
  }

  public ExpandableField<BehandlingsprotokollRequest> getBehandlingsprotokoll() {
    return behandlingsprotokoll;
  }

  public List<ExpandableField<DokumentbeskrivelseRequest>> getVedtaksdokument() {
    return vedtaksdokument;
  }

  public String getDato() {
    return dato;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static VedtakRequest of(Function<Builder, Builder> builderFunction) {
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

    /** The unique identifier for the resource, given by the user's system. */
    protected String systemId;

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    protected ExpandableField<EnhetRequest> journalenhet;

    protected ExpandableField<MoetesaksbeskrivelseRequest> vedtakstekst;

    protected List<ExpandableField<VoteringRequest>> votering;

    protected ExpandableField<BehandlingsprotokollRequest> behandlingsprotokoll;

    protected List<ExpandableField<DokumentbeskrivelseRequest>> vedtaksdokument;

    protected String dato;

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

    /** The unique identifier for the resource, given by the user's system. */
    public String getSystemId() {
      return systemId;
    }

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    public ExpandableField<EnhetRequest> getJournalenhet() {
      return journalenhet;
    }

    public ExpandableField<MoetesaksbeskrivelseRequest> getVedtakstekst() {
      return vedtakstekst;
    }

    public List<ExpandableField<VoteringRequest>> getVotering() {
      return votering;
    }

    public ExpandableField<BehandlingsprotokollRequest> getBehandlingsprotokoll() {
      return behandlingsprotokoll;
    }

    public List<ExpandableField<DokumentbeskrivelseRequest>> getVedtaksdokument() {
      return vedtaksdokument;
    }

    public String getDato() {
      return dato;
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

    /** The unique identifier for the resource, given by the user's system. */
    public Builder systemId(String systemId) {
      this.systemId = systemId;
      return this;
    }

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    public Builder journalenhet(EnhetRequest journalenhet) {
      this.journalenhet = new ExpandableField<>(journalenhet);
      return this;
    }

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    public Builder journalenhet(String id) {
      this.journalenhet = new ExpandableField<>(id);
      return this;
    }

    public Builder vedtakstekst(MoetesaksbeskrivelseRequest vedtakstekst) {
      this.vedtakstekst = new ExpandableField<>(vedtakstekst);
      return this;
    }

    public Builder vedtakstekst(String id) {
      this.vedtakstekst = new ExpandableField<>(id);
      return this;
    }

    public Builder votering(List<VoteringRequest> votering) {
      this.votering = votering.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    public Builder addVotering(VoteringRequest votering) {
      if (this.votering == null) {
        this.votering = new ArrayList<>();
      }
      this.votering.add(new ExpandableField<VoteringRequest>(votering));
      return this;
    }

    public Builder addVotering(
        Function<VoteringRequest.Builder, VoteringRequest.Builder> builderFunction) {
      if (this.votering == null) {
        this.votering = new ArrayList<>();
      }
      this.votering.add(
          new ExpandableField<>(builderFunction.apply(new VoteringRequest.Builder()).build()));
      return this;
    }

    public Builder addVotering(String id) {
      if (this.votering == null) {
        this.votering = new ArrayList<>();
      }
      this.votering.add(new ExpandableField<>(id));
      return this;
    }

    public Builder behandlingsprotokoll(BehandlingsprotokollRequest behandlingsprotokoll) {
      this.behandlingsprotokoll = new ExpandableField<>(behandlingsprotokoll);
      return this;
    }

    public Builder behandlingsprotokoll(String id) {
      this.behandlingsprotokoll = new ExpandableField<>(id);
      return this;
    }

    public Builder vedtaksdokument(List<DokumentbeskrivelseRequest> vedtaksdokument) {
      this.vedtaksdokument =
          vedtaksdokument.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    public Builder addVedtaksdokument(DokumentbeskrivelseRequest vedtaksdokument) {
      if (this.vedtaksdokument == null) {
        this.vedtaksdokument = new ArrayList<>();
      }
      this.vedtaksdokument.add(new ExpandableField<DokumentbeskrivelseRequest>(vedtaksdokument));
      return this;
    }

    public Builder addVedtaksdokument(
        Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
            builderFunction) {
      if (this.vedtaksdokument == null) {
        this.vedtaksdokument = new ArrayList<>();
      }
      this.vedtaksdokument.add(
          new ExpandableField<>(
              builderFunction.apply(new DokumentbeskrivelseRequest.Builder()).build()));
      return this;
    }

    public Builder addVedtaksdokument(String id) {
      if (this.vedtaksdokument == null) {
        this.vedtaksdokument = new ArrayList<>();
      }
      this.vedtaksdokument.add(new ExpandableField<>(id));
      return this;
    }

    public Builder dato(String dato) {
      this.dato = dato;
      return this;
    }

    public VedtakRequest build() {
      return new VedtakRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.vedtakstekst,
          this.votering,
          this.behandlingsprotokoll,
          this.vedtaksdokument,
          this.dato);
    }
  }
}
