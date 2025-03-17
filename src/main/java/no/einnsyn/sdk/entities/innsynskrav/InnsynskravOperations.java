// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.innsynskrav;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.innsynskrav.models.Innsynskrav;
import no.einnsyn.sdk.entities.innsynskrav.models.InnsynskravRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class InnsynskravOperations extends ApiEntityOperations<Innsynskrav, InnsynskravRequest> {

  public InnsynskravOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Innsynskrav> list() throws EInnsynException {
    String url = "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Innsynskrav> list(EInnsynOptions options) throws EInnsynException {
    String url = "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Innsynskrav> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Innsynskrav> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Innsynskrav> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Innsynskrav> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Innsynskrav delete(String id) throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Innsynskrav delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Innsynskrav delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Innsynskrav get(String id) throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Innsynskrav get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Innsynskrav get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Innsynskrav get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Innsynskrav get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Innsynskrav get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Innsynskrav update(String id, InnsynskravRequest body) throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Innsynskrav update(
      String id,
      Function<InnsynskravRequest.Builder, InnsynskravRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new InnsynskravRequest.Builder()).build(),
        null,
        type);
  }

  public Innsynskrav update(String id, InnsynskravRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Innsynskrav update(
      String id,
      Function<InnsynskravRequest.Builder, InnsynskravRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskrav/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Innsynskrav>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new InnsynskravRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
