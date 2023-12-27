package AssertJTests;

import APICalls.PutCall;
import org.testng.annotations.Test;
import utility.PropertyManager;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPut extends PutCall {

    public TestPut() throws IOException {
    }

    @Test(priority = 0)
    public void isResponseCodeEqualTo200() {
        int code = getResponseCode(httpResponse);
        assertThat(code).isEqualTo(200);
    }

    @Test ( priority = 0 )
    public void testId() throws IOException {
        String id = put.getId();
        assertThat(id).isEqualTo(PropertyManager.getId());

    }
    @Test ( priority = 0 )
    public void testName(){
        String name = put.getName();
        assertThat(name).isEqualTo("test_board");

    }
}
