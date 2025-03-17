// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.lagretsoek;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.lagretsoek.models.LagretSoek;
import no.einnsyn.sdk.entities.lagretsoek.models.LagretSoekRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class LagretSoekOperations extends ApiEntityOperations<LagretSoek, LagretSoekRequest> {

  public LagretSoekOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<LagretSoek> list() throws EInnsynException {
    String url = "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSoek>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<LagretSoek> list(EInnsynOptions options) throws EInnsynException {
    String url = "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSoek>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<LagretSoek> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSoek>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<LagretSoek> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSoek>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<LagretSoek> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSoek>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<LagretSoek> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSoek>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public LagretSoek delete(String id) throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public LagretSoek delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public LagretSoek delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public LagretSoek get(String id) throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public LagretSoek get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public LagretSoek get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public LagretSoek get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public LagretSoek get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public LagretSoek get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public LagretSoek update(String id, LagretSoekRequest body) throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public LagretSoek update(
      String id, Function<LagretSoekRequest.Builder, LagretSoekRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new LagretSoekRequest.Builder()).build(),
        null,
        type);
  }

  public LagretSoek update(String id, LagretSoekRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public LagretSoek update(
      String id,
      Function<LagretSoekRequest.Builder, LagretSoekRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/lagretSoek/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new LagretSoekRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
