package com.cydeo.tests.SelfPracticeProjects;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T1_AccountCreatingInBestBuy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.bestbuy.com");
        WebElement AccountModule=driver.findElement(By.xpath("//span[@class='v-p-right-xxs line-clamp']"));
        Thread.sleep(1000);
        AccountModule.click();
        Thread.sleep(1000);
        WebElement CreateAccountButton=driver.findElement(By.xpath("//a[@tabindex='0']"));
        Thread.sleep(1000);
        CreateAccountButton.click();
        Thread.sleep(1000);
        WebElement FirstNameInput=driver.findElement(By.className("tb-input"));
        Thread.sleep(1000);
        FirstNameInput.sendKeys("Mohammad"+ Keys.TAB);
        Thread.sleep(1000);
        WebElement LastNameInput=driver.findElement(By.id("lastName"));
        Thread.sleep(1000);
        LastNameInput.sendKeys("Stanikzai"+ Keys.TAB);
        WebElement EmailId=driver.findElement(By.xpath("//input[@type='email']"));
        //Thread.sleep(1000);
        EmailId.sendKeys("shoaibstanikzai3@gmail.com"+ Keys.TAB);
        WebElement ToggleSlider=driver.findElement(By.xpath("//span[@class='c-toggle-slider c-toggle-round']"));
        //Thread.sleep(1000);
        ToggleSlider.click();
        Thread.sleep(1000);
        WebElement PasswordInput=driver.findElement(By.xpath("//input[@name='fld-p1']"));
        PasswordInput.sendKeys("Bscec@123456"+Keys.TAB);
        Thread.sleep(1000);
        WebElement ConfirmPasswordInput=driver.findElement(By.xpath("//input[@name='reenterPassword']"));
        ConfirmPasswordInput.sendKeys("Bscec@123456"+Keys.TAB);
        //LoginButton.click();
       // Thread.sleep(2000);
      //  WebElement RegisterButton= driver.findElement(By.xpath("//a[@href='https://www.aetna.com/AccountManagerV3/register/selfService/registerMember']"));
        //WebElement RegisterElement=driver.findElement(By.xpath("//a[@href='/register']"));
        //Thread.sleep(2000);
       // RegisterElement.sendKeys(Keys.ENTER);
        //Thread.sleep(2000);
       // driver.quit();
    }
}
