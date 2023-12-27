package APICalls;

import JacksonModels.Response;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


import java.io.*;
import java.util.Properties;

import static utility.PropertyManager.getProperties;

public class PostCall extends BaseCall {

    protected static String POST_URL = "https://api.trello.com/1/boards/?name=test_board&key="+ apiKey+"&token="+ apiToken;
    protected final CloseableHttpResponse httpResponse =  callPost();
    protected final Response post = (Response) deserializeObject(httpResponse);

    public PostCall() throws IOException {
    }

    protected static CloseableHttpResponse callPost() throws IOException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault();) {
            HttpPost httpPost = new HttpPost(POST_URL);
            return  httpClient.execute(httpPost);
        }
    }
    protected void setNewID() throws IOException {
        Properties props = getProperties();
        String propertiesPath = "/Users/mlichota/IdeaProjects/APITesting/src/main/resources/app.poperties";
        String newId = post.getId();
        props.setProperty("Id",newId);
        var writer = new FileWriter(propertiesPath);
        props.store(writer,"");
    }
}
