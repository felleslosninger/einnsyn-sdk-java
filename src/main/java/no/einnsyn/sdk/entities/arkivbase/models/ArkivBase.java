// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.arkivbase.models;

import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.entities.enhet.models.Enhet;

/** Properties shared by all Noark objects */
public class ArkivBase extends Base {
  /**
   * An identifier for the resource, given by the user's system.
   *
   * <p>For most entities the systemId is unique, and can be used in place of the eInnsynId when
   * looking up a single object. It is *not* unique for Arkiv, Arkivdel and Klasse, and can not be
   * used to look those up.
   */
  protected String systemId;

  /**
   * The administrative unit that is responsible for the resource. This is by default derived from
   * the credentials used to authenticate the request on creation, or it can manually be set to an
   * Enhet owned by that derived Enhet.
   */
  protected ExpandableField<Enhet> journalenhet;

  /**
   * An identifier for the resource, given by the user's system.
   *
   * <p>For most entities the systemId is unique, and can be used in place of the eInnsynId when
   * looking up a single object. It is *not* unique for Arkiv, Arkivdel and Klasse, and can not be
   * used to look those up.
   */
  public String getSystemId() {
    return systemId;
  }

  /**
   * The administrative unit that is responsible for the resource. This is by default derived from
   * the credentials used to authenticate the request on creation, or it can manually be set to an
   * Enhet owned by that derived Enhet.
   */
  public ExpandableField<Enhet> getJournalenhet() {
    return journalenhet;
  }
}
