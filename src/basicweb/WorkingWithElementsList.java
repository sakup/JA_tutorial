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

public class WorkingWithElementsList {
    private WebDriver driver;
    private String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseURL = "https://letskodeit.teachable.com/p/practice";

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @Test
    public void testListOfElements() throws  Exception {
        boolean isChecked = false;
//        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
        List<WebElement> radioButtons = driver.findElements(By.name("cars"));
        int size = radioButtons.size();
        System.out.println("Size of the list is " + size);
        for (int i=0; i<size; i++) {
            isChecked = radioButtons.get(i).isSelected();

            if (!isChecked) {
                radioButtons.get(i).click();
                Thread.sleep(2000);
            }
        }
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
