package AssertJTests;

import APICalls.PutCall;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPut extends PutCall {

    public TestPut() throws IOException {
    }

    @Test(priority = 2)
    public void responseCodeShouldBe200() throws IOException {
        int code = getResponseCode(httpResponse);
        assertThat(code).as("Check if response code is equal to 200").isEqualTo(200);
    }

    @Test(priority = 2)
    public void responseIdShouldMatchExpected() throws IOException {
        String id = put.getId();
        assertThat(id).as("Check if id matches expected").isEqualTo(PropertyManager.getId());
    }

    @Test(priority = 2)
    public void responseNameShouldBeChangedBoard() {
        String name = put.getName();
        assertThat(name).as("Check if name is changed_board").isEqualTo("changed_board");

    }
}
