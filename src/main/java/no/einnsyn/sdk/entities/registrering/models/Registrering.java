// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.registrering.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.Dokumentbeskrivelse;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.entities.korrespondansepart.models.Korrespondansepart;

/**
 * An abstract base model for registry entries, such as journal entries (Journalpost) and
 * meeting-related entries (Moetesak, Moetedokument).
 */
public class Registrering extends ArkivBase {
  /** A URL-friendly unique slug for the resource. */
  protected String slug;

  /** The title of the resource, with sensitive information redacted. */
  protected String offentligTittel;

  /** The title of the resource, with sensitive information included. */
  protected String offentligTittelSensitiv;

  protected String beskrivelse;

  /**
   * The date the resource was published. This field is updated automatically, but can be set
   * manually by admins.
   */
  protected String publisertDato;

  /**
   * The date the resource was last updated. This field is updated automatically, but can be set
   * manually by admins.
   */
  protected String oppdatertDato;

  protected List<ExpandableField<Korrespondansepart>> korrespondansepart;

  protected List<ExpandableField<Dokumentbeskrivelse>> dokumentbeskrivelse;

  /** The administrative unit that has been handed the responsibility for this resource. */
  protected ExpandableField<Enhet> avhendetTil;

  /** A URL-friendly unique slug for the resource. */
  public String getSlug() {
    return slug;
  }

  /** The title of the resource, with sensitive information redacted. */
  public String getOffentligTittel() {
    return offentligTittel;
  }

  /** The title of the resource, with sensitive information included. */
  public String getOffentligTittelSensitiv() {
    return offentligTittelSensitiv;
  }

  public String getBeskrivelse() {
    return beskrivelse;
  }

  /**
   * The date the resource was published. This field is updated automatically, but can be set
   * manually by admins.
   */
  public String getPublisertDato() {
    return publisertDato;
  }

  /**
   * The date the resource was last updated. This field is updated automatically, but can be set
   * manually by admins.
   */
  public String getOppdatertDato() {
    return oppdatertDato;
  }

  public List<ExpandableField<Korrespondansepart>> getKorrespondansepart() {
    return korrespondansepart;
  }

  public List<ExpandableField<Dokumentbeskrivelse>> getDokumentbeskrivelse() {
    return dokumentbeskrivelse;
  }

  /** The administrative unit that has been handed the responsibility for this resource. */
  public ExpandableField<Enhet> getAvhendetTil() {
    return avhendetTil;
  }
}
