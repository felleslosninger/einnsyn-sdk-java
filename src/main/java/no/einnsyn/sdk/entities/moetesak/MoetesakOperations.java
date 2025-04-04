// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.moetesak;

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
import no.einnsyn.sdk.entities.moetesak.models.GetByMoetesakParameters;
import no.einnsyn.sdk.entities.moetesak.models.ListByMoetesakParameters;
import no.einnsyn.sdk.entities.moetesak.models.Moetesak;
import no.einnsyn.sdk.entities.moetesak.models.MoetesakRequest;
import no.einnsyn.sdk.entities.utredning.models.Utredning;
import no.einnsyn.sdk.entities.utredning.models.UtredningRequest;
import no.einnsyn.sdk.entities.vedtak.models.Vedtak;
import no.einnsyn.sdk.entities.vedtak.models.VedtakRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class MoetesakOperations extends ApiEntityOperations<Moetesak, MoetesakRequest> {

  public MoetesakOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Moetesak> list() throws EInnsynException {
    String url = "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesak>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Moetesak> list(EInnsynOptions options) throws EInnsynException {
    String url = "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesak>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Moetesak> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesak>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Moetesak> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesak>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Moetesak> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesak>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Moetesak> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetesak>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetesak add(MoetesakRequest body) throws EInnsynException {
    String url = "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Moetesak add(
      Function<MoetesakRequest.Builder, MoetesakRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak";
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

  public Moetesak add(MoetesakRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/moetesak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Moetesak add(
      Function<MoetesakRequest.Builder, MoetesakRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak";
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

  public Moetesak delete(String id) throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Moetesak delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Moetesak delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetesak get(String id) throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Moetesak get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Moetesak get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Moetesak get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Moetesak get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Moetesak get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetesak update(String id, MoetesakRequest body) throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Moetesak update(
      String id, Function<MoetesakRequest.Builder, MoetesakRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetesakRequest.Builder()).build(),
        null,
        type);
  }

  public Moetesak update(String id, MoetesakRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Moetesak update(
      String id,
      Function<MoetesakRequest.Builder, MoetesakRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Moetesak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetesakRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(String id)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id, ListByMoetesakParameters queryParameters) throws EInnsynException {
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id,
      Function<ListByMoetesakParameters.Builder, ListByMoetesakParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByMoetesakParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id, ListByMoetesakParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id,
      Function<ListByMoetesakParameters.Builder, ListByMoetesakParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByMoetesakParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(String id, DokumentbeskrivelseRequest body)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(String id, String bodyId)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, bodyId, null, type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(
      String id,
      Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
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
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(
      String id, String bodyId, EInnsynOptions options) throws EInnsynException {
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
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
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
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
    String url = "/moetesak/" + id + "/dokumentbeskrivelse";
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
    String url = "/moetesak/" + id + "/dokumentbeskrivelse/" + dokumentbeskrivelseId;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Dokumentbeskrivelse deleteDokumentbeskrivelse(
      String id, String dokumentbeskrivelseId, EInnsynOptions options) throws EInnsynException {
    String url = "/moetesak/" + id + "/dokumentbeskrivelse/" + dokumentbeskrivelseId;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Dokumentbeskrivelse deleteDokumentbeskrivelse(
      String id,
      String dokumentbeskrivelseId,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/dokumentbeskrivelse/" + dokumentbeskrivelseId;
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

  public Utredning getUtredning(String id) throws EInnsynException {
    String url = "/moetesak/" + id + "/utredning";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Utredning getUtredning(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetesak/" + id + "/utredning";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Utredning getUtredning(String id, GetByMoetesakParameters queryParameters)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/utredning";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Utredning getUtredning(
      String id,
      Function<GetByMoetesakParameters.Builder, GetByMoetesakParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/utredning";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetByMoetesakParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Utredning getUtredning(
      String id, GetByMoetesakParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/utredning";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Utredning getUtredning(
      String id,
      Function<GetByMoetesakParameters.Builder, GetByMoetesakParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/utredning";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetByMoetesakParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Utredning addUtredning(String id, UtredningRequest body) throws EInnsynException {
    String url = "/moetesak/" + id + "/utredning";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Utredning addUtredning(
      String id, Function<UtredningRequest.Builder, UtredningRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/utredning";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new UtredningRequest.Builder()).build(),
        null,
        type);
  }

  public Utredning addUtredning(String id, UtredningRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/utredning";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Utredning addUtredning(
      String id,
      Function<UtredningRequest.Builder, UtredningRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/utredning";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new UtredningRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Vedtak getVedtak(String id) throws EInnsynException {
    String url = "/moetesak/" + id + "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Vedtak getVedtak(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/moetesak/" + id + "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Vedtak getVedtak(String id, GetByMoetesakParameters queryParameters)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Vedtak getVedtak(
      String id,
      Function<GetByMoetesakParameters.Builder, GetByMoetesakParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetByMoetesakParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Vedtak getVedtak(
      String id, GetByMoetesakParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Vedtak getVedtak(
      String id,
      Function<GetByMoetesakParameters.Builder, GetByMoetesakParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetByMoetesakParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Vedtak addVedtak(String id, VedtakRequest body) throws EInnsynException {
    String url = "/moetesak/" + id + "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Vedtak addVedtak(
      String id, Function<VedtakRequest.Builder, VedtakRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new VedtakRequest.Builder()).build(),
        null,
        type);
  }

  public Vedtak addVedtak(String id, VedtakRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Vedtak addVedtak(
      String id,
      Function<VedtakRequest.Builder, VedtakRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/moetesak/" + id + "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new VedtakRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
