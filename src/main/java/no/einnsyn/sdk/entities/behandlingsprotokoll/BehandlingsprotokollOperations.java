// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.behandlingsprotokoll;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.behandlingsprotokoll.models.Behandlingsprotokoll;
import no.einnsyn.sdk.entities.behandlingsprotokoll.models.BehandlingsprotokollRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class BehandlingsprotokollOperations
    extends ApiEntityOperations<Behandlingsprotokoll, BehandlingsprotokollRequest> {

  public BehandlingsprotokollOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Behandlingsprotokoll> list() throws EInnsynException {
    String url = "/behandlingsprotokoll";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Behandlingsprotokoll>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Behandlingsprotokoll> list(EInnsynOptions options) throws EInnsynException {
    String url = "/behandlingsprotokoll";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Behandlingsprotokoll>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Behandlingsprotokoll> list(ListParameters queryParameters)
      throws EInnsynException {
    String url = "/behandlingsprotokoll";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Behandlingsprotokoll>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Behandlingsprotokoll> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/behandlingsprotokoll";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Behandlingsprotokoll>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Behandlingsprotokoll> list(
      ListParameters queryParameters, EInnsynOptions options) throws EInnsynException {
    String url = "/behandlingsprotokoll";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Behandlingsprotokoll>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Behandlingsprotokoll> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/behandlingsprotokoll";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Behandlingsprotokoll>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Behandlingsprotokoll delete(String id) throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Behandlingsprotokoll delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Behandlingsprotokoll delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Behandlingsprotokoll get(String id) throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Behandlingsprotokoll get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Behandlingsprotokoll get(String id, GetParameters queryParameters)
      throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Behandlingsprotokoll get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Behandlingsprotokoll get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Behandlingsprotokoll get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Behandlingsprotokoll update(String id, BehandlingsprotokollRequest body)
      throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Behandlingsprotokoll update(
      String id,
      Function<BehandlingsprotokollRequest.Builder, BehandlingsprotokollRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new BehandlingsprotokollRequest.Builder()).build(),
        null,
        type);
  }

  public Behandlingsprotokoll update(
      String id, BehandlingsprotokollRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Behandlingsprotokoll update(
      String id,
      Function<BehandlingsprotokollRequest.Builder, BehandlingsprotokollRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/behandlingsprotokoll/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Behandlingsprotokoll>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new BehandlingsprotokollRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
