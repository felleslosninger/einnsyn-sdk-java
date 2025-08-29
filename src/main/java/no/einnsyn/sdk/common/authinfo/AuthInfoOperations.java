// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.authinfo;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiOperations;
import no.einnsyn.sdk.common.authinfo.models.AuthInfoResponse;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class AuthInfoOperations extends ApiOperations {

  public AuthInfoOperations(ApiRequester requester) {
    super(requester);
  }

  public AuthInfoResponse get() throws EInnsynException {
    String url = "/me";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<AuthInfoResponse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public AuthInfoResponse get(EInnsynOptions options) throws EInnsynException {
    String url = "/me";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<AuthInfoResponse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public AuthInfoResponse get(
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/me";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<AuthInfoResponse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
