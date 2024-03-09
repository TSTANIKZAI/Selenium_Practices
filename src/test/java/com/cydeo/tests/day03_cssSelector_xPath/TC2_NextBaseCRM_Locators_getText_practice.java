package com.cydeo.tests.day03_cssSelector_xPath;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2_NextBaseCRM_Locators_getText_practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");//1.Open chrome
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //2.Go to http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");
        Thread.sleep(1000);
        WebElement LoginInputBox= driver.findElement(By.className("login-inp"));
        LoginInputBox.sendKeys("helpdesk3@cybertekschool.com");
        Thread.sleep(1000);
        //4. Verify "remember me" label text is as expected:
        // Expected: Remember me on thid computer
        String ExpectedText="Remember me on this computer";
        String actualText=driver.findElement(By.className("login-item-checkbox-label")).getText();
        if (actualText.equals(ExpectedText)) {
            System.out.println("Verify Remember me Test Passed!, Actual text is: "+actualText);
        }else {
            System.out.println("Verify Remember me Test Failed!, Actual text is: "+actualText+" Your Expected is: "+ExpectedText);
        }
        //4. Verify "forgot password" link text is as expected:
        // Expected: Forgot your password?
        String ExpectedForgotPassword="FORGOT YOUR PASSWORD?";
        WebElement ForgotPasswordLink=driver.findElement(By.className("login-link-forgot-pass"));//i have to come back and check for the object name to make sure my self and compare with other classes
        String actualForgotPassword=ForgotPasswordLink.getText();
        if (actualText.equals(ExpectedText)) {
            System.out.println("Verify Forgot your password? Test Passed!, Actual link is: "+actualForgotPassword);
        }else {
            System.out.println("Verify Forgot your password? Test Passed!, Actual link is: "+actualForgotPassword+" Your Expected is: "+ExpectedForgotPassword);
        }
        //5. Verify "forgot password" href attributes value contains expected:
        //Expected: forgot_password=yes
        String ExpectedInHref="forgot_password=yes";
        String actualHrefValue=ForgotPasswordLink.getAttribute("href");
        if (actualHrefValue.contains(ExpectedInHref)){
            System.out.println("Verify: Test Passed!, Actual HREF (href) value is: "+actualHrefValue);
        }else {
            System.out.println("Verify: Test Failed!, Actual HREF (href) value is: "+actualHrefValue+" Your Expected is: "+ExpectedInHref);
        }

        /*WebElement RememberMe=driver.findElement(By.id("USER_REMEMBER"));
        RememberMe.isEnabled();
        Thread.sleep(1000);
        WebElement PasswordInputBox= driver.findElement(By.name("USER_PASSWORD"));
        PasswordInputBox.sendKeys("UserUser");
        Thread.sleep(1000);
        WebElement RememberMe1=driver.findElement(By.name("USER_REMEMBER"));
        RememberMe1.isEnabled();*/
    }
}
