package APICalls;

import RetrofitModels.ResponseModel;
import retrofit2.Call;
import retrofit2.Response;
import utility.PropertyManager;

import java.io.IOException;

public class RetrofitPostCall extends RetrofitCall {
    public Response<ResponseModel> createBoard() throws IOException {
        Call<ResponseModel> createUserResponseCall = apiInterface.createBoard(
                "test_board",
                PropertyManager.getApiKey(),
                PropertyManager.getApiToken());
        return createUserResponseCall.execute();
    }
}
