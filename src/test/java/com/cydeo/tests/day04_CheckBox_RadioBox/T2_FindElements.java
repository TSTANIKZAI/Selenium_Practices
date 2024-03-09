package com.cydeo.tests.day04_CheckBox_RadioBox;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class T2_FindElements {
    public static void main(String[] args) {
        //TC #2: FindElements Task
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        //3- Locate all the links in the page.
        List<WebElement>listOfLinks=driver.findElements(By.tagName("a"));
        // 4- Print out the number of the links on the page.
        System.out.println("listOfLinks.size() = " + listOfLinks.size());//listOfLinks.size().soutv+Enter
        // 5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links
        for (WebElement each : listOfLinks) {//its printing reference object
            System.out.println(each);
            System.out.println("Text of the Link: "+each.getText());//its print the text of the link
            System.out.println("The HREF value of the Link: "+each.getAttribute("href"));
        }

        driver.quit();

    }
}




