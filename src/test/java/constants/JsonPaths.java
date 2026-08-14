package constants;

import lombok.experimental.UtilityClass;

// Use these only for trivial single-field lookups (e.g. grabbing the created
// pet's id right after a POST). For anything with nested fields - like a pet's
// category name - deserialize the response into a Model class (see models/) and
// assert on that instead of chaining JsonPath lookups (e.g. avoid
// .body("category.name", equalTo(...))-style assertions). See the
// "Deserialization over JSONPath" requirement.
@UtilityClass
public class JsonPaths {
    // TODO: add missing JSON paths for properties of responses for Petstore API

    // httpbin.org JSON paths
    // TODO: add missing JSON paths for properties of responses for httpbin.org API
}
