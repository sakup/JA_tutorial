package basicweb;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarSelection {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.expedia.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void test1() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.id("tab-flight-tab-hp")).click();
        WebElement departingField = driver.findElement(By.id("flight-departing-hp-flight"));
        departingField.click();
        WebElement dateToSelect = driver.findElement(By.xpath(".//*[@id='flight-departing-wrapper-hp-flight']//div[2]//button[text()=\"31\"]"));
        dateToSelect.click();

    }

    @Test
    public void test2()throws Exception{
        driver.get(baseUrl);
        driver.findElement(By.id("tab-flight-tab-hp")).click();
        WebElement departingField = driver.findElement(By.id("flight-departing-hp-flight"));
        departingField.click();
        WebElement calMonth = driver.findElement(By.xpath(".//*[@id='flight-departing-wrapper-hp-flight']//div[2]"));

        List<WebElement> allValidDates = calMonth.findElements(By.tagName("button"));

        Thread.sleep(2000);

        for (WebElement date : allValidDates) {
            if (date.getText().equals("31")) {
                date.click();
                break;
            }
        }

    }

    @After
    public void tearDown() throws Exception{
        Thread.sleep(2000);
        driver.quit();
    }
}
