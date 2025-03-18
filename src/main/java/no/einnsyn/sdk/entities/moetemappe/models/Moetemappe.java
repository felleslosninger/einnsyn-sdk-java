// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetemappe.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.entities.mappe.models.Mappe;
import no.einnsyn.sdk.entities.moetedokument.models.Moetedokument;
import no.einnsyn.sdk.entities.moetesak.models.Moetesak;

/** Moetemappe */
public class Moetemappe extends Mappe {
  protected final String entity = "Moetemappe";

  protected String moetenummer;

  protected String utvalg;

  protected ExpandableField<Enhet> utvalgObjekt;

  protected String moetedato;

  protected String moetested;

  protected String videoLink;

  protected ExpandableField<Moetemappe> referanseForrigeMoete;

  protected ExpandableField<Moetemappe> referanseNesteMoete;

  protected List<ExpandableField<Moetedokument>> moetedokument;

  protected List<ExpandableField<Moetesak>> moetesak;

  public String getEntity() {
    return entity;
  }

  public String getMoetenummer() {
    return moetenummer;
  }

  public String getUtvalg() {
    return utvalg;
  }

  public ExpandableField<Enhet> getUtvalgObjekt() {
    return utvalgObjekt;
  }

  public String getMoetedato() {
    return moetedato;
  }

  public String getMoetested() {
    return moetested;
  }

  public String getVideoLink() {
    return videoLink;
  }

  public ExpandableField<Moetemappe> getReferanseForrigeMoete() {
    return referanseForrigeMoete;
  }

  public ExpandableField<Moetemappe> getReferanseNesteMoete() {
    return referanseNesteMoete;
  }

  public List<ExpandableField<Moetedokument>> getMoetedokument() {
    return moetedokument;
  }

  public List<ExpandableField<Moetesak>> getMoetesak() {
    return moetesak;
  }
}
