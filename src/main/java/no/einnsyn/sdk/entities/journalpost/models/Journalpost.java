// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.journalpost.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.entities.registrering.models.Registrering;
import no.einnsyn.sdk.entities.saksmappe.models.Saksmappe;
import no.einnsyn.sdk.entities.skjerming.models.Skjerming;

/**
 * Represents a registry entry for a document, corresponding to the Journalpost in the Noark 5
 * standard. It is a record of an incoming, outgoing, or internal document.
 */
public class Journalpost extends Registrering {
  protected final String entity = "Journalpost";

  /** The year the registry entry was created. */
  protected Integer journalaar;

  /** The sequence number of the registry entry within the journal year. */
  protected Integer journalsekvensnummer;

  /** The post number within the journal. */
  protected Integer journalpostnummer;

  /** The type of registry entry. */
  protected JournalposttypeEnum journalposttype;

  /** The date the registry entry was recorded. */
  protected String journaldato;

  /** The date of the document itself. */
  protected String dokumentetsDato;

  /** Access control information for the registry entry. */
  protected ExpandableField<Skjerming> skjerming;

  /** Legacy field for the journal post type. */
  protected String legacyJournalposttype;

  /** Legacy field for references to related cases. */
  protected List<String> legacyFoelgsakenReferanse;

  /** The identifier of the administrative unit responsible for the registry entry. */
  protected String administrativEnhet;

  /**
   * The full administrative unit object responsible for the registry entry (expandable reference).
   */
  protected ExpandableField<Enhet> administrativEnhetObjekt;

  /** The case this record belongs to. */
  protected ExpandableField<Saksmappe> saksmappe;

  public String getEntity() {
    return entity;
  }

  /** The year the registry entry was created. */
  public Integer getJournalaar() {
    return journalaar;
  }

  /** The sequence number of the registry entry within the journal year. */
  public Integer getJournalsekvensnummer() {
    return journalsekvensnummer;
  }

  /** The post number within the journal. */
  public Integer getJournalpostnummer() {
    return journalpostnummer;
  }

  /** The type of registry entry. */
  public JournalposttypeEnum getJournalposttype() {
    return journalposttype;
  }

  /** The date the registry entry was recorded. */
  public String getJournaldato() {
    return journaldato;
  }

  /** The date of the document itself. */
  public String getDokumentetsDato() {
    return dokumentetsDato;
  }

  /** Access control information for the registry entry. */
  public ExpandableField<Skjerming> getSkjerming() {
    return skjerming;
  }

  /** Legacy field for the journal post type. */
  public String getLegacyJournalposttype() {
    return legacyJournalposttype;
  }

  /** Legacy field for references to related cases. */
  public List<String> getLegacyFoelgsakenReferanse() {
    return legacyFoelgsakenReferanse;
  }

  /** The identifier of the administrative unit responsible for the registry entry. */
  public String getAdministrativEnhet() {
    return administrativEnhet;
  }

  /**
   * The full administrative unit object responsible for the registry entry (expandable reference).
   */
  public ExpandableField<Enhet> getAdministrativEnhetObjekt() {
    return administrativEnhetObjekt;
  }

  /** The case this record belongs to. */
  public ExpandableField<Saksmappe> getSaksmappe() {
    return saksmappe;
  }
}
