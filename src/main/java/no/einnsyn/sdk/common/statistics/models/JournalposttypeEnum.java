// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.statistics.models;

import com.google.gson.annotations.SerializedName;

public enum JournalposttypeEnum {
  @SerializedName("inngaaende_dokument")
  INNGAAENDE_DOKUMENT("inngaaende_dokument"),
  @SerializedName("utgaaende_dokument")
  UTGAAENDE_DOKUMENT("utgaaende_dokument"),
  @SerializedName("organinternt_dokument_uten_oppfoelging")
  ORGANINTERNT_DOKUMENT_UTEN_OPPFOELGING("organinternt_dokument_uten_oppfoelging"),
  @SerializedName("organinternt_dokument_for_oppfoelging")
  ORGANINTERNT_DOKUMENT_FOR_OPPFOELGING("organinternt_dokument_for_oppfoelging"),
  @SerializedName("saksframlegg")
  SAKSFRAMLEGG("saksframlegg"),
  @SerializedName("sakskart")
  SAKSKART("sakskart"),
  @SerializedName("moeteprotokoll")
  MOETEPROTOKOLL("moeteprotokoll"),
  @SerializedName("moetebok")
  MOETEBOK("moetebok"),
  @SerializedName("ukjent")
  UKJENT("ukjent");

  private final String value;

  JournalposttypeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }

  public String toJson() {
    return value;
  }

  public static JournalposttypeEnum fromValue(String value) {
    value = value.trim().toLowerCase();
    for (JournalposttypeEnum val : JournalposttypeEnum.values()) {
      if (val.value.toLowerCase().equals(value)) {
        return val;
      }
    }
    throw new IllegalArgumentException("Unknown value: " + value);
  }
}
