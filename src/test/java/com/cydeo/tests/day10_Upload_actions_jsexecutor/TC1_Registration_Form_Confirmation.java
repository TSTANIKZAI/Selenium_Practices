package com.cydeo.tests.day10_Upload_actions_jsexecutor;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

//TC#1: Registration form confirmation
public class TC1_Registration_Form_Confirmation {
    WebDriver driver;
    @Test
    public void Registration_Form(){
        //1. Open browser
        //2. Go to website:https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        BrowserUtils.sleep(1);
       //3. Enter first name
        WebElement firstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Mohammad");
        //4. Enter last name
        WebElement lastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Stanikzai");
       //5. Enter username
        WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@placeholder='username']"));
        userName.sendKeys("bsces1");
        //6. Enter email address
        WebElement email=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("shoaibstanikzai3@gmail.com");
        //7. Enter password
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("bsces1@123");
        //8. Enter phone number
        WebElement phoneNumber=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys("571-508-9521");
        //9. Select a gender from radio buttons
        WebElement gender=Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        gender.click();
        //10.Enter date of birth
        WebElement dateOfBirth=Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        dateOfBirth.sendKeys("01/09/1989");
        //11.Select Department/Office

        Select selectDepartment=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        selectDepartment.selectByValue("DE");
        //12.Select Job Title
        Select selectJobTitle=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        selectJobTitle.selectByVisibleText("SDET");
        //13.Select programming language from checkboxes
        WebElement ProgLanguage=Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        ProgLanguage.click();
        //14.Click to sign up button
        WebElement submitButton=Driver.getDriver().findElement(By.id("wooden_spoon"));
        submitButton.click();
        //15.Verify success message “You’ve successfully completed registration.” is displayed.
        WebElement successMessage=Driver.getDriver().findElement(By.xpath("//div[@role='alert']"));
        Assert.assertTrue(successMessage.isDisplayed());
        Driver.closeDriver();
    }
}
