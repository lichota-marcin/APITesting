package APICalls;

import JacksonModels.Response;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;


public class PostCall extends BaseCall {


    protected final CloseableHttpResponse httpResponse = callPost();
    public final Response post = (Response) deserializeObject(httpResponse);

    public PostCall() throws IOException {
    }

    protected CloseableHttpResponse callPost() throws IOException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault();) {
            HttpPost httpPost = new HttpPost(POST_URL);
            return httpClient.execute(httpPost);
        }
    }


}
