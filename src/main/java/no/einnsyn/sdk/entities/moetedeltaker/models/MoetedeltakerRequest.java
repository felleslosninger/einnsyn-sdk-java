// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetedeltaker.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;

/** Represents a participant in a meeting. */
public class MoetedeltakerRequest extends ArkivBaseRequest {
  /** The name of the meeting participant. */
  protected String moetedeltakerNavn;

  /** The function or role of the participant in the meeting (e.g., 'Chairperson'). */
  protected String moetedeltakerFunksjon;

  public MoetedeltakerRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String moetedeltakerNavn,
      String moetedeltakerFunksjon) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.moetedeltakerNavn = moetedeltakerNavn;
    this.moetedeltakerFunksjon = moetedeltakerFunksjon;
  }

  /** The name of the meeting participant. */
  public String getMoetedeltakerNavn() {
    return moetedeltakerNavn;
  }

  /** The function or role of the participant in the meeting (e.g., 'Chairperson'). */
  public String getMoetedeltakerFunksjon() {
    return moetedeltakerFunksjon;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MoetedeltakerRequest of(Function<Builder, Builder> builderFunction) {
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

    /** The name of the meeting participant. */
    protected String moetedeltakerNavn;

    /** The function or role of the participant in the meeting (e.g., 'Chairperson'). */
    protected String moetedeltakerFunksjon;

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

    /** The name of the meeting participant. */
    public String getMoetedeltakerNavn() {
      return moetedeltakerNavn;
    }

    /** The function or role of the participant in the meeting (e.g., 'Chairperson'). */
    public String getMoetedeltakerFunksjon() {
      return moetedeltakerFunksjon;
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

    /** The name of the meeting participant. */
    public Builder moetedeltakerNavn(String moetedeltakerNavn) {
      this.moetedeltakerNavn = moetedeltakerNavn;
      return this;
    }

    /** The function or role of the participant in the meeting (e.g., 'Chairperson'). */
    public Builder moetedeltakerFunksjon(String moetedeltakerFunksjon) {
      this.moetedeltakerFunksjon = moetedeltakerFunksjon;
      return this;
    }

    public MoetedeltakerRequest build() {
      return new MoetedeltakerRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.moetedeltakerNavn,
          this.moetedeltakerFunksjon);
    }
  }
}
