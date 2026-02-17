// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.statistics.models;

import com.google.gson.annotations.SerializedName;

public enum AggregateIntervalEnum {
  @SerializedName("hour")
  HOUR("hour"),
  @SerializedName("day")
  DAY("day"),
  @SerializedName("week")
  WEEK("week"),
  @SerializedName("month")
  MONTH("month"),
  @SerializedName("year")
  YEAR("year");

  private final String value;

  AggregateIntervalEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  public String toJson() {
    return value;
  }

  public static AggregateIntervalEnum fromValue(String value) {
    value = value.trim().toLowerCase();
    for (AggregateIntervalEnum val : AggregateIntervalEnum.values()) {
      if (val.value.toLowerCase().equals(value)) {
        return val;
      }
    }
    throw new IllegalArgumentException("Unknown value: " + value);
  }
}
