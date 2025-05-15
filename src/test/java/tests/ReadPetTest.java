package tests;

import org.testng.annotations.Test;
import utils.RandomUtils;

public class ReadPetTest extends BaseTest {
    private static final String PET_NOT_FOUND_RESPONSE_MESSAGE = "Pet not found";

    @Test(description = "Get a pet by id - 200 Success")
    public void getPetById() {
        // TODO: complete the test case

        /*
         A wait between POST and GET requests might be needed to wait for a pet to be saved before accessing it.
         As the main goal of this unit is to learn RestAssured, you may mock this wait so far by any means,
         but think how we can handle this situation effectively, we'll implement it in the next unit.
         */
    }

    @Test(description = "Get a non-existing pet by id - 404 Not Found")
    public void getNonExistingPetById() {
        long nonExistingId = RandomUtils.getRandomLong();

        // TODO: complete the test case

        /*
         Because of the mock API service limits, we cannot get a vacant pet id from the service.
         There is a chance of generating an existing id using a randomizer. On real projects,
         a vacant id will be retrieved by requests.
         */
    }

    @Test(description = "Get a pet by invalid id - 400 Bad Request")
    public void getPetByInvalidId() {
        String invalidId = RandomUtils.getRandomAlphabeticString();

        // TODO: complete the test case

        /*
         This test will fail due to a defect. By the documentation,
         it should return status code 400, but it returns status code 404.
         */
    }
}
