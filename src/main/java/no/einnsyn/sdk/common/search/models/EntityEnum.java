// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.search.models;

import com.google.gson.annotations.SerializedName;

public enum EntityEnum {
  @SerializedName("Journalpost")
  JOURNALPOST("Journalpost"),
  @SerializedName("Moetemappe")
  MOETEMAPPE("Moetemappe"),
  @SerializedName("Moetesak")
  MOETESAK("Moetesak"),
  @SerializedName("Saksmappe")
  SAKSMAPPE("Saksmappe");

  private final String value;

  EntityEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  public String toJson() {
    return value;
  }

  public static EntityEnum fromValue(String value) {
    value = value.trim().toLowerCase();
    for (EntityEnum val : EntityEnum.values()) {
      if (val.value.toLowerCase().equals(value)) {
        return val;
      }
    }
    throw new IllegalArgumentException("Unknown value: " + value);
  }
}
