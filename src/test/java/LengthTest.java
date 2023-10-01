import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LengthTest {

    @DataProvider(name = "lengthTestDataProvider")
    public Object[][] lengthTestDataProvider(){
        return new Object[][] {{"samer", 5}, {"", 0}, {"sa@mer##", 8}};
    }

    @Test(dataProvider = "lengthTestDataProvider")
    public void lengthTest(String text, int expected){
        int actual = text.length(); //d
        Assert.assertEquals(expected, actual);
    }
}
