// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.utredning.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.Dokumentbeskrivelse;
import no.einnsyn.sdk.entities.moetesaksbeskrivelse.models.Moetesaksbeskrivelse;

/** Represents a report or investigation related to a meeting case. */
public class Utredning extends ArkivBase {
  protected final String entity = "Utredning";

  /** The description of the case. */
  protected ExpandableField<Moetesaksbeskrivelse> saksbeskrivelse;

  /** The recommendation or proposition. */
  protected ExpandableField<Moetesaksbeskrivelse> innstilling;

  /** Documents that are part of the investigation. */
  protected List<ExpandableField<Dokumentbeskrivelse>> utredningsdokument;

  public String getEntity() {
    return entity;
  }

  /** The description of the case. */
  public ExpandableField<Moetesaksbeskrivelse> getSaksbeskrivelse() {
    return saksbeskrivelse;
  }

  /** The recommendation or proposition. */
  public ExpandableField<Moetesaksbeskrivelse> getInnstilling() {
    return innstilling;
  }

  /** Documents that are part of the investigation. */
  public List<ExpandableField<Dokumentbeskrivelse>> getUtredningsdokument() {
    return utredningsdokument;
  }
}
