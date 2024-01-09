package TestNGTests;

import APICalls.GetCall;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

public class TestGet extends GetCall {
    public TestGet() throws IOException {
    }

    @Test(priority = 1)
    public void responseCodeShouldBe200() throws IOException {
        int code = getResponseCode(httpResponse);
        Assert.assertEquals(code, 200, "Response code is not 200");
    }

    @Test(priority = 1)
    public void responseIdShouldMatchExpected() throws IOException {
        String id = get.getId();
        Assert.assertEquals(id, PropertyManager.getId(), "Id does not match expected");
    }

    @Test(priority = 1)
    public void responseNameShouldBeTestBoard() {
        String name = get.getName();
        Assert.assertEquals(name, "test_board", "Board's name is not test_board");
    }
}




