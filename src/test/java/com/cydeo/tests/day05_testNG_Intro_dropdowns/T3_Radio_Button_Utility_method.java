package com.cydeo.tests.day05_testNG_Intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class T3_Radio_Button_Utility_method {

        public static void main(String[]args) throws InterruptedException {
//XPATH PRACTICES
//DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//TC #3 Utility method task for (continuation of Task2)
// DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
// 1. Open Chrome browser.
            WebDriver driver= WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//2. Go to https://practice.cydeo.com/radio_buttons
            driver.get("https://practice.cydeo.com/radio_buttons");
            Thread.sleep(1000);
            //3. Click to “Hockey” radio button
            //4. Verify “Hockey” radio button is selected after clicking.
            clickAndVerifyRadioButton(driver,"sport","football");
            clickAndVerifyRadioButton(driver,"color","black");
            clickAndVerifyRadioButton(driver,"sport","hokey");
driver.quit();
            }
    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String expectedId){
//Locate all -of- the 'sports' Radio button and store them in a Lis<WebElement>
        //List<WebElement>RadioButton=driver.findElements(By.xpath("//input[@name='"+nameAttribute+"']"));  or you can use below code
        List<WebElement>RadioButtons=driver.findElements(By.name(nameAttribute));
        for (WebElement each : RadioButtons) {
            String ActualID= each.getAttribute("id");
            System.out.println("ActualID = " + ActualID);

            if (ActualID.equals(expectedId)){
                each.click();
                System.out.println(ActualID+" is selected: "+each.isSelected());
                break;
            }
        }
    }
        }


/*XPATH PRACTICES

DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #3:
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.

USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
Create a utility method to handle above logic.
Method name: clickAndVerifyRadioButton
Return type: void or boolean
Method args:
1. WebDriver
2. Name attribute as String (for providing which group of radio buttons)
3. Id attribute as String (for providing which radio button to be clicked)
Method should loop through the given group of radio buttons. When it finds the
matching option, it should click and verify option is Selected.
Print out verification: true*/