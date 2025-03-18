// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.tilbakemelding;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.tilbakemelding.models.Tilbakemelding;
import no.einnsyn.sdk.entities.tilbakemelding.models.TilbakemeldingRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class TilbakemeldingOperations
    extends ApiEntityOperations<Tilbakemelding, TilbakemeldingRequest> {

  public TilbakemeldingOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Tilbakemelding> list() throws EInnsynException {
    String url = "/tilbakemelding";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Tilbakemelding>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Tilbakemelding> list(EInnsynOptions options) throws EInnsynException {
    String url = "/tilbakemelding";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Tilbakemelding>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Tilbakemelding> list(ListParameters queryParameters)
      throws EInnsynException {
    String url = "/tilbakemelding";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Tilbakemelding>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Tilbakemelding> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/tilbakemelding";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Tilbakemelding>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Tilbakemelding> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/tilbakemelding";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Tilbakemelding>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Tilbakemelding> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/tilbakemelding";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Tilbakemelding>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Tilbakemelding add(TilbakemeldingRequest body) throws EInnsynException {
    String url = "/tilbakemelding";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Tilbakemelding add(
      Function<TilbakemeldingRequest.Builder, TilbakemeldingRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/tilbakemelding";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new TilbakemeldingRequest.Builder()).build(),
        null,
        type);
  }

  public Tilbakemelding add(TilbakemeldingRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/tilbakemelding";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Tilbakemelding add(
      Function<TilbakemeldingRequest.Builder, TilbakemeldingRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/tilbakemelding";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new TilbakemeldingRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Tilbakemelding delete(String id) throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Tilbakemelding delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Tilbakemelding delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Tilbakemelding get(String id) throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Tilbakemelding get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Tilbakemelding get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Tilbakemelding get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Tilbakemelding get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Tilbakemelding get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Tilbakemelding update(String id, TilbakemeldingRequest body) throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Tilbakemelding update(
      String id,
      Function<TilbakemeldingRequest.Builder, TilbakemeldingRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new TilbakemeldingRequest.Builder()).build(),
        null,
        type);
  }

  public Tilbakemelding update(String id, TilbakemeldingRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Tilbakemelding update(
      String id,
      Function<TilbakemeldingRequest.Builder, TilbakemeldingRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/tilbakemelding/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Tilbakemelding>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new TilbakemeldingRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
