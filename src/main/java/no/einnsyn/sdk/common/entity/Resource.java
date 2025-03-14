package no.einnsyn.sdk.common.entity;

import no.einnsyn.sdk.net.ApiRequester;

public class Resource {

  private transient ApiRequester requester;

  public void setRequester(ApiRequester requester) {
    this.requester = requester;
  }

  protected ApiRequester getRequester() {
    return requester;
  }

  public String toString() {
    if (requester != null) {
      return requester.serialize(this, true);
    }
    return super.toString();
  }
}
