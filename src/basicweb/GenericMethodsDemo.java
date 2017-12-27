package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import basicweb.GenericMethods;

import java.util.concurrent.TimeUnit;

public class GenericMethodsDemo {
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
        WebElement element = gm.getElement("name", "id");
        element.sendKeys("test");



    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
