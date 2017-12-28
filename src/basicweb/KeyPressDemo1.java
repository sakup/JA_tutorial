package basicweb;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class KeyPressDemo1 {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/p/practice";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void testKeyPress() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.xpath(".//a[contains(@href, 'sign_in')]")).click();
        driver.findElement(By.id("user_email")).sendKeys("blablabla@email.com");
        Thread.sleep(2000);

        // driver.findElement(By.id("user_email")).sendKeys(Keys.TAB); // Hit the TAB key

        driver.findElement(By.id("user_password")).sendKeys("blablabla");
        Thread.sleep(2000);

        driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);

    }

    @After
    public void tearDown() throws Exception {
        //driver.quit()
    }
}
