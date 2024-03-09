package com.cydeo.tests.day02_Locators_getText_GetAttributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[]args) throws InterruptedException {

        //WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().to("https://practice.cydeo.com");//driver.get("copy url......")
        Thread.sleep(5000);
        String ExpectedURL="cydeo";
        String ActualURL=driver.getCurrentUrl();
        if (ActualURL.contains(ExpectedURL)){
            System.err.println("Test Passed!!!: Actual URL Contains "+ExpectedURL+", "+ActualURL);
        }else {
            System.err.println("Test Failed!!!: Actual URL Contains "+ExpectedURL+", "+ActualURL);
        }
        Thread.sleep(5000);
        String ExpectedTitle="Practice";
        String ActualTitle=driver.getTitle();
        if (ActualTitle.equals(ExpectedTitle)) {
            System.out.println("Test Passed!!! Title is: "+ActualTitle);
        }else {
            System.err.println("Test Fail!!!: "+ActualTitle);
        }
        Thread.sleep(2000);
        driver.quit();
    }

}
//TC#1: Cydeo Practice tool verifications
//1. Open Chrome browser
//2. Go to https://practice.cydeo.com
//3. Verify URL contains
// Expected cydeo
//4. verify title:
//Expected: practice