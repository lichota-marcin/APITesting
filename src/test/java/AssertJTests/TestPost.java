package AssertJTests;

import APICalls.PostCall;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPost extends PostCall {

    public TestPost() throws IOException {
    }

    @BeforeClass
    public void setup() throws IOException {
        String newId = post.getId();
        PropertyManager.setNewId(newId);
    }


    @Test(priority = 0)
    public void responseCodeShouldBe200() throws IOException {
        int code = getResponseCode(httpResponse);
        assertThat(code).as("Check if response code is equal to 200").isEqualTo(200);
    }

    @Test(priority = 0)
    public void responseIdShouldMatchExpected() throws IOException {
        String id = post.getId();
        assertThat(id).as("Check if id matches expected").isEqualTo(PropertyManager.getId());
    }

    @Test(priority = 0)
    public void responseNameShouldBeTestBoard() {
        String name = post.getName();
        assertThat(name).as("Check if name is test_board").isEqualTo("test_board");

    }
}
