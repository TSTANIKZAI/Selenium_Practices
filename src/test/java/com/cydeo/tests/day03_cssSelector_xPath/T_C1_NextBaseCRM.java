package com.cydeo.tests.day03_cssSelector_xPath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T_C1_NextBaseCRM {
    public static void main(String[] args) throws InterruptedException {
        //1. open a Chrom browser
        //WebDriver driver=new ChromeDriver();
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();

        //2.Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3. Enter incorrect username:
        //moh.tariqst@gmail.com
        WebElement LoginInputBox= driver.findElement(By.className("login-inp"));
        LoginInputBox.sendKeys("moh.tariqst@gmail.com");
        //4. Enter incorect password
        //Bskd@1345
        WebElement PasswordInputBox= driver.findElement(By.name("USER_PASSWORD"));
       PasswordInputBox.sendKeys("Bskd@1345");
       //5. take mark remember me button
       WebElement RememberButton= driver.findElement(By.id("USER_REMEMBER"));
       RememberButton.click();
       //6. wait for few seconds
       Thread.sleep(5000);
       //7. Enter for Login
       WebElement LoginButton=driver.findElement(By.className("login-btn"));
       LoginButton.sendKeys(Keys.ENTER);
       //8. Verify error message test is as expected
        //expected: Incorrect login or password
       String ExpectedText="Incorrect login or password";
       String actualText=driver.findElement(By.className("errortext")).getText();
       if (actualText.equals(ExpectedText)){
           System.out.println("Test Passed, Actual text is: "+actualText);
       }else {
           System.out.println("Test Failed, Actual text is: "+actualText);
       }
       Thread.sleep(3000);
       driver.quit();



    }
}
