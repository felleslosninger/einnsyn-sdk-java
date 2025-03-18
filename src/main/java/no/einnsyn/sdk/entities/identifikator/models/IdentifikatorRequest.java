// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.identifikator.models;

import java.util.function.Function;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBaseRequest;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;

/** Identifikator */
public class IdentifikatorRequest extends ArkivBaseRequest {
  protected String navn;

  protected String identifikator;

  protected String initialer;

  protected String epostadresse;

  public IdentifikatorRequest(
      String externalId,
      String accessibleAfter,
      String systemId,
      ExpandableField<EnhetRequest> journalenhet,
      String navn,
      String identifikator,
      String initialer,
      String epostadresse) {
    super(externalId, accessibleAfter, systemId, journalenhet);
    this.navn = navn;
    this.identifikator = identifikator;
    this.initialer = initialer;
    this.epostadresse = epostadresse;
  }

  public String getNavn() {
    return navn;
  }

  public String getIdentifikator() {
    return identifikator;
  }

  public String getInitialer() {
    return initialer;
  }

  public String getEpostadresse() {
    return epostadresse;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static IdentifikatorRequest of(Function<Builder, Builder> builderFunction) {
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

    protected String navn;

    protected String identifikator;

    protected String initialer;

    protected String epostadresse;

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

    public String getNavn() {
      return navn;
    }

    public String getIdentifikator() {
      return identifikator;
    }

    public String getInitialer() {
      return initialer;
    }

    public String getEpostadresse() {
      return epostadresse;
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

    public Builder navn(String navn) {
      this.navn = navn;
      return this;
    }

    public Builder identifikator(String identifikator) {
      this.identifikator = identifikator;
      return this;
    }

    public Builder initialer(String initialer) {
      this.initialer = initialer;
      return this;
    }

    public Builder epostadresse(String epostadresse) {
      this.epostadresse = epostadresse;
      return this;
    }

    public IdentifikatorRequest build() {
      return new IdentifikatorRequest(
          this.externalId,
          this.accessibleAfter,
          this.systemId,
          this.journalenhet,
          this.navn,
          this.identifikator,
          this.initialer,
          this.epostadresse);
    }
  }
}
