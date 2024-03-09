package com.cydeo.tests.Office_Hours.Week2;

import com.cydeo.tests.Office_Hours.Utility_Package_OfficeHrs.Utility_office;
import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
//TC002 As a user I should be able to select my favorite color and sport
public class Radio_Button {
    WebDriver driver;
    @BeforeMethod
    public void SetupMethod() {
        //1. Create new test and make setups
        driver = WebDriverFactory.getDriver("FIREFOX");
        BrowserUtils.sleep(2);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // 2-goto https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");
    }
    // 3-click Radio Buttons
@Test
    public void Radio_Buttons_Test(){
       // driver.findElement(By.linkText("Radio Buttons")).click();
    Utility_office.clickOption(driver,"Radio Buttons");
        BrowserUtils.sleep(1);
        //4-verify title contains Radio buttons
    //BrowserUtils.verifyTitleContains(driver,"Radio");
    BrowserUtils.verifyTitle(driver,"Radio buttons");
    //5-select the favorite color as Red
    WebElement RedButton= driver.findElement(By.id("red"));
    RedButton.click();
    //6-verify the Red is selected
    Assert.assertTrue(RedButton.isSelected());
    BrowserUtils.sleep(1);
    //7-select the favorite sport as Football
    WebElement footballBtn=driver.findElement(By.id("football"));
    footballBtn.click();
    //  8-verify the Football is selected
    Assert.assertTrue(footballBtn.isSelected());
}@AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
