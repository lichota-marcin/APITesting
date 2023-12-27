package TestNGTests;

import java.io.IOException;
import APICalls.GetCall;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.PropertyManager;

public class TestGet extends GetCall {
    public TestGet() throws IOException {
    }

    @Test ( priority = 1 )
    public void isResponseCodeEqualTo200() {
        int code = getResponseCode(httpResponse);
        Assert.assertEquals(code, 200 );
    }
    @Test ( priority = 1 )
    public void testId() throws IOException {
        String id = get.getId();
        Assert.assertEquals(id, PropertyManager.getId() );
    }
    @Test ( priority = 1 )
    public void testName(){
        String name = get.getName();
        Assert.assertEquals(name, "test_board");
    }
}




