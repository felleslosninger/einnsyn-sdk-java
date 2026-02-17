// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetemappe.models;

import java.util.List;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.entities.mappe.models.Mappe;
import no.einnsyn.sdk.entities.moetedokument.models.Moetedokument;
import no.einnsyn.sdk.entities.moetesak.models.Moetesak;

/** Represents a meeting, containing information about a specific meeting. */
public class Moetemappe extends Mappe {
  protected final String entity = "Moetemappe";

  /** A unique number or identifier for the meeting. */
  protected String moetenummer;

  /** The name of the committee or board holding the meeting. */
  protected String utvalg;

  /** The committee or board holding the meeting. */
  protected ExpandableField<Enhet> utvalgObjekt;

  /** The date and time of the meeting. */
  protected String moetedato;

  /** The location of the meeting. */
  protected String moetested;

  /** A link to a video recording of the meeting. */
  protected String videoLink;

  /** A reference to the previous meeting. */
  protected ExpandableField<Moetemappe> referanseForrigeMoete;

  /** A reference to the next meeting. */
  protected ExpandableField<Moetemappe> referanseNesteMoete;

  /** Documents associated with the meeting. */
  protected List<ExpandableField<Moetedokument>> moetedokument;

  /** Cases discussed in the meeting. */
  protected List<ExpandableField<Moetesak>> moetesak;

  public String getEntity() {
    return entity;
  }

  /** A unique number or identifier for the meeting. */
  public String getMoetenummer() {
    return moetenummer;
  }

  /** The name of the committee or board holding the meeting. */
  public String getUtvalg() {
    return utvalg;
  }

  /** The committee or board holding the meeting. */
  public ExpandableField<Enhet> getUtvalgObjekt() {
    return utvalgObjekt;
  }

  /** The date and time of the meeting. */
  public String getMoetedato() {
    return moetedato;
  }

  /** The location of the meeting. */
  public String getMoetested() {
    return moetested;
  }

  /** A link to a video recording of the meeting. */
  public String getVideoLink() {
    return videoLink;
  }

  /** A reference to the previous meeting. */
  public ExpandableField<Moetemappe> getReferanseForrigeMoete() {
    return referanseForrigeMoete;
  }

  /** A reference to the next meeting. */
  public ExpandableField<Moetemappe> getReferanseNesteMoete() {
    return referanseNesteMoete;
  }

  /** Documents associated with the meeting. */
  public List<ExpandableField<Moetedokument>> getMoetedokument() {
    return moetedokument;
  }

  /** Cases discussed in the meeting. */
  public List<ExpandableField<Moetesak>> getMoetesak() {
    return moetesak;
  }
}
