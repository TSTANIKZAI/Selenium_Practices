package com.cydeo.tests.day07_WebTable_Utility_Javafaker;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.CRM_Utilities;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
//TC #4: Login scenario
public class T4_Login_Scenario {
    WebDriver driver;
    @BeforeMethod
    public void SetupMethod(){
        //1. Create new test and make set ups
        driver= WebDriverFactory.getDriver("FIREFOX");
        BrowserUtils.sleep(2);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //2. Go to: http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");
        BrowserUtils.sleep(1);
    }
    @Test
    public void Test1_T4_Login_Page(){
driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk1@cydeo.com"+ Keys.TAB);
BrowserUtils.sleep(1);
driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser"+Keys.TAB);
        BrowserUtils.sleep(1);
driver.findElement(By.xpath("//input[@id='USER_REMEMBER']")).click();
        BrowserUtils.sleep(1);//we can use either from util class or directly from java Thread.sleep()
driver.findElement(By.xpath("//input[@class='login-btn']")).click();
        BrowserUtils.sleep(1);
        System.out.println("Expected Title: "+driver.getTitle());
    }
    @AfterMethod
    public void tearDropDown(){
        driver.quit();
    }
    public static void verifyTitleTest1(WebDriver driver, String expectedTitle){
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));

    }
    @Test
    public void Test2_T4_Login_Page() {
        //Login in using the utitlity method we created in CRM Utility class.
        CRM_Utilities.Login_CRM(driver);
        BrowserUtils.sleep(2);
        System.out.println("Actual Title is: "+driver.getTitle());
    }

    public static void verifyTitleTest2(WebDriver driver, String expectedTitle){
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }
    @Test
    public void Test3_T4_Login_Page() {
        //Login in using the utitlity method we created in CRM Utility class.
       CRM_Utilities.Login_CRM(driver,"helpdesk3@cydeo.com","UserUser");
        BrowserUtils.sleep(4);
        System.out.println("Actual Title is: "+driver.getTitle());
    }
}
/*


3. Enter valid username
4. Enter valid password
5. Click to `Log In` button
6. Verify title is as expected:
Expected: Portal

USERNAME PASSWORD
helpdesk1@cydeo.com UserUser
helpdesk2@cydeo.com UserUser*/
