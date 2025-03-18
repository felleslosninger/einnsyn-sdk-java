// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.klassifikasjonssystem;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.klasse.models.Klasse;
import no.einnsyn.sdk.entities.klasse.models.KlasseRequest;
import no.einnsyn.sdk.entities.klassifikasjonssystem.models.Klassifikasjonssystem;
import no.einnsyn.sdk.entities.klassifikasjonssystem.models.KlassifikasjonssystemRequest;
import no.einnsyn.sdk.entities.klassifikasjonssystem.models.ListByKlassifikasjonssystemParameters;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class KlassifikasjonssystemOperations
    extends ApiEntityOperations<Klassifikasjonssystem, KlassifikasjonssystemRequest> {

  public KlassifikasjonssystemOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Klassifikasjonssystem> list() throws EInnsynException {
    String url = "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klassifikasjonssystem>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Klassifikasjonssystem> list(EInnsynOptions options) throws EInnsynException {
    String url = "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klassifikasjonssystem>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Klassifikasjonssystem> list(ListParameters queryParameters)
      throws EInnsynException {
    String url = "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klassifikasjonssystem>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Klassifikasjonssystem> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klassifikasjonssystem>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Klassifikasjonssystem> list(
      ListParameters queryParameters, EInnsynOptions options) throws EInnsynException {
    String url = "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klassifikasjonssystem>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Klassifikasjonssystem> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klassifikasjonssystem>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Klassifikasjonssystem delete(String id) throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Klassifikasjonssystem delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Klassifikasjonssystem delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Klassifikasjonssystem get(String id) throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Klassifikasjonssystem get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Klassifikasjonssystem get(String id, GetParameters queryParameters)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Klassifikasjonssystem get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Klassifikasjonssystem get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Klassifikasjonssystem get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Klassifikasjonssystem update(String id, KlassifikasjonssystemRequest body)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Klassifikasjonssystem update(
      String id,
      Function<KlassifikasjonssystemRequest.Builder, KlassifikasjonssystemRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new KlassifikasjonssystemRequest.Builder()).build(),
        null,
        type);
  }

  public Klassifikasjonssystem update(
      String id, KlassifikasjonssystemRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Klassifikasjonssystem update(
      String id,
      Function<KlassifikasjonssystemRequest.Builder, KlassifikasjonssystemRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new KlassifikasjonssystemRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Klasse> listKlasse(String id) throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Klasse> listKlasse(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Klasse> listKlasse(
      String id, ListByKlassifikasjonssystemParameters queryParameters) throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Klasse> listKlasse(
      String id,
      Function<
              ListByKlassifikasjonssystemParameters.Builder,
              ListByKlassifikasjonssystemParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction
            .apply(new ListByKlassifikasjonssystemParameters.Builder())
            .build(),
        null,
        null,
        type);
  }

  public PaginatedList<Klasse> listKlasse(
      String id, ListByKlassifikasjonssystemParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Klasse> listKlasse(
      String id,
      Function<
              ListByKlassifikasjonssystemParameters.Builder,
              ListByKlassifikasjonssystemParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction
            .apply(new ListByKlassifikasjonssystemParameters.Builder())
            .build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Klasse addKlasse(String id, KlasseRequest body) throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Klasse addKlasse(
      String id, Function<KlasseRequest.Builder, KlasseRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new KlasseRequest.Builder()).build(),
        null,
        type);
  }

  public Klasse addKlasse(String id, KlasseRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Klasse addKlasse(
      String id,
      Function<KlasseRequest.Builder, KlasseRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klassifikasjonssystem/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new KlasseRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
