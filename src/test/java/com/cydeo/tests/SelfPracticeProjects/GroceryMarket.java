package com.cydeo.tests.SelfPracticeProjects;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class GroceryMarket {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("Firefox");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.groceryoutlet.com/");
        driver.manage().window().maximize();
        WebElement SignUpSave=driver.findElement(By.xpath("//a[@class='mega-menu-link']"));
        SignUpSave.click();
        WebElement InputEmailAddress=driver.findElement(By.xpath("//input[@name='input_5']"));
        InputEmailAddress.sendKeys("shoaibstanikzai3@gmail.com"+Keys.TAB);
        Thread.sleep(1000);
        WebElement FirstName=driver.findElement(By.xpath("//input[@name='input_2']"));
        Thread.sleep(1000);
        FirstName.sendKeys("Mohammad"+Keys.TAB);
       WebElement EnterZip=driver.findElement(By.xpath("//input[@placeholder='Zip Code*']"));
       Thread.sleep(2000);
        EnterZip.sendKeys("22312"+Keys.TAB);
        Thread.sleep(2000);
        WebElement SelectStore=driver.findElement(By.xpath("//select[@name='input_4']"));
        Thread.sleep(2000);
        SelectStore.sendKeys("Catonsville - 6510 Baltimore National Pike"+Keys.TAB+Keys.ENTER);
       // WebElement SubmitButton=driver.findElement(By.xpath("//input[@type='submit'"));

        Thread.sleep(5000);
        driver.quit();
    }
}
