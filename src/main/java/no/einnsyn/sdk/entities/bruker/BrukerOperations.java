// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.entities.bruker;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiEntityOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.queryparameters.models.GetParameters;
import no.einnsyn.sdk.common.queryparameters.models.ListParameters;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.bruker.models.Bruker;
import no.einnsyn.sdk.entities.bruker.models.BrukerRequest;
import no.einnsyn.sdk.entities.bruker.models.ListByBrukerParameters;
import no.einnsyn.sdk.entities.innsynskrav.models.Innsynskrav;
import no.einnsyn.sdk.entities.innsynskravbestilling.models.InnsynskravBestilling;
import no.einnsyn.sdk.entities.innsynskravbestilling.models.InnsynskravBestillingRequest;
import no.einnsyn.sdk.entities.lagretsak.models.LagretSak;
import no.einnsyn.sdk.entities.lagretsak.models.LagretSakRequest;
import no.einnsyn.sdk.entities.lagretsoek.models.LagretSoek;
import no.einnsyn.sdk.entities.lagretsoek.models.LagretSoekRequest;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class BrukerOperations extends ApiEntityOperations<Bruker, BrukerRequest> {

  public BrukerOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Bruker> list() throws EInnsynException {
    String url = "/bruker";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Bruker>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Bruker> list(EInnsynOptions options) throws EInnsynException {
    String url = "/bruker";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Bruker>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Bruker> list(ListParameters queryParameters) throws EInnsynException {
    String url = "/bruker";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Bruker>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Bruker> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/bruker";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Bruker>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Bruker> list(ListParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Bruker>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Bruker> list(
      Function<ListParameters.Builder, ListParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Bruker>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Bruker add(BrukerRequest body) throws EInnsynException {
    String url = "/bruker";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Bruker add(Function<BrukerRequest.Builder, BrukerRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/bruker";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new BrukerRequest.Builder()).build(),
        null,
        type);
  }

  public Bruker add(BrukerRequest body, EInnsynOptions options) throws EInnsynException {
    String url = "/bruker";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Bruker add(
      Function<BrukerRequest.Builder, BrukerRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new BrukerRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Bruker delete(String id) throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Bruker delete(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Bruker delete(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.DELETE;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Bruker get(String id) throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Bruker get(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Bruker get(String id, GetParameters queryParameters) throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public Bruker get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public Bruker get(String id, GetParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public Bruker get(
      String id,
      Function<GetParameters.Builder, GetParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new GetParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Bruker update(String id, BrukerRequest body) throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Bruker update(
      String id, Function<BrukerRequest.Builder, BrukerRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new BrukerRequest.Builder()).build(),
        null,
        type);
  }

  public Bruker update(String id, BrukerRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Bruker update(
      String id,
      Function<BrukerRequest.Builder, BrukerRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new BrukerRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Bruker activate(String id, String secret) throws EInnsynException {
    String url = "/bruker/" + id + "/activate/" + secret;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Bruker activate(String id, String secret, EInnsynOptions options) throws EInnsynException {
    String url = "/bruker/" + id + "/activate/" + secret;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Bruker activate(
      String id,
      String secret,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/activate/" + secret;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(String id) throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(
      String id, ListByBrukerParameters queryParameters) throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(
      String id,
      Function<ListByBrukerParameters.Builder, ListByBrukerParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByBrukerParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(
      String id, ListByBrukerParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Innsynskrav> listInnsynskrav(
      String id,
      Function<ListByBrukerParameters.Builder, ListByBrukerParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskrav";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Innsynskrav>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByBrukerParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<InnsynskravBestilling> listInnsynskravBestilling(String id)
      throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<InnsynskravBestilling>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<InnsynskravBestilling> listInnsynskravBestilling(
      String id, EInnsynOptions options) throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<InnsynskravBestilling>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<InnsynskravBestilling> listInnsynskravBestilling(
      String id, ListByBrukerParameters queryParameters) throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<InnsynskravBestilling>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<InnsynskravBestilling> listInnsynskravBestilling(
      String id,
      Function<ListByBrukerParameters.Builder, ListByBrukerParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<InnsynskravBestilling>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByBrukerParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<InnsynskravBestilling> listInnsynskravBestilling(
      String id, ListByBrukerParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<InnsynskravBestilling>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<InnsynskravBestilling> listInnsynskravBestilling(
      String id,
      Function<ListByBrukerParameters.Builder, ListByBrukerParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<InnsynskravBestilling>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByBrukerParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public InnsynskravBestilling addInnsynskravBestilling(
      String id, InnsynskravBestillingRequest body) throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public InnsynskravBestilling addInnsynskravBestilling(
      String id,
      Function<InnsynskravBestillingRequest.Builder, InnsynskravBestillingRequest.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new InnsynskravBestillingRequest.Builder()).build(),
        null,
        type);
  }

  public InnsynskravBestilling addInnsynskravBestilling(
      String id, InnsynskravBestillingRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public InnsynskravBestilling addInnsynskravBestilling(
      String id,
      Function<InnsynskravBestillingRequest.Builder, InnsynskravBestillingRequest.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/innsynskravBestilling";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<InnsynskravBestilling>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new InnsynskravBestillingRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<LagretSak> listLagretSak(String id) throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSak>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<LagretSak> listLagretSak(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSak>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<LagretSak> listLagretSak(String id, ListByBrukerParameters queryParameters)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSak>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<LagretSak> listLagretSak(
      String id,
      Function<ListByBrukerParameters.Builder, ListByBrukerParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSak>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByBrukerParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<LagretSak> listLagretSak(
      String id, ListByBrukerParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSak>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<LagretSak> listLagretSak(
      String id,
      Function<ListByBrukerParameters.Builder, ListByBrukerParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSak>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByBrukerParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public LagretSak addLagretSak(String id, LagretSakRequest body) throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public LagretSak addLagretSak(
      String id, Function<LagretSakRequest.Builder, LagretSakRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new LagretSakRequest.Builder()).build(),
        null,
        type);
  }

  public LagretSak addLagretSak(String id, LagretSakRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public LagretSak addLagretSak(
      String id,
      Function<LagretSakRequest.Builder, LagretSakRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSak";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<LagretSak>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new LagretSakRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public PaginatedList<LagretSoek> listLagretSoek(String id) throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSoek>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<LagretSoek> listLagretSoek(String id, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSoek>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<LagretSoek> listLagretSoek(String id, ListByBrukerParameters queryParameters)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSoek>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<LagretSoek> listLagretSoek(
      String id,
      Function<ListByBrukerParameters.Builder, ListByBrukerParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSoek>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByBrukerParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<LagretSoek> listLagretSoek(
      String id, ListByBrukerParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSoek>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<LagretSoek> listLagretSoek(
      String id,
      Function<ListByBrukerParameters.Builder, ListByBrukerParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<LagretSoek>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new ListByBrukerParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public LagretSoek addLagretSoek(String id, LagretSoekRequest body) throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public LagretSoek addLagretSoek(
      String id, Function<LagretSoekRequest.Builder, LagretSoekRequest.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new LagretSoekRequest.Builder()).build(),
        null,
        type);
  }

  public LagretSoek addLagretSoek(String id, LagretSoekRequest body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public LagretSoek addLagretSoek(
      String id,
      Function<LagretSoekRequest.Builder, LagretSoekRequest.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/lagretSoek";
    ApiRequestMethod method = ApiRequestMethod.POST;
    Type type = new TypeToken<LagretSoek>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new LagretSoekRequest.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Bruker requestPasswordReset(String id) throws EInnsynException {
    String url = "/bruker/" + id + "/requestPasswordReset";
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public Bruker requestPasswordReset(String id, EInnsynOptions options) throws EInnsynException {
    String url = "/bruker/" + id + "/requestPasswordReset";
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public Bruker requestPasswordReset(
      String id, Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/requestPasswordReset";
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Bruker updatePassword(String id, UpdatePassword body) throws EInnsynException {
    String url = "/bruker/" + id + "/updatePassword";
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Bruker updatePassword(
      String id, Function<UpdatePassword.Builder, UpdatePassword.Builder> bodyBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/updatePassword";
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new UpdatePassword.Builder()).build(),
        null,
        type);
  }

  public Bruker updatePassword(String id, UpdatePassword body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id + "/updatePassword";
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Bruker updatePassword(
      String id,
      Function<UpdatePassword.Builder, UpdatePassword.Builder> bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/updatePassword";
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new UpdatePassword.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public Bruker updatePasswordWithSecret(String id, String secret, UpdatePasswordWithSecret body)
      throws EInnsynException {
    String url = "/bruker/" + id + "/updatePassword/" + secret;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, body, null, type);
  }

  public Bruker updatePasswordWithSecret(
      String id,
      String secret,
      Function<UpdatePasswordWithSecret.Builder, UpdatePasswordWithSecret.Builder>
          bodyBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/updatePassword/" + secret;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new UpdatePasswordWithSecret.Builder()).build(),
        null,
        type);
  }

  public Bruker updatePasswordWithSecret(
      String id, String secret, UpdatePasswordWithSecret body, EInnsynOptions options)
      throws EInnsynException {
    String url = "/bruker/" + id + "/updatePassword/" + secret;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(method, url, null, body, options, type);
  }

  public Bruker updatePasswordWithSecret(
      String id,
      String secret,
      Function<UpdatePasswordWithSecret.Builder, UpdatePasswordWithSecret.Builder>
          bodyBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/bruker/" + id + "/updatePassword/" + secret;
    ApiRequestMethod method = ApiRequestMethod.PATCH;
    Type type = new TypeToken<Bruker>() {}.getType();
    return requester.request(
        method,
        url,
        null,
        bodyBuilderFunction.apply(new UpdatePasswordWithSecret.Builder()).build(),
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }

  public static class UpdatePassword {
    protected String oldPassword;

    protected String newPassword;

    public UpdatePassword(String oldPassword, String newPassword) {
      super();
      this.oldPassword = oldPassword;
      this.newPassword = newPassword;
    }

    public String getOldPassword() {
      return oldPassword;
    }

    public String getNewPassword() {
      return newPassword;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static UpdatePassword of(Function<Builder, Builder> builderFunction) {
      return builderFunction.apply(new Builder()).build();
    }

    public static class Builder {
      protected String oldPassword;

      protected String newPassword;

      public String getOldPassword() {
        return oldPassword;
      }

      public String getNewPassword() {
        return newPassword;
      }

      public Builder oldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
        return this;
      }

      public Builder newPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
      }

      public UpdatePassword build() {
        return new UpdatePassword(this.oldPassword, this.newPassword);
      }
    }
  }

  public static class UpdatePasswordWithSecret {
    protected String newPassword;

    public UpdatePasswordWithSecret(String newPassword) {
      super();
      this.newPassword = newPassword;
    }

    public String getNewPassword() {
      return newPassword;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static UpdatePasswordWithSecret of(Function<Builder, Builder> builderFunction) {
      return builderFunction.apply(new Builder()).build();
    }

    public static class Builder {
      protected String newPassword;

      public String getNewPassword() {
        return newPassword;
      }

      public Builder newPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
      }

      public UpdatePasswordWithSecret build() {
        return new UpdatePasswordWithSecret(this.newPassword);
      }
    }
  }
}
