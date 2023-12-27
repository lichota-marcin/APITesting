package RestAssuredTests;

import APICalls.PostCall;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import static org.hamcrest.Matchers.equalTo;
import static utility.PropertyManager.getProperties;

public class TestPost extends PostCall {
    public TestPost() throws IOException {
    }

    static RequestSpecification httpRequest = RestAssured.given().when().header("Content-Type", "application/json");
    static Response response = httpRequest.post(POST_URL);

    @BeforeClass
    public void setup() throws IOException {
        Properties props = getProperties();
        String propertiesPath = "/Users/mlichota/IdeaProjects/APITesting/src/main/resources/app.poperties";
        String newId = response.then().extract().path("id");
        props.setProperty("Id",newId);
        var writer = new FileWriter(propertiesPath);
        props.store(writer,"");
        }

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
