package no.einnsyn.sdk.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class VersionUtil {
  public static String getVersion() {
    Properties properties = new Properties();
    try (InputStream inputStream = VersionUtil.class.getResourceAsStream("/version.properties")) {
      if (inputStream != null) {
        properties.load(inputStream);
        return properties.getProperty("app.version", "Unknown");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return "Unknown";
  }
}
