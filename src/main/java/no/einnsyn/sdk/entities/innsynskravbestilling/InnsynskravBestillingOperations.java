// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.innsynskravbestilling;

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
import no.einnsyn.sdk.entities.innsynskravbestilling.models.InnsynskravBestilling;
import no.einnsyn.sdk.entities.innsynskravbestilling.models.InnsynskravBestillingRequest;
import no.einnsyn.sdk.entities.innsynskravbestilling.models.ListByInnsynskravBestillingParameters;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class InnsynskravBestillingOperations
    extends ApiEntityOperations<InnsynskravBestilling, InnsynskravBestillingRequest> {

  public InnsynskravBestillingOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<InnsynskravBestilling> list() throws EInnsynException {
    String url = "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<InnsynskravBestilling>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<InnsynskravBestilling> list(EInnsynOptions options) throws EInnsynException {
    String url = "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<InnsynskravBestilling>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<InnsynskravBestilling> list(ListParameters queryParameters)
      throws EInnsynException {
    String url = "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<InnsynskravBestilling>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<InnsynskravBestilling> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<InnsynskravBestilling>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<InnsynskravBestilling> list(
      ListParameters queryParameters, EInnsynOptions options) throws EInnsynException {
    String url = "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<InnsynskravBestilling>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<InnsynskravBestilling> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<InnsynskravBestilling>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public InnsynskravBestilling add(InnsynskravBestillingRequest body) throws EInnsynException {
    String url = "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public InnsynskravBestilling add(
      Function<InnsynskravBestillingRequest.Builder, InnsynskravBestillingRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new InnsynskravBestillingRequest.Builder()).build(),
        null,
        type);
  }

  public InnsynskravBestilling add(InnsynskravBestillingRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public InnsynskravBestilling add(
      Function<InnsynskravBestillingRequest.Builder, InnsynskravBestillingRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new InnsynskravBestillingRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public InnsynskravBestilling delete(String id) throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public InnsynskravBestilling delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public InnsynskravBestilling delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public InnsynskravBestilling get(String id) throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public InnsynskravBestilling get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public InnsynskravBestilling get(String id, GetParameters queryParameters)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public InnsynskravBestilling get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public InnsynskravBestilling get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public InnsynskravBestilling get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public InnsynskravBestilling update(String id, InnsynskravBestillingRequest body)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public InnsynskravBestilling update(
      String id,
      Function<InnsynskravBestillingRequest.Builder, InnsynskravBestillingRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new InnsynskravBestillingRequest.Builder()).build(),
        null,
        type);
  }

  public InnsynskravBestilling update(
      String id, InnsynskravBestillingRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public InnsynskravBestilling update(
      String id,
      Function<InnsynskravBestillingRequest.Builder, InnsynskravBestillingRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new InnsynskravBestillingRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(String id) throws EInnsynException {
    String url = "/innsynskravBestilling/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(
      String id, ListByInnsynskravBestillingParameters queryParameters) throws EInnsynException {
    String url = "/innsynskravBestilling/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(
      String id,
      Function<
              ListByInnsynskravBestillingParameters.Builder,
              ListByInnsynskravBestillingParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction
            .apply(new ListByInnsynskravBestillingParameters.Builder())
            .build(),
        null,
        null,
        type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(
      String id, ListByInnsynskravBestillingParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(
      String id,
      Function<
              ListByInnsynskravBestillingParameters.Builder,
              ListByInnsynskravBestillingParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction
            .apply(new ListByInnsynskravBestillingParameters.Builder())
            .build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public InnsynskravBestilling verify(String id, String secret) throws EInnsynException {
    String url = "/innsynskravBestilling/" + id + "/verify/" + secret;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public InnsynskravBestilling verify(String id, String secret, EInnsynOptions options)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id + "/verify/" + secret;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public InnsynskravBestilling verify(
      String id,
      String secret,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/innsynskravBestilling/" + id + "/verify/" + secret;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
