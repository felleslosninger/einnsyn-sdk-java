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

/** Vedtak */
public class Vedtak extends ArkivBase {
  protected final String entity = "Vedtak";

  protected ExpandableField<Moetesaksbeskrivelse> vedtakstekst;

  protected List<ExpandableField<Votering>> votering;

  protected ExpandableField<Behandlingsprotokoll> behandlingsprotokoll;

  protected List<ExpandableField<Dokumentbeskrivelse>> vedtaksdokument;

  protected String dato;

  public String getEntity() {
    return entity;
  }

  public ExpandableField<Moetesaksbeskrivelse> getVedtakstekst() {
    return vedtakstekst;
  }

  public List<ExpandableField<Votering>> getVotering() {
    return votering;
  }

  public ExpandableField<Behandlingsprotokoll> getBehandlingsprotokoll() {
    return behandlingsprotokoll;
  }

  public List<ExpandableField<Dokumentbeskrivelse>> getVedtaksdokument() {
    return vedtaksdokument;
  }

  public String getDato() {
    return dato;
  }
}
