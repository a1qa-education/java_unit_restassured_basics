package tests;

import constants.Endpoints;
import constants.Params;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import models.Pet;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public abstract class BaseTest {
    private static final String API_URL = "https://petstore.swagger.io";
    protected final List<Long> createdPetIds = new ArrayList<>();
    protected Pet pet;

    @BeforeMethod
    public void generatePet() {
        pet = new Pet();
        pet.setName(RandomUtils.getRandomAlphabeticString());
    }

    @AfterMethod
    public void deleteCreatedPets() {
        createdPetIds.forEach(this::deletePetById);
    }

    protected void deletePetById(Long petId) {
        given()
                .spec(getBaseReqSpec())
                .pathParam(Params.PET_ID, petId)
                .when()
                .delete(Endpoints.PET_BY);
    }

    protected RequestSpecification getBaseReqSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(API_URL)
                .setBasePath(Endpoints.BASE_PATH)
                .setAccept(ContentType.JSON)
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();
    }
}
