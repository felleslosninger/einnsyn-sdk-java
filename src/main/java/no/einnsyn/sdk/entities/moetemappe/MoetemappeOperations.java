// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetemappe;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.moetedokument.models.Moetedokument;
import no.einnsyn.sdk.entities.moetedokument.models.MoetedokumentRequest;
import no.einnsyn.sdk.entities.moetemappe.models.ListByMoetemappeParameters;
import no.einnsyn.sdk.entities.moetemappe.models.Moetemappe;
import no.einnsyn.sdk.entities.moetemappe.models.MoetemappeRequest;
import no.einnsyn.sdk.entities.moetesak.models.Moetesak;
import no.einnsyn.sdk.entities.moetesak.models.MoetesakRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class MoetemappeOperations extends ApiEntityOperations<Moetemappe, MoetemappeRequest> {

  public MoetemappeOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Moetemappe> list() throws EInnsynException {
    String url = "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Moetemappe> list(EInnsynOptions options) throws EInnsynException {
    String url = "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Moetemappe> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Moetemappe> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Moetemappe> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Moetemappe> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetemappe delete(String id) throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Moetemappe delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Moetemappe delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetemappe get(String id) throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Moetemappe get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Moetemappe get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Moetemappe get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Moetemappe get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Moetemappe get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetemappe update(String id, MoetemappeRequest body) throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Moetemappe update(
      String id, Function<MoetemappeRequest.Builder, MoetemappeRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetemappeRequest.Builder()).build(),
        null,
        type);
  }

  public Moetemappe update(String id, MoetemappeRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Moetemappe update(
      String id,
      Function<MoetemappeRequest.Builder, MoetemappeRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetemappeRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Moetedokument> listMoetedokument(String id) throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedokument>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Moetedokument> listMoetedokument(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedokument>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Moetedokument> listMoetedokument(
      String id, ListByMoetemappeParameters queryParameters) throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedokument>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Moetedokument> listMoetedokument(
      String id,
      Function<ListByMoetemappeParameters.Builder, ListByMoetemappeParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedokument>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByMoetemappeParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Moetedokument> listMoetedokument(
      String id, ListByMoetemappeParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedokument>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Moetedokument> listMoetedokument(
      String id,
      Function<ListByMoetemappeParameters.Builder, ListByMoetemappeParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedokument>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByMoetemappeParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetedokument addMoetedokument(String id, MoetedokumentRequest body)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Moetedokument addMoetedokument(
      String id,
      Function<MoetedokumentRequest.Builder, MoetedokumentRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetedokumentRequest.Builder()).build(),
        null,
        type);
  }

  public Moetedokument addMoetedokument(
      String id, MoetedokumentRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Moetedokument addMoetedokument(
      String id,
      Function<MoetedokumentRequest.Builder, MoetedokumentRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetedokumentRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Moetesak> listMoetesak(String id) throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesak>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Moetesak> listMoetesak(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesak>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Moetesak> listMoetesak(String id, ListByMoetemappeParameters queryParameters)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesak>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Moetesak> listMoetesak(
      String id,
      Function<ListByMoetemappeParameters.Builder, ListByMoetemappeParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesak>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByMoetemappeParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Moetesak> listMoetesak(
      String id, ListByMoetemappeParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesak>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Moetesak> listMoetesak(
      String id,
      Function<ListByMoetemappeParameters.Builder, ListByMoetemappeParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesak>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByMoetemappeParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetesak addMoetesak(String id, MoetesakRequest body) throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Moetesak addMoetesak(
      String id, Function<MoetesakRequest.Builder, MoetesakRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetesakRequest.Builder()).build(),
        null,
        type);
  }

  public Moetesak addMoetesak(String id, MoetesakRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Moetesak addMoetesak(
      String id,
      Function<MoetesakRequest.Builder, MoetesakRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetemappe/" + id + "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetesakRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
