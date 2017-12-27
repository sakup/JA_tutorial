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

public class Autocomplete {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.google.com/";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testAutocomplete() throws Exception{
        driver.get(baseUrl);
        String searchingTest = "new york times";
        String partialText = "new york";

        WebElement text = driver.findElement(By.id("gs_htif0"));
        text.sendKeys(partialText);
        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath(".//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul"));
        List<WebElement> results = element.findElements(By.tagName("li"));
        int size = results.size();

        System.out.println("The size of the list is: " + size);

        for (int i=0; i<size; i++){
            System.out.println(results.get(i).getText());
        }

        Thread.sleep(3000);

        for (WebElement result : results) {
            if (result.getText().equals(searchingTest)) {
                result.click();
            }
        }
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}
