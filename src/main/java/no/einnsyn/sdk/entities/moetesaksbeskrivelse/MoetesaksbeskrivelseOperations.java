// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetesaksbeskrivelse;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.moetesaksbeskrivelse.models.Moetesaksbeskrivelse;
import no.einnsyn.sdk.entities.moetesaksbeskrivelse.models.MoetesaksbeskrivelseRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class MoetesaksbeskrivelseOperations
    extends ApiEntityOperations<Moetesaksbeskrivelse, MoetesaksbeskrivelseRequest> {

  public MoetesaksbeskrivelseOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Moetesaksbeskrivelse> list() throws EInnsynException {
    String url = "/moetesaksbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesaksbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Moetesaksbeskrivelse> list(EInnsynOptions options) throws EInnsynException {
    String url = "/moetesaksbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesaksbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Moetesaksbeskrivelse> list(ListParameters queryParameters)
      throws EInnsynException {
    String url = "/moetesaksbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesaksbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Moetesaksbeskrivelse> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetesaksbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesaksbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Moetesaksbeskrivelse> list(
      ListParameters queryParameters, EInnsynOptions options) throws EInnsynException {
    String url = "/moetesaksbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesaksbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Moetesaksbeskrivelse> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesaksbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesaksbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetesaksbeskrivelse delete(String id) throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Moetesaksbeskrivelse delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Moetesaksbeskrivelse delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetesaksbeskrivelse get(String id) throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Moetesaksbeskrivelse get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Moetesaksbeskrivelse get(String id, GetParameters queryParameters)
      throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Moetesaksbeskrivelse get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Moetesaksbeskrivelse get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Moetesaksbeskrivelse get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetesaksbeskrivelse update(String id, MoetesaksbeskrivelseRequest body)
      throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Moetesaksbeskrivelse update(
      String id,
      Function<MoetesaksbeskrivelseRequest.Builder, MoetesaksbeskrivelseRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetesaksbeskrivelseRequest.Builder()).build(),
        null,
        type);
  }

  public Moetesaksbeskrivelse update(
      String id, MoetesaksbeskrivelseRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Moetesaksbeskrivelse update(
      String id,
      Function<MoetesaksbeskrivelseRequest.Builder, MoetesaksbeskrivelseRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesaksbeskrivelse/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetesaksbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetesaksbeskrivelseRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
