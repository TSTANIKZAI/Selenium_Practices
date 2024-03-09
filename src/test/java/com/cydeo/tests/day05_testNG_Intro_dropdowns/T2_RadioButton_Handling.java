package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T2_RadioButton_Handling {
    public static void main(String[]args) throws InterruptedException {
//XPATH PRACTICES
//DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//TC #2: Radiobutton handling.
// DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
// 1. Open Chrome browser.
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        Thread.sleep(2000);
//3. Click to “Hockey” radio button
        WebElement HockeyButton=driver.findElement(By.xpath("//input[@id='hockey']"));
        Thread.sleep(1000);
        HockeyButton.click();
        //4. Verify “Hockey” radio button is selected after clicking.
        Thread.sleep(1000);
        System.out.println("HockeyButton.isSelected(), Expected True = " + HockeyButton.isSelected());
        if (HockeyButton.isSelected()){
            System.out.println("Button is selected. Verification PASSED!");
        }else {
            System.out.println("Button is Not selected. Verification FAILED!");
        }
driver.quit();
    }
}
/* USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS*/