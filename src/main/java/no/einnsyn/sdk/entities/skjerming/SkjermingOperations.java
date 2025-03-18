// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.skjerming;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.skjerming.models.Skjerming;
import no.einnsyn.sdk.entities.skjerming.models.SkjermingRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class SkjermingOperations extends ApiEntityOperations<Skjerming, SkjermingRequest> {

  public SkjermingOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Skjerming> list() throws EInnsynException {
    String url = "/skjerming";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Skjerming>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Skjerming> list(EInnsynOptions options) throws EInnsynException {
    String url = "/skjerming";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Skjerming>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Skjerming> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/skjerming";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Skjerming>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Skjerming> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/skjerming";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Skjerming>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Skjerming> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/skjerming";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Skjerming>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Skjerming> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/skjerming";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Skjerming>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Skjerming add(SkjermingRequest body) throws EInnsynException {
    String url = "/skjerming";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Skjerming add(
      Function<SkjermingRequest.Builder, SkjermingRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/skjerming";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new SkjermingRequest.Builder()).build(),
        null,
        type);
  }

  public Skjerming add(SkjermingRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/skjerming";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Skjerming add(
      Function<SkjermingRequest.Builder, SkjermingRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/skjerming";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new SkjermingRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Skjerming delete(String id) throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Skjerming delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Skjerming delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Skjerming get(String id) throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Skjerming get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Skjerming get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Skjerming get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Skjerming get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Skjerming get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Skjerming update(String id, SkjermingRequest body) throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Skjerming update(
      String id, Function<SkjermingRequest.Builder, SkjermingRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new SkjermingRequest.Builder()).build(),
        null,
        type);
  }

  public Skjerming update(String id, SkjermingRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Skjerming update(
      String id,
      Function<SkjermingRequest.Builder, SkjermingRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/skjerming/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Skjerming>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new SkjermingRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
