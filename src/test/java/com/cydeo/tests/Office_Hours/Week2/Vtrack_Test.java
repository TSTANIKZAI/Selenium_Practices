package com.cydeo.tests.Office_Hours.Week2;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

//TC001 As a user I should be able to see Home, About us, Our Approach, Product and
// Services, Contact and LOGIN labels are displayed
public class Vtrack_Test {
    WebDriver driver;
    @BeforeMethod
    public void SetupMethod() {
        //1. Create new test and make setups
        driver = WebDriverFactory.getDriver("FIREFOX");
        BrowserUtils.sleep(2);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //2-goto https://vytrack.com/
        driver.get("https://vytrack.com/");
    }
    //3-verify Home, About us, Our Approach, Products and Services, Contact and
    // LOGIN labels are displayed
    @Test
    public void vytrack_all_test(){
        List<WebElement>allTopLinks=driver.findElements(By.xpath("//ul[@id='top-menu']/li/a"));
        BrowserUtils.sleep(2);
        for (WebElement eachLink : allTopLinks) {
            Assert.assertTrue(eachLink.isDisplayed());
            System.out.println(eachLink);
        }


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
