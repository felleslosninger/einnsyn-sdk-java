package no.einnsyn.sdk.net.parsing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import no.einnsyn.sdk.EInnsynOptions;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.entities.enhet.models.Enhet;
import no.einnsyn.sdk.net.ApiRequester;
import org.junit.jupiter.api.Test;

class PaginatedListTypeAdapterFactoryTest {

  private static final Type PAGINATED_LIST_TYPE = new TypeToken<PaginatedList<Base>>() {}.getType();

  private final ApiRequester requester = new ApiRequester(EInnsynOptions.builder().build());

  @Test
  void shouldParseTotal() {
    PaginatedList<Base> list =
        requester.deserialize(
            "{\"items\":[{\"entity\":\"Enhet\",\"id\":\"enh_1\"}],"
                + "\"total\":{\"value\":10000,\"capped\":true},"
                + "\"next\":\"https://example.com/next\"}",
            PAGINATED_LIST_TYPE);

    assertEquals(1, list.getItems().size());
    assertInstanceOf(Enhet.class, list.getItems().get(0));
    assertEquals("https://example.com/next", list.getNext());
    assertEquals(10000L, list.getTotal().getValue());
    assertTrue(list.getTotal().getCapped());
  }

  @Test
  void shouldParseUncappedTotal() {
    PaginatedList<Base> list =
        requester.deserialize(
            "{\"items\":[],\"total\":{\"value\":42,\"capped\":false}}", PAGINATED_LIST_TYPE);

    assertEquals(42L, list.getTotal().getValue());
    assertFalse(list.getTotal().getCapped());
  }

  @Test
  void shouldLeaveTotalNullWhenAbsent() {
    PaginatedList<Base> list = requester.deserialize("{\"items\":[]}", PAGINATED_LIST_TYPE);

    assertTrue(list.getItems().isEmpty());
    assertNull(list.getTotal());
  }
}
