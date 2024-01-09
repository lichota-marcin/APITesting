package AssertJTests;

import APICalls.GetCall;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class TestGet extends GetCall {

    public TestGet() throws IOException {
    }

    @Test(priority = 1)
    public void responseCodeShouldBe200() throws IOException {
        int code = getResponseCode(httpResponse);
        assertThat(code).as("Check if response code is equal to 200").isEqualTo(200);
    }

    @Test(priority = 1)
    public void responseIdShouldMatchExpected() throws IOException {
        String id = get.getId();
        assertThat(id).as("Check if id matches expected").isEqualTo(PropertyManager.getId());

    }

    @Test(priority = 1)
    public void responseNameShouldBeTestBoard() {
        String name = get.getName();
        assertThat(name).as("Check if name is test_board").isEqualTo("test_board");

    }
}
