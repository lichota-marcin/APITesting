package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {
    static String propertiesPath = "/Users/mlichota/IdeaProjects/APITesting/src/main/resources/app.poperties";

    static public Properties getProperties() throws IOException {

        Properties appProps = new Properties();
        appProps.load(new FileInputStream(propertiesPath));
        return appProps;
    }

    static public String getApiKey() throws IOException {
        Properties appProps = getProperties();
        return appProps.getProperty("apikey");
    }

    static public String getApiToken() throws IOException {
        Properties appProps = getProperties();
        return appProps.getProperty("apitoken");
    }

    static public String getId() throws IOException {
        Properties appProps = getProperties();
        return appProps.getProperty("Id");
    }
}
