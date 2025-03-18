// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.utredning.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.Dokumentbeskrivelse;
import no.einnsyn.sdk.entities.moetesaksbeskrivelse.models.Moetesaksbeskrivelse;

/** Utredning */
public class Utredning extends ArkivBase {
  protected final String entity = "Utredning";

  protected ExpandableField<Moetesaksbeskrivelse> saksbeskrivelse;

  protected ExpandableField<Moetesaksbeskrivelse> innstilling;

  protected List<ExpandableField<Dokumentbeskrivelse>> utredningsdokument;

  public String getEntity() {
    return entity;
  }

  public ExpandableField<Moetesaksbeskrivelse> getSaksbeskrivelse() {
    return saksbeskrivelse;
  }

  public ExpandableField<Moetesaksbeskrivelse> getInnstilling() {
    return innstilling;
  }

  public List<ExpandableField<Dokumentbeskrivelse>> getUtredningsdokument() {
    return utredningsdokument;
  }
}
