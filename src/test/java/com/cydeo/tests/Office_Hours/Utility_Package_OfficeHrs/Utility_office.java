package com.cydeo.tests.Office_Hours.Utility_Package_OfficeHrs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utility_office {
    public static void clickOption(WebDriver driver,String option){
        driver.findElement(By.linkText(option)).click();
    }
}

