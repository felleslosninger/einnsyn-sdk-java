// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.dokumentbeskrivelse;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.Dokumentbeskrivelse;
import no.einnsyn.sdk.entities.dokumentbeskrivelse.models.DokumentbeskrivelseRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class DokumentbeskrivelseOperations
    extends ApiEntityOperations<Dokumentbeskrivelse, DokumentbeskrivelseRequest> {

  public DokumentbeskrivelseOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Dokumentbeskrivelse> list() throws EInnsynException {
    String url = "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Dokumentbeskrivelse> list(EInnsynOptions options) throws EInnsynException {
    String url = "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Dokumentbeskrivelse> list(ListParameters queryParameters)
      throws EInnsynException {
    String url = "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Dokumentbeskrivelse> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Dokumentbeskrivelse> list(
      ListParameters queryParameters, EInnsynOptions options) throws EInnsynException {
    String url = "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Dokumentbeskrivelse> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentbeskrivelse delete(String id) throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Dokumentbeskrivelse delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Dokumentbeskrivelse delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentbeskrivelse get(String id) throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Dokumentbeskrivelse get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Dokumentbeskrivelse get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Dokumentbeskrivelse get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Dokumentbeskrivelse get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Dokumentbeskrivelse get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentbeskrivelse update(String id, DokumentbeskrivelseRequest body)
      throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Dokumentbeskrivelse update(
      String id,
      Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new DokumentbeskrivelseRequest.Builder()).build(),
        null,
        type);
  }

  public Dokumentbeskrivelse update(
      String id, DokumentbeskrivelseRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Dokumentbeskrivelse update(
      String id,
      Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/dokumentbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new DokumentbeskrivelseRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
