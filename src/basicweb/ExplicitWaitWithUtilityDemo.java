package basicweb;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExplicitWaitWithUtilityDemo {
    private WebDriver driver;
    private String baseURL;
    WaitTypes wt;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseURL = "https://letskodeit.teachable.com/p/practice";
        wt = new WaitTypes(driver);

        driver.manage().window().maximize();
    }

    @Test
    public void test() throws Exception {
        driver.get(baseURL);
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();
        WebElement emailField = wt.waitForElement(By.id("user_email"), 3);
        emailField.sendKeys("test");

        wt.clickWhenready(By.name("commit"), 3);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
//        driver.quit();
    }
}
