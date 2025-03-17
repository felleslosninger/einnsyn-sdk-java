// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.bruker.models;

import com.google.gson.annotations.SerializedName;

public enum LanguageEnum {
  @SerializedName("nb")
  NB("nb"),
  @SerializedName("nn")
  NN("nn"),
  @SerializedName("en")
  EN("en"),
  @SerializedName("se")
  SE("se");

  private final String value;

  LanguageEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  public String toJson() {
    return value;
  }

  public static LanguageEnum fromValue(String value) {
    value = value.trim().toLowerCase();
    for (LanguageEnum val : LanguageEnum.values()) {
      if (val.value.toLowerCase().equals(value)) {
        return val;
      }
    }
    throw new IllegalArgumentException("Unknown value: " + value);
  }
}
