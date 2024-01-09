package RestAssuredTests;

import APICalls.PutCall;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

import static org.hamcrest.Matchers.equalTo;

public class TestPut extends PutCall {


    public TestPut() throws IOException {
    }


    @Test(priority = 2)
    public void responseIdShouldMatchExpected() throws IOException {
        RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
        Response response = httpRequest.put(PUT_URL);
        response.then().assertThat().body("id", equalTo(PropertyManager.getId()));
    }

    @Test(priority = 2)
    public void responseNameShouldBeChangedBoard() {
        RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
        Response response = httpRequest.put(PUT_URL);
        response.then().assertThat().body("name", equalTo("changed_board"));
    }

    @Test(priority = 2)
    public void checkIfResponseCodeOfPutIsEqualTo200() {
        RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
        Response response = httpRequest.put(PUT_URL);
        response.then().statusCode(200);
    }
}
