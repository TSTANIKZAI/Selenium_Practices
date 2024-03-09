package com.cydeo.tests.day02_Locators_getText_GetAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_Library_Verification {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome Browser
        WebDriver driver=new ChromeDriver();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");
        Thread.sleep(1000);
        //3. Enter User Name
        //Expected: student54@library
        WebElement EmailAddress=driver.findElement(By.className("form-control"));
        EmailAddress.sendKeys("student54@library");
        Thread.sleep(1000);
        //4. Enter Password
        //Expected: libraryUser
        WebElement Password=driver.findElement(By.id("inputPassword"));
        Password.sendKeys("libraryUser");
        Thread.sleep(1000);
        WebElement SignIn=driver.findElement(By.tagName("button"));
        SignIn.click();


    }
}
