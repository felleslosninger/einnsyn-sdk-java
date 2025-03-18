// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.lagretsak;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.lagretsak.models.LagretSak;
import no.einnsyn.sdk.entities.lagretsak.models.LagretSakRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class LagretSakOperations extends ApiEntityOperations<LagretSak, LagretSakRequest> {

  public LagretSakOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<LagretSak> list() throws EInnsynException {
    String url = "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSak>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<LagretSak> list(EInnsynOptions options) throws EInnsynException {
    String url = "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSak>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<LagretSak> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSak>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<LagretSak> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSak>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<LagretSak> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSak>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<LagretSak> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSak>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public LagretSak delete(String id) throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public LagretSak delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public LagretSak delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public LagretSak get(String id) throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public LagretSak get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public LagretSak get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public LagretSak get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public LagretSak get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public LagretSak get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public LagretSak update(String id, LagretSakRequest body) throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public LagretSak update(
      String id, Function<LagretSakRequest.Builder, LagretSakRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new LagretSakRequest.Builder()).build(),
        null,
        type);
  }

  public LagretSak update(String id, LagretSakRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public LagretSak update(
      String id,
      Function<LagretSakRequest.Builder, LagretSakRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSak/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new LagretSakRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
