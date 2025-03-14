package no.einnsyn.sdk.net.parsing;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import no.einnsyn.sdk.common.responses.models.PaginatedList;
import no.einnsyn.sdk.entities.base.models.Base;

public class PaginatedListTypeAdapterFactory implements TypeAdapterFactory {

  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (!PaginatedList.class.isAssignableFrom(type.getRawType())) {
      return null;
    }

    // Get the default delegate adapter
    final TypeAdapter<T> delegate = gson.getDelegateAdapter(this, type);

    return new TypeAdapter<T>() {
      @Override
      public void write(JsonWriter out, T value) throws IOException {
        delegate.write(out, value);
      }

      @Override
      @SuppressWarnings("unchecked")
      public T read(JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
          in.nextNull();
          return null;
        }

        PaginatedList<Base> result = new PaginatedList<>();

        in.beginObject();
        while (in.hasNext()) {
          String name = in.nextName();

          if (name.equals("items")) {
            List<Base> items = new ArrayList<>();
            result.setItems(items);
            in.beginArray();
            while (in.hasNext()) {
              JsonElement itemElement = gson.fromJson(in, JsonElement.class);
              JsonObject itemObj = itemElement.getAsJsonObject();
              String entity = itemObj.get("entity").getAsString();

              // Deserialize based on type
              Class<? extends Base> clazz = EntityClassMapper.getClassFromEntity(entity);
              Base item = gson.fromJson(itemElement, clazz);
              items.add(item);
            }
            in.endArray();
          } else if (name.equals("next")) {
            result.setNext(in.nextString());
          } else if (name.equals("previous")) {
            result.setPrevious(in.nextString());
          } else {
            in.skipValue();
          }
        }
        in.endObject();
        return (T) result;
      }
    };
  }
}
