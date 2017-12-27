package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class IdPathDemo {

    public static void main(String[] args){
        WebDriver driver;
        driver = new FirefoxDriver();
        String baseURL = "http://google.com";
        driver.manage().window().maximize();
        driver.get(baseURL);

        //driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='_eEe']/a[2]")).click();
        driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//*[@id='hdtb-msb-vis']/div[4]/a")).click();

        //driver.close();

    }

}
