package AssertJTests;

import APICalls.DeleteCall;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class TestDelete extends DeleteCall {

    public TestDelete() throws IOException {
    }

    @Test(priority = 3)
    public void responseCodeShouldBe200() throws IOException {
        int code = getResponseCode(httpResponse);
        assertThat(code).as("Check if response code is equal to 200").isEqualTo(200);
    }

    @Test(priority = 4)
    public void checkIfBoardExistsAfterDeletion() throws IOException {
        CloseableHttpResponse httpResponse = checkIfBoardExists();
        int code = getResponseCode(httpResponse);
        assertThat(code).as("Check if response code is equal to 404").isEqualTo(404);
    }
}

