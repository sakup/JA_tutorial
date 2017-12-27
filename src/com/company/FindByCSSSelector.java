package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByCSSSelector {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String baseURL = "https://letskodeit.teachable.com/p/practice";
        driver.manage().window().maximize();
        driver.get(baseURL);

        driver.findElement(By.cssSelector("#bmwradio")).click();
        driver.findElement(By.cssSelector("#hondacheck")).click();
        driver.findElement(By.cssSelector("fieldset>label>input#benzcheck")).click();


    }
}
