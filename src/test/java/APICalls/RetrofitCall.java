//This file is failed attempt to make a working call to Trelo API using Retrofit
//After multiple attempts and making a successful call to other API in SimpleRetrofitForChecking Package
//I believe there is something wrong in the response of Trelo API
//Whole file is a mess because I don't see a point in fixing and reformatting code that doesn't even work

package APICalls;

import RetrofitModels.ResponseModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.*;


import java.io.IOException;

public class RetrofitCall extends BaseCall {
    protected static String POST_URL = "https://api.trello.com/1/boards/?name=test_board&key="+ apiKey+"&token="+ apiToken;

    static String URL = "https://api.trello.com/1/boards/?name=test_board&key=d1290b394d0d3023ee548174c8fb3d85&token=ATTAb18cc18128f5aa873a3f6158fde484c048479039858026047b2feaa21ba56846B0D5784C";
    interface ApiInterface{
        @GET("/")
        Call<ResponseModel> getBoard(@Query("id") String id, @Query("apiKey") String apiKey, @Query("apiToken") String apiToken );

        @POST("/?name=test_board")
        Call<ResponseModel> postBoard(@Query("apiKey") String apiKey, @Query("apiToken") String apiToken );}

     class ApiClient {
         static  Gson gson = new GsonBuilder()
                 .setLenient()
                 .create();
         public static String BASE_URL = "https://api.trello.com/1/boards/";
         private static Retrofit retrofit;

         public static Retrofit getClient() {
             if (retrofit == null) {
                 retrofit = new Retrofit.Builder()
                         .baseUrl(BASE_URL)
                         .addConverterFactory(GsonConverterFactory.create(gson))
                         .build();
             }
             return retrofit;
         }
     }


    public static void makeRequest() throws IOException {

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ResponseModel> call = apiService.getBoard("6582e09ad85e7cb37384f9b4","d1290b394d0d3023ee548174c8fb3d85","ATTAb18cc18128f5aa873a3f6158fde484c048479039858026047b2feaa21ba56846B0D5784C");
        call.enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                ResponseModel a = response.body();
                System.out.println(a);
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                System.out.println("Response = " + t);
            }


        });


    }
    public static void main(String[] args) throws IOException {
        makeRequest();
        //this method throws: com.google.gson.JsonSyntaxException: java.lang.IllegalStateException: Expected BEGIN_OBJECT but was STRING at line 1 column 1 path $
        //json response was validated using https://jsonformatter.curiousconcept.com/#
        //can't get past this error no matter what, I guess this API response is somewhat faulty and retrofit methods can't parse it or something
    }

    }

