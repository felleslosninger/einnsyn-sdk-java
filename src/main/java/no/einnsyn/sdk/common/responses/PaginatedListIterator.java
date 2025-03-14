package no.einnsyn.sdk.common.responses;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.NoSuchElementException;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.base.models.Base;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

public class PaginatedListIterator<T extends Base> implements Iterator<T> {
  private Iterator<T> currentIterator;
  private String nextUrl;

  private final ApiRequester requester;

  public PaginatedListIterator(PaginatedList<T> paginatedList, ApiRequester requester) {
    this.requester = requester;
    this.currentIterator = paginatedList.getItems().iterator();
    this.nextUrl = paginatedList.getNext();
  }

  @Override
  public boolean hasNext() {
    if (currentIterator.hasNext()) {
      return true;
    }
    while (nextUrl != null && !currentIterator.hasNext()) {
      try {
        loadNextPage();
      } catch (EInnsynException e) {
        return false;
      }
    }
    return currentIterator.hasNext();
  }

  @Override
  public T next() {
    if (!hasNext()) {
      throw new NoSuchElementException("No more items available.");
    }
    return currentIterator.next();
  }

  /** Loads the next page via the requester and updates the current iterator and nextUrl. */
  private void loadNextPage() throws EInnsynException {
    if (requester == null) {
      nextUrl = null;
      return;
    }

    Type type = new TypeToken<PaginatedList<?>>() {}.getType();
    PaginatedList<T> nextPage =
        requester.request(ApiRequestMethod.GET, nextUrl, null, null, null, type);
    if (nextPage != null) {
      currentIterator = nextPage.getItems().iterator();
      nextUrl = nextPage.getNext();
    } else {
      nextUrl = null;
    }
  }
}
