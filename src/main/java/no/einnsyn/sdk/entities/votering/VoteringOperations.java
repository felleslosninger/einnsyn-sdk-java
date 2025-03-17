// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.votering;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.votering.models.Votering;
import no.einnsyn.sdk.entities.votering.models.VoteringRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class VoteringOperations extends ApiEntityOperations<Votering, VoteringRequest> {

  public VoteringOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Votering> list() throws EInnsynException {
    String url = "/votering";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Votering>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Votering> list(EInnsynOptions options) throws EInnsynException {
    String url = "/votering";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Votering>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Votering> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/votering";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Votering>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Votering> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/votering";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Votering>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Votering> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/votering";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Votering>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Votering> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/votering";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Votering>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Votering delete(String id) throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Votering delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Votering delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Votering get(String id) throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Votering get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Votering get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Votering get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Votering get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Votering get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Votering update(String id, VoteringRequest body) throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Votering update(
      String id, Function<VoteringRequest.Builder, VoteringRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new VoteringRequest.Builder()).build(),
        null,
        type);
  }

  public Votering update(String id, VoteringRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Votering update(
      String id,
      Function<VoteringRequest.Builder, VoteringRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/votering/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new VoteringRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
