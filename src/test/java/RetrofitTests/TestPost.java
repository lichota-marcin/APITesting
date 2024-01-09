package RetrofitTests;

import APICalls.RetrofitPostCall;
import RetrofitModels.ResponseModel;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import retrofit2.Response;
import utility.PropertyManager;

import java.io.IOException;

import static utility.PropertyManager.setNewId;

public class TestPost extends RetrofitPostCall {
    Response<ResponseModel> createBoardResponse = createBoard();

    public TestPost() throws IOException {
    }

    @BeforeClass
    public void setup() throws IOException {
        String id = createBoardResponse.body().getId();
        setNewId(id);
    }

    @Test(priority = 0)
    public void responseCodeShouldBe200() throws IOException {
        Assert.assertEquals(createBoardResponse.code(), 200, "Response code is not 200");
    }

    @Test(priority = 0)
    public void responseIdShouldMatchExpected() throws IOException {
        Assert.assertEquals(createBoardResponse.body().getId(), PropertyManager.getId(), "Id does not match expected");
    }

    @Test(priority = 0)
    public void responseNameShouldBeTestBoard() throws IOException {
        Assert.assertEquals(createBoardResponse.body().getName(), "test_board", "Board's name is not test_board");
    }
}
