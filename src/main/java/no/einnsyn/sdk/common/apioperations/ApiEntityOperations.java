package no.einnsyn.sdk.common.apioperations;

import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.entities.base.models.BaseRequest;
import no.einnsyn.sdk.net.ApiRequester;

public abstract class ApiEntityOperations<T extends Base, R extends BaseRequest>
    extends ApiOperations {

  public ApiEntityOperations(ApiRequester requester) {
    super(requester);
  }

  public abstract T get(String id) throws EInnsynException;

  public abstract T delete(String id) throws EInnsynException;
}
