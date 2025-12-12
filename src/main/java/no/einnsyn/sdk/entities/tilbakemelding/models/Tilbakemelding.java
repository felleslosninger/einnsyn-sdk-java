// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.tilbakemelding.models;

import no.einnsyn.sdk.entities.base.models.Base;

/** Represents user feedback submitted through the application. */
public class Tilbakemelding extends Base {
  protected final String entity = "Tilbakemelding";

  /** The feedback message from the user. */
  protected String messageFromUser;

  /** The path of the page where the feedback was submitted. */
  protected String path;

  /** The referer URL. */
  protected String referer;

  /** The user agent string of the user's browser. */
  protected String userAgent;

  /** The screen height of the user's device. */
  protected Integer screenHeight;

  /** The screen width of the user's device. */
  protected Integer screenWidth;

  /** The document height of the page. */
  protected Integer docHeight;

  /** The document width of the page. */
  protected Integer docWidth;

  /** The window height of the browser. */
  protected Integer winHeight;

  /** The window width of the browser. */
  protected Integer winWidth;

  /** The horizontal scroll position. */
  protected Integer scrollX;

  /** The vertical scroll position. */
  protected Integer scrollY;

  /** Indicates whether the user was satisfied. */
  protected Boolean userSatisfied;

  /** Indicates whether the feedback has been handled by an administrator. */
  protected Boolean handledByAdmin;

  /** A comment from the administrator who handled the feedback. */
  protected String adminComment;

  public String getEntity() {
    return entity;
  }

  /** The feedback message from the user. */
  public String getMessageFromUser() {
    return messageFromUser;
  }

  /** The path of the page where the feedback was submitted. */
  public String getPath() {
    return path;
  }

  /** The referer URL. */
  public String getReferer() {
    return referer;
  }

  /** The user agent string of the user's browser. */
  public String getUserAgent() {
    return userAgent;
  }

  /** The screen height of the user's device. */
  public Integer getScreenHeight() {
    return screenHeight;
  }

  /** The screen width of the user's device. */
  public Integer getScreenWidth() {
    return screenWidth;
  }

  /** The document height of the page. */
  public Integer getDocHeight() {
    return docHeight;
  }

  /** The document width of the page. */
  public Integer getDocWidth() {
    return docWidth;
  }

  /** The window height of the browser. */
  public Integer getWinHeight() {
    return winHeight;
  }

  /** The window width of the browser. */
  public Integer getWinWidth() {
    return winWidth;
  }

  /** The horizontal scroll position. */
  public Integer getScrollX() {
    return scrollX;
  }

  /** The vertical scroll position. */
  public Integer getScrollY() {
    return scrollY;
  }

  /** Indicates whether the user was satisfied. */
  public Boolean getUserSatisfied() {
    return userSatisfied;
  }

  /** Indicates whether the feedback has been handled by an administrator. */
  public Boolean getHandledByAdmin() {
    return handledByAdmin;
  }

  /** A comment from the administrator who handled the feedback. */
  public String getAdminComment() {
    return adminComment;
  }
}
