// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.saksmappe.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.entities.journalpost.models.Journalpost;
import no.einnsyn.sdk.entities.mappe.models.Mappe;

/** Saksmappe */
public class Saksmappe extends Mappe {
  protected final String entity = "Saksmappe";

  protected Integer saksaar;

  protected Integer sakssekvensnummer;

  protected String saksnummer;

  protected String saksdato;

  protected List<ExpandableField<Journalpost>> journalpost;

  /** A code for the administrative Enhet associated with this Saksmappe. */
  protected String administrativEnhet;

  /**
   * The administrative Enhet associated with this Saksmappe. This is derived from the code given in
   * `administrativEnhet`. If no `administrativEnhet` is given, or the code is not found, the
   * `journalenhet` of the authenticated user will be used.
   */
  protected ExpandableField<Enhet> administrativEnhetObjekt;

  public String getEntity() {
    return entity;
  }

  public Integer getSaksaar() {
    return saksaar;
  }

  public Integer getSakssekvensnummer() {
    return sakssekvensnummer;
  }

  public String getSaksnummer() {
    return saksnummer;
  }

  public String getSaksdato() {
    return saksdato;
  }

  public List<ExpandableField<Journalpost>> getJournalpost() {
    return journalpost;
  }

  /** A code for the administrative Enhet associated with this Saksmappe. */
  public String getAdministrativEnhet() {
    return administrativEnhet;
  }

  /**
   * The administrative Enhet associated with this Saksmappe. This is derived from the code given in
   * `administrativEnhet`. If no `administrativEnhet` is given, or the code is not found, the
   * `journalenhet` of the authenticated user will be used.
   */
  public ExpandableField<Enhet> getAdministrativEnhetObjekt() {
    return administrativEnhetObjekt;
  }
}
