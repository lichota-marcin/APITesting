package RetrofitTests;

import APICalls.RetrofitDeleteCall;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestDelete extends RetrofitDeleteCall {
    @Test(priority = 3)
    public void responseCodeShouldBe200() throws IOException {
        Assert.assertEquals(deleteBoard().code(), 200, "Response code is not 200");
    }

    @Test(priority = 4)
    public void checkIfBoardExistsAfterDeletion() throws IOException {
        Assert.assertEquals(getBoard().code(), 404, "Response code is not 404");
    }
}
