// Auto-generated from our API specification
// https://github.com/felleslosninger/einnsyn-api-spec

package no.einnsyn.sdk.common.search;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.function.Function;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.apioperations.ApiOperations;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.common.search.models.SearchParameters;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class SearchOperations extends ApiOperations {

  public SearchOperations(ApiRequester requester) {
    super(requester);
  }

  public PaginatedList<Base> search() throws EInnsynException {
    String url = "/search";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Base>>() {}.getType();
    return requester.request(method, url, null, null, null, type);
  }

  public PaginatedList<Base> search(EInnsynOptions options) throws EInnsynException {
    String url = "/search";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Base>>() {}.getType();
    return requester.request(method, url, null, null, options, type);
  }

  public PaginatedList<Base> search(SearchParameters queryParameters) throws EInnsynException {
    String url = "/search";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Base>>() {}.getType();
    return requester.request(method, url, queryParameters, null, null, type);
  }

  public PaginatedList<Base> search(
      Function<SearchParameters.Builder, SearchParameters.Builder> queryParametersBuilderFunction)
      throws EInnsynException {
    String url = "/search";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Base>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new SearchParameters.Builder()).build(),
        null,
        null,
        type);
  }

  public PaginatedList<Base> search(SearchParameters queryParameters, EInnsynOptions options)
      throws EInnsynException {
    String url = "/search";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Base>>() {}.getType();
    return requester.request(method, url, queryParameters, null, options, type);
  }

  public PaginatedList<Base> search(
      Function<SearchParameters.Builder, SearchParameters.Builder> queryParametersBuilderFunction,
      Function<EInnsynOptions.Builder, EInnsynOptions.Builder> optionsBuilderFunction)
      throws EInnsynException {
    String url = "/search";
    ApiRequestMethod method = ApiRequestMethod.GET;
    Type type = new TypeToken<PaginatedList<Base>>() {}.getType();
    return requester.request(
        method,
        url,
        queryParametersBuilderFunction.apply(new SearchParameters.Builder()).build(),
        null,
        optionsBuilderFunction.apply(new EInnsynOptions.Builder()).build(),
        type);
  }
}
