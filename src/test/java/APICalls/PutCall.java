package APICalls;

import JacksonModels.Response;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class PutCall extends BaseCall{

    protected static String PUT_URL = "https://api.trello.com/1/boards/"+Id+"?key="+ apiKey+"&token="+ apiToken;
    protected final CloseableHttpResponse httpResponse =  callPut();
    protected final Response put = (Response) deserializeObject(httpResponse);

    public PutCall() throws IOException {
    }
    protected static CloseableHttpResponse callPut() throws IOException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault();) {
            HttpPut httpPut  = new HttpPut(PUT_URL);
            return  httpClient.execute(httpPut);
        }


    }
}

