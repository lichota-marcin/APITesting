package APICalls;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class DeleteCall extends BaseCall {

    protected final CloseableHttpResponse httpResponse = callDelete();

    public DeleteCall() throws IOException {
    }

    protected CloseableHttpResponse callDelete() throws IOException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault();) {
            HttpDelete httpDelete = new HttpDelete(DELETE_URL);
            return httpClient.execute(httpDelete);
        }
    }

    public CloseableHttpResponse checkIfBoardExists() throws IOException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(GET_URL);
            return httpClient.execute(httpGet);
        }
    }
}
