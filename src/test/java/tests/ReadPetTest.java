package tests;

import org.testng.annotations.Test;
import utils.RandomUtils;

public class ReadPetTest extends BaseTest {

    @Test(description = "Test Case 2 - Get a Pet by ID")
    public void getPetById() {
        // TODO: create the pet; assert status code and add its id to createdPetIds for teardown

        // TODO: retrieve the pet by id and assert status code

        // TODO: assert the retrieved pet's name matches the created pet's name
    }

    @Test(description = "Test Case 4 - Get a Pet by an Invalid ID")
    public void getPetByInvalidId() {
        String invalidId = RandomUtils.getRandomAlphabeticString();

        // TODO: send GET with the invalid id and assert status code is 400

        // Note: this will fail - the documentation says 400, the real API returns 404 (DEFECT-001).
        // Don't skip it; the failure is the point.
    }
}
