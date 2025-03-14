package no.einnsyn.sdk.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class QuerystringSerializer {

  private static final Gson gson = new Gson();

  public static String serialize(Object obj) {
    if (obj == null) {
      return "";
    }
    JsonElement jsonObject = gson.toJsonTree(obj);
    StringBuilder queryString = new StringBuilder();
    flatten(jsonObject, "", queryString);
    return "?" + queryString.toString();
  }

  private static void flatten(JsonElement jsonElement, String prefix, StringBuilder queryString) {
    for (String key : jsonElement.getAsJsonObject().keySet()) {
      JsonElement value = jsonElement.getAsJsonObject().get(key);
      if (value.isJsonObject()) {
        flatten(value, prefix + key + ".", queryString);
      } else if (value.isJsonArray()) {
        for (JsonElement arrayObject : value.getAsJsonArray()) {
          if (arrayObject.isJsonObject()) {
            flatten(arrayObject, prefix + key + ".", queryString);
          } else {
            append(queryString, prefix + key, arrayObject.getAsString());
          }
        }
      } else {
        append(queryString, prefix + key, value.getAsString());
      }
    }
  }

  private static void append(StringBuilder queryString, String key, String value) {
    if (queryString.length() != 0) {
      queryString.append("&");
    }
    try {
      queryString
          .append(URLEncoder.encode(key, StandardCharsets.UTF_8.toString()))
          .append("=")
          .append(URLEncoder.encode(value, StandardCharsets.UTF_8.toString()));
    } catch (Exception e) {
      // Ignore
    }
  }
}
