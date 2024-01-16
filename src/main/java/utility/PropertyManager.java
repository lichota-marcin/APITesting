package utility;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;


public class PropertyManager {
    static String propertiesPath = "src/main/resources/app.poperties";

    private static Properties INSTANCE;

    private PropertyManager() {
    }

    public static Properties getProperties() throws IOException {
        if (INSTANCE == null) {
            Properties appProps = new Properties();
            appProps.load(new FileInputStream(propertiesPath));
            INSTANCE = appProps;
        }
        return INSTANCE;
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

    static public void setNewId(String id) throws IOException {
        Properties props = getProperties();
        props.setProperty("Id", id);
        var writer = new FileWriter(propertiesPath);
        props.store(writer, "");
    }

}

