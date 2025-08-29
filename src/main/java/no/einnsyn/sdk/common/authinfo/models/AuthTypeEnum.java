// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.authinfo.models;

import com.google.gson.annotations.SerializedName;

public enum AuthTypeEnum {
  @SerializedName("Ansattporten")
  ANSATTPORTEN("Ansattporten"),
  @SerializedName("ApiKey")
  APIKEY("ApiKey"),
  @SerializedName("Bruker")
  BRUKER("Bruker");

  private final String value;

  AuthTypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  public String toJson() {
    return value;
  }

  public static AuthTypeEnum fromValue(String value) {
    value = value.trim().toLowerCase();
    for (AuthTypeEnum val : AuthTypeEnum.values()) {
      if (val.value.toLowerCase().equals(value)) {
        return val;
      }
    }
    throw new IllegalArgumentException("Unknown value: " + value);
  }
}
