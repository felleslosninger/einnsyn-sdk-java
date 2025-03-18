// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.votering.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;
import no.einnsyn.sdk.entities.identifikator.models.Identifikator;
import no.einnsyn.sdk.entities.moetedeltaker.models.Moetedeltaker;

/** Votering */
public class Votering extends ArkivBase {
  protected final String entity = "Votering";

  protected ExpandableField<Moetedeltaker> moetedeltaker;

  protected StemmeEnum stemme;

  protected ExpandableField<Identifikator> representerer;

  public String getEntity() {
    return entity;
  }

  public ExpandableField<Moetedeltaker> getMoetedeltaker() {
    return moetedeltaker;
  }

  public StemmeEnum getStemme() {
    return stemme;
  }

  public ExpandableField<Identifikator> getRepresenterer() {
    return representerer;
  }
}
