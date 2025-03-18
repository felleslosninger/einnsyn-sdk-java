// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.tilbakemelding.models;

import no.einnsyn.sdk.entities.base.models.Base;

/** Tilbakemelding */
public class Tilbakemelding extends Base {
  protected final String entity = "Tilbakemelding";

  protected String messageFromUser;

  protected String path;

  protected String referer;

  protected String userAgent;

  protected Integer screenHeight;

  protected Integer screenWidth;

  protected Integer docHeight;

  protected Integer docWidth;

  protected Integer winHeight;

  protected Integer winWidth;

  protected Integer scrollX;

  protected Integer scrollY;

  protected Boolean userSatisfied;

  protected Boolean handledByAdmin;

  protected String adminComment;

  public String getEntity() {
    return entity;
  }

  public String getMessageFromUser() {
    return messageFromUser;
  }

  public String getPath() {
    return path;
  }

  public String getReferer() {
    return referer;
  }

  public String getUserAgent() {
    return userAgent;
  }

  public Integer getScreenHeight() {
    return screenHeight;
  }

  public Integer getScreenWidth() {
    return screenWidth;
  }

  public Integer getDocHeight() {
    return docHeight;
  }

  public Integer getDocWidth() {
    return docWidth;
  }

  public Integer getWinHeight() {
    return winHeight;
  }

  public Integer getWinWidth() {
    return winWidth;
  }

  public Integer getScrollX() {
    return scrollX;
  }

  public Integer getScrollY() {
    return scrollY;
  }

  public Boolean getUserSatisfied() {
    return userSatisfied;
  }

  public Boolean getHandledByAdmin() {
    return handledByAdmin;
  }

  public String getAdminComment() {
    return adminComment;
  }
}
