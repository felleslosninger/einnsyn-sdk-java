package no.einnsyn.sdk.net.parsing;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.Base;

public class ExpandableFieldTypeAdapter<T extends Base> extends TypeAdapter<ExpandableField<T>> {
  private final Class<T> clazz;
  private final Gson gson;

  public ExpandableFieldTypeAdapter(Class<T> clazz, Gson gson) {
    this.clazz = clazz;
    this.gson = gson;
  }

  @Override
  public void write(JsonWriter out, ExpandableField<T> src) throws IOException {
    if (src == null) {
      out.nullValue();
    } else if (src.getId() != null) {
      out.value(src.getId());
    } else if (src.isExpanded()) {
      gson.toJson(src.getExpanded(), clazz, out);
    } else {
      out.nullValue();
    }
  }

  @Override
  public ExpandableField<T> read(JsonReader in) throws IOException {
    JsonElement json = Streams.parse(in);
    if (json.isJsonNull()) {
      return null;
    }

    // If we've parsed a string, it's an ID.
    if (json.isJsonPrimitive()) {
      JsonPrimitive jsonPrimitive = json.getAsJsonPrimitive();
      if (jsonPrimitive.isString()) {
        return new ExpandableField<>(clazz, jsonPrimitive.getAsString());
      } else {
        throw new JsonParseException("ExpandableField is a non-string primitive type.");
      }
    }

    // If we've parsed an object, it's the expanded object.
    else if (json.isJsonObject()) {
      T object = gson.fromJson(json, clazz);
      return new ExpandableField<>(clazz, object);
    }

    // If it's not a string or an object, it's an error. This should never happen unless the client
    // library is out of sync with the API spec.
    else {
      throw new JsonParseException("ExpandableField is a non-object, non-primitive type.");
    }
  }
}
