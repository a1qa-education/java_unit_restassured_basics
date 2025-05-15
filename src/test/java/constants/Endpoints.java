package constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Endpoints {
    public final String BASE_PATH = "/v2";
    public final String PET = "/pet";
    public final String PET_BY = "%s/{%s}".formatted(PET, Params.PET_ID);
    // TODO: add missing Petstore endpoints

    // httpbin.org endpoints
    public final String BASIC_AUTH = "/basic-auth/%s/%s";
    // TODO: add missing httpbin.org endpoints
}
