package com.cydeo.tests.Office_Hours.Week1;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Vtrack_LoginPage {
    public static void main(String[] args) throws InterruptedException {
        //1. Setup the browser driver.
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //2. go to http://vytrack.com
        driver.get("https://vytrack.com");
        Thread.sleep(2000);
        //3. Click the Login Button
        WebElement LoginButton=driver.findElement(By.xpath("//a[@href='http://app.vytrack.com']"));
        //WebElement LoginButton=driver.findElement(By.id("prependedInput"));
        Thread.sleep(2000);
        LoginButton.click();
        //4. Verify the title contains"Login"
      String actualtitle=driver.getTitle();
              String Expected="Login";
              if (actualtitle.contains(actualtitle)){
                  System.out.println("Title Verification Test Passed!!! Title is:"+actualtitle);
              }else {
                  System.out.println("Title Verification Test Failed!!! Title is: "+actualtitle);
              }
              Thread.sleep(2000);
        driver.quit();
    }
}
