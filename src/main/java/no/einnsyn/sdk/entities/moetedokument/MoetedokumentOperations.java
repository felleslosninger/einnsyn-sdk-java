// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetedokument;

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
import no.einnsyn.sdk.entities.moetedokument.models.ListByMoetedokumentParameters;
import no.einnsyn.sdk.entities.moetedokument.models.Moetedokument;
import no.einnsyn.sdk.entities.moetedokument.models.MoetedokumentRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class MoetedokumentOperations
    extends ApiEntityOperations<Moetedokument, MoetedokumentRequest> {

  public MoetedokumentOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Moetedokument> list() throws EInnsynException {
    String url = "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedokument>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Moetedokument> list(EInnsynOptions options) throws EInnsynException {
    String url = "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedokument>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Moetedokument> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedokument>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Moetedokument> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedokument>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Moetedokument> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedokument>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Moetedokument> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetedokument>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetedokument delete(String id) throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Moetedokument delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Moetedokument delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetedokument get(String id) throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Moetedokument get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Moetedokument get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Moetedokument get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Moetedokument get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Moetedokument get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetedokument update(String id, MoetedokumentRequest body) throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Moetedokument update(
      String id,
      Function<MoetedokumentRequest.Builder, MoetedokumentRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetedokumentRequest.Builder()).build(),
        null,
        type);
  }

  public Moetedokument update(String id, MoetedokumentRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Moetedokument update(
      String id,
      Function<MoetedokumentRequest.Builder, MoetedokumentRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetedokument>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetedokumentRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(String id)
      throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id, ListByMoetedokumentParameters queryParameters) throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id,
      Function<ListByMoetedokumentParameters.Builder, ListByMoetedokumentParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByMoetedokumentParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id, ListByMoetedokumentParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id,
      Function<ListByMoetedokumentParameters.Builder, ListByMoetedokumentParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByMoetedokumentParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(String id, DokumentbeskrivelseRequest body)
      throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(String id, String bodyId)
      throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, bodyId, null, type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(
      String id,
      Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new DokumentbeskrivelseRequest.Builder()).build(),
        null,
        type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(
      String id, DokumentbeskrivelseRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(
      String id, String bodyId, EInnsynOptions options) throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, bodyId, options, type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(
      String id,
      Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new DokumentbeskrivelseRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(
      String id,
      String bodyId,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyId,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentbeskrivelse deleteDokumentbeskrivelse(String id, String dokumentbeskrivelseId)
      throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse/" + dokumentbeskrivelseId;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Dokumentbeskrivelse deleteDokumentbeskrivelse(
      String id, String dokumentbeskrivelseId, EInnsynOptions options) throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse/" + dokumentbeskrivelseId;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Dokumentbeskrivelse deleteDokumentbeskrivelse(
      String id,
      String dokumentbeskrivelseId,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetedokument/" + id + "/dokumentbeskrivelse/" + dokumentbeskrivelseId;
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
}
