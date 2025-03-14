package no.einnsyn.sdk;

import java.util.function.Function;
import no.einnsyn.sdk.net.ApiRequester;
import no.einnsyn.sdk.utils.VersionUtil;

public class EInnsynClient extends EInnsynClientBase {

  public static String VERSION = VersionUtil.getVersion();

  public EInnsynClient(String apiKey) {
    this(b -> b.apiKey(apiKey));
  }

  public EInnsynClient(String baseUrl, String apiKey) {
    this(b -> b.apiKey(apiKey).baseUrl(baseUrl));
  }

  public EInnsynClient(Function<EInnsynOptions.Builder, EInnsynOptions.Builder> builderFunc) {
    this(builderFunc.apply(new EInnsynOptions.Builder()).build());
  }

  public EInnsynClient(EInnsynOptions options) {
    super(new ApiRequester(options));
  }
}
