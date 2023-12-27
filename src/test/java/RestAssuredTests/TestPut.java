package RestAssuredTests;

import APICalls.PutCall;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

import static org.hamcrest.Matchers.equalTo;

public class TestPut extends PutCall {

    public TestPut() throws IOException {
    }

    static RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
    static Response response = httpRequest.put(PUT_URL);

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
}
