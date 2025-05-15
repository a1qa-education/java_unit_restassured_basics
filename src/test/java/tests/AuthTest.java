package tests;

import org.testng.annotations.Test;
import utils.RandomUtils;

public class AuthTest {
    private static final String API_URL = "https://httpbin.org";

    @Test(description = "Log in with basic auth - 200 Success")
    public void logInWithBasicAuth() {
        String username = RandomUtils.getRandomAlphabeticString();
        String password = RandomUtils.getRandomAlphabeticString();

        // TODO: complete the test case

        /*
         Since we use two different APIs we cannot use the same BaseTest for all the tests currently.
         You can include base URI right in the test methods. Better structure supporting many APIs
         will be shown in the next units.
         */
    }

    @Test(description = "Log in with a bearer token - 200 Success")
    public void logInWithBearerToken() {
        String token = "Bearer " + RandomUtils.getRandomAlphabeticString();

        // TODO: complete the test case
    }
}
