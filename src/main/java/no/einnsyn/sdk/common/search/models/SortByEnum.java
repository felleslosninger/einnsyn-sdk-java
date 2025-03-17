// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.search.models;

import com.google.gson.annotations.SerializedName;

public enum SortByEnum {
  @SerializedName("score")
  SCORE("score"),
  @SerializedName("id")
  ID("id"),
  @SerializedName("entity")
  ENTITY("entity"),
  @SerializedName("publisertDato")
  PUBLISERTDATO("publisertDato"),
  @SerializedName("oppdatertDato")
  OPPDATERTDATO("oppdatertDato"),
  @SerializedName("moetedato")
  MOETEDATO("moetedato"),
  @SerializedName("fulltekst")
  FULLTEKST("fulltekst"),
  @SerializedName("type")
  TYPE("type");

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
