package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FindByLinkText {

    public static void main(String[] args) throws Exception{
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
        driver = new FirefoxDriver();
        String baseURL = "https://demostore.x-cart.com/";
        driver.manage().window().maximize();
        driver.get(baseURL);

        driver.findElement(By.linkText("Shipping info")).click();
        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("Terms")).click();
    }
}
