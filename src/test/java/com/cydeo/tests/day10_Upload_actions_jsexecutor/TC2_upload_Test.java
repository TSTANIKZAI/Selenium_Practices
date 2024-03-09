package com.cydeo.tests.day10_Upload_actions_jsexecutor;

import com.cydeo.tests.Base.TestBase;
import com.cydeo.tests.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//TC #2 Upload Test
public class TC2_upload_Test extends TestBase {
    @Test
    public void upload_Test1(){
        //1. Go to https://practice.cydeo.com/upload
        driver.get("https://practice.cydeo.com/upload");
        BrowserUtils.sleep(1);
        // 2. Find some small file from your computer, and get the path of it.
        WebElement chooseFile= driver.findElement(By.id("file-upload"));
        BrowserUtils.sleep(2);
        // 3. Upload the file.
        chooseFile.sendKeys("/Users/stanikzai/Desktop/Screenshot 2024-02-14 at 9.41.19 PM.png");
        BrowserUtils.sleep(2);
        WebElement submitButton= driver.findElement(By.id("file-submit"));
        submitButton.click();
        BrowserUtils.sleep(2);
        //4. Assert:-File uploaded text is displayed on the page
        WebElement fileUploadedHeader= driver.findElement(By.tagName("h3"));
        String actualMessage=fileUploadedHeader.getText();
        String expectedMessage="File Uploaded!";
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertTrue(actualMessage.equals(expectedMessage));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());
        BrowserUtils.sleep(3);
    }
}

