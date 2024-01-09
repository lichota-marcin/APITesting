package APICalls;

import RetrofitModels.RequestModel;
import RetrofitModels.ResponseModel;
import retrofit2.Call;
import retrofit2.Response;
import utility.PropertyManager;

import java.io.IOException;

public class RetrofitPutCall extends RetrofitCall {
    public Response<ResponseModel> updateBoard(RequestModel requestModel) throws IOException {
        Call<ResponseModel> createUserResponseCall = apiInterface.updateBoard(
                PropertyManager.getId(),
                PropertyManager.getApiKey(),
                PropertyManager.getApiToken(),
                requestModel);
        return createUserResponseCall.execute();
    }
}
