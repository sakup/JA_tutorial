package basicweb;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class NavigatingBetweenPages {
    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception{
        driver = new FirefoxDriver();
        baseURL = "https://letskodeit.teachable.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws InterruptedException{
        driver.get(baseURL);
        String title = driver.getTitle();
        System.out.println("Title of the page is " + title);

        String currentURL = driver.getCurrentUrl();
        System.out.println("CurrentURL is " + currentURL);

        String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
        driver.navigate().to(urlToNavigate);
        currentURL = driver.getCurrentUrl();
        System.out.println("CurrentURL is " + currentURL);

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navigate back");
        currentURL = driver.getCurrentUrl();
        System.out.println("CurrentURL is " + currentURL);

        Thread.sleep(2000);

        driver.navigate().forward();
        System.out.println("Navigate forward");
        currentURL = driver.getCurrentUrl();
        System.out.println("CurrentURL is " + currentURL);

        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Navigate back");
        currentURL = driver.getCurrentUrl();
        System.out.println("CurrentURL is " + currentURL);

        driver.navigate().refresh();
        System.out.println("Navigate refresh");
        driver.get(currentURL);
        System.out.println("Navigate refresh");

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }



}
