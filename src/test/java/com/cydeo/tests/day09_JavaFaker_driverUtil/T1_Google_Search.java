package com.cydeo.tests.day09_JavaFaker_driverUtil;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_Google_Search {
    WebDriver driver;
   @BeforeMethod
    public void SetupMethod(){
       driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));

       driver.get(ConfigurationReader.getProperty("googleURL"));
   }
   @Test
    public void GoogleSearch_Test(){
       BrowserUtils.sleep(1);
       WebElement searchBox= driver.findElement(By.xpath("//textarea[@name='q']"));
       searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
       BrowserUtils.sleep(1);
       System.out.println("driver.getTitle() = " + driver.getTitle());
       String actualTitle= driver.getTitle();
       String expectedTitle=ConfigurationReader.getProperty("searchValue")+ " - Google Search";
       Assert.assertTrue(actualTitle.equals(expectedTitle));

   }

}
/*TC #1: Google search
1- Open a chrome browser
2- Go to: https://bing.com
3- Write “SAMSUNG” in search box
4- Verify title:
Expected: SAMSUNG - Search
Use `configuration.properties` for the following:
1. The browser type
2. The URL
3. The search keyword
4. Make title verification dynamic. If search value changes, title
assertion should not fail.*/