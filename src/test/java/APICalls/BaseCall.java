package APICalls;

import JacksonModels.Response;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import utility.PropertyManager;

import java.io.IOException;


public class BaseCall {


    protected String GET_URL = "https://api.trello.com/1/boards/" + id + "?key=" + apiKey + "&token=" + apiToken;
    protected String POST_URL = "https://api.trello.com/1/boards/?name=test_board&key=" + apiKey + "&token=" + apiToken;
    protected String PUT_URL = "https://api.trello.com/1/boards/" + id + "?key=" + apiKey + "&token=" + apiToken + "&name=changed_board";
    protected String DELETE_URL = "https://api.trello.com/1/boards/" + id + "?key=" + apiKey + "&token=" + apiToken;



    public static final String apiKey, apiToken, id;

    static {
        try {
            apiKey = PropertyManager.getApiKey();
            apiToken = PropertyManager.getApiToken();
            id = PropertyManager.getId();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected static int getResponseCode(CloseableHttpResponse httpResponse) throws IOException {
        int responseCode = httpResponse.getStatusLine().getStatusCode();
        httpResponse.close();
        return responseCode;

    }

    protected static Object deserializeObject(CloseableHttpResponse httpResponse) throws IOException {
        String response = EntityUtils.toString(httpResponse.getEntity());
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(response, Response.class);
    }
}
