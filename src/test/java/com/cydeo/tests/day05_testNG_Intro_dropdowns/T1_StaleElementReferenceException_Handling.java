package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T1_StaleElementReferenceException_Handling {
    public static void main(String[] args) throws InterruptedException {
        //XPATH PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: StaleElementReferenceException handling
       //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // 2. Go to https://practice.cydeo.com/add_remove_elements/
      driver.get("https://practice.cydeo.com/add_remove_elements/");
      Thread.sleep(2000);
      //3. Click to “Add Element” button
        WebElement AddElementButton= driver.findElement(By.xpath("//button[.='Add Element']"));
        Thread.sleep(2000);
        AddElementButton.click();
        //4. Verify “Delete” button is displayed after clicking.
        System.out.println("AddElementButton.isDisplayed(),Expecting True = " + AddElementButton.isDisplayed());
       // 5. Click to “Delete” button.
        WebElement DeleteButton= driver.findElement(By.xpath("//button[.='Delete']"));
        Thread.sleep(2000);
        DeleteButton.click();
        //6. Verify “Delete” button is NOT displayed after clicking.
      //use try & catch  to handle and verify
      try {
        System.out.println("DeleteButton.isDisplayed(), Expecting False = " + DeleteButton.isDisplayed());
      }catch (StaleElementReferenceException e){
        System.out.println("---> StaleElementReferenceException happened due to element being deleted from the page.");
        System.out.println("Which Concludes our test case Passing!-");
        System.out.println("DeleteButton.isDisplayed(), Expecting False = ");
      }
      //DeleteButton= driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
       // System.out.println("DeleteButton.isDisplayed() After handling= " + DeleteButton.isDisplayed());
      driver.quit();
    }
}
/* USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS*/