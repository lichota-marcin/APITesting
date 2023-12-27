package AssertJTests;

import APICalls.PostCall;
import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.PropertyManager;


import java.io.IOException;

public class TestPost extends PostCall {

    public TestPost() throws IOException {
    }

    @BeforeClass
    public void setup() throws IOException {
        setNewID();}

    @Test (priority = 0)
    public void isResponseCodeEqualTo200() {
        int code = getResponseCode(httpResponse);
    assertThat(code).isEqualTo(200);
    }

    @Test ( priority = 0 )
    public void testId() throws IOException {
        String id = post.getId();
        assertThat(id).isEqualTo(PropertyManager.getId());

    }
    @Test ( priority = 0 )
    public void testName(){
        String name = post.getName();
        assertThat(name).isEqualTo("test_board");

    }
}
