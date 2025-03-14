package no.einnsyn.sdk.common.responses.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import no.einnsyn.sdk.common.entity.Resource;
import no.einnsyn.sdk.common.responses.PaginatedListIterator;
import no.einnsyn.sdk.entities.base.models.Base;

public class PaginatedList<T extends Base> extends Resource {

  private List<T> items = new ArrayList<>();

  public List<T> getItems() {
    return items;
  }

  public void setItems(List<T> items) {
    this.items = items;
  }

  private String next;

  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  private String previous;

  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public Iterator<T> iterator() {
    return new PaginatedListIterator<>(this, this.getRequester());
  }
}
