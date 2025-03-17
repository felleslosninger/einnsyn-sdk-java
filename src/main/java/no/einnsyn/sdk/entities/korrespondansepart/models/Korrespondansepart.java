// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.korrespondansepart.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.journalpost.models.Journalpost;
import no.einnsyn.sdk.entities.moetedokument.models.Moetedokument;
import no.einnsyn.sdk.entities.moetesak.models.Moetesak;

/** Korrespondansepart */
public class Korrespondansepart extends ArkivBase {
  protected final String entity = "Korrespondansepart";

  /** The name of the Korrespondansepart, with sensitive parts redacted. */
  protected String korrespondansepartNavn;

  /** The name of the Korrespondansepart, with all parts included. */
  protected String korrespondansepartNavnSensitiv;

  protected String korrespondanseparttype;

  protected String saksbehandler;

  protected String epostadresse;

  protected String postnummer;

  protected Boolean erBehandlingsansvarlig;

  /** The code for the administrative Enhet associated with this Korrespondansepart. */
  protected String administrativEnhet;

  /** The Journalpost this Korrespondansepart is associated with, if any. */
  protected ExpandableField<Journalpost> journalpost;

  /** The Moetedokument this Korrespondansepart is associated with, if any. */
  protected ExpandableField<Moetedokument> moetedokument;

  /** The Moetesak this Korrespondansepart is associated with, if any. */
  protected ExpandableField<Moetesak> moetesak;

  public String getEntity() {
    return entity;
  }

  /** The name of the Korrespondansepart, with sensitive parts redacted. */
  public String getKorrespondansepartNavn() {
    return korrespondansepartNavn;
  }

  /** The name of the Korrespondansepart, with all parts included. */
  public String getKorrespondansepartNavnSensitiv() {
    return korrespondansepartNavnSensitiv;
  }

  public String getKorrespondanseparttype() {
    return korrespondanseparttype;
  }

  public String getSaksbehandler() {
    return saksbehandler;
  }

  public String getEpostadresse() {
    return epostadresse;
  }

  public String getPostnummer() {
    return postnummer;
  }

  public Boolean getErBehandlingsansvarlig() {
    return erBehandlingsansvarlig;
  }

  /** The code for the administrative Enhet associated with this Korrespondansepart. */
  public String getAdministrativEnhet() {
    return administrativEnhet;
  }

  /** The Journalpost this Korrespondansepart is associated with, if any. */
  public ExpandableField<Journalpost> getJournalpost() {
    return journalpost;
  }

  /** The Moetedokument this Korrespondansepart is associated with, if any. */
  public ExpandableField<Moetedokument> getMoetedokument() {
    return moetedokument;
  }

  /** The Moetesak this Korrespondansepart is associated with, if any. */
  public ExpandableField<Moetesak> getMoetesak() {
    return moetesak;
  }
}
