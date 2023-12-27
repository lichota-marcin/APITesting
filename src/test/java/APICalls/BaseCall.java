package APICalls;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import JacksonModels.Response;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import utility.PropertyManager;
import java.io.IOException;

import static io.restassured.RestAssured.given;


public class BaseCall {

    public static final String apiKey;

    static {
        try {
            apiKey = PropertyManager.getApiKey();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static final String apiToken;

    static {
        try {
            apiToken = PropertyManager.getApiToken();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String Id;

    static {
        try {
            Id = PropertyManager.getId();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected static int getResponseCode(CloseableHttpResponse httpResponse ) {
        return httpResponse.getStatusLine().getStatusCode();
    }
    protected static Object deserializeObject(CloseableHttpResponse httpResponse) throws IOException {
        String response = EntityUtils.toString(httpResponse.getEntity());
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.readValue(response, Response.class);
    }
}
