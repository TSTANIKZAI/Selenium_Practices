package com.cydeo.tests.day02_Locators_getText_GetAttributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Azul_CRM_PagePractice {
    public static void main(String[] args) throws InterruptedException {
        //open Chrome page
        WebDriver driver=new ChromeDriver();
        //wait for 2 seconds
        Thread.sleep(2000);
        //maximize the page
        driver.manage().window().maximize();
        //open the Azul CRM application page
        driver.navigate().to("https://qa.azulcrm.com/");
        Thread.sleep(3000);
        //find the title
        String str="Authorization";
        if (driver.getTitle().equals("Authorization")){
            System.out.println("Test is Passed with this result."+str);
        }else {
            System.err.println("Test is failed, Try again.");
        }
driver.quit();

    }
}
//1: open Chrome page
// data. http://www.google.com
//2: navigate to Azul CRM page
// data. https://qa.azulcrm.com/
//3:Test the Login text box
// data. helpdesk3@cybertekschool.com
//4: test the Password box
//data. UserUser
//5: take mark the Remember me the details in this compter
//6: verify the Title
// data. Authorization
//7:verify the Log out button should work.