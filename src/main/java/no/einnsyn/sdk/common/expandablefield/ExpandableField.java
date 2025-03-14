package no.einnsyn.sdk.common.expandablefield;

import no.einnsyn.sdk.common.entity.HasId;
import no.einnsyn.sdk.common.entity.Resource;
import no.einnsyn.sdk.common.exceptions.models.EInnsynException;
import no.einnsyn.sdk.net.ApiRequestMethod;
import no.einnsyn.sdk.net.ApiRequester;

/**
 * A class representing "expandable fields" in the API. These are fields that are either an ID or an
 * object. This is inspired by Stripe's API: https://stripe.com/docs/api/expanding_objects
 *
 * <p>An ExpandableField will always contain an ID, and may contain an object if it has been
 * expanded.
 */
public class ExpandableField<T> extends Resource {

  private T expandedObject = null;
  private String id;
  private final Class<T> clazz;

  public ExpandableField(String id) {
    this.id = id;
    this.clazz = null;
  }

  public ExpandableField(T object) {
    this.expandedObject = object;
    this.clazz = null;
  }

  public ExpandableField(Class<T> clazz, String id) {
    this.clazz = clazz;
    this.id = id;
  }

  public ExpandableField(Class<T> clazz, T object) {
    this.clazz = clazz;
    this.expandedObject = object;
  }

  public boolean isExpanded() {
    return expandedObject != null;
  }

  public T getExpanded() {
    return expandedObject;
  }

  public T expand() throws EInnsynException {
    if (expandedObject != null) {
      return expandedObject;
    }

    ApiRequester requester = this.getRequester();
    if (clazz != null && id != null && requester != null) {
      String url = "/" + clazz.getSimpleName().toLowerCase() + "/" + id;
      expandedObject = requester.request(ApiRequestMethod.GET, url, null, null, null, clazz);
      return expandedObject;
    }

    return null;
  }

  public String getId() {
    if (id == null && expandedObject != null && expandedObject instanceof HasId) {
      return ((HasId) expandedObject).getId();
    }
    return id;
  }
}
