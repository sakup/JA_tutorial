package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesireCapabilitiesDemo {

    public static void main(String[] args){
        WebDriver driver;
        String baseURL = "https://letskodeit.teachable.com/pages/practice";
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setBrowserName("firefox");
        caps.setPlatform(Platform.LINUX);

        driver = new FirefoxDriver(caps);
        driver.manage().window().maximize();
        driver.get(baseURL);
    }
}