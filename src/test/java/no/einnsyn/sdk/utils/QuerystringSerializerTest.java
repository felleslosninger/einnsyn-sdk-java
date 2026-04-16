package no.einnsyn.sdk.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import no.einnsyn.sdk.common.search.models.SearchParameters;
import no.einnsyn.sdk.entities.lagretsoek.models.LagretSoekRequest;
import org.junit.jupiter.api.Test;

class QuerystringSerializerTest {

  @Test
  void serializeReturnsEmptyStringForNull() {
    assertEquals("", QuerystringSerializer.serialize(null));
  }

  @Test
  void serializeFlattensNestedObjectsAndArrays() {
    SearchParameters searchParameters =
        SearchParameters.builder()
            .query("open")
            .addExpand("value one")
            .addExpand("value/two")
            .limit(2)
            .build();

    LagretSoekRequest query =
        LagretSoekRequest.builder()
            .label("saved search")
            .searchParameters(searchParameters)
            .build();

    String serialized = QuerystringSerializer.serialize(query);

    assertEquals(
        Set.of(
            "label=saved+search",
            "searchParameters.query=open",
            "searchParameters.expand=value+one",
            "searchParameters.expand=value%2Ftwo",
            "searchParameters.limit=2"),
        parameters(serialized));
  }

  private static Set<String> parameters(String queryString) {
    return Arrays.stream(queryString.substring(1).split("&")).collect(Collectors.toSet());
  }
}
