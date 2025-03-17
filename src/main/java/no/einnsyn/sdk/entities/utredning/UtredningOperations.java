// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.utredning;

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
import no.einnsyn.sdk.entities.utredning.models.ListByUtredningParameters;
import no.einnsyn.sdk.entities.utredning.models.Utredning;
import no.einnsyn.sdk.entities.utredning.models.UtredningRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class UtredningOperations extends ApiEntityOperations<Utredning, UtredningRequest> {

  public UtredningOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Utredning> list() throws EInnsynException {
    String url = "/utredning";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Utredning>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Utredning> list(EInnsynOptions options) throws EInnsynException {
    String url = "/utredning";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Utredning>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Utredning> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/utredning";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Utredning>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Utredning> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/utredning";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Utredning>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Utredning> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/utredning";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Utredning>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Utredning> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/utredning";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Utredning>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Utredning delete(String id) throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Utredning delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Utredning delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Utredning get(String id) throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Utredning get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Utredning get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Utredning get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Utredning get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Utredning get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Utredning update(String id, UtredningRequest body) throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Utredning update(
      String id, Function<UtredningRequest.Builder, UtredningRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new UtredningRequest.Builder()).build(),
        null,
        type);
  }

  public Utredning update(String id, UtredningRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Utredning update(
      String id,
      Function<UtredningRequest.Builder, UtredningRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/utredning/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Utredning>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new UtredningRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Dokumentbeskrivelse> listUtredningsdokument(String id)
      throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listUtredningsdokument(
      String id, EInnsynOptions options) throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listUtredningsdokument(
      String id, ListByUtredningParameters queryParameters) throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listUtredningsdokument(
      String id,
      Function<ListByUtredningParameters.Builder, ListByUtredningParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByUtredningParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Dokumentbeskrivelse> listUtredningsdokument(
      String id, ListByUtredningParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listUtredningsdokument(
      String id,
      Function<ListByUtredningParameters.Builder, ListByUtredningParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByUtredningParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentbeskrivelse addUtredningsdokument(String id, DokumentbeskrivelseRequest body)
      throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Dokumentbeskrivelse addUtredningsdokument(String id, String bodyId)
      throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, bodyId, null, type);
  }

  public Dokumentbeskrivelse addUtredningsdokument(
      String id,
      Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
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

  public Dokumentbeskrivelse addUtredningsdokument(
      String id, DokumentbeskrivelseRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Dokumentbeskrivelse addUtredningsdokument(String id, String bodyId, EInnsynOptions options)
      throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, bodyId, options, type);
  }

  public Dokumentbeskrivelse addUtredningsdokument(
      String id,
      Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
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

  public Dokumentbeskrivelse addUtredningsdokument(
      String id,
      String bodyId,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument";
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

  public Dokumentbeskrivelse deleteUtredningsdokument(String id, String utredningsdokumentId)
      throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument/" + utredningsdokumentId;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Dokumentbeskrivelse deleteUtredningsdokument(
      String id, String utredningsdokumentId, EInnsynOptions options) throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument/" + utredningsdokumentId;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Dokumentbeskrivelse deleteUtredningsdokument(
      String id,
      String utredningsdokumentId,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/utredning/" + id + "/utredningsdokument/" + utredningsdokumentId;
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
