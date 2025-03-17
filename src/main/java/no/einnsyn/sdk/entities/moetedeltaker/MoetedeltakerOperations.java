// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetedeltaker;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.moetedeltaker.models.Moetedeltaker;
import no.einnsyn.sdk.entities.moetedeltaker.models.MoetedeltakerRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class MoetedeltakerOperations
    extends ApiEntityOperations<Moetedeltaker, MoetedeltakerRequest> {

  public MoetedeltakerOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Moetedeltaker> list() throws EInnsynException {
    String url = "/moetedeltaker";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedeltaker>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Moetedeltaker> list(EInnsynOptions options) throws EInnsynException {
    String url = "/moetedeltaker";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedeltaker>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Moetedeltaker> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/moetedeltaker";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedeltaker>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Moetedeltaker> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetedeltaker";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedeltaker>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Moetedeltaker> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetedeltaker";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedeltaker>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Moetedeltaker> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetedeltaker";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedeltaker>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetedeltaker delete(String id) throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Moetedeltaker delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Moetedeltaker delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetedeltaker get(String id) throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Moetedeltaker get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Moetedeltaker get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Moetedeltaker get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Moetedeltaker get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Moetedeltaker get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetedeltaker update(String id, MoetedeltakerRequest body) throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Moetedeltaker update(
      String id,
      Function<MoetedeltakerRequest.Builder, MoetedeltakerRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetedeltakerRequest.Builder()).build(),
        null,
        type);
  }

  public Moetedeltaker update(String id, MoetedeltakerRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Moetedeltaker update(
      String id,
      Function<MoetedeltakerRequest.Builder, MoetedeltakerRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetedeltaker/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetedeltaker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetedeltakerRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
