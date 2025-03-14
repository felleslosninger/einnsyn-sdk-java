package no.einnsyn.sdk.net.parsing;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import no.einnsyn.sdk.common.entity.Resource;
import no.einnsyn.sdk.net.ApiRequester;

public class ResourceTypeAdapterFactory implements TypeAdapterFactory {
  private final ApiRequester apiRequester;

  public ResourceTypeAdapterFactory(ApiRequester apiRequester) {
    this.apiRequester = apiRequester;
  }

  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {

    if (!Resource.class.isAssignableFrom(type.getRawType())) {
      return null;
    }

    final TypeAdapter<T> delegate = gson.getDelegateAdapter(this, type);

    return new TypeAdapter<T>() {
      @Override
      public void write(JsonWriter out, T value) throws IOException {
        delegate.write(out, value);
      }

      @SuppressWarnings("unchecked")
      @Override
      public T read(JsonReader in) throws IOException {
        Resource result = (Resource) delegate.read(in);
        result.setRequester(apiRequester);
        return (T) result;
      }
    };
  }
}
