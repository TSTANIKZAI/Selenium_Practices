package com.cydeo.tests.day04_CheckBox_RadioBox;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class CssSelector_Xpath {
  ///*XPATH and CSS Selector PRACTICES
  //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
    public static void main(String[] args) throws InterruptedException {
       // TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
       // a. “Home” link
        //using cssSelector Syntax#1 tagName[Attribute='value']
        //WebElement HomeLink=driver.findElement(By.cssSelector("a[class='nav-link']"));
        //using #2nd Syntax (tagName.classValue)
        WebElement HomeLink=driver.findElement(By.cssSelector("a.nav-link"));
        //another way through href
        WebElement homeLink2=driver.findElement(By.cssSelector("a[href='/']"));
       // b. “Forgot password” header
        //using Xpath  1st Syntax
        WebElement HeaderEx1= driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        //using cssSelector 2nd Syntax through parent element
        WebElement HeaderEx2=driver.findElement(By.cssSelector("div[class='example']>h2"));
        //using another option  div.example>h2
        WebElement HeaderEx3=driver.findElement(By.cssSelector("div.example>h2"));
       // c. “E-mail” text
        //Locate through Xpath 1st option by text
        WebElement EmailTextEx1= driver.findElement(By.xpath("//label[.='E-mail']"));
        //using 2nd option of Xpath
        WebElement EmailTextEx2=driver.findElement(By.xpath("//label[@for='email']"));
       // d. E-mail input box
        //using Xpath option
        WebElement EmailInput=driver.findElement(By.xpath("//input[@name='email']"));
       //second option
        WebElement EmailInputEx1=driver.findElement(By.xpath("//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$']"));
        // e. “Retrieve password” button
        //we want to use Xpath
        WebElement RetrieveButton=driver.findElement(By.xpath("//button[@id='form_submit']"));
       // f. “Powered by Cydeo text
        //we want to use Xpath
        WebElement CydeoText= driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //4. Verify all web elements are displayed.
        System.out.println("HomeLink.isDisplayed() = " + HomeLink.isDisplayed());
        System.out.println("HeaderEx1.isDisplayed() = " + HeaderEx1.isDisplayed());
        System.out.println("EmailTextEx1.isDisplayed() = " + EmailTextEx1.isDisplayed());
        System.out.println("EmailInputEx1.isDisplayed() = " + EmailInputEx1.isDisplayed());
        System.out.println("RetrieveButton.isDisplayed() = " + RetrieveButton.isDisplayed());
        System.out.println("CydeoText.isDisplayed() = " + CydeoText.isDisplayed());

        driver.quit();
    }
}



/*
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible
Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible*/

/*<div id="55k" name="kgl33" for="randomV12">
 * <a href="https://tesla.com">CYBERTRUCK OFFICIAL</a>*/

// div[id='55k']
//       div.kgl33
//        a[href='https://tesla.com']