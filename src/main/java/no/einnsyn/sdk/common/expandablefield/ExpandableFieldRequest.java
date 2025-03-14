package no.einnsyn.sdk.common.expandablefield;

import no.einnsyn.sdk.common.entity.HasId;

public class ExpandableFieldRequest<T extends HasId> {

  private T expandedObject = null;
  private String id;

  public ExpandableFieldRequest(String id) {
    this.id = id;
  }

  public ExpandableFieldRequest(T object) {
    this.expandedObject = object;
  }

  public boolean isExpanded() {
    return expandedObject != null;
  }

  public T getExpanded() {
    return expandedObject;
  }

  public String getId() {
    return id;
  }

  public String toString() {
    return id;
  }
}
