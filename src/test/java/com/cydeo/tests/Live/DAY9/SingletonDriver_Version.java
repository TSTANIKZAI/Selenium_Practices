package com.cydeo.tests.Live.DAY9;


import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SingletonDriver_Version {


    @Test (priority = 1)
    public void googleTitle(){
        Driver.getDriver().get("https://google.com");
        System.out.println("google test driver = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

    }

    @Test (priority = 2)
    public void yahooTitle(){
        Driver.getDriver().get("https://yahoo.com");
        System.out.println("yahoo test driver = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

    }


    @Test (priority = 3)
    public void etsyTitle(){
        Driver.getDriver().get("https://etsy.com");
        System.out.println("etsy test driver = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

    }


}