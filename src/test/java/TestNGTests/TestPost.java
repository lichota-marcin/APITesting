package TestNGTests;

import java.io.IOException;
import APICalls.PostCall;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.PropertyManager;

public class TestPost extends PostCall {

    public TestPost() throws IOException {
    }

    @BeforeClass
            public void setup() throws IOException {
            setNewID();}

    @Test ( priority = 0 )
    public void isResponseCodeEqualTo200() {
        int code = getResponseCode(httpResponse);
        Assert.assertEquals(code, 200 );

    }
    @Test ( priority = 0 )
    public void testId() throws IOException {
        String id = post.getId();
        Assert.assertEquals(id, PropertyManager.getId());
        //I realize that this uses the same method for getting id of both sides of assertion hence it will always be true
        //but I decided to leave it here
    }
    @Test ( priority = 0 )
    public void testName(){
        String name = post.getName();
        Assert.assertEquals(name, "test_board");
    }


}




