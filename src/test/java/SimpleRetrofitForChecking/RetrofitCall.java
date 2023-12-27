package SimpleRetrofitForChecking;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public class RetrofitCall  {

    interface RequestUser{
        @GET("/api/users/{uid}")
        Call<UserData> getUser(@Path("uid") String uid);

        @POST("/api/users")
        Call<ResponsePost> postUser(@Body RequestPost requestPost);
    }

    public static void testRequest(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        RequestUser requestUser = retrofit.create(RequestUser.class);

        requestUser.postUser(new RequestPost("marcin", "intern")).enqueue(new Callback<ResponsePost>() {
            @Override
            public void onResponse(Call<ResponsePost> call, Response<ResponsePost> response) {
                System.out.println(response.body().getName());
            }

            @Override
            public void onFailure(Call<ResponsePost> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });}

    public static void main(String[] args) {
        testRequest();
    }

}