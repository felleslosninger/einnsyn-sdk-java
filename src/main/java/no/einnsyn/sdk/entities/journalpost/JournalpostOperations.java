// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.journalpost;

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
import no.einnsyn.sdk.entities.journalpost.models.Journalpost;
import no.einnsyn.sdk.entities.journalpost.models.JournalpostRequest;
import no.einnsyn.sdk.entities.journalpost.models.ListByJournalpostParameters;
import no.einnsyn.sdk.entities.korrespondansepart.models.Korrespondansepart;
import no.einnsyn.sdk.entities.korrespondansepart.models.KorrespondansepartRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class JournalpostOperations extends ApiEntityOperations<Journalpost, JournalpostRequest> {

  public JournalpostOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Journalpost> list() throws EInnsynException {
    String url = "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Journalpost>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Journalpost> list(EInnsynOptions options) throws EInnsynException {
    String url = "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Journalpost>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Journalpost> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Journalpost>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Journalpost> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Journalpost>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Journalpost> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Journalpost>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Journalpost> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Journalpost>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Journalpost delete(String id) throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Journalpost delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Journalpost delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Journalpost get(String id) throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Journalpost get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Journalpost get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Journalpost get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Journalpost get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Journalpost get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Journalpost update(String id, JournalpostRequest body) throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Journalpost update(
      String id,
      Function<JournalpostRequest.Builder, JournalpostRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new JournalpostRequest.Builder()).build(),
        null,
        type);
  }

  public Journalpost update(String id, JournalpostRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Journalpost update(
      String id,
      Function<JournalpostRequest.Builder, JournalpostRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new JournalpostRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(String id)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id, EInnsynOptions options) throws EInnsynException {
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id, ListByJournalpostParameters queryParameters) throws EInnsynException {
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id,
      Function<ListByJournalpostParameters.Builder, ListByJournalpostParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByJournalpostParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id, ListByJournalpostParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Dokumentbeskrivelse> listDokumentbeskrivelse(
      String id,
      Function<ListByJournalpostParameters.Builder, ListByJournalpostParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Dokumentbeskrivelse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByJournalpostParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(String id, DokumentbeskrivelseRequest body)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(String id, String bodyId)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, bodyId, null, type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(
      String id,
      Function<DokumentbeskrivelseRequest.Builder, DokumentbeskrivelseRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
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
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Dokumentbeskrivelse addDokumentbeskrivelse(
      String id, String bodyId, EInnsynOptions options) throws EInnsynException {
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
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
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
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
    String url = "/journalpost/" + id + "/dokumentbeskrivelse";
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
    String url = "/journalpost/" + id + "/dokumentbeskrivelse/" + dokumentbeskrivelseId;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Dokumentbeskrivelse deleteDokumentbeskrivelse(
      String id, String dokumentbeskrivelseId, EInnsynOptions options) throws EInnsynException {
    String url = "/journalpost/" + id + "/dokumentbeskrivelse/" + dokumentbeskrivelseId;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Dokumentbeskrivelse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Dokumentbeskrivelse deleteDokumentbeskrivelse(
      String id,
      String dokumentbeskrivelseId,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/dokumentbeskrivelse/" + dokumentbeskrivelseId;
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

  public PaginatedList<Korrespondansepart> listKorrespondansepart(String id)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Korrespondansepart>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Korrespondansepart> listKorrespondansepart(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Korrespondansepart>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Korrespondansepart> listKorrespondansepart(
      String id, ListByJournalpostParameters queryParameters) throws EInnsynException {
    String url = "/journalpost/" + id + "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Korrespondansepart>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Korrespondansepart> listKorrespondansepart(
      String id,
      Function<ListByJournalpostParameters.Builder, ListByJournalpostParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Korrespondansepart>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByJournalpostParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Korrespondansepart> listKorrespondansepart(
      String id, ListByJournalpostParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Korrespondansepart>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Korrespondansepart> listKorrespondansepart(
      String id,
      Function<ListByJournalpostParameters.Builder, ListByJournalpostParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Korrespondansepart>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByJournalpostParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Korrespondansepart addKorrespondansepart(String id, KorrespondansepartRequest body)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Korrespondansepart addKorrespondansepart(
      String id,
      Function<KorrespondansepartRequest.Builder, KorrespondansepartRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new KorrespondansepartRequest.Builder()).build(),
        null,
        type);
  }

  public Korrespondansepart addKorrespondansepart(
      String id, KorrespondansepartRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/journalpost/" + id + "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Korrespondansepart addKorrespondansepart(
      String id,
      Function<KorrespondansepartRequest.Builder, KorrespondansepartRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/journalpost/" + id + "/korrespondansepart";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Korrespondansepart>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new KorrespondansepartRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
