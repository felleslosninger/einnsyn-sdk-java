// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetesak.models;

import com.google.gson.annotations.SerializedName;

public enum MoetesakstypeEnum {
  @SerializedName("moete")
  MOETE("moete"),
  @SerializedName("politisk")
  POLITISK("politisk"),
  @SerializedName("delegert")
  DELEGERT("delegert"),
  @SerializedName("interpellasjon")
  INTERPELLASJON("interpellasjon"),
  @SerializedName("godkjenning")
  GODKJENNING("godkjenning"),
  @SerializedName("orientering")
  ORIENTERING("orientering"),
  @SerializedName("referat")
  REFERAT("referat"),
  @SerializedName("annet")
  ANNET("annet");

  private final String value;

  MoetesakstypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  public String toJson() {
    return value;
  }

  public static MoetesakstypeEnum fromValue(String value) {
    value = value.trim().toLowerCase();
    for (MoetesakstypeEnum val : MoetesakstypeEnum.values()) {
      if (val.value.toLowerCase().equals(value)) {
        return val;
      }
    }
    throw new IllegalArgumentException("Unknown value: " + value);
  }
}
