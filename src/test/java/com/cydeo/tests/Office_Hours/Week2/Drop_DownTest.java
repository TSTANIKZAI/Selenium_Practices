package com.cydeo.tests.Office_Hours.Week2;

import com.cydeo.tests.Base.TestBase;
import com.cydeo.tests.Office_Hours.Utility_Package_OfficeHrs.Utility_office;
import com.cydeo.tests.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Drop_DownTest extends TestBase {


    //Dropdown
    // TC003 As a user I should be able to see default option as Select a State

    @Test
    public void DropDown_Test1(){
        //1. open a (Chrome or Firefox) browser//its depends on your base class browser
        //2. go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //3-click drop down
        Utility_office.clickOption(driver,"Dropdown");
        //4. verify title
        BrowserUtils.verifyTitle(driver,"Dropdown");
        //5. verify default option Select a State
        Select selectState=new Select(driver.findElement(By.id("state")));
        BrowserUtils.sleep(1);
        WebElement defaultOption=selectState.getFirstSelectedOption();
        BrowserUtils.sleep(1);
        String actualDefualtOption=defaultOption.getText();
        String expectedDefualtOption="Select a State";
        Assert.assertEquals(actualDefualtOption,expectedDefualtOption);

    }

    //TC004 As a user I should be able to select Alabama
    @Test
    public void Select_State_test2(){
        driver.get("https://practice.cydeo.com");
        BrowserUtils.sleep(2);
        // 1-click drop down
        Utility_office.clickOption(driver,"Dropdown");

        // 2-verify title is dropdown
        BrowserUtils.verifyTitle(driver,"Dropdown");
        // 3-select Alabama
        Select selectState=new Select(driver.findElement(By.id("state")));
        selectState.selectByIndex(1);//select dropdown otpions indexes starting from zero
        BrowserUtils.sleep(1);
        selectState.selectByValue("VA");
        BrowserUtils.sleep(1);
        selectState.selectByVisibleText("Nevada");
        //4-verify Alabama is selected
        WebElement selectedOption=selectState.getFirstSelectedOption();
        String actualSelectedOption=selectedOption.getText();
        String expectedSelectedOption="Nevada";
        Assert.assertEquals(actualSelectedOption,expectedSelectedOption);
    }
}
