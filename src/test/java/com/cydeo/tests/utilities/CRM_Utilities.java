package com.cydeo.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

/*This Class will store the method related to CRM project. */
public class CRM_Utilities {
    /*This method will login using below credentials
    * user name:"helpdesk1@cydeo.com"
    * Password: "UserUser" */
    public static void Login_CRM(WebDriver driver){
        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk1@cydeo.com"+ Keys.TAB);

        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser"+Keys.TAB);

        driver.findElement(By.xpath("//input[@id='USER_REMEMBER']")).click();
        BrowserUtils.sleep(1);//we can use either from util class or directly from java Thread.sleep()
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
    }
    public static void Login_CRM(WebDriver driver, String Email, String Password){//we used for customized login page
        driver.findElement(By.name("USER_LOGIN")).sendKeys("Username"+ Keys.TAB);

        driver.findElement(By.name("USER_PASSWORD")).sendKeys("Password"+Keys.TAB);

        driver.findElement(By.xpath("//input[@id='USER_REMEMBER']")).click();
        BrowserUtils.sleep(1);//we can use either from util class or directly from java Thread.sleep()
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
    }

}
