package com.cydeo.tests.day04_CheckBox_RadioBox;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T3_Checkboxes_RadioBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //1. Go to https://practice.cydeo.com/checkboxes
        driver.get("https://practice.cydeo.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Locate checkbox#1 and #2.
        WebElement CheckBox1=driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement CheckBox2=driver.findElement(By.xpath("//input[@id='box2']"));
        // 2. Confirm checkbox #1 is NOT selected by default
        System.out.println("CheckBox1.isSelected(), expecting false = " + CheckBox1.isSelected());
        // 3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("CheckBox2.isSelected(),expecting true = " + CheckBox2.isSelected());
        Thread.sleep(2000);
        //4. Click checkbox #1 to select it.
        CheckBox1.click();
        Thread.sleep(2000);
        //5. Click checkbox #2 to deselect it.
        CheckBox2.click();
        Thread.sleep(2000);
        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("CheckBox1.isSelected() = " + CheckBox1.isSelected());
        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("CheckBox2.isSelected() = " + CheckBox2.isSelected());
        Thread.sleep(3000);
        driver.quit();
    }

}






