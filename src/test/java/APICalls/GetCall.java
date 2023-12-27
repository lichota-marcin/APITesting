package APICalls;

import JacksonModels.Response;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


import java.io.IOException;

public class GetCall extends BaseCall {
    protected static String GET_URL = "https://api.trello.com/1/boards/"+Id+"?key="+ apiKey+"&token="+ apiToken;
    protected final CloseableHttpResponse httpResponse =  callGet();
    protected final Response get = (Response) deserializeObject(httpResponse);

    public GetCall() throws IOException {
    }

    public static CloseableHttpResponse callGet() throws IOException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault();) {
            HttpGet httpGet = new HttpGet(GET_URL);
            return  httpClient.execute(httpGet);
        }
    }

    public static void main(String[] args) {
        System.out.println(GET_URL);
    }

}
