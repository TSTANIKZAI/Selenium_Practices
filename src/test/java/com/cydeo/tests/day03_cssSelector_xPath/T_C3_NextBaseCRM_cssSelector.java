package com.cydeo.tests.day03_cssSelector_xPath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T_C3_NextBaseCRM_cssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get("https://login1.nextbasecrm.com/");
        String expectedLoginText="Log In";
        //below we used Locating Login Button using class attributes value.
        //WebElement LoginButton=driver.findElement(By.className("login-btn"));
        //below we wanna use Locating LoginButton Using cssSelector using types attributes value based on
        // tagName[attributes='value']
        WebElement LoginButton=driver.findElement(By.cssSelector("input[type='submit']"));//you can try below options as weell
        //WebElement LoginButton=driver.findElement(By.cssSelector("input[class='login-btn']"));
        //Or
        //WebElement LoginButton=driver.findElement(By.cssSelector("input[value='Log In']"));
        String ActualLoginButton=LoginButton.getAttribute("value");
        if (ActualLoginButton.equals(expectedLoginText)){
            System.out.println("Test Passed! "+ActualLoginButton);
        }else {
            System.out.println("Test Failed "+ActualLoginButton);
        }






















    }
}
/*Note:
* we can use this cssSelector only for ID & Class Name as below
* Syntax: tagName.attributeValue(classValue or idValue)
* WebElement LoginButton=driver.findElement(By.cssSelector("input.login-btn"))
* This is only limited for id and class.*/