package TestNGTests;

import APICalls.DeleteCall;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import static APICalls.GetCall.callGet;


public class TestDelete extends DeleteCall {
    public TestDelete() throws IOException {
    }

    @Test(priority = 3)
    public void isResponseCodeEqualTo200() {
        int code = getResponseCode(httpResponse);
        Assert.assertEquals(code, 200 );
    }
    @Test(priority = 3)
        public void checkIfBoardExistsAfterDeletion() throws IOException {
        CloseableHttpResponse httpResponse =  callGet();
        int code = getResponseCode(httpResponse);
        Assert.assertEquals(code, 404);
        }
    }

//    @Test(priority = 3)
//    public void testId() throws IOException {
//        String id = get.getId();
//        Assert.assertEquals(PropertyManager.getId(), id);
//    }


