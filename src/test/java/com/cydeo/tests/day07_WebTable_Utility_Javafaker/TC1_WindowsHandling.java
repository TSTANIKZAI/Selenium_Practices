package com.cydeo.tests.day07_WebTable_Utility_Javafaker;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

//TC #1: Window Handle practice
public class TC1_WindowsHandling {   WebDriver driver;
    @BeforeMethod
    //1. Create new test and make set ups
    public void setupMethod() {
        //1. open chrome
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");
    }

@Test
    public void window_Handling_Test() throws InterruptedException {
        //3. Copy paste the lines from below into your class
    ((JavascriptExecutor) driver).executeScript("window.open('https://www.google.com','_blank');");
    //Thread.sleep(1000);
    ((JavascriptExecutor) driver).executeScript("window.open('https://www.etsy.com','_blank');");
    //Thread.sleep(2000);
    ((JavascriptExecutor) driver).executeScript("window.open('https://www.facebook.com','_blank');");
    //Thread.sleep(3000);
    //4. Create a logic to switch to the tab where Etsy.com is open

   BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");
   Thread.sleep(1000);
   BrowserUtils.verifyTitleContains(driver,"Etsy");
    System.out.println(driver.getTitle());
}
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
/*





Lines to be pasted:
((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
These lines will simply open new tabs using something called JavascriptExecutor
and get those pages. We will learn JavascriptExecutor later as well.*/