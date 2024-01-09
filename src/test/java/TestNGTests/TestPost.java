package TestNGTests;

import APICalls.PostCall;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

public class TestPost extends PostCall {

    public TestPost() throws IOException {
    }

    @BeforeClass
    public void setup() throws IOException {
        String newId = post.getId();
        PropertyManager.setNewId(newId);
    }


    @Test(priority = 0)
    public void responseCodeShouldBe200() throws IOException {
        int code = getResponseCode(httpResponse);
        Assert.assertEquals(code, 200, "Response code is not 200");
    }

    @Test(priority = 0)
    public void responseIdShouldMatchExpected() throws IOException {
        String id = post.getId();
        Assert.assertEquals(id, PropertyManager.getId(), "Id does not match expected");
    }

    @Test(priority = 0)
    public void responseNameShouldBeTestBoard() {
        String name = post.getName();
        Assert.assertEquals(name, "test_board", "Board's name is not test_board");
    }


}




