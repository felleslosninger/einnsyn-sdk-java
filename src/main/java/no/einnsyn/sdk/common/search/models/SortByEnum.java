// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.search.models;

import com.google.gson.annotations.SerializedName;

public enum SortByEnum {
  @SerializedName("administrativEnhetNavn")
  ADMINISTRATIVENHETNAVN("administrativEnhetNavn"),
  @SerializedName("dokumentetsDato")
  DOKUMENTETSDATO("dokumentetsDato"),
  @SerializedName("entity")
  ENTITY("entity"),
  @SerializedName("fulltekst")
  FULLTEKST("fulltekst"),
  @SerializedName("id")
  ID("id"),
  @SerializedName("journaldato")
  JOURNALDATO("journaldato"),
  @SerializedName("journalpostnummer")
  JOURNALPOSTNUMMER("journalpostnummer"),
  @SerializedName("journalposttype")
  JOURNALPOSTTYPE("journalposttype"),
  @SerializedName("korrespondansepartNavn")
  KORRESPONDANSEPARTNAVN("korrespondansepartNavn"),
  @SerializedName("moetedato")
  MOETEDATO("moetedato"),
  @SerializedName("oppdatertDato")
  OPPDATERTDATO("oppdatertDato"),
  @SerializedName("publisertDato")
  PUBLISERTDATO("publisertDato"),
  @SerializedName("standardDato")
  STANDARDDATO("standardDato"),
  @SerializedName("sakssekvensnummer")
  SAKSSEKVENSNUMMER("sakssekvensnummer"),
  @SerializedName("score")
  SCORE("score"),
  @SerializedName("tittel")
  TITTEL("tittel");

  private final String value;

  SortByEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  public String toJson() {
    return value;
  }

  public static SortByEnum fromValue(String value) {
    value = value.trim().toLowerCase();
    for (SortByEnum val : SortByEnum.values()) {
      if (val.value.toLowerCase().equals(value)) {
        return val;
      }
    }
    throw new IllegalArgumentException("Unknown value: " + value);
  }
}
