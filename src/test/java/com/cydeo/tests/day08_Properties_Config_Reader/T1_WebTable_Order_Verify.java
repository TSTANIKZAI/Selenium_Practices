package com.cydeo.tests.day08_Properties_Config_Reader;

import com.cydeo.tests.utilities.WebDriverFactory;
import com.cydeo.tests.utilities.WebOrederUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_WebTable_Order_Verify {
    WebDriver driver;
    @BeforeMethod
    //1. Create new test and make setups
    public void setupMethod() {
        //1. open chrome
        driver = WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @Test
    public void order_verify_Name_Test(){


        //2. Verify Bob’s name is listed as expected.
        WebElement bobCell=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[7]/td[2]"));
        System.out.println(bobCell.getText());
        //Expected: “Bob Martin”
        String actualName= bobCell.getText();
        String ExpectedName="Bob Martin";
        Assert.assertEquals(actualName,ExpectedName,"Names are not matching");
        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
        WebElement bobsOrderDate=driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));
        String ExpectedOrderDate="12/31/2021";
        String ActualOrderDate=bobsOrderDate.getText();
        System.out.println("Actual Order Date is: "+ActualOrderDate);
        Assert.assertEquals(ActualOrderDate,ExpectedOrderDate);
    }
    @Test
    public void Test2_UseOrder_Verify_Method(){
        //we have to call from utility Class
       // WebOrederUtils.ReturnOrderDate(driver,"Bart Fisher"); or
    String BartFisher= WebOrederUtils.ReturnOrderDate(driver,"Bart Fisher");
    System.out.println("Bart Fisher = " + BartFisher);
    }
    @Test
    public void Test3(){
        WebOrederUtils.OrderVerify(driver,"Bart Fisher","01/16/2021");

    }
}




