package RestAssuredTests;

import APICalls.BaseCall;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

import static org.hamcrest.Matchers.equalTo;
import static utility.PropertyManager.setNewId;

public class TestPost extends BaseCall {
    protected String POST_URL = "https://api.trello.com/1/boards/?name=test_board&key=" + apiKey + "&token=" + apiToken;

    Response response;

    @BeforeClass
    public void setup() throws IOException {
        response = RestAssured.given().when().header("Content-Type", "application/json").post(POST_URL);
        String id = response.then().extract().path("id");
        setNewId(id);
    }

    @Test(priority = 0)
    public void responseIdShouldMatchExpected() throws IOException {
        response.then().assertThat().body("id", equalTo(PropertyManager.getId()));
    }

    @Test(priority = 0)
    public void responseNameShouldBeTestBoard() {
        response.then().assertThat().body("name", equalTo("test_board"));
    }

    @Test(priority = 0)
    public void checkIfResponseCodeOfGetIsEqualTo200() {
        response.then().statusCode(200);
    }
}
