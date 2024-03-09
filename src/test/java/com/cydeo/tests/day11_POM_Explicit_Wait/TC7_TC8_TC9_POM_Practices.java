package com.cydeo.tests.day11_POM_Explicit_Wait;

import com.cydeo.Pages.Library_Login_Page;
import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7_TC8_TC9_POM_Practices {
    Library_Login_Page loginPage;
    @BeforeMethod
    public void Setup(){
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");
        loginPage=new Library_Login_Page();//I want to instantiate from the class and run for every single test,therefore I comment line27(Object)
    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
    @Test
    public void T7_field_Required_error_Test(){

        //3- Do not enter any information
        // Library_Login_Page loginPage=new Library_Login_Page();
        //4- Click to “Sign in” button
        loginPage.signInButton.click();
        BrowserUtils.sleep(2);
        //5- Verify expected error is displayed:
        Assert.assertTrue(loginPage.fieldRequiredErrorMessage.isDisplayed());
        //Expected: This field is required.
        //NOTE: FOLLOW POM DESIGN PATTERN
    }
    //TC8
    @Test
    public void T8_EmailFormat_ErrorMessage_Test(){
        //3- Enter invalid email format error message test
        loginPage.emailInput.sendKeys("ddddfgdd.com");
        loginPage.PasswordInput.sendKeys("dfgkdjdk");
        BrowserUtils.sleep(2);
        loginPage.signInButton.click();
        //4- verify expected error is displayed
        //Expected: Please enter a valid email adress.
        Assert.assertTrue(loginPage.enterValidEmailErrorMessage.isDisplayed());
    }

    @Test
    public void T9_IncorrectPasswordOrUserName_Test(){
        loginPage.emailInput.sendKeys("ddddfgdd@gmail.com");
        BrowserUtils.sleep(1);
        loginPage.PasswordInput.sendKeys("dfgkdjdk");
        BrowserUtils.sleep(2);
        loginPage.signInButton.click();
        BrowserUtils.sleep(1);
        Assert.assertTrue(loginPage.enterValidPasswordAndEmailErrorMessage.isDisplayed());


    }
}
