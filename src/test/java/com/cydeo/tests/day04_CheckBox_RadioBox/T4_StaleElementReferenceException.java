package com.cydeo.tests.day04_CheckBox_RadioBox;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T4_StaleElementReferenceException {
    public static void main(String[] args) throws InterruptedException {
        //TC #4: StaleElementReferenceException Task
        // 1- Open a chrome browser
        WebDriver driver=WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        // 2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //3- Locate “CYDEO” link, verify it is displayed.
        //WebElement CydeoLink=driver.findElement(By.xpath("//a[.='CYDEO']")); OR
        WebElement CydeoLink=driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        Thread.sleep(1000);
        CydeoLink.isDisplayed();
        System.out.println("Before Refresh CydeoLink.isDisplayed() = " + CydeoLink.isDisplayed());
        Thread.sleep(2000);
       // 4- Refresh the page.
       // 5- Verify it is displayed, again.
        driver.navigate().refresh();
        System.out.println("Refreshing the page....");
        /*Note: if we run our programme we will get StaleElementReferenceException, because here we use the element already
        * now its useless, if we want to open back the same page than we have to reasign CydeoLink
        * as below*/
        CydeoLink=driver.findElement(By.xpath("//a[@href='https://cydeo.com/']"));
        System.out.println("After Refreshing CydeoLink.isDisplayed() = " + CydeoLink.isDisplayed());
        //Now we will get back the page result displayed true.
        driver.quit();
    }

}
/*



This is a simple StaleElementReferenceException to understand what is this exception and how to handle it.*/