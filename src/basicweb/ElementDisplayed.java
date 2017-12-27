package basicweb;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ElementDisplayed {
    private WebDriver driver;
    private String baseURL1;
    private String baseURL2;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseURL1 = "https://letskodeit.teachable.com/p/practice";
        baseURL2 = "https://www.expedia.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testLetsKodeIt() throws Exception {
        driver.get(baseURL1);
        WebElement textbox = driver.findElement(By.id("displayed-text"));
        System.out.println("Text box displayed " + textbox.isDisplayed());

        Thread.sleep(2000);

        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();
        System.out.println("Clicked on hide button");
        System.out.println("Text box displayed " + textbox.isDisplayed());

        Thread.sleep(2000);

        WebElement showButton = driver.findElement(By.id("show-textbox"));
        showButton.click();
        System.out.println("Clicked on show button");
        System.out.println("Text box displayed " + textbox.isDisplayed());

    }

    @Test
    public void testExpedia() throws Exception {
        driver.get(baseURL2);
        WebElement childDropdown = driver.findElement(By.id("package-1-age-select-1-hp-package"));
        System.out.println("ChildDropdown box displayed " + childDropdown.isDisplayed());

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
