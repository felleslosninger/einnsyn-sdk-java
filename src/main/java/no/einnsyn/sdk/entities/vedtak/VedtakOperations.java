// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.vedtak;

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
import no.einnsyn.sdk.entities.vedtak.models.ListByVedtakParameters;
import no.einnsyn.sdk.entities.vedtak.models.Vedtak;
import no.einnsyn.sdk.entities.vedtak.models.VedtakRequest;
import no.einnsyn.sdk.entities.votering.models.Votering;
import no.einnsyn.sdk.entities.votering.models.VoteringRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class VedtakOperations extends ApiEntityOperations<Vedtak, VedtakRequest> {

  public VedtakOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Vedtak> list() throws EInnsynException {
    String url = "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Vedtak>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Vedtak> list(EInnsynOptions options) throws EInnsynException {
    String url = "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Vedtak>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Vedtak> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Vedtak>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Vedtak> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Vedtak>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Vedtak> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Vedtak>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Vedtak> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Vedtak>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Vedtak delete(String id) throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Vedtak delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Vedtak delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Vedtak get(String id) throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Vedtak get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Vedtak get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Vedtak get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Vedtak get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Vedtak get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Vedtak update(String id, VedtakRequest body) throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Vedtak update(
      String id, Function<VedtakRequest.Builder, VedtakRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new VedtakRequest.Builder()).build(),
        null,
        type);
  }

  public Vedtak update(String id, VedtakRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Vedtak update(
      String id,
      Function<VedtakRequest.Builder, VedtakRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Vedtak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new VedtakRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Dokumentbeskrivelse> listVedtaksdokument(String id) throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listVedtaksdokument(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listVedtaksdokument(
      String id, ListByVedtakParameters queryParameters) throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listVedtaksdokument(
      String id,
      Function<ListByVedtakParameters.Builder, ListByVedtakParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByVedtakParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Dokumentbeskrivelse> listVedtaksdokument(
      String id, ListByVedtakParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listVedtaksdokument(
      String id,
      Function<ListByVedtakParameters.Builder, ListByVedtakParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByVedtakParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentbeskrivelse addVedtaksdokument(String id, DokumentbeskrivelseRequest body)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Dokumentbeskrivelse addVedtaksdokument(String id, String bodyId) throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, bodyId, null, type);
  }

  public Dokumentbeskrivelse addVedtaksdokument(
      String id,
      Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
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

  public Dokumentbeskrivelse addVedtaksdokument(
      String id, DokumentbeskrivelseRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Dokumentbeskrivelse addVedtaksdokument(String id, String bodyId, EInnsynOptions options)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, bodyId, options, type);
  }

  public Dokumentbeskrivelse addVedtaksdokument(
      String id,
      Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
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

  public Dokumentbeskrivelse addVedtaksdokument(
      String id,
      String bodyId,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument";
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

  public Dokumentbeskrivelse deleteVedtaksdokument(String id, String vedtaksdokumentId)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument/" + vedtaksdokumentId;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Dokumentbeskrivelse deleteVedtaksdokument(
      String id, String vedtaksdokumentId, EInnsynOptions options) throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument/" + vedtaksdokumentId;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Dokumentbeskrivelse deleteVedtaksdokument(
      String id,
      String vedtaksdokumentId,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/vedtaksdokument/" + vedtaksdokumentId;
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

  public PaginatedList<Votering> listVotering(String id) throws EInnsynException {
    String url = "/vedtak/" + id + "/votering";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Votering>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Votering> listVotering(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/votering";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Votering>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Votering> listVotering(String id, ListByVedtakParameters queryParameters)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/votering";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Votering>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Votering> listVotering(
      String id,
      Function<ListByVedtakParameters.Builder, ListByVedtakParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/votering";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Votering>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByVedtakParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Votering> listVotering(
      String id, ListByVedtakParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/votering";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Votering>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Votering> listVotering(
      String id,
      Function<ListByVedtakParameters.Builder, ListByVedtakParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/votering";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Votering>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByVedtakParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Votering addVotering(String id, VoteringRequest body) throws EInnsynException {
    String url = "/vedtak/" + id + "/votering";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Votering addVotering(
      String id, Function<VoteringRequest.Builder, VoteringRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/votering";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new VoteringRequest.Builder()).build(),
        null,
        type);
  }

  public Votering addVotering(String id, VoteringRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/votering";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Votering addVotering(
      String id,
      Function<VoteringRequest.Builder, VoteringRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/vedtak/" + id + "/votering";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Votering>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new VoteringRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
