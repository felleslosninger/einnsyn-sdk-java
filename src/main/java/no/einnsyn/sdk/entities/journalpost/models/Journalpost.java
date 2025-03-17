// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.journalpost.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.entities.registrering.models.Registrering;
import no.einnsyn.sdk.entities.saksmappe.models.Saksmappe;
import no.einnsyn.sdk.entities.skjerming.models.Skjerming;

/** Journalpost */
public class Journalpost extends Registrering {
  protected final String entity = "Journalpost";

  protected Integer journalaar;

  protected Integer journalsekvensnummer;

  protected Integer journalpostnummer;

  protected JournalposttypeEnum journalposttype;

  protected String journaldato;

  protected String dokumentetsDato;

  protected ExpandableField<Skjerming> skjerming;

  protected String legacyJournalposttype;

  protected List<String> legacyFoelgsakenReferanse;

  protected String administrativEnhet;

  protected ExpandableField<Enhet> administrativEnhetObjekt;

  protected ExpandableField<Saksmappe> saksmappe;

  public String getEntity() {
    return entity;
  }

  public Integer getJournalaar() {
    return journalaar;
  }

  public Integer getJournalsekvensnummer() {
    return journalsekvensnummer;
  }

  public Integer getJournalpostnummer() {
    return journalpostnummer;
  }

  public JournalposttypeEnum getJournalposttype() {
    return journalposttype;
  }

  public String getJournaldato() {
    return journaldato;
  }

  public String getDokumentetsDato() {
    return dokumentetsDato;
  }

  public ExpandableField<Skjerming> getSkjerming() {
    return skjerming;
  }

  public String getLegacyJournalposttype() {
    return legacyJournalposttype;
  }

  public List<String> getLegacyFoelgsakenReferanse() {
    return legacyFoelgsakenReferanse;
  }

  public String getAdministrativEnhet() {
    return administrativEnhet;
  }

  public ExpandableField<Enhet> getAdministrativEnhetObjekt() {
    return administrativEnhetObjekt;
  }

  public ExpandableField<Saksmappe> getSaksmappe() {
    return saksmappe;
  }
}
