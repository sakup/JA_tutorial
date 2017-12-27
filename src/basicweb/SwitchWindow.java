package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class SwitchWindow {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseURL = "https://letskodeit.teachable.com/p/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @Test
    public void test() throws InterruptedException {

        // Get the handle
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent handle: " + parentHandle);

        // Find open window button
        WebElement openWindow = driver.findElement(By.id("openwindow"));
        openWindow.click();

        // Get all handles
        Set<String> handles = driver.getWindowHandles();

        // Switch between handles
        for (String handle: handles) {
            System.out.println(handle);
            if(!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                Thread.sleep(2000);

                WebElement searchBox = driver.findElement(By.id("search-courses"));
                searchBox.sendKeys("python");
                Thread.sleep(2000);
                driver.close();
                break;
            }
        }

        // Switch back to parent window
        driver.switchTo().window(parentHandle);
        driver.findElement(By.id("name")).sendKeys("Test Sucsessful");

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();

    }
}
