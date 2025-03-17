// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.enhet.models;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.BaseRequest;

/** eInnsyn Enhet */
public class EnhetRequest extends BaseRequest {
  protected String navn;

  protected String navnNynorsk;

  protected String navnEngelsk;

  protected String navnSami;

  protected String orgnummer;

  protected String enhetskode;

  protected String kontaktpunktAdresse;

  protected String kontaktpunktEpost;

  protected String kontaktpunktTelefon;

  protected String innsynskravEpost;

  protected EnhetstypeEnum enhetstype;

  protected String avsluttetDato;

  protected Boolean skjult;

  protected Boolean eFormidling;

  protected Boolean teknisk;

  protected Boolean skalKonvertereId;

  protected Boolean skalMottaKvittering;

  protected Boolean visToppnode;

  protected Integer orderXmlVersjon;

  protected List<ExpandableField<EnhetRequest>> underenhet;

  protected ExpandableField<EnhetRequest> handteresAv;

  protected ExpandableField<EnhetRequest> parent;

  public EnhetRequest(
      String externalId,
      String accessibleAfter,
      String navn,
      String navnNynorsk,
      String navnEngelsk,
      String navnSami,
      String orgnummer,
      String enhetskode,
      String kontaktpunktAdresse,
      String kontaktpunktEpost,
      String kontaktpunktTelefon,
      String innsynskravEpost,
      EnhetstypeEnum enhetstype,
      String avsluttetDato,
      Boolean skjult,
      Boolean eFormidling,
      Boolean teknisk,
      Boolean skalKonvertereId,
      Boolean skalMottaKvittering,
      Boolean visToppnode,
      Integer orderXmlVersjon,
      List<ExpandableField<EnhetRequest>> underenhet,
      ExpandableField<EnhetRequest> handteresAv,
      ExpandableField<EnhetRequest> parent) {
    super(externalId, accessibleAfter);
    this.navn = navn;
    this.navnNynorsk = navnNynorsk;
    this.navnEngelsk = navnEngelsk;
    this.navnSami = navnSami;
    this.orgnummer = orgnummer;
    this.enhetskode = enhetskode;
    this.kontaktpunktAdresse = kontaktpunktAdresse;
    this.kontaktpunktEpost = kontaktpunktEpost;
    this.kontaktpunktTelefon = kontaktpunktTelefon;
    this.innsynskravEpost = innsynskravEpost;
    this.enhetstype = enhetstype;
    this.avsluttetDato = avsluttetDato;
    this.skjult = skjult;
    this.eFormidling = eFormidling;
    this.teknisk = teknisk;
    this.skalKonvertereId = skalKonvertereId;
    this.skalMottaKvittering = skalMottaKvittering;
    this.visToppnode = visToppnode;
    this.orderXmlVersjon = orderXmlVersjon;
    this.underenhet = underenhet;
    this.handteresAv = handteresAv;
    this.parent = parent;
  }

  public String getNavn() {
    return navn;
  }

  public String getNavnNynorsk() {
    return navnNynorsk;
  }

  public String getNavnEngelsk() {
    return navnEngelsk;
  }

  public String getNavnSami() {
    return navnSami;
  }

  public String getOrgnummer() {
    return orgnummer;
  }

  public String getEnhetskode() {
    return enhetskode;
  }

  public String getKontaktpunktAdresse() {
    return kontaktpunktAdresse;
  }

  public String getKontaktpunktEpost() {
    return kontaktpunktEpost;
  }

  public String getKontaktpunktTelefon() {
    return kontaktpunktTelefon;
  }

  public String getInnsynskravEpost() {
    return innsynskravEpost;
  }

  public EnhetstypeEnum getEnhetstype() {
    return enhetstype;
  }

  public String getAvsluttetDato() {
    return avsluttetDato;
  }

  public Boolean getSkjult() {
    return skjult;
  }

  public Boolean getEFormidling() {
    return eFormidling;
  }

  public Boolean getTeknisk() {
    return teknisk;
  }

  public Boolean getSkalKonvertereId() {
    return skalKonvertereId;
  }

  public Boolean getSkalMottaKvittering() {
    return skalMottaKvittering;
  }

  public Boolean getVisToppnode() {
    return visToppnode;
  }

  public Integer getOrderXmlVersjon() {
    return orderXmlVersjon;
  }

  public List<ExpandableField<EnhetRequest>> getUnderenhet() {
    return underenhet;
  }

  public ExpandableField<EnhetRequest> getHandteresAv() {
    return handteresAv;
  }

  public ExpandableField<EnhetRequest> getParent() {
    return parent;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static EnhetRequest of(Function<Builder, Builder> builderFunction) {
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

    protected String navn;

    protected String navnNynorsk;

    protected String navnEngelsk;

    protected String navnSami;

    protected String orgnummer;

    protected String enhetskode;

    protected String kontaktpunktAdresse;

    protected String kontaktpunktEpost;

    protected String kontaktpunktTelefon;

    protected String innsynskravEpost;

    protected EnhetstypeEnum enhetstype;

    protected String avsluttetDato;

    protected Boolean skjult;

    protected Boolean eFormidling;

    protected Boolean teknisk;

    protected Boolean skalKonvertereId;

    protected Boolean skalMottaKvittering;

    protected Boolean visToppnode;

    protected Integer orderXmlVersjon;

    protected List<ExpandableField<EnhetRequest>> underenhet;

    protected ExpandableField<EnhetRequest> handteresAv;

    protected ExpandableField<EnhetRequest> parent;

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

    public String getNavn() {
      return navn;
    }

    public String getNavnNynorsk() {
      return navnNynorsk;
    }

    public String getNavnEngelsk() {
      return navnEngelsk;
    }

    public String getNavnSami() {
      return navnSami;
    }

    public String getOrgnummer() {
      return orgnummer;
    }

    public String getEnhetskode() {
      return enhetskode;
    }

    public String getKontaktpunktAdresse() {
      return kontaktpunktAdresse;
    }

    public String getKontaktpunktEpost() {
      return kontaktpunktEpost;
    }

    public String getKontaktpunktTelefon() {
      return kontaktpunktTelefon;
    }

    public String getInnsynskravEpost() {
      return innsynskravEpost;
    }

    public EnhetstypeEnum getEnhetstype() {
      return enhetstype;
    }

    public String getAvsluttetDato() {
      return avsluttetDato;
    }

    public Boolean getSkjult() {
      return skjult;
    }

    public Boolean getEFormidling() {
      return eFormidling;
    }

    public Boolean getTeknisk() {
      return teknisk;
    }

    public Boolean getSkalKonvertereId() {
      return skalKonvertereId;
    }

    public Boolean getSkalMottaKvittering() {
      return skalMottaKvittering;
    }

    public Boolean getVisToppnode() {
      return visToppnode;
    }

    public Integer getOrderXmlVersjon() {
      return orderXmlVersjon;
    }

    public List<ExpandableField<EnhetRequest>> getUnderenhet() {
      return underenhet;
    }

    public ExpandableField<EnhetRequest> getHandteresAv() {
      return handteresAv;
    }

    public ExpandableField<EnhetRequest> getParent() {
      return parent;
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

    public Builder navn(String navn) {
      this.navn = navn;
      return this;
    }

    public Builder navnNynorsk(String navnNynorsk) {
      this.navnNynorsk = navnNynorsk;
      return this;
    }

    public Builder navnEngelsk(String navnEngelsk) {
      this.navnEngelsk = navnEngelsk;
      return this;
    }

    public Builder navnSami(String navnSami) {
      this.navnSami = navnSami;
      return this;
    }

    public Builder orgnummer(String orgnummer) {
      this.orgnummer = orgnummer;
      return this;
    }

    public Builder enhetskode(String enhetskode) {
      this.enhetskode = enhetskode;
      return this;
    }

    public Builder kontaktpunktAdresse(String kontaktpunktAdresse) {
      this.kontaktpunktAdresse = kontaktpunktAdresse;
      return this;
    }

    public Builder kontaktpunktEpost(String kontaktpunktEpost) {
      this.kontaktpunktEpost = kontaktpunktEpost;
      return this;
    }

    public Builder kontaktpunktTelefon(String kontaktpunktTelefon) {
      this.kontaktpunktTelefon = kontaktpunktTelefon;
      return this;
    }

    public Builder innsynskravEpost(String innsynskravEpost) {
      this.innsynskravEpost = innsynskravEpost;
      return this;
    }

    public Builder enhetstype(EnhetstypeEnum enhetstype) {
      this.enhetstype = enhetstype;
      return this;
    }

    public Builder avsluttetDato(String avsluttetDato) {
      this.avsluttetDato = avsluttetDato;
      return this;
    }

    public Builder skjult(Boolean skjult) {
      this.skjult = skjult;
      return this;
    }

    public Builder eFormidling(Boolean eFormidling) {
      this.eFormidling = eFormidling;
      return this;
    }

    public Builder teknisk(Boolean teknisk) {
      this.teknisk = teknisk;
      return this;
    }

    public Builder skalKonvertereId(Boolean skalKonvertereId) {
      this.skalKonvertereId = skalKonvertereId;
      return this;
    }

    public Builder skalMottaKvittering(Boolean skalMottaKvittering) {
      this.skalMottaKvittering = skalMottaKvittering;
      return this;
    }

    public Builder visToppnode(Boolean visToppnode) {
      this.visToppnode = visToppnode;
      return this;
    }

    public Builder orderXmlVersjon(Integer orderXmlVersjon) {
      this.orderXmlVersjon = orderXmlVersjon;
      return this;
    }

    public Builder underenhet(List<EnhetRequest> underenhet) {
      this.underenhet = underenhet.stream().map(ExpandableField::new).collect(Collectors.toList());
      return this;
    }

    public Builder addUnderenhet(EnhetRequest underenhet) {
      if (this.underenhet == null) {
        this.underenhet = new ArrayList<>();
      }
      this.underenhet.add(new ExpandableField<EnhetRequest>(underenhet));
      return this;
    }

    public Builder addUnderenhet(
        Function<EnhetRequest.Builder, EnhetRequest.Builder> builderFunction) {
      if (this.underenhet == null) {
        this.underenhet = new ArrayList<>();
      }
      this.underenhet.add(
          new ExpandableField<>(builderFunction.apply(new EnhetRequest.Builder()).build()));
      return this;
    }

    public Builder addUnderenhet(String id) {
      if (this.underenhet == null) {
        this.underenhet = new ArrayList<>();
      }
      this.underenhet.add(new ExpandableField<>(id));
      return this;
    }

    public Builder handteresAv(EnhetRequest handteresAv) {
      this.handteresAv = new ExpandableField<>(handteresAv);
      return this;
    }

    public Builder handteresAv(String id) {
      this.handteresAv = new ExpandableField<>(id);
      return this;
    }

    public Builder parent(EnhetRequest parent) {
      this.parent = new ExpandableField<>(parent);
      return this;
    }

    public Builder parent(String id) {
      this.parent = new ExpandableField<>(id);
      return this;
    }

    public EnhetRequest build() {
      return new EnhetRequest(
          this.externalId,
          this.accessibleAfter,
          this.navn,
          this.navnNynorsk,
          this.navnEngelsk,
          this.navnSami,
          this.orgnummer,
          this.enhetskode,
          this.kontaktpunktAdresse,
          this.kontaktpunktEpost,
          this.kontaktpunktTelefon,
          this.innsynskravEpost,
          this.enhetstype,
          this.avsluttetDato,
          this.skjult,
          this.eFormidling,
          this.teknisk,
          this.skalKonvertereId,
          this.skalMottaKvittering,
          this.visToppnode,
          this.orderXmlVersjon,
          this.underenhet,
          this.handteresAv,
          this.parent);
    }
  }
}
