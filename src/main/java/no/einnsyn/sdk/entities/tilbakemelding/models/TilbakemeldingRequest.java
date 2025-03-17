// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.tilbakemelding.models;

import java.util.function.Function;
import no.einnsyn.sdk.entities.base.models.BaseRequest;

/** Tilbakemelding */
public class TilbakemeldingRequest extends BaseRequest {
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

    public Builder messageFromUser(String messageFromUser) {
      this.messageFromUser = messageFromUser;
      return this;
    }

    public Builder path(String path) {
      this.path = path;
      return this;
    }

    public Builder referer(String referer) {
      this.referer = referer;
      return this;
    }

    public Builder userAgent(String userAgent) {
      this.userAgent = userAgent;
      return this;
    }

    public Builder screenHeight(Integer screenHeight) {
      this.screenHeight = screenHeight;
      return this;
    }

    public Builder screenWidth(Integer screenWidth) {
      this.screenWidth = screenWidth;
      return this;
    }

    public Builder docHeight(Integer docHeight) {
      this.docHeight = docHeight;
      return this;
    }

    public Builder docWidth(Integer docWidth) {
      this.docWidth = docWidth;
      return this;
    }

    public Builder winHeight(Integer winHeight) {
      this.winHeight = winHeight;
      return this;
    }

    public Builder winWidth(Integer winWidth) {
      this.winWidth = winWidth;
      return this;
    }

    public Builder scrollX(Integer scrollX) {
      this.scrollX = scrollX;
      return this;
    }

    public Builder scrollY(Integer scrollY) {
      this.scrollY = scrollY;
      return this;
    }

    public Builder userSatisfied(Boolean userSatisfied) {
      this.userSatisfied = userSatisfied;
      return this;
    }

    public Builder handledByAdmin(Boolean handledByAdmin) {
      this.handledByAdmin = handledByAdmin;
      return this;
    }

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
