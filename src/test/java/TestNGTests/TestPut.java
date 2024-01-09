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
    public void responseCodeShouldBe200() throws IOException {
        int code = getResponseCode(httpResponse);
        Assert.assertEquals(code, 200, "Response code is not 200");
    }

    @Test(priority = 2)
    public void responseIdShouldMatchExpected() throws IOException {
        String id = put.getId();
        Assert.assertEquals(id, PropertyManager.getId(), "Id does not match expected");
    }

    @Test(priority = 2)
    public void responseNameShouldBeChangedBoard() {
        String name = put.getName();
        Assert.assertEquals(name, "changed_board", "Board's name is not changed_board");
    }
}
