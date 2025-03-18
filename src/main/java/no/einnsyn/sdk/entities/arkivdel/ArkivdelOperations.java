// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.arkivdel;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.arkivdel.models.Arkivdel;
import no.einnsyn.sdk.entities.arkivdel.models.ArkivdelRequest;
import no.einnsyn.sdk.entities.arkivdel.models.ListByArkivdelParameters;
import no.einnsyn.sdk.entities.klasse.models.Klasse;
import no.einnsyn.sdk.entities.klasse.models.KlasseRequest;
import no.einnsyn.sdk.entities.klassifikasjonssystem.models.Klassifikasjonssystem;
import no.einnsyn.sdk.entities.klassifikasjonssystem.models.KlassifikasjonssystemRequest;
import no.einnsyn.sdk.entities.moetemappe.models.Moetemappe;
import no.einnsyn.sdk.entities.moetemappe.models.MoetemappeRequest;
import no.einnsyn.sdk.entities.saksmappe.models.Saksmappe;
import no.einnsyn.sdk.entities.saksmappe.models.SaksmappeRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class ArkivdelOperations extends ApiEntityOperations<Arkivdel, ArkivdelRequest> {

  public ArkivdelOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Arkivdel> list() throws EInnsynException {
    String url = "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkivdel>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Arkivdel> list(EInnsynOptions options) throws EInnsynException {
    String url = "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkivdel>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Arkivdel> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkivdel>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Arkivdel> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkivdel>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Arkivdel> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkivdel>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Arkivdel> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Arkivdel>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Arkivdel delete(String id) throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Arkivdel delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Arkivdel delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Arkivdel get(String id) throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Arkivdel get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Arkivdel get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Arkivdel get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Arkivdel get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Arkivdel get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Arkivdel update(String id, ArkivdelRequest body) throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Arkivdel update(
      String id, Function<ArkivdelRequest.Builder, ArkivdelRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ArkivdelRequest.Builder()).build(),
        null,
        type);
  }

  public Arkivdel update(String id, ArkivdelRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Arkivdel update(
      String id,
      Function<ArkivdelRequest.Builder, ArkivdelRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Arkivdel>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new ArkivdelRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Klasse> listKlasse(String id) throws EInnsynException {
    String url = "/arkivdel/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Klasse> listKlasse(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Klasse> listKlasse(String id, ListByArkivdelParameters queryParameters)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Klasse> listKlasse(
      String id,
      Function<ListByArkivdelParameters.Builder, ListByArkivdelParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByArkivdelParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Klasse> listKlasse(
      String id, ListByArkivdelParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Klasse> listKlasse(
      String id,
      Function<ListByArkivdelParameters.Builder, ListByArkivdelParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klasse>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByArkivdelParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Klasse addKlasse(String id, KlasseRequest body) throws EInnsynException {
    String url = "/arkivdel/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Klasse addKlasse(
      String id, Function<KlasseRequest.Builder, KlasseRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klasse";
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
    String url = "/arkivdel/" + id + "/klasse";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Klasse>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Klasse addKlasse(
      String id,
      Function<KlasseRequest.Builder, KlasseRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klasse";
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

  public PaginatedList<Klassifikasjonssystem> listKlassifikasjonssystem(String id)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klassifikasjonssystem>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Klassifikasjonssystem> listKlassifikasjonssystem(
      String id, EInnsynOptions options) throws EInnsynException {
    String url = "/arkivdel/" + id + "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klassifikasjonssystem>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Klassifikasjonssystem> listKlassifikasjonssystem(
      String id, ListByArkivdelParameters queryParameters) throws EInnsynException {
    String url = "/arkivdel/" + id + "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klassifikasjonssystem>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Klassifikasjonssystem> listKlassifikasjonssystem(
      String id,
      Function<ListByArkivdelParameters.Builder, ListByArkivdelParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klassifikasjonssystem>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByArkivdelParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Klassifikasjonssystem> listKlassifikasjonssystem(
      String id, ListByArkivdelParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klassifikasjonssystem>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Klassifikasjonssystem> listKlassifikasjonssystem(
      String id,
      Function<ListByArkivdelParameters.Builder, ListByArkivdelParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Klassifikasjonssystem>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByArkivdelParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Klassifikasjonssystem addKlassifikasjonssystem(
      String id, KlassifikasjonssystemRequest body) throws EInnsynException {
    String url = "/arkivdel/" + id + "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Klassifikasjonssystem addKlassifikasjonssystem(
      String id,
      Function<KlassifikasjonssystemRequest.Builder, KlassifikasjonssystemRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new KlassifikasjonssystemRequest.Builder()).build(),
        null,
        type);
  }

  public Klassifikasjonssystem addKlassifikasjonssystem(
      String id, KlassifikasjonssystemRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Klassifikasjonssystem addKlassifikasjonssystem(
      String id,
      Function<KlassifikasjonssystemRequest.Builder, KlassifikasjonssystemRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/klassifikasjonssystem";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Klassifikasjonssystem>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new KlassifikasjonssystemRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Moetemappe> listMoetemappe(String id) throws EInnsynException {
    String url = "/arkivdel/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Moetemappe> listMoetemappe(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Moetemappe> listMoetemappe(
      String id, ListByArkivdelParameters queryParameters) throws EInnsynException {
    String url = "/arkivdel/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Moetemappe> listMoetemappe(
      String id,
      Function<ListByArkivdelParameters.Builder, ListByArkivdelParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByArkivdelParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Moetemappe> listMoetemappe(
      String id, ListByArkivdelParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Moetemappe> listMoetemappe(
      String id,
      Function<ListByArkivdelParameters.Builder, ListByArkivdelParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Moetemappe>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByArkivdelParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Moetemappe addMoetemappe(String id, MoetemappeRequest body) throws EInnsynException {
    String url = "/arkivdel/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Moetemappe addMoetemappe(
      String id, Function<MoetemappeRequest.Builder, MoetemappeRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetemappeRequest.Builder()).build(),
        null,
        type);
  }

  public Moetemappe addMoetemappe(String id, MoetemappeRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Moetemappe addMoetemappe(
      String id,
      Function<MoetemappeRequest.Builder, MoetemappeRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/moetemappe";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Moetemappe>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new MoetemappeRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Saksmappe> listSaksmappe(String id) throws EInnsynException {
    String url = "/arkivdel/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Saksmappe> listSaksmappe(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Saksmappe> listSaksmappe(String id, ListByArkivdelParameters queryParameters)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Saksmappe> listSaksmappe(
      String id,
      Function<ListByArkivdelParameters.Builder, ListByArkivdelParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByArkivdelParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Saksmappe> listSaksmappe(
      String id, ListByArkivdelParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Saksmappe> listSaksmappe(
      String id,
      Function<ListByArkivdelParameters.Builder, ListByArkivdelParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Saksmappe>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByArkivdelParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Saksmappe addSaksmappe(String id, SaksmappeRequest body) throws EInnsynException {
    String url = "/arkivdel/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Saksmappe addSaksmappe(
      String id, Function<SaksmappeRequest.Builder, SaksmappeRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new SaksmappeRequest.Builder()).build(),
        null,
        type);
  }

  public Saksmappe addSaksmappe(String id, SaksmappeRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Saksmappe addSaksmappe(
      String id,
      Function<SaksmappeRequest.Builder, SaksmappeRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/arkivdel/" + id + "/saksmappe";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Saksmappe>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new SaksmappeRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
