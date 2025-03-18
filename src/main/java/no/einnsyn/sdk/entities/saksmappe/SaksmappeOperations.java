// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.saksmappe;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.journalpost.models.Journalpost;
import no.einnsyn.sdk.entities.journalpost.models.JournalpostRequest;
import no.einnsyn.sdk.entities.saksmappe.models.ListBySaksmappeParameters;
import no.einnsyn.sdk.entities.saksmappe.models.Saksmappe;
import no.einnsyn.sdk.entities.saksmappe.models.SaksmappeRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class SaksmappeOperations extends ApiEntityOperations<Saksmappe, SaksmappeRequest> {

  public SaksmappeOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Saksmappe> list() throws EInnsynException {
    String url = "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Saksmappe> list(EInnsynOptions options) throws EInnsynException {
    String url = "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Saksmappe> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Saksmappe> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Saksmappe> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Saksmappe> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Saksmappe delete(String id) throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Saksmappe delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Saksmappe delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Saksmappe get(String id) throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Saksmappe get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Saksmappe get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Saksmappe get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Saksmappe get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Saksmappe get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Saksmappe update(String id, SaksmappeRequest body) throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Saksmappe update(
      String id, Function<SaksmappeRequest.Builder, SaksmappeRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new SaksmappeRequest.Builder()).build(),
        null,
        type);
  }

  public Saksmappe update(String id, SaksmappeRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Saksmappe update(
      String id,
      Function<SaksmappeRequest.Builder, SaksmappeRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/saksmappe/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new SaksmappeRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Journalpost> listJournalpost(String id) throws EInnsynException {
    String url = "/saksmappe/" + id + "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Journalpost>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Journalpost> listJournalpost(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/saksmappe/" + id + "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Journalpost>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Journalpost> listJournalpost(
      String id, ListBySaksmappeParameters queryParameters) throws EInnsynException {
    String url = "/saksmappe/" + id + "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Journalpost>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Journalpost> listJournalpost(
      String id,
      Function<ListBySaksmappeParameters.Builder, ListBySaksmappeParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/saksmappe/" + id + "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Journalpost>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListBySaksmappeParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Journalpost> listJournalpost(
      String id, ListBySaksmappeParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/saksmappe/" + id + "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Journalpost>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Journalpost> listJournalpost(
      String id,
      Function<ListBySaksmappeParameters.Builder, ListBySaksmappeParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/saksmappe/" + id + "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Journalpost>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListBySaksmappeParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Journalpost addJournalpost(String id, JournalpostRequest body) throws EInnsynException {
    String url = "/saksmappe/" + id + "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Journalpost addJournalpost(
      String id,
      Function<JournalpostRequest.Builder, JournalpostRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/saksmappe/" + id + "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new JournalpostRequest.Builder()).build(),
        null,
        type);
  }

  public Journalpost addJournalpost(String id, JournalpostRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/saksmappe/" + id + "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Journalpost addJournalpost(
      String id,
      Function<JournalpostRequest.Builder, JournalpostRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/saksmappe/" + id + "/journalpost";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Journalpost>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new JournalpostRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
