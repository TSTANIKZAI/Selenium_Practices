package com.cydeo.tests.day02_Locators_getText_GetAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_Google_Search {
    public static void main(String[] args) throws InterruptedException {
        //1: open chrome page
        WebDriver driver=new ChromeDriver();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //2: open google page
        driver.navigate().to("http://google.com");
        Thread.sleep(1000);
        //3: write "Apple" in the search box
        //a. locate search box
        WebElement googleSearchBox= driver.findElement(By.name("q"));
        //b. enter "Apple" key, and press enter
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);
        Thread.sleep(1000);
        // 2nd option : googleSearchBox.sendKeys(Keys.ENTER);
        //5: Verify title
        //Expected: Title should start with "Apple" word
        String expectedTitleStart= "apple";
        String actualTitleStart=driver.getTitle();

        if (actualTitleStart.startsWith(expectedTitleStart)){
            System.err.println("Test Passed!!! Actual Title is "+actualTitleStart);
        }else {
            System.err.println("Test Failed!!!");
        }
        driver.quit();
    }
}
