// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.votering.models;

import com.google.gson.annotations.SerializedName;

public enum StemmeEnum {
  @SerializedName("Ja")
  JA("Ja"),
  @SerializedName("Nei")
  NEI("Nei"),
  @SerializedName("Blankt")
  BLANKT("Blankt");

  private final String value;

  StemmeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  public String toJson() {
    return value;
  }

  public static StemmeEnum fromValue(String value) {
    value = value.trim().toLowerCase();
    for (StemmeEnum val : StemmeEnum.values()) {
      if (val.value.toLowerCase().equals(value)) {
        return val;
      }
    }
    throw new IllegalArgumentException("Unknown value: " + value);
  }
}
