package APICalls;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class DeleteCall extends BaseCall {

    protected static String DELETE_URL = "https://api.trello.com/1/boards/" + Id + "?key=" + apiKey + "&token=" + apiToken;
    protected final CloseableHttpResponse httpResponse = callDelete();


    public DeleteCall() throws IOException {
    }

    protected static CloseableHttpResponse callDelete() throws IOException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault();) {
            HttpDelete httpDelete = new HttpDelete(DELETE_URL);
            return httpClient.execute(httpDelete);
        }
    }
}
