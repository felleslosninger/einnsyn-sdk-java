// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.enhet.models;

import com.google.gson.annotations.SerializedName;

public enum SortOrderEnum {
  @SerializedName("asc")
  ASC("asc"),
  @SerializedName("desc")
  DESC("desc");

  private final String value;

  SortOrderEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  public String toJson() {
    return value;
  }

  public static SortOrderEnum fromValue(String value) {
    value = value.trim().toLowerCase();
    for (SortOrderEnum val : SortOrderEnum.values()) {
      if (val.value.toLowerCase().equals(value)) {
        return val;
      }
    }
    throw new IllegalArgumentException("Unknown value: " + value);
  }
}
