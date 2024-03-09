package com.cydeo.tests.SelfPracticeProjects;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class GrocerySignIn {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("Firefox");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.groceryoutlet.com/");
        driver.manage().window().maximize();
        WebElement SignInButton=driver.findElement(By.xpath("//a[@class='nav-top-link align-items-center font-weight-bold mx-3 gtm-login']"));
        SignInButton.sendKeys(Keys.ENTER);
        WebElement InputEmailAddress=driver.findElement(By.xpath("//input[@placeholder='Enter Your Email Address']"));
        InputEmailAddress.sendKeys("shoaibstanikzai3@gmail.com"+Keys.TAB);
        Thread.sleep(3000);
        String ExpectedPassword="Bscec@41899";
        WebElement PasswordInput=driver.findElement(By.xpath("//input[@id='password']"));
        PasswordInput.sendKeys(ExpectedPassword+Keys.ENTER);

    }
}
