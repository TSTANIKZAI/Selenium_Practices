package com.cydeo.tests.day06_alerts_iframesWindows;

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

public class dropdowsn_T6_T7_T8 {
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
    public void dateDropDown_T6() throws InterruptedException {
        //year
 Select yearDropDown=new Select(driver.findElement(By.xpath("//select[@id='year']")));
 Thread.sleep(2000);
 Select monthDropDown=new Select(driver.findElement(By.xpath("//select[@id='month']")));
 Thread.sleep(2000);
 Select dayDropDown=new Select(driver.findElement(By.xpath("//select[@id='day']")));
 Thread.sleep(2000);
 yearDropDown.selectByVisibleText("1933");
 Thread.sleep(2000);
 monthDropDown.selectByVisibleText("December");//you can select by value or index even
 Thread.sleep(2000);
 dayDropDown.selectByVisibleText("1");

 String expectedYear="1933";
 String expectedMonth="December";
 String expectedDay="1";

 String ActualYear=yearDropDown.getFirstSelectedOption().getText();
 String ActualMonth=monthDropDown.getFirstSelectedOption().getText();
 String ActualDay=dayDropDown.getFirstSelectedOption().getText();



        //Assert.assertEquals(ActualMonth,expectedMonth);
        Assert.assertTrue(ActualMonth.equals(expectedMonth));
       // Assert.assertEquals(ActualDay,expectedDay);
        Assert.assertTrue(ActualDay.equals(expectedDay));
        Assert.assertTrue(ActualYear.equals(expectedYear));

    }
    //TC#7
    @Test
    public void Test7() throws InterruptedException {
        //3. Select Illinois
        Select DropDownState=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Thread.sleep(1000);
        DropDownState.selectByValue("IL");
        String ExpectedIlloniStateValue="Illinois";
        Thread.sleep(1000);
        String ActualIlloniStateValue=DropDownState.getFirstSelectedOption().getText();
        Thread.sleep(1000);
        Assert.assertTrue(ActualIlloniStateValue.equals(ExpectedIlloniStateValue));

        Thread.sleep(1000);

        //4. Select Virginia
        DropDownState.selectByVisibleText("Virginia");
        Thread.sleep(1000);
        String ExpectedVaValue="Virginia";
        String ActualVaValue=DropDownState.getFirstSelectedOption().getText();
        Thread.sleep(1000);
        Assert.assertTrue(ActualIlloniStateValue.equals(ExpectedIlloniStateValue));
        //6. Select California
        Thread.sleep(1000);
        DropDownState.selectByIndex(5);
        Thread.sleep(3000);
        //7. Verify final selected option is California.
        String EpectedCalStateValue="California";
        String ActualCalStateValue=DropDownState.getFirstSelectedOption().getText();
        Thread.sleep(3000);
        //below note as string is only for failed test
        Assert.assertEquals(ActualCalStateValue,EpectedCalStateValue," State Drop Down value is not as expected");
// State selection based on Value, Text and Index number.
    }

    @Test
public void dropDownTask8() throws InterruptedException {
        Thread.sleep(2000);
//3. Click to non-select dropdown {in non select dropdown we find locat of element as normal without creating Locate Object}
        WebElement nonSelectWebsiteDropDown=driver.findElement(By.linkText("Dropdown link"));
        Thread.sleep(2000);
        nonSelectWebsiteDropDown.click();
        Thread.sleep(2000);
        //4. Click on face book" https://www.facebook.com/"
        WebElement FaceBook=driver.findElement(By.linkText("Facebook"));
        Thread.sleep(2000);
        FaceBook.click();
        Thread.sleep(2000);
       // 5. Verify title is “Facebook - Log In or Sign Up”
        String expectedTitle="Facebook - log in or sign up";
        String ActualTitle=driver.getTitle();
      Assert.assertEquals(ActualTitle,expectedTitle, "Title are not equal!!!");

    }

    /*TC #8: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown


*/
}
