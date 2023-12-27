package AssertJTests;

import APICalls.DeleteCall;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.annotations.Test;

import java.io.IOException;

import static APICalls.GetCall.callGet;
import static org.assertj.core.api.Assertions.assertThat;

public class TestDelete extends DeleteCall {

    public TestDelete() throws IOException {
    }

    @Test(priority = 3)
    public void isResponseCodeEqualTo200() {
        int code = getResponseCode(httpResponse);
        assertThat(code).isEqualTo(200);
    }
    @Test(priority = 3)
    public void checkIfBoardExistsAfterDeletion() throws IOException {
        CloseableHttpResponse httpResponse =  callGet();
        int code = getResponseCode(httpResponse);
        assertThat(code).isEqualTo(404);
    }
}

