package com.cydeo.tests.day06_alerts_iframesWindows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_T2_T3_AlertPractices {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        //1. open chrome
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //2. Go to http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    ////*TC #1: Information alert practice
    @Test
    public void Alerts_Practice_TC1() throws InterruptedException {
        //3. Click to “Click for JS Alert” button
        WebElement JsAlert=driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        Thread.sleep(2000);
       JsAlert.click();
       Thread.sleep(2000);
       //4. Click to OK button from the alert
       Alert alert=driver.switchTo().alert();
       Thread.sleep(2000);
        alert.accept();
        Thread.sleep(4000);
        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText= driver.findElement(By.xpath("//p[@style='color:green']"));
        Assert.assertTrue(resultText.isDisplayed(),"Result text is not Displayed");
        Thread.sleep(1000);
        String expectedText="You successfully clicked an alert";
        String actualText=resultText.getText();
        Assert.assertEquals(actualText,expectedText,"Due to Actual Text doesnt match with Expected One,Test Failed!!");
    }
    //TC #2: Confirmation alert practice
    @Test
    public void Alerts_Practice_TC2() throws InterruptedException {
      //3. Click to “Click for JS Confirm” button
        WebElement JsConfirm= driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        Thread.sleep(1000);
        JsConfirm.click();
        Thread.sleep(1000);
        //4. Click to OK button from the alert
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();
        //alert.accept();
        Thread.sleep(2000);
       // 5. Verify “You clicked: Cancel” text is displayed
        WebElement resultTex1= driver.findElement(By.xpath("//p[.='You clicked: Cancel']"));
        Assert.assertTrue(resultTex1.isDisplayed()," The result doesnt desplay");
        Thread.sleep(1000);
    }
    //TC #3: Information alert practice
@Test
    public void Alerts_PracticeT3() throws InterruptedException {
     //3. Click to “Click for JS Prompt” button
    WebElement JsPrompt= driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
    Thread.sleep(1000);
    JsPrompt.click();
    //4. Send “hello” text to alert
    Alert alert=driver.switchTo().alert();
    Thread.sleep(1000);
    alert.sendKeys("Hello");
    Thread.sleep(3000);
    //5. Click to OK button from the alert
    alert.accept();
    Thread.sleep(1000);
    //6. Verify “You entered: hello” text is displayed.
    WebElement resultTest3= driver.findElement(By.xpath("//p[.='You entered: Hello']"));
    Thread.sleep(2000);
    Assert.assertTrue(resultTest3.isDisplayed());
}
}
