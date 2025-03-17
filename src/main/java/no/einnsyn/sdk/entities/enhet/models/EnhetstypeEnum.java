// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.enhet.models;

import com.google.gson.annotations.SerializedName;

public enum EnhetstypeEnum {
  @SerializedName("ADMINISTRATIVENHET")
  ADMINISTRATIVENHET("ADMINISTRATIVENHET"),
  @SerializedName("AVDELING")
  AVDELING("AVDELING"),
  @SerializedName("BYDEL")
  BYDEL("BYDEL"),
  @SerializedName("DUMMYENHET")
  DUMMYENHET("DUMMYENHET"),
  @SerializedName("FYLKE")
  FYLKE("FYLKE"),
  @SerializedName("KOMMUNE")
  KOMMUNE("KOMMUNE"),
  @SerializedName("ORGAN")
  ORGAN("ORGAN"),
  @SerializedName("SEKSJON")
  SEKSJON("SEKSJON"),
  @SerializedName("UTVALG")
  UTVALG("UTVALG"),
  @SerializedName("VIRKSOMHET")
  VIRKSOMHET("VIRKSOMHET");

  private final String value;

  EnhetstypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  public String toJson() {
    return value;
  }

  public static EnhetstypeEnum fromValue(String value) {
    value = value.trim().toLowerCase();
    for (EnhetstypeEnum val : EnhetstypeEnum.values()) {
      if (val.value.toLowerCase().equals(value)) {
        return val;
      }
    }
    throw new IllegalArgumentException("Unknown value: " + value);
  }
}
