package constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Endpoints {
    public final String BASE_PATH = "/v2";
    public final String PET = "/pet";
    public final String PET_BY_ID = "%s/{%s}".formatted(PET, Params.ID);
    // TODO: add missing Petstore endpoints

    // Test Case 5 (bearer auth against httpbin.org) is written from scratch -
    // add the httpbin.org base URL/endpoint yourself as part of that test.
}
