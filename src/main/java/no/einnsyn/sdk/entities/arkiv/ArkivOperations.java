// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.arkiv;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.arkiv.models.Arkiv;
import no.einnsyn.sdk.entities.arkiv.models.ArkivRequest;
import no.einnsyn.sdk.entities.arkiv.models.ListByArkivParameters;
import no.einnsyn.sdk.entities.arkivdel.models.Arkivdel;
import no.einnsyn.sdk.entities.arkivdel.models.ArkivdelRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class ArkivOperations extends ApiEntityOperations<Arkiv, ArkivRequest> {

  public ArkivOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Arkiv> list() throws EInnsynException {
    String url = "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Arkiv> list(EInnsynOptions options) throws EInnsynException {
    String url = "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Arkiv> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Arkiv> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Arkiv> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Arkiv> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Arkiv add(ArkivRequest body) throws EInnsynException {
    String url = "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Arkiv add(Function<ArkivRequest.Builder, ArkivRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ArkivRequest.Builder()).build(),
        null,
        type);
  }

  public Arkiv add(ArkivRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Arkiv add(
      Function<ArkivRequest.Builder, ArkivRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ArkivRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Arkiv delete(String id) throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Arkiv delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Arkiv delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Arkiv get(String id) throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Arkiv get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Arkiv get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Arkiv get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Arkiv get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Arkiv get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Arkiv update(String id, ArkivRequest body) throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Arkiv update(
      String id, Function<ArkivRequest.Builder, ArkivRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ArkivRequest.Builder()).build(),
        null,
        type);
  }

  public Arkiv update(String id, ArkivRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Arkiv update(
      String id,
      Function<ArkivRequest.Builder, ArkivRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ArkivRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Arkiv> listArkiv(String id) throws EInnsynException {
    String url = "/arkiv/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Arkiv> listArkiv(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/arkiv/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Arkiv> listArkiv(String id, ListByArkivParameters queryParameters)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Arkiv> listArkiv(
      String id,
      Function<ListByArkivParameters.Builder, ListByArkivParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByArkivParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Arkiv> listArkiv(
      String id, ListByArkivParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Arkiv> listArkiv(
      String id,
      Function<ListByArkivParameters.Builder, ListByArkivParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkiv>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByArkivParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Arkiv addArkiv(String id, ArkivRequest body) throws EInnsynException {
    String url = "/arkiv/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Arkiv addArkiv(
      String id, Function<ArkivRequest.Builder, ArkivRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ArkivRequest.Builder()).build(),
        null,
        type);
  }

  public Arkiv addArkiv(String id, ArkivRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Arkiv addArkiv(
      String id,
      Function<ArkivRequest.Builder, ArkivRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkiv";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Arkiv>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ArkivRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Arkivdel> listArkivdel(String id) throws EInnsynException {
    String url = "/arkiv/" + id + "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkivdel>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Arkivdel> listArkivdel(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkivdel>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Arkivdel> listArkivdel(String id, ListByArkivParameters queryParameters)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkivdel>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Arkivdel> listArkivdel(
      String id,
      Function<ListByArkivParameters.Builder, ListByArkivParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkivdel>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByArkivParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Arkivdel> listArkivdel(
      String id, ListByArkivParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkivdel>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Arkivdel> listArkivdel(
      String id,
      Function<ListByArkivParameters.Builder, ListByArkivParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkivdel>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByArkivParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Arkivdel addArkivdel(String id, ArkivdelRequest body) throws EInnsynException {
    String url = "/arkiv/" + id + "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Arkivdel addArkivdel(
      String id, Function<ArkivdelRequest.Builder, ArkivdelRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ArkivdelRequest.Builder()).build(),
        null,
        type);
  }

  public Arkivdel addArkivdel(String id, ArkivdelRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Arkivdel addArkivdel(
      String id,
      Function<ArkivdelRequest.Builder, ArkivdelRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkiv/" + id + "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ArkivdelRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
