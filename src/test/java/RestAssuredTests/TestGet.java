package RestAssuredTests;

import APICalls.GetCall;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.PropertyManager;

import static org.hamcrest.Matchers.equalTo;


import java.io.IOException;

public class TestGet extends GetCall {
    public TestGet() throws IOException {
    }


    static RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
    static Response response = httpRequest.get(GET_URL);

    @Test
    public static void testId() throws IOException {
        response.then().assertThat().body("id", equalTo(PropertyManager.getId()));
    }
    @Test
    public static void testName() throws IOException {
        response.then().assertThat().body("name", equalTo("test_board"));
    }
    @Test
    public static void checkIfResponseCodeOfGetIsEqualTo200(){
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public static void checkIfPrefsPermissionLevelEqualsPrivate(){
        response.then().assertThat().body("prefs.permissionLevel", equalTo("private"));
        // .log().all();
        //.statusCode(200).
    }
    }

