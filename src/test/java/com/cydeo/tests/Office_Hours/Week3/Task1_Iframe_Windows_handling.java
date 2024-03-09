package com.cydeo.tests.Office_Hours.Week3;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Task1_Iframe_Windows_handling {
    @Test
    public void iframe_windows_handles_Test(){
//Test website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
        //Test Scenario:

        //Step 1- Go to the above URL.
      Driver.getDriver().get(ConfigurationReader.getProperty("w3.school.url"));

      //Step 2- Get the current window’s handle and write to the console window. It must be the first window handle.
        String mainWindowHandle=Driver.getDriver().getWindowHandle();
        //using frame("name/id value")
      //Driver.getDriver().switchTo().frame("iframeResult");
      //or
        //using frame (webElement)
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.id("iframeResult")));
      //Step 3- Locate the “Visit W3Schools.com!” link and click it.
        Driver.getDriver().findElement(By.linkText("Visit W3Schools.com!")).click();

        //Step 4- Get all window handles and hold them in a list.
        Set<String>allWindowsHandles=Driver.getDriver().getWindowHandles();

        //Step 5- Write to total window handle number to the console. It must be 2.
        //allWindowsHandles.size().soutv+Enter
        System.out.println("allWindowsHandles.size() = " + allWindowsHandles.size());

        //Step 6- Switch to the second window.
        for (String eachWindow : allWindowsHandles) {
            Driver.getDriver().switchTo().window(eachWindow);

            //Step 7- Get the current window’s handle and write to the console window. It must be a second window handle.
            System.out.println("Driver.getDriver().getWindowHandle() = " + Driver.getDriver().getWindowHandle());
        }
//Step 8- Check the upper left side logo in the second window.
        WebElement logo=Driver.getDriver().findElement(By.xpath("//a[@id='w3-logo']"));
        Assert.assertTrue(logo.isDisplayed(),"Logo did not displayed!");
        //Step 9- Go back (Switch) to the first window.
        Driver.getDriver().switchTo().window(mainWindowHandle);
        //Step 10- Get the current window’s handle and write to the console window. It must be the first window handle.
        System.out.println("Driver.getDriver().getWindowHandle() = " + Driver.getDriver().getWindowHandle());
        //Step 11- Check the See Run Button Text. It must contain “Run >” text.
        WebElement runBtn=Driver.getDriver().findElement(By.id("runbtn"));
        Assert.assertTrue(runBtn.getText().contains("Run"));
        Driver.closeDriver();
    }
}
/*Task 1:  Iframe-window handles

















*/