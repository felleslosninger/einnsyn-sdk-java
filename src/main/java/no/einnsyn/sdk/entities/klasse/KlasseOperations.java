// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.klasse;

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
import no.einnsyn.sdk.entities.klasse.models.ListByKlasseParameters;
import no.einnsyn.sdk.entities.moetemappe.models.Moetemappe;
import no.einnsyn.sdk.entities.saksmappe.models.Saksmappe;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class KlasseOperations extends ApiEntityOperations<Klasse, KlasseRequest> {

  public KlasseOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Klasse> list() throws EInnsynException {
    String url = "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Klasse> list(EInnsynOptions options) throws EInnsynException {
    String url = "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Klasse> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Klasse> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Klasse> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Klasse> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Klasse delete(String id) throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Klasse delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Klasse delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Klasse get(String id) throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Klasse get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Klasse get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Klasse get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Klasse get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Klasse get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Klasse update(String id, KlasseRequest body) throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Klasse update(
      String id, Function<KlasseRequest.Builder, KlasseRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new KlasseRequest.Builder()).build(),
        null,
        type);
  }

  public Klasse update(String id, KlasseRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Klasse update(
      String id,
      Function<KlasseRequest.Builder, KlasseRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new KlasseRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Klasse> listKlasse(String id) throws EInnsynException {
    String url = "/klasse/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Klasse> listKlasse(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klasse/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Klasse> listKlasse(String id, ListByKlasseParameters queryParameters)
      throws EInnsynException {
    String url = "/klasse/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Klasse> listKlasse(
      String id,
      Function<ListByKlasseParameters.Builder, ListByKlasseParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByKlasseParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Klasse> listKlasse(
      String id, ListByKlasseParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klasse/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Klasse> listKlasse(
      String id,
      Function<ListByKlasseParameters.Builder, ListByKlasseParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByKlasseParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Klasse addKlasse(String id, KlasseRequest body) throws EInnsynException {
    String url = "/klasse/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Klasse addKlasse(
      String id, Function<KlasseRequest.Builder, KlasseRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id + "/klasse";
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
    String url = "/klasse/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Klasse addKlasse(
      String id,
      Function<KlasseRequest.Builder, KlasseRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id + "/klasse";
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

  public PaginatedList<Moetemappe> listMoetemappe(String id) throws EInnsynException {
    String url = "/klasse/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Moetemappe> listMoetemappe(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klasse/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Moetemappe> listMoetemappe(String id, ListByKlasseParameters queryParameters)
      throws EInnsynException {
    String url = "/klasse/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Moetemappe> listMoetemappe(
      String id,
      Function<ListByKlasseParameters.Builder, ListByKlasseParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByKlasseParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Moetemappe> listMoetemappe(
      String id, ListByKlasseParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klasse/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Moetemappe> listMoetemappe(
      String id,
      Function<ListByKlasseParameters.Builder, ListByKlasseParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByKlasseParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Saksmappe> listSaksmappe(String id) throws EInnsynException {
    String url = "/klasse/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Saksmappe> listSaksmappe(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klasse/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Saksmappe> listSaksmappe(String id, ListByKlasseParameters queryParameters)
      throws EInnsynException {
    String url = "/klasse/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Saksmappe> listSaksmappe(
      String id,
      Function<ListByKlasseParameters.Builder, ListByKlasseParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByKlasseParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Saksmappe> listSaksmappe(
      String id, ListByKlasseParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/klasse/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Saksmappe> listSaksmappe(
      String id,
      Function<ListByKlasseParameters.Builder, ListByKlasseParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/klasse/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByKlasseParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
