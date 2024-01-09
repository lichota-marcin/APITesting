package TestNGTests;

import APICalls.DeleteCall;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class TestDelete extends DeleteCall {
    public TestDelete() throws IOException {
    }

    @Test(priority = 3)
    public void responseCodeShouldBe200() throws IOException {
        int code = getResponseCode(httpResponse);
        Assert.assertEquals(code, 200, "Response code is not 200");
    }

    @Test(priority = 4)
    public void checkIfBoardExistsAfterDeletion() throws IOException {
        CloseableHttpResponse httpResponse = checkIfBoardExists();
        int code = getResponseCode(httpResponse);
        Assert.assertEquals(code, 404, "Response code is not 404");
    }
}



