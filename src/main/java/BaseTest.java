import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {


    @BeforeMethod(alwaysRun = true)
    public void startBrowser() {
        System.out.println("do something before test");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownBrowser() {
        System.out.println("do something after test");
    }




}
