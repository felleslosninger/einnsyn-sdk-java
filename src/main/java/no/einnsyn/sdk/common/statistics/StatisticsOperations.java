// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.statistics;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.statistics.models.StatisticsParameters;
import no.einnsyn.sdk.common.statistics.models.StatisticsResponse;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class StatisticsOperations extends ApiOperations {

  public StatisticsOperations(ApiRequester requester) {
    super(requester);
  }

  public StatisticsResponse query() throws EInnsynException {
    String url = "/statistics";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<StatisticsResponse>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public StatisticsResponse query(EInnsynOptions options) throws EInnsynException {
    String url = "/statistics";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<StatisticsResponse>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public StatisticsResponse query(StatisticsParameters queryParameters) throws EInnsynException {
    String url = "/statistics";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<StatisticsResponse>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public StatisticsResponse query(
      Function<StatisticsParameters.Builder, StatisticsParameters.Builder>
          queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/statistics";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<StatisticsResponse>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new StatisticsParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public StatisticsResponse query(StatisticsParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/statistics";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<StatisticsResponse>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public StatisticsResponse query(
      Function<StatisticsParameters.Builder, StatisticsParameters.Builder>
          queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/statistics";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<StatisticsResponse>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new StatisticsParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
