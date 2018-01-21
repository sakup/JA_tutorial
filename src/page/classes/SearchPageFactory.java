package page.classes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
    WebDriver driver;

    @FindBy (id="tab-flight-tab-hp")
    WebElement flightTab;

    @FindBy (id="flight-type-roundtrip-label-hp-flight")
    WebElement roundTrip;

    @FindBy (id="flight-type-one-way-label-hp-flight")
    WebElement oneWay;

    @FindBy (id="flight-type-multi-dest-label-hp-flight")
    WebElement multipleDestination;

    @FindBy (id="flight-origin-hp-flight")
    WebElement originCity;

    @FindBy (id="flight-destination-hp-flight")
    WebElement destinationCity;

    @FindBy (id="flight-departing-hp-flight")
    WebElement departureDate;

    @FindBy (id="flight-returning-hp-flight")
    WebElement returnDate;

    @FindBy (xpath = ".//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button")
    WebElement searchButton;


    public SearchPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFlightTab() {
        flightTab.click();
    }

    public void clickRoundTrio() {
        roundTrip.click();
    }

    public void clickOneWay() {
        oneWay.click();
    }

    public void clickMultipleDestination() {
        multipleDestination.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void setOriginCity(String origin){
        originCity.sendKeys(origin);
    }

    public void setDestinationCity(String destination){
        destinationCity.sendKeys(destination);
    }

    public void setDepartureDate(String departure){
        departureDate.sendKeys(departure);

    }

    public void setReturnDate(String returning) {
        returnDate.sendKeys(returning);
    }
}
