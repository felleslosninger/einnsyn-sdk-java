// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.mappe.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.arkivdel.models.Arkivdel;
import no.einnsyn.sdk.entities.klasse.models.Klasse;
import no.einnsyn.sdk.entities.moetemappe.models.Moetemappe;
import no.einnsyn.sdk.entities.saksmappe.models.Saksmappe;

/**
 * An abstract base model for case files (Saksmappe) and meeting records (Moetemappe). It contains
 * common properties for these folder-like structures.
 */
public class Mappe extends ArkivBase {
  /** A URL-friendly unique slug for the resource. */
  protected String slug;

  /** The title of the Mappe, with sensitive information redacted. */
  protected String offentligTittel;

  /** The title of the Mappe, with sensitive information included. */
  protected String offentligTittelSensitiv;

  protected String beskrivelse;

  protected String noekkelord;

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

  /** An optional Klasse for this Mappe. */
  protected ExpandableField<Klasse> klasse;

  /** If this Mappe is the child of a Saksmappe, this field will contain the parent Saksmappe. */
  protected ExpandableField<Saksmappe> saksmappe;

  /** If this Mappe is the child of a Moetemappe, this field will contain the parent Moetemappe. */
  protected ExpandableField<Moetemappe> moetemappe;

  /**
   * If this Mappe is not a child of a Saksmappe or Moetemappe, this field will contain the parent
   * Arkivdel.
   */
  protected ExpandableField<Arkivdel> arkivdel;

  /** A URL-friendly unique slug for the resource. */
  public String getSlug() {
    return slug;
  }

  /** The title of the Mappe, with sensitive information redacted. */
  public String getOffentligTittel() {
    return offentligTittel;
  }

  /** The title of the Mappe, with sensitive information included. */
  public String getOffentligTittelSensitiv() {
    return offentligTittelSensitiv;
  }

  public String getBeskrivelse() {
    return beskrivelse;
  }

  public String getNoekkelord() {
    return noekkelord;
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

  /** An optional Klasse for this Mappe. */
  public ExpandableField<Klasse> getKlasse() {
    return klasse;
  }

  /** If this Mappe is the child of a Saksmappe, this field will contain the parent Saksmappe. */
  public ExpandableField<Saksmappe> getSaksmappe() {
    return saksmappe;
  }

  /** If this Mappe is the child of a Moetemappe, this field will contain the parent Moetemappe. */
  public ExpandableField<Moetemappe> getMoetemappe() {
    return moetemappe;
  }

  /**
   * If this Mappe is not a child of a Saksmappe or Moetemappe, this field will contain the parent
   * Arkivdel.
   */
  public ExpandableField<Arkivdel> getArkivdel() {
    return arkivdel;
  }
}
