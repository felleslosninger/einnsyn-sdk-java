// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.identifikator.models;

import no.einnsyn.sdk.entities.arkivbase.models.ArkivBase;

/** Represents an identifier for a person, such as a case officer or an author. */
public class Identifikator extends ArkivBase {
  protected final String entity = "Identifikator";

  /** The full name of the person. */
  protected String navn;

  /** A unique identifier for the person, often a username or an employee ID. */
  protected String identifikator;

  /** The initials of the person. */
  protected String initialer;

  /** The email address of the person. */
  protected String epostadresse;

  public String getEntity() {
    return entity;
  }

  /** The full name of the person. */
  public String getNavn() {
    return navn;
  }

  /** A unique identifier for the person, often a username or an employee ID. */
  public String getIdentifikator() {
    return identifikator;
  }

  /** The initials of the person. */
  public String getInitialer() {
    return initialer;
  }

  /** The email address of the person. */
  public String getEpostadresse() {
    return epostadresse;
  }
}
