// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.authinfo.models;

import com.google.gson.annotations.SerializedName;

public enum TypeEnum {
  @SerializedName("Bruker")
  BRUKER("Bruker"),
  @SerializedName("Enhet")
  ENHET("Enhet");

  private final String value;

  TypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  public String toJson() {
    return value;
  }

  public static TypeEnum fromValue(String value) {
    value = value.trim().toLowerCase();
    for (TypeEnum val : TypeEnum.values()) {
      if (val.value.toLowerCase().equals(value)) {
        return val;
      }
    }
    throw new IllegalArgumentException("Unknown value: " + value);
  }
}
