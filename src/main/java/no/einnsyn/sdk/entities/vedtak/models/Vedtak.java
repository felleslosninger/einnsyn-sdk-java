// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.vedtak.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.behandlingsprotokoll.models.Behandlingsprotokoll;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.Dokumentbeskrivelse;
import no.einnsyn.sdk.entities.moetesaksbeskrivelse.models.Moetesaksbeskrivelse;
import no.einnsyn.sdk.entities.votering.models.Votering;

/** Represents a decision made in a meeting case. */
public class Vedtak extends ArkivBase {
  protected final String entity = "Vedtak";

  /** The text of the decision. */
  protected ExpandableField<Moetesaksbeskrivelse> vedtakstekst;

  /** The voting results related to the decision. */
  protected List<ExpandableField<Votering>> votering;

  /** The protocol of proceedings for the decision. */
  protected ExpandableField<Behandlingsprotokoll> behandlingsprotokoll;

  /** The document containing the decision. */
  protected List<ExpandableField<Dokumentbeskrivelse>> vedtaksdokument;

  /** The date the decision was made. */
  protected String dato;

  public String getEntity() {
    return entity;
  }

  /** The text of the decision. */
  public ExpandableField<Moetesaksbeskrivelse> getVedtakstekst() {
    return vedtakstekst;
  }

  /** The voting results related to the decision. */
  public List<ExpandableField<Votering>> getVotering() {
    return votering;
  }

  /** The protocol of proceedings for the decision. */
  public ExpandableField<Behandlingsprotokoll> getBehandlingsprotokoll() {
    return behandlingsprotokoll;
  }

  /** The document containing the decision. */
  public List<ExpandableField<Dokumentbeskrivelse>> getVedtaksdokument() {
    return vedtaksdokument;
  }

  /** The date the decision was made. */
  public String getDato() {
    return dato;
  }
}
