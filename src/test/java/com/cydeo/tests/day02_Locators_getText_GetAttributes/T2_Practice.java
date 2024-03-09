package com.cydeo.tests.day02_Locators_getText_GetAttributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Practice {
    public static void main(String[] args) throws InterruptedException {
        //1: Open a chrome page.
        WebDriver driver = new ChromeDriver();
        //wait for 2 seconds
        Thread.sleep(2000);
        //maximize the page
        driver.manage().window().maximize();
        //2: Go to : http://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");
        Thread.sleep(3000);
        //3: Click the A/B Testing from top of the list.
        //driver.findElement(By.linkText("A/B Testing")).click(); //1st option
        //2nd option
        WebElement abTestLink=driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        Thread.sleep(2000);
        //4: verify the title.
        //Expected: No A/B Test
        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed!!!: Title is " + actualTitle);
        } else {
            System.out.println("Title Verification Failed!!!: Actual Title is " + actualTitle);
        }
        Thread.sleep(1000);
        //5: Go back home page by using the .back();
        driver.navigate().back();
        Thread.sleep(1000);
        //6: verify title equals:
        //expected: Practice
        String ExpectedTitle = "Practice";
        String ActualTitle = driver.getTitle();
        if (ActualTitle.equals(ExpectedTitle)) {
            System.err.println("Home Page Title Verification Passed!!!: Actual Title is " + ActualTitle);
        }else {
            System.err.println("Home Page Title Verification Failed!!!: Actual Title is " + ActualTitle);
        }
        driver.quit();
    }


    }

