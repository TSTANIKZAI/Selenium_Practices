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

public class TC4_Iframe {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        //1. open chrome
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //3. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    //TC #4: Iframe practice
    @Test
    public void T4_Iframe(){
   //We have to switch to iframe to be able to locate the web elements in there.
   //Option#1- switch "id" atribute value.
     driver.switchTo().frame("mce_0_ifr");
        //Option#2
        //driver.switchTo().frame(1);//you need to count index numer
        //Option#3
        //driver.switchTo().frame(driver.findElement(By.xpath("")));
        WebElement ParagraphText=driver.findElement(By.xpath("//body[.='Your content goes here.']"));
//4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(ParagraphText.isDisplayed());
//5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
       // driver.switchTo().defaultContent();its another option just we can use.
        driver.switchTo().parentFrame();
        WebElement HeaderText=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(HeaderText.isDisplayed());

    }

}