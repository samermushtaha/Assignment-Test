import org.example.Main;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class LengthTest {

    @DataProvider(name = "lengthTestDataProvider")
    public Object[][] lengthTestDataProvider(){
        return new Object[][] {{"samer", 5}, {"", 0}, {"sa@mer##", 8}};
    }

    @BeforeClass
    public void printAfterStatue(){
        System.out.println("Starting...");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisionZero(){

    }

    @AfterMethod
    public void printAfterStatue(ITestResult result){
        System.out.println(result.getMethod().getMethodName() + " is finished");
    }

    @BeforeMethod
    public void printBeforeStatue(ITestResult result){
        System.out.println(result.getMethod().getMethodName() + " is going");
    }

    @Test(dataProvider = "lengthTestDataProvider", priority = 1)
    public void lengthTest(String text, int expected){
        int actual = text.length();
        Assert.assertEquals(expected, actual);
    }

    @Test(priority = 2)
    public void test(){
        Assert.assertEquals(2+2, 4);
    }
}
