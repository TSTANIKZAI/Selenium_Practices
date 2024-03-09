package com.cydeo.tests.day02_Locators_getText_GetAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute {
    public static void main(String[] args) throws InterruptedException {
        //1.Open Chrome Browser
        WebDriver driver=new ChromeDriver();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //2. Go to http://practice.cydeo.com/registration_form
        driver.get("http://practice.cydeo.com/registration_form");
        Thread.sleep(1000);
        //3. verify header text is as expected
        //Expected: Registration form
        WebElement header=driver.findElement(By.tagName("h2"));
        String ExpectedHeaderText="Registration form";
        String ActualHeaderText= header.getText();
        if (ActualHeaderText.equals(ExpectedHeaderText)){
            System.out.println("Test Verification Passed!!! Page Header is: "+ActualHeaderText);
        }else {
            System.err.println("Test Verification Failed!!! Page Header is: "+ActualHeaderText);
        }
        //4. Locate "First Name" input box
        WebElement FirstNameInput=driver.findElement(By.className("form-control"));
        //5. Verify placeholder attributes value is as expected
        //Expected: first name
        String ExpectedPlaceHolder="lasr name";
        String ActualPlaceHolder=FirstNameInput.getAttribute("placeholder");
        if (ActualPlaceHolder.equals(ExpectedPlaceHolder)){
            System.out.println("Test Verification Passed!!! Actual Place Holder is: "+ActualPlaceHolder);
        }else {
            System.err.println("Test Verification Failed!!! Actual Place Holder is: "+ActualPlaceHolder+", but you putted "+ExpectedPlaceHolder);
        }


    }
}
