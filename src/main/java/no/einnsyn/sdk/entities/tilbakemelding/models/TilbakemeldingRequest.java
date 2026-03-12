// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.tilbakemelding.models;

import java.util.function.Function;
import no.einnsyn.sdk.entities.base.models.BaseRequest;

/** Represents user feedback submitted through the application. */
public class TilbakemeldingRequest extends BaseRequest {
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

  public TilbakemeldingRequest(
      String externalId,
      String accessibleAfter,
      String messageFromUser,
      String path,
      String referer,
      String userAgent,
      Integer screenHeight,
      Integer screenWidth,
      Integer docHeight,
      Integer docWidth,
      Integer winHeight,
      Integer winWidth,
      Integer scrollX,
      Integer scrollY,
      Boolean userSatisfied,
      Boolean handledByAdmin,
      String adminComment) {
    super(externalId, accessibleAfter);
    this.messageFromUser = messageFromUser;
    this.path = path;
    this.referer = referer;
    this.userAgent = userAgent;
    this.screenHeight = screenHeight;
    this.screenWidth = screenWidth;
    this.docHeight = docHeight;
    this.docWidth = docWidth;
    this.winHeight = winHeight;
    this.winWidth = winWidth;
    this.scrollX = scrollX;
    this.scrollY = scrollY;
    this.userSatisfied = userSatisfied;
    this.handledByAdmin = handledByAdmin;
    this.adminComment = adminComment;
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

  public static Builder builder() {
    return new Builder();
  }

  public static TilbakemeldingRequest of(Function<Builder, Builder> builderFunction) {
    return builderFunction.apply(new Builder()).build();
  }

  public static class Builder {
    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     */
    protected String externalId;

    /** This object should not be accessible to the public before the given dateTime. */
    protected String accessibleAfter;

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

    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     */
    public String getExternalId() {
      return externalId;
    }

    /** This object should not be accessible to the public before the given dateTime. */
    public String getAccessibleAfter() {
      return accessibleAfter;
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

    /**
     * An external ID for the resource. This is similar to "systemId", but will be used for legacy
     * IRIs that were used in earlier eInnsyn versions.
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    /** This object should not be accessible to the public before the given dateTime. */
    public Builder accessibleAfter(String accessibleAfter) {
      this.accessibleAfter = accessibleAfter;
      return this;
    }

    /** The feedback message from the user. */
    public Builder messageFromUser(String messageFromUser) {
      this.messageFromUser = messageFromUser;
      return this;
    }

    /** The path of the page where the feedback was submitted. */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /** The referer URL. */
    public Builder referer(String referer) {
      this.referer = referer;
      return this;
    }

    /** The user agent string of the user's browser. */
    public Builder userAgent(String userAgent) {
      this.userAgent = userAgent;
      return this;
    }

    /** The screen height of the user's device. */
    public Builder screenHeight(Integer screenHeight) {
      this.screenHeight = screenHeight;
      return this;
    }

    /** The screen width of the user's device. */
    public Builder screenWidth(Integer screenWidth) {
      this.screenWidth = screenWidth;
      return this;
    }

    /** The document height of the page. */
    public Builder docHeight(Integer docHeight) {
      this.docHeight = docHeight;
      return this;
    }

    /** The document width of the page. */
    public Builder docWidth(Integer docWidth) {
      this.docWidth = docWidth;
      return this;
    }

    /** The window height of the browser. */
    public Builder winHeight(Integer winHeight) {
      this.winHeight = winHeight;
      return this;
    }

    /** The window width of the browser. */
    public Builder winWidth(Integer winWidth) {
      this.winWidth = winWidth;
      return this;
    }

    /** The horizontal scroll position. */
    public Builder scrollX(Integer scrollX) {
      this.scrollX = scrollX;
      return this;
    }

    /** The vertical scroll position. */
    public Builder scrollY(Integer scrollY) {
      this.scrollY = scrollY;
      return this;
    }

    /** Indicates whether the user was satisfied. */
    public Builder userSatisfied(Boolean userSatisfied) {
      this.userSatisfied = userSatisfied;
      return this;
    }

    /** Indicates whether the feedback has been handled by an administrator. */
    public Builder handledByAdmin(Boolean handledByAdmin) {
      this.handledByAdmin = handledByAdmin;
      return this;
    }

    /** A comment from the administrator who handled the feedback. */
    public Builder adminComment(String adminComment) {
      this.adminComment = adminComment;
      return this;
    }

    public TilbakemeldingRequest build() {
      return new TilbakemeldingRequest(
          this.externalId,
          this.accessibleAfter,
          this.messageFromUser,
          this.path,
          this.referer,
          this.userAgent,
          this.screenHeight,
          this.screenWidth,
          this.docHeight,
          this.docWidth,
          this.winHeight,
          this.winWidth,
          this.scrollX,
          this.scrollY,
          this.userSatisfied,
          this.handledByAdmin,
          this.adminComment);
    }
  }
}
