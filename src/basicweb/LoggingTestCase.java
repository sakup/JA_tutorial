package basicweb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;
;

public class LoggingTestCase {
    private WebDriver driver;

    private String baseUrl;
    private static final Logger log = LogManager.getLogger(LoggingTestCase.class.getName());

    @Before
    public void beforeClass() {
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com";

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void testMethod() throws Exception {
        log.info("This message is from test method");
    }

    @After
    public void afterClass() {
        driver.quit();
    }
}
