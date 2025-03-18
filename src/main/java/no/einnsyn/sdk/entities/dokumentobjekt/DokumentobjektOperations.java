// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.dokumentobjekt;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.dokumentobjekt.models.Dokumentobjekt;
import no.einnsyn.sdk.entities.dokumentobjekt.models.DokumentobjektRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class DokumentobjektOperations
    extends ApiEntityOperations<Dokumentobjekt, DokumentobjektRequest> {

  public DokumentobjektOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Dokumentobjekt> list() throws EInnsynException {
    String url = "/dokumentobjekt";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentobjekt>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Dokumentobjekt> list(EInnsynOptions options) throws EInnsynException {
    String url = "/dokumentobjekt";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentobjekt>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Dokumentobjekt> list(ListParameters queryParameters)
      throws EInnsynException {
    String url = "/dokumentobjekt";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentobjekt>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Dokumentobjekt> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentobjekt";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentobjekt>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Dokumentobjekt> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/dokumentobjekt";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentobjekt>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Dokumentobjekt> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentobjekt";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentobjekt>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentobjekt delete(String id) throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Dokumentobjekt delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Dokumentobjekt delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentobjekt get(String id) throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Dokumentobjekt get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Dokumentobjekt get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Dokumentobjekt get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Dokumentobjekt get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Dokumentobjekt get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentobjekt update(String id, DokumentobjektRequest body) throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Dokumentobjekt update(
      String id,
      Function<DokumentobjektRequest.Builder, DokumentobjektRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new DokumentobjektRequest.Builder()).build(),
        null,
        type);
  }

  public Dokumentobjekt update(String id, DokumentobjektRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Dokumentobjekt update(
      String id,
      Function<DokumentobjektRequest.Builder, DokumentobjektRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentobjekt/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Dokumentobjekt>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new DokumentobjektRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
