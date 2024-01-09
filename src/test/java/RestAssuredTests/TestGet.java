package RestAssuredTests;

import APICalls.GetCall;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

import static org.hamcrest.Matchers.equalTo;

public class TestGet extends GetCall {

    public TestGet() throws IOException {
    }

    @Test(priority = 1)
    public void responseIdShouldMatchExpected() throws IOException {
        RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
        Response response = httpRequest.get(GET_URL);
        response.then().assertThat().body("id", equalTo(PropertyManager.getId()));
    }

    @Test(priority = 1)
    public void responseNameShouldBeTestBoard() {
        RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
        Response response = httpRequest.get(GET_URL);
        response.then().assertThat().body("name", equalTo("test_board"));
    }

    @Test(priority = 1)
    public void checkIfResponseCodeOfGetIsEqualTo200() {
        RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
        Response response = httpRequest.get(GET_URL);
        response.then().statusCode(200);
    }

    @Test(priority = 1)
    public void checkIfPrefsPermissionLevelEqualsPrivate() {
        RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
        Response response = httpRequest.get(GET_URL);
        response.then().assertThat().body("prefs.permissionLevel", equalTo("private"));

    }
}

