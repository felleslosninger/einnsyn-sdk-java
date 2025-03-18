// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.korrespondansepart;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.korrespondansepart.models.Korrespondansepart;
import no.einnsyn.sdk.entities.korrespondansepart.models.KorrespondansepartRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class KorrespondansepartOperations
    extends ApiEntityOperations<Korrespondansepart, KorrespondansepartRequest> {

  public KorrespondansepartOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Korrespondansepart> list() throws EInnsynException {
    String url = "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Korrespondansepart>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Korrespondansepart> list(EInnsynOptions options) throws EInnsynException {
    String url = "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Korrespondansepart>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Korrespondansepart> list(ListParameters queryParameters)
      throws EInnsynException {
    String url = "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Korrespondansepart>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Korrespondansepart> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Korrespondansepart>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Korrespondansepart> list(
      ListParameters queryParameters, EInnsynOptions options) throws EInnsynException {
    String url = "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Korrespondansepart>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Korrespondansepart> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Korrespondansepart>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Korrespondansepart delete(String id) throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Korrespondansepart delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Korrespondansepart delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Korrespondansepart get(String id) throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Korrespondansepart get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Korrespondansepart get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Korrespondansepart get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Korrespondansepart get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Korrespondansepart get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Korrespondansepart update(String id, KorrespondansepartRequest body)
      throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Korrespondansepart update(
      String id,
      Function<KorrespondansepartRequest.Builder, KorrespondansepartRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new KorrespondansepartRequest.Builder()).build(),
        null,
        type);
  }

  public Korrespondansepart update(
      String id, KorrespondansepartRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Korrespondansepart update(
      String id,
      Function<KorrespondansepartRequest.Builder, KorrespondansepartRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/korrespondansepart/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new KorrespondansepartRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
