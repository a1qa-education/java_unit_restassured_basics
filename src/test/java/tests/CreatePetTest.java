package tests;

import org.testng.annotations.Test;

public class CreatePetTest extends BaseTest {
    private static final String ALLOW_METHODS_HEADER = "Access-Control-Allow-Methods";
    private static final String DELETE_METHOD = "DELETE";

    @Test(description = "Test Case 1 - Create a Pet")
    public void createPet() {
        // TODO: send the create-pet request; assert status code, content type, and ALLOW_METHODS_HEADER

        // TODO: extract the created pet's id and add it to createdPetIds for teardown

        // TODO: assert the created pet's name matches
    }
}
