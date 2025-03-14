package no.einnsyn.sdk.net.parsing;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import no.einnsyn.sdk.common.expandablefield.ExpandableField;
import no.einnsyn.sdk.entities.base.models.Base;

public class ExpandableFieldTypeAdapterFactory implements TypeAdapterFactory {
  @SuppressWarnings("unchecked")
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
    Type type = typeToken.getType();

    if (!(type instanceof ParameterizedType)) {
      return null;
    }

    ParameterizedType paramType = (ParameterizedType) type;
    if (!ExpandableField.class.isAssignableFrom((Class<?>) paramType.getRawType())) {
      return null;
    }

    Type actualType = paramType.getActualTypeArguments()[0];
    if (!(actualType instanceof Class<?>)) {
      return null;
    }

    Class<? extends Base> clazz = (Class<? extends Base>) actualType;
    TypeAdapter<?> adapter = new ExpandableFieldTypeAdapter<>(clazz, gson);
    return (TypeAdapter<T>) adapter;
  }
}
