package com.cydeo.tests.day02_Home_Work_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP1_Etsy_Title_Verification {
    public static void main(String[] args) throws InterruptedException {
        //1. open Chrome browser
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.Bestbuy.com");

        //3. Search for "Wooden spoon"
      WebElement SearchBox=driver.findElement(By.name("st"));
       Thread.sleep(2000);
      SearchBox.sendKeys("Air pods");
       SearchBox.sendKeys(Keys.ENTER);
       //4. verify the title.
        //Expecpected Result: BestBuy
        String ExpectedTitle="Best Buy";
        WebElement header=driver.findElement(By.tagName("Best Buy"));
        String ActualTitle=header.getText();
        if (ActualTitle.equals(ExpectedTitle)){
            System.out.println("Test Passed with Title Details: "+ActualTitle);
        }else {
            System.out.println("Test Failed, Actual Title is: "+ActualTitle);
        }
        //driver.getCurrentUrl();
        //Thread.sleep(5000);
        //driver.quit();



    }
}
