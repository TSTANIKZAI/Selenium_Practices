
//package com.cydeo.tests.review.day9_10_11.base;
/*
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

// This class is abstract because we don't want any other class to create object from that
public abstract class TestBase {


    protected Select select;
    protected Actions actions;

    @BeforeMethod
    public void setup(){
        // you will not use below 3 line of code in singleton
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        actions = new Actions(Driver.getDriver());
        // with using Singleton design pattern
        Driver.getDriver().get("https://demo.guru99.com/test/drag_drop.html");

    }

    @AfterMethod
    public void teardown(){
        // without singleton
        // driver.quit();

        // with using Singleton design pattern
        //  Driver.closeDriver();

    }
}*/