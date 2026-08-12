// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.matrikkelnummer;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.matrikkelnummer.models.Matrikkelnummer;
import no.einnsyn.sdk.entities.matrikkelnummer.models.MatrikkelnummerRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class MatrikkelnummerOperations
    extends ApiEntityOperations<Matrikkelnummer, MatrikkelnummerRequest> {

  public MatrikkelnummerOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Matrikkelnummer> list() throws EInnsynException {
    String url = "/matrikkelnummer";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Matrikkelnummer>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Matrikkelnummer> list(EInnsynOptions options) throws EInnsynException {
    String url = "/matrikkelnummer";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Matrikkelnummer>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Matrikkelnummer> list(ListParameters queryParameters)
      throws EInnsynException {
    String url = "/matrikkelnummer";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Matrikkelnummer>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Matrikkelnummer> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/matrikkelnummer";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Matrikkelnummer>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Matrikkelnummer> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/matrikkelnummer";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Matrikkelnummer>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Matrikkelnummer> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/matrikkelnummer";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Matrikkelnummer>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Matrikkelnummer delete(String id) throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Matrikkelnummer delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Matrikkelnummer delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Matrikkelnummer get(String id) throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Matrikkelnummer get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Matrikkelnummer get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Matrikkelnummer get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Matrikkelnummer get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Matrikkelnummer get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Matrikkelnummer update(String id, MatrikkelnummerRequest body) throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Matrikkelnummer update(
      String id,
      Function<MatrikkelnummerRequest.Builder, MatrikkelnummerRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MatrikkelnummerRequest.Builder()).build(),
        null,
        type);
  }

  public Matrikkelnummer update(String id, MatrikkelnummerRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Matrikkelnummer update(
      String id,
      Function<MatrikkelnummerRequest.Builder, MatrikkelnummerRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/matrikkelnummer/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Matrikkelnummer>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MatrikkelnummerRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
