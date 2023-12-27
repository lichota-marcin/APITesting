package RestAssuredTests;

import APICalls.DeleteCall;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class TestDelete extends DeleteCall {

    static RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
    static Response response = httpRequest.delete(DELETE_URL);
    public TestDelete() throws IOException {
    }
    @Test
    public static void isResponseCodeEqualTo200(){
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void checkIfBoardExistsAfterDeletion(){
        int statusCode = TestGet.response.getStatusCode();
        Assert.assertEquals(statusCode, 404);
    }
}
