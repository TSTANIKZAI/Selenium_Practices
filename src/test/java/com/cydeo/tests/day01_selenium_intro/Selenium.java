package com.cydeo.tests.day01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.close();
    }
}
