package RetrofitTests;

import APICalls.RetrofitGetCall;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

public class TestGet extends RetrofitGetCall {

    @Test(priority = 1)
    public void responseCodeShouldBe200() throws IOException {
        Assert.assertEquals(getBoard().code(), 200, "Response code is not 200");
    }

    @Test(priority = 1)
    public void responseIdShouldMatchExpected() throws IOException {
        Assert.assertEquals(getBoard().body().getId(), PropertyManager.getId(), "Id does not match expected");
    }

    @Test(priority = 1)
    public void responseNameShouldBeTestBoard() throws IOException {
        Assert.assertEquals(getBoard().body().getName(), "test_board", "Board's name is not test_board");
    }


}
