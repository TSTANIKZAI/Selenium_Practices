package com.cydeo.tests.day06_alerts_iframesWindows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
//TC #5: Window Handle practice
public class TC5_Windows_Practice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        //1. open chrome
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void Window_Practice() throws InterruptedException {
        //4. Assert: Title is “Windows”
        String ExpectedTitle="Windows";
        String ActualTitle=driver.getTitle();
        Assert.assertEquals(ActualTitle,ExpectedTitle);
        System.out.println("Main Handle = " + driver.getWindowHandle());
        //5. Click to: “Click Here” link
        System.out.println("Title Before Click: "+driver.getTitle());
        WebElement Link= driver.findElement(By.linkText("Click Here"));
        Link.click();
        System.out.println("Title after clicking: "+driver.getTitle());
        Thread.sleep(3000);
        //6. Switch to new Window.
        /* We need to use driver.getWindowHandles() method
        driver.getWindowHandles();
        * 1- WindowHandle: MainHandle
        2- WindowHandle: 2nd Window*/
        for (String each:driver.getWindowHandles()) {
driver.switchTo().window(each);
            System.out.println("Current Title while switching window: "+driver.getTitle());
        }
        //7. Assert: Title is “New Window”
String ExpectedNewWindowTitle="New Window";
        String ActualNewWindowTitle=driver.getTitle();
        // or ActualNewWindowTitle=driver.getTitle();
        Assert.assertEquals(ActualNewWindowTitle,ExpectedNewWindowTitle);
    }
}
