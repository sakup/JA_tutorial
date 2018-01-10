package basicweb;


import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.classes.SearchPageFactory;

import java.util.concurrent.TimeUnit;

public class FrameworkTestCase {
    private WebDriver driver;
    private String baseUrl;
    SearchPageFactory searchPage;

    @Before
    public void beforeClass() {
        driver = new FirefoxDriver();
        baseUrl = "https://www.expedia.com/";

        searchPage = new SearchPageFactory(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void test() {
        searchPage.clickFlightTab();
        searchPage.setOriginCity("New York");
        searchPage.setDestinationCity("Chicago");
        searchPage.setDepartureDate("01/19/2018");
        searchPage.setReturnDate("01/22/2018");
        searchPage.clickSearchButton();

    }

    @After
    public void afterClass() {

    }
}
