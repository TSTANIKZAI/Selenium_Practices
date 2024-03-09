package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_DropDown_Intro {
    //TC#5: Verifying “Simple dropdown” and “State selection” dropdown
    //default values
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. open chrome
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
        @Test
        public void simple_dropDown() {
//3. Verify “Simple dropdown” default selected value is correct
            //Locating the drop down as a web element
            WebElement simpleDropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
            //Creating select class object and passing the dropdown web element into the constructor
            Select select = new Select(simpleDropDown);

            //Expected: “Please select an option”
            String ExpectedDefaultValue = "Please select an option";

            //Actual
            String ActualDefaultValue = select.getFirstSelectedOption().getText();
            //Do our assortion
            Assert.assertEquals(ActualDefaultValue, ExpectedDefaultValue);
            Assert.assertTrue(ActualDefaultValue.equals(ExpectedDefaultValue));
            // 4. Verify “State selection”
            //Locate web element drop down
            //Create select object and also locate the drop down itself in my construction see 2nd option.
            WebElement stateSelection = driver.findElement(By.xpath("//select[@id='state']"));
            Select select1 = new Select(stateSelection);//or in one line
            //2nd option
            Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
            //Actual
            String ActualDefaultValue1 = select1.getFirstSelectedOption().getText();

            //Expected: “Select a State”
            String ExpectedDefaultValue1 = "Select a State";
            //Verify default selected value is correct
            Assert.assertEquals(ActualDefaultValue1,ExpectedDefaultValue1);

        }
    }





