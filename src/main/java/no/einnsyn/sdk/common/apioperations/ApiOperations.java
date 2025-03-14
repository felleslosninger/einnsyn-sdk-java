package no.einnsyn.sdk.common.apioperations;

import no.einnsyn.sdk.net.ApiRequester;

public abstract class ApiOperations {

  protected ApiRequester requester;

  public ApiOperations(ApiRequester requester) {
    this.requester = requester;
  }
}
