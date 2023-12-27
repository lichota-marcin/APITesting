package TestNGTests;

import APICalls.PutCall;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

public class TestPut extends PutCall {


    public TestPut() throws IOException {
    }

    @Test(priority = 2)
    public void isResponseCodeEqualTo200() {
        int code = getResponseCode(httpResponse);
        Assert.assertEquals(code, 200 );
    }

    @Test(priority = 2)
    public void testId() throws IOException {
        String id = put.getId();
        Assert.assertEquals(id, PropertyManager.getId());
    }

    @Test(priority = 2)
    public void testName() {
        String name = put.getName();
        Assert.assertEquals(name, "test_board");
    }
}
