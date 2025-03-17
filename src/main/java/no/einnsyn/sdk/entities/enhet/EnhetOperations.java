// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.enhet;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.apikey.models.ApiKey;
import no.einnsyn.sdk.entities.apikey.models.ApiKeyRequest;
import no.einnsyn.sdk.entities.arkiv.models.Arkiv;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.entities.enhet.models.EnhetRequest;
import no.einnsyn.sdk.entities.enhet.models.ListByEnhetParameters;
import no.einnsyn.sdk.entities.innsynskrav.models.Innsynskrav;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class EnhetOperations extends ApiEntityOperations<Enhet, EnhetRequest> {

  public EnhetOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Enhet> list() throws EInnsynException {
    String url = "/enhet";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Enhet>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Enhet> list(EInnsynOptions options) throws EInnsynException {
    String url = "/enhet";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Enhet>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Enhet> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/enhet";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Enhet>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Enhet> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/enhet";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Enhet>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Enhet> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Enhet>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Enhet> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/enhet";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Enhet>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Enhet add(EnhetRequest body) throws EInnsynException {
    String url = "/enhet";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Enhet add(Function<EnhetRequest.Builder, EnhetRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/enhet";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new EnhetRequest.Builder()).build(),
        null,
        type);
  }

  public Enhet add(EnhetRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/enhet";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Enhet add(
      Function<EnhetRequest.Builder, EnhetRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/enhet";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new EnhetRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Enhet delete(String id) throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Enhet delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Enhet delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Enhet get(String id) throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Enhet get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Enhet get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Enhet get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Enhet get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Enhet get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Enhet update(String id, EnhetRequest body) throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Enhet update(
      String id, Function<EnhetRequest.Builder, EnhetRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new EnhetRequest.Builder()).build(),
        null,
        type);
  }

  public Enhet update(String id, EnhetRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Enhet update(
      String id,
      Function<EnhetRequest.Builder, EnhetRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new EnhetRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<ApiKey> listApiKey(String id) throws EInnsynException {
    String url = "/enhet/" + id + "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<ApiKey>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<ApiKey> listApiKey(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet/" + id + "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<ApiKey>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<ApiKey> listApiKey(String id, ListByEnhetParameters queryParameters)
      throws EInnsynException {
    String url = "/enhet/" + id + "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<ApiKey>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<ApiKey> listApiKey(
      String id,
      Function<ListByEnhetParameters.Builder, ListByEnhetParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<ApiKey>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByEnhetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<ApiKey> listApiKey(
      String id, ListByEnhetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet/" + id + "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<ApiKey>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<ApiKey> listApiKey(
      String id,
      Function<ListByEnhetParameters.Builder, ListByEnhetParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<ApiKey>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByEnhetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public ApiKey addApiKey(String id, ApiKeyRequest body) throws EInnsynException {
    String url = "/enhet/" + id + "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public ApiKey addApiKey(
      String id, Function<ApiKeyRequest.Builder, ApiKeyRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ApiKeyRequest.Builder()).build(),
        null,
        type);
  }

  public ApiKey addApiKey(String id, ApiKeyRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet/" + id + "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public ApiKey addApiKey(
      String id,
      Function<ApiKeyRequest.Builder, ApiKeyRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/apiKey";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<ApiKey>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ApiKeyRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Arkiv> listArkiv(String id) throws EInnsynException {
    String url = "/enhet/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Arkiv> listArkiv(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/enhet/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Arkiv> listArkiv(String id, ListByEnhetParameters queryParameters)
      throws EInnsynException {
    String url = "/enhet/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Arkiv> listArkiv(
      String id,
      Function<ListByEnhetParameters.Builder, ListByEnhetParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByEnhetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Arkiv> listArkiv(
      String id, ListByEnhetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Arkiv> listArkiv(
      String id,
      Function<ListByEnhetParameters.Builder, ListByEnhetParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByEnhetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(String id) throws EInnsynException {
    String url = "/enhet/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(
      String id, ListByEnhetParameters queryParameters) throws EInnsynException {
    String url = "/enhet/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(
      String id,
      Function<ListByEnhetParameters.Builder, ListByEnhetParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByEnhetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(
      String id, ListByEnhetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(
      String id,
      Function<ListByEnhetParameters.Builder, ListByEnhetParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByEnhetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Enhet> listUnderenhet(String id) throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Enhet>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Enhet> listUnderenhet(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Enhet>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Enhet> listUnderenhet(String id, ListByEnhetParameters queryParameters)
      throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Enhet>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Enhet> listUnderenhet(
      String id,
      Function<ListByEnhetParameters.Builder, ListByEnhetParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Enhet>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByEnhetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Enhet> listUnderenhet(
      String id, ListByEnhetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Enhet>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Enhet> listUnderenhet(
      String id,
      Function<ListByEnhetParameters.Builder, ListByEnhetParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Enhet>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByEnhetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Enhet addUnderenhet(String id, EnhetRequest body) throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Enhet addUnderenhet(String id, String bodyId) throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, null, bodyId, null, type);
  }

  public Enhet addUnderenhet(
      String id, Function<EnhetRequest.Builder, EnhetRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new EnhetRequest.Builder()).build(),
        null,
        type);
  }

  public Enhet addUnderenhet(String id, EnhetRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Enhet addUnderenhet(String id, String bodyId, EInnsynOptions options)
      throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(method, url, null, bodyId, options, type);
  }

  public Enhet addUnderenhet(
      String id,
      Function<EnhetRequest.Builder, EnhetRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new EnhetRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Enhet addUnderenhet(
      String id,
      String bodyId,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/enhet/" + id + "/underenhet";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Enhet>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyId,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
