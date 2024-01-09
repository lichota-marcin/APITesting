package RetrofitTests;

import APICalls.RetrofitPutCall;
import RetrofitModels.RequestModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

public class TestPut extends RetrofitPutCall {
    String id = PropertyManager.getId();
    String name = "changed_board";
    RequestModel requestModel = new RequestModel(id, name);

    public TestPut() throws IOException {
    }

    @Test(priority = 2)
    public void responseCodeShouldBe200() throws IOException {
        Assert.assertEquals(updateBoard(requestModel).code(), 200, "Response code is not 200");
    }

    @Test(priority = 2)
    public void responseIdShouldMatchExpected() throws IOException {
        Assert.assertEquals(updateBoard(requestModel).body().getId(), PropertyManager.getId(), "Id does not match expected");
    }

    @Test(priority = 2)
    public void responseNameShouldBeChangedBoard() throws IOException {
        Assert.assertEquals(updateBoard(requestModel).body().getName(), "changed_board", "Board's name is not changed_board");
    }
}
