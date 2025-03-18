// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.identifikator;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.identifikator.models.Identifikator;
import no.einnsyn.sdk.entities.identifikator.models.IdentifikatorRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class IdentifikatorOperations
    extends ApiEntityOperations<Identifikator, IdentifikatorRequest> {

  public IdentifikatorOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Identifikator> list() throws EInnsynException {
    String url = "/identifikator";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Identifikator>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Identifikator> list(EInnsynOptions options) throws EInnsynException {
    String url = "/identifikator";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Identifikator>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Identifikator> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/identifikator";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Identifikator>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Identifikator> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/identifikator";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Identifikator>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Identifikator> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/identifikator";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Identifikator>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Identifikator> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/identifikator";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Identifikator>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Identifikator delete(String id) throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Identifikator delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Identifikator delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Identifikator get(String id) throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Identifikator get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Identifikator get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Identifikator get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Identifikator get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Identifikator get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Identifikator update(String id, IdentifikatorRequest body) throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Identifikator update(
      String id,
      Function<IdentifikatorRequest.Builder, IdentifikatorRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new IdentifikatorRequest.Builder()).build(),
        null,
        type);
  }

  public Identifikator update(String id, IdentifikatorRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Identifikator update(
      String id,
      Function<IdentifikatorRequest.Builder, IdentifikatorRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/identifikator/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Identifikator>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new IdentifikatorRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
