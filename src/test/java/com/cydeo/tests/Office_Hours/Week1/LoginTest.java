package com.cydeo.tests.Office_Hours.Week1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
    @BeforeMethod
            public void setup(){
    //1. Setup the browser driver.
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    //2. go to http://vytrack.com
        driver.get("http://vytrack.com");
        }
    @Test
    public void LoginTest() throws InterruptedException {
        //1. Setup the browser driver.
      /*  WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //2. go to http://vytrack.com
        driver.get("http://vytrack.com");*/
        Thread.sleep(2000);
        //3. Click the Login Button
        driver.findElement(By.linkText("LOGIN")).click();
        Thread.sleep(2000);

        //4. Login to application with username as User1 and password as UserUser123
        driver.findElement(By.name("_username")).sendKeys("User1");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(5000);
        //5. verify the title is Dashboard
        /*String ExpectedTitle="Dashboard";
        if (ActualTitle.equals(ExpectedTitle)){// we can not use if statatement for TestNG
            System.out.println("Test Verification Passed!!!, Expected Title is: "+ActualTitle);
        }else {
            System.out.println("Test Verification Failed!!!, Expected Title is: "+ActualTitle);
        }*/
        Assert.assertEquals(driver.getTitle(),"Dashboard","Title Verification Failed");


       // driver.quit(); closing all open pages/windows
        //driver.close(); closing only currently open page/window

    }
   @Test
    public void hiddenPassword_Test() throws InterruptedException {
        //1- Setup the "browser driver"
        // WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // 2- Go to "https://vytrack.com"
       //driver.get("https://vytrack.com");
       // 3- Click Login Button
       driver.findElement(By.xpath("//a[@href='http://app.vytrack.com']")).click();
       Thread.sleep(2000);
       // 4- Login to application with username as "User1" and password as "UserUser123"
       // 5- Verify the password is hidden
       WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));

       String actualHiddenPassword = password.getAttribute("type");// it will return value of attribute name
       String expectedHiddenPassword = "password";

       Assert.assertEquals(actualHiddenPassword,expectedHiddenPassword);
   }
   @AfterMethod
    public void tearDown(){
        driver.quit();
   }
}




