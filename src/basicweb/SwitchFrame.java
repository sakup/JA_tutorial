package basicweb;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SwitchFrame {
    private WebDriver driver;
    private String baseUrl;
    private JavascriptExecutor js;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void test() throws InterruptedException {

        js.executeScript("window.scrollBy(0, 1900);");

        Thread.sleep(2000);
         //Switch to frame by id
//        driver.switchTo().frame("courses-iframe");
         //Switch to frame by name
//        driver.switchTo().frame("iframe-name");
        // Switch to frame by number
        driver.switchTo().frame(0);
        WebElement searchBox = driver.findElement(By.id("search-courses"));
        searchBox.sendKeys("python");

        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -1900);");
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Fuck YEAH !!!");
    }

    @After
    public void tearDown() throws  Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
