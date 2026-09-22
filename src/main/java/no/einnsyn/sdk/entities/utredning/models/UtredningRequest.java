// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.utredning.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.DokumentbeskrivelseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;
import no.einnsyn.sdk.entities.moetesaksbeskrivelse.models.MoetesaksbeskrivelseRequest;

/** Represents a report or investigation related to a meeting case. */
public class UtredningRequest extends ArkivBaseRequest {
  /** The description of the case. */
  protected ExpandableField<MoetesaksbeskrivelseRequest> saksbeskrivelse;

  /** The recommendation or proposition. */
  protected ExpandableField<MoetesaksbeskrivelseRequest> innstilling;

  /** Documents that are part of the investigation. */
  protected List<ExpandableField<DokumentbeskrivelseRequest>> utredningsdokument;

  public UtredningRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      ExpandableField<MoetesaksbeskrivelseRequest> saksbeskrivelse,
      ExpandableField<MoetesaksbeskrivelseRequest> innstilling,
      List<ExpandableField<DokumentbeskrivelseRequest>> utredningsdokument) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.saksbeskrivelse = saksbeskrivelse;
    this.innstilling = innstilling;
    this.utredningsdokument = utredningsdokument;
  }

  /** The description of the case. */
  public ExpandableField<MoetesaksbeskrivelseRequest> getSaksbeskrivelse() {
    return saksbeskrivelse;
  }

  /** The recommendation or proposition. */
  public ExpandableField<MoetesaksbeskrivelseRequest> getInnstilling() {
    return innstilling;
  }

  /** Documents that are part of the investigation. */
  public List<ExpandableField<DokumentbeskrivelseRequest>> getUtredningsdokument() {
    return utredningsdokument;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static UtredningRequest of(Function<Builder, Builder> builderFunction) {
    return builderFunction.apply(new Builder()).build();
  }

  public static class Builder {
    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     *
     * <p>For most entities the externalId is unique, and can be used in place of the eInnsynId when
     * looking up a single object. It is *not* unique for Arkiv, Arkivdel, Klasse and
     * Korrespondansepart, and can not be used to look those up. For those entities, a value given
     * in the `externalIds` list parameter may also match more than one object.
     */
    protected String externalId;

    /** This object should not be accessible to the public before the given dateTime. */
    protected String accessibleAfter;

    /**
     * An identifier for the resource, given by the user's system.
     *
     * <p>For most entities the systemId is unique, and can be used in place of the eInnsynId when
     * looking up a single object. It is *not* unique for Arkiv, Arkivdel and Klasse, and can not be
     * used to look those up.
     */
    protected String systemId;

    /**
     * The administrative unit that is responsible for the resource. This is by default derived from
     * the credentials used to authenticate the request on creation, or it can manually be set to an
     * Enhet owned by that derived Enhet.
     */
    protected ExpandableField<EnhetRequest> journalenhet;

    /** The description of the case. */
    protected ExpandableField<MoetesaksbeskrivelseRequest> saksbeskrivelse;

    /** The recommendation or proposition. */
    protected ExpandableField<MoetesaksbeskrivelseRequest> innstilling;

    /** Documents that are part of the investigation. */
    protected List<ExpandableField<DokumentbeskrivelseRequest>> utredningsdokument;

    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     *
     * <p>For most entities the externalId is unique, and can be used in place of the eInnsynId when
     * looking up a single object. It is *not* unique for Arkiv, Arkivdel, Klasse and
     * Korrespondansepart, and can not be used to look those up. For those entities, a value given
     * in the `externalIds` list parameter may also match more than one object.
     */
    public String getExternalId() {
      return externalId;
    }

    /** This object should not be accessible to the public before the given dateTime. */
    public String getAccessibleAfter() {
      return accessibleAfter;
    }

    /**
     * An identifier for the resource, given by the user's system.
     *
     * <p>For most entities the systemId is unique, and can be used in place of the eInnsynId when
     * looking up a single object. It is *not* unique for Arkiv, Arkivdel and Klasse, and can not be
     * used to look those up.
     */
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

    /** The description of the case. */
    public ExpandableField<MoetesaksbeskrivelseRequest> getSaksbeskrivelse() {
      return saksbeskrivelse;
    }

    /** The recommendation or proposition. */
    public ExpandableField<MoetesaksbeskrivelseRequest> getInnstilling() {
      return innstilling;
    }

    /** Documents that are part of the investigation. */
    public List<ExpandableField<DokumentbeskrivelseRequest>> getUtredningsdokument() {
      return utredningsdokument;
    }

    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     *
     * <p>For most entities the externalId is unique, and can be used in place of the eInnsynId when
     * looking up a single object. It is *not* unique for Arkiv, Arkivdel, Klasse and
     * Korrespondansepart, and can not be used to look those up. For those entities, a value given
     * in the `externalIds` list parameter may also match more than one object.
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

    /**
     * An identifier for the resource, given by the user's system.
     *
     * <p>For most entities the systemId is unique, and can be used in place of the eInnsynId when
     * looking up a single object. It is *not* unique for Arkiv, Arkivdel and Klasse, and can not be
     * used to look those up.
     */
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

    /** The description of the case. */
    public Builder saksbeskrivelse(MoetesaksbeskrivelseRequest saksbeskrivelse) {
      this.saksbeskrivelse = new ExpandableField<>(saksbeskrivelse);
      return this;
    }

    /** The description of the case. */
    public Builder saksbeskrivelse(String id) {
      this.saksbeskrivelse = new ExpandableField<>(id);
      return this;
    }

    /** The recommendation or proposition. */
    public Builder innstilling(MoetesaksbeskrivelseRequest innstilling) {
      this.innstilling = new ExpandableField<>(innstilling);
      return this;
    }

    /** The recommendation or proposition. */
    public Builder innstilling(String id) {
      this.innstilling = new ExpandableField<>(id);
      return this;
    }

    /** Documents that are part of the investigation. */
    public Builder utredningsdokument(List<DokumentbeskrivelseRequest> utredningsdokument) {
      this.utredningsdokument =
          utredningsdokument.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    /** Documents that are part of the investigation. */
    public Builder addUtredningsdokument(DokumentbeskrivelseRequest utredningsdokument) {
      if (this.utredningsdokument == null) {
        this.utredningsdokument = new ArrayList<>();
      }
      this.utredningsdokument.add(
          new ExpandableField<DokumentbeskrivelseRequest>(utredningsdokument));
      return this;
    }

    /** Documents that are part of the investigation. */
    public Builder addUtredningsdokument(
        Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
            builderFunction) {
      if (this.utredningsdokument == null) {
        this.utredningsdokument = new ArrayList<>();
      }
      this.utredningsdokument.add(
          new ExpandableField<>(
              builderFunction.apply(new DokumentbeskrivelseRequest.Builder()).build()));
      return this;
    }

    /** Documents that are part of the investigation. */
    public Builder addUtredningsdokument(String id) {
      if (this.utredningsdokument == null) {
        this.utredningsdokument = new ArrayList<>();
      }
      this.utredningsdokument.add(new ExpandableField<>(id));
      return this;
    }

    public UtredningRequest build() {
      return new UtredningRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.saksbeskrivelse,
          this.innstilling,
          this.utredningsdokument);
    }
  }
}
