package RestAssuredTests;

import APICalls.BaseCall;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestDelete extends BaseCall {
    protected String DELETE_URL = "https://api.trello.com/1/boards/" + id + "?key=" + apiKey + "&token=" + apiToken;
    protected String GET_URL = "https://api.trello.com/1/boards/" + id + "?key=" + apiKey + "&token=" + apiToken;

    @Test(priority = 3)
    public void responseCodeShouldBe200() {
        RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
        Response response = httpRequest.delete(DELETE_URL);
        response.then().statusCode(200);
    }

    @Test(priority = 4)
    public void checkIfBoardExistsAfterDeletion() {
        RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
        Response checkIfBoardExist = httpRequest.get(GET_URL);
        int statusCode = checkIfBoardExist.getStatusCode();
        Assert.assertEquals(statusCode, 404);
    }
}
