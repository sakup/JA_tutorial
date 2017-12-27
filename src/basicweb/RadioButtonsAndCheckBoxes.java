package basicweb;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class RadioButtonsAndCheckBoxes {
    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseURL = "https://letskodeit.teachable.com/p/practice";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }

    @Test
    public void test() throws Exception {
        WebElement bmwRadioButton = driver.findElement(By.id("bmwradio"));
        bmwRadioButton.click();
        Thread.sleep(2000);

        WebElement benzRadioButton = driver.findElement(By.id("benzradio"));
        benzRadioButton.click();
        Thread.sleep(2000);

        WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
        bmwCheckBox.click();
        Thread.sleep(1000);

        WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
        benzCheckBox.click();

        System.out.println("BMW Radio Button is selected - " + bmwRadioButton.isSelected());
        System.out.println("BENZ Radio Button is selected - " + benzRadioButton.isSelected());
        System.out.println("BMW Check Box is selected - " + bmwCheckBox.isSelected());
        System.out.println("BENZ Check Box is selected - " + benzCheckBox.isSelected());
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

}
