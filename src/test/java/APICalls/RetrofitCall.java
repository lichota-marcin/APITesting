package APICalls;

import RetrofitModels.RequestModel;
import RetrofitModels.ResponseModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.*;

import static APICalls.RetrofitCall.ApiClient.getClient;


public class RetrofitCall {
    public ApiInterface apiInterface = getClient();

    public interface ApiInterface {
        @GET("boards/{id}")
        Call<ResponseModel> getBoard(@Path("id") String id, @Query("key") String apiKey, @Query("token") String apiToken);

        @POST("boards/")
        Call<ResponseModel> createBoard(@Query("name") String name, @Query("key") String apiKey, @Query("token") String apiToken);

        @PUT("boards/{id}")
        Call<ResponseModel> updateBoard(@Path("id") String id, @Query("key") String apiKey, @Query("token") String apiToken, @Body RequestModel requestModel);

        @DELETE("boards/{id}")
        Call<ResponseModel> deleteBoard(@Path("id") String id, @Query("key") String apiKey, @Query("token") String apiToken);
    }

    public class ApiClient {
        public static String BASE_URL = "https://api.trello.com/1/";
        static Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        private static Retrofit retrofit;

        public static ApiInterface getClient() {
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create(gson))
                        .build();
            }
            return retrofit.create(ApiInterface.class);
        }
    }


}
