package com.cydeo.tests.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String browserType){
        if (browserType.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        }else if(browserType.equalsIgnoreCase("Firefox")){
            return new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("Safari")) {
            return new SafariDriver();
        } else {
            System.out.println("Given String doesnt represent any browser.");
            System.out.println("Either That browser does not exist or not currently supported.");
            System.out.println("driver=null");
        }


        return null;
    }
    //Task: New Method Creation
    //Method Name: getDriver
    //Static Method
    //Accepts String arg: browser Type
    //  -This arg will determine what type of browser is opened
    //  -If "Chrome" passed --> it will open chrome browser
    //  -if "Firefox" passed --> it will open firefox browser
    //Return Type: "WebDriver"
}
