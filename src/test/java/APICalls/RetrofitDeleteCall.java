package APICalls;

import RetrofitModels.ResponseModel;
import retrofit2.Call;
import retrofit2.Response;
import utility.PropertyManager;

import java.io.IOException;

public class RetrofitDeleteCall extends RetrofitCall {
    public Response<ResponseModel> deleteBoard() throws IOException {
        Call<ResponseModel> createUserResponseCall = apiInterface.deleteBoard(
                PropertyManager.getId(),
                PropertyManager.getApiKey(),
                PropertyManager.getApiToken());
        return createUserResponseCall.execute();
    }

    public Response<ResponseModel> getBoard() throws IOException {
        Call<ResponseModel> createUserResponseCall = apiInterface.getBoard(
                PropertyManager.getId(),
                PropertyManager.getApiKey(),
                PropertyManager.getApiToken());
        return createUserResponseCall.execute();
    }
}
