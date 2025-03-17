// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.lagretsak.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.entities.bruker.models.Bruker;
import no.einnsyn.sdk.entities.moetemappe.models.Moetemappe;
import no.einnsyn.sdk.entities.saksmappe.models.Saksmappe;

/** LagretSak */
public class LagretSak extends Base {
  protected final String entity = "LagretSak";

  /** The bruker that has saved this sak. This will be set to the authenticated user. */
  protected ExpandableField<Bruker> bruker;

  /** The saksmappe that has been saved. */
  protected ExpandableField<Saksmappe> saksmappe;

  /** The moetemappe that has been saved. */
  protected ExpandableField<Moetemappe> moetemappe;

  /** Specifies whether the user wants to receive notifications about this sak. */
  protected Boolean subscribe;

  public String getEntity() {
    return entity;
  }

  /** The bruker that has saved this sak. This will be set to the authenticated user. */
  public ExpandableField<Bruker> getBruker() {
    return bruker;
  }

  /** The saksmappe that has been saved. */
  public ExpandableField<Saksmappe> getSaksmappe() {
    return saksmappe;
  }

  /** The moetemappe that has been saved. */
  public ExpandableField<Moetemappe> getMoetemappe() {
    return moetemappe;
  }

  /** Specifies whether the user wants to receive notifications about this sak. */
  public Boolean getSubscribe() {
    return subscribe;
  }
}
