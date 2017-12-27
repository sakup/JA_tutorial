package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by pukas on 08.12.2017.
 */
public class ElementListDemo {

    private WebDriver driver;
    private String baseURL;
    private GenericMethods gm;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseURL = "https://letskodeit.teachable.com/p/practice";
        gm = new GenericMethods(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testGetText() throws Exception{
        driver.get(baseURL);
//        WebElement element = driver.findElement(By.id("name"));



//        List<WebElement> elementList = gm.getElementList("//input[@type='text']", "xpath");
//        int size = elementList.size();
//        System.out.println("Size of element list is " + size);



        boolean result1 = gm.isElementPresent("name", "id");
        System.out.println("Element is present " + result1);

        boolean result2 = gm.isElementPresent("nothere", "id");
        System.out.println("Element is present " + result2);


    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
