// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.matrikkelnummer.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.journalpost.models.Journalpost;
import no.einnsyn.sdk.entities.moetedokument.models.Moetedokument;
import no.einnsyn.sdk.entities.moetemappe.models.Moetemappe;
import no.einnsyn.sdk.entities.moetesak.models.Moetesak;
import no.einnsyn.sdk.entities.saksmappe.models.Saksmappe;

/**
 * Identifies a property unit (matrikkelenhet) in the Norwegian cadastre, following Kartverket's
 * standard format.
 */
public class Matrikkelnummer extends ArkivBase {
  protected final String entity = "Matrikkelnummer";

  /** Four-digit municipality number (kommunenummer). */
  protected String kommunenummer;

  /** Garden number (gaardsnummer). */
  protected Integer gaardsnummer;

  /** Bruk number (bruksnummer). */
  protected Integer bruksnummer;

  /** Leasehold number (festenummer). 0 means no leasehold. */
  protected Integer festenummer;

  /** Section number (seksjonsnummer). 0 means no section. */
  protected Integer seksjonsnummer;

  /** The Saksmappe this Matrikkelnummer is associated with, if any. */
  protected ExpandableField<Saksmappe> saksmappe;

  /** The Moetemappe this Matrikkelnummer is associated with, if any. */
  protected ExpandableField<Moetemappe> moetemappe;

  /** The Journalpost this Matrikkelnummer is associated with, if any. */
  protected ExpandableField<Journalpost> journalpost;

  /** The Moetesak this Matrikkelnummer is associated with, if any. */
  protected ExpandableField<Moetesak> moetesak;

  /** The Moetedokument this Matrikkelnummer is associated with, if any. */
  protected ExpandableField<Moetedokument> moetedokument;

  public String getEntity() {
    return entity;
  }

  /** Four-digit municipality number (kommunenummer). */
  public String getKommunenummer() {
    return kommunenummer;
  }

  /** Garden number (gaardsnummer). */
  public Integer getGaardsnummer() {
    return gaardsnummer;
  }

  /** Bruk number (bruksnummer). */
  public Integer getBruksnummer() {
    return bruksnummer;
  }

  /** Leasehold number (festenummer). 0 means no leasehold. */
  public Integer getFestenummer() {
    return festenummer;
  }

  /** Section number (seksjonsnummer). 0 means no section. */
  public Integer getSeksjonsnummer() {
    return seksjonsnummer;
  }

  /** The Saksmappe this Matrikkelnummer is associated with, if any. */
  public ExpandableField<Saksmappe> getSaksmappe() {
    return saksmappe;
  }

  /** The Moetemappe this Matrikkelnummer is associated with, if any. */
  public ExpandableField<Moetemappe> getMoetemappe() {
    return moetemappe;
  }

  /** The Journalpost this Matrikkelnummer is associated with, if any. */
  public ExpandableField<Journalpost> getJournalpost() {
    return journalpost;
  }

  /** The Moetesak this Matrikkelnummer is associated with, if any. */
  public ExpandableField<Moetesak> getMoetesak() {
    return moetesak;
  }

  /** The Moetedokument this Matrikkelnummer is associated with, if any. */
  public ExpandableField<Moetedokument> getMoetedokument() {
    return moetedokument;
  }
}
