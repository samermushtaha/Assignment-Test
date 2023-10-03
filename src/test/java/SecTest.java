import org.testng.Assert;
import org.testng.annotations.Test;

public class SecTest {
    @Test
    public void test2(){
        Assert.assertEquals(2+2, 4);
    }
    @Test
    public void test(){
        Assert.assertEquals(2+2, 4);
    }
}
