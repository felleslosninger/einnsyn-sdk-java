// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.arkivdel.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;

/**
 * Represents a subdivision of an archive (Arkiv). In the Noark 5 standard, an archive can be
 * divided into one or more archive parts.
 */
public class ArkivdelRequest extends ArkivBaseRequest {
  /** The title of the Arkivdel. */
  protected String tittel;

  public ArkivdelRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String tittel) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.tittel = tittel;
  }

  /** The title of the Arkivdel. */
  public String getTittel() {
    return tittel;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ArkivdelRequest of(Function<Builder, Builder> builderFunction) {
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

    /** The title of the Arkivdel. */
    protected String tittel;

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

    /** The title of the Arkivdel. */
    public String getTittel() {
      return tittel;
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

    /** The title of the Arkivdel. */
    public Builder tittel(String tittel) {
      this.tittel = tittel;
      return this;
    }

    public ArkivdelRequest build() {
      return new ArkivdelRequest(
          this.externalId, this.accessibleAfter, this.systemId, this.journalenhet, this.tittel);
    }
  }
}
