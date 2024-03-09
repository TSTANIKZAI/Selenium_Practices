package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_TestNG_Selenium_Intro {
//TC#4: Cydeo Title Verification
    WebDriver driver;
    @BeforeMethod
        public void setupMethod(){
        //1. open chrome
        driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //2. Go to http://cydeo.com
        driver.get("http://practice.cydeo.com");

    }
@AfterMethod
public void tearDown(){
        driver.quit();
}
@Test
    public void test1_cydeo_title_Verification(){

//3.Verify Title:
    //Expected: Practice
    String actualTitle=driver.getTitle();
    String expectedTitle="Practice";
    Assert.assertEquals(actualTitle,expectedTitle);

}
}
