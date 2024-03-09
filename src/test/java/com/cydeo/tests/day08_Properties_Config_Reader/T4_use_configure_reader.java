package com.cydeo.tests.day08_Properties_Config_Reader;

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

import java.time.Duration;
//TC #4: Google search
public class T4_use_configure_reader {
    /*Use `configuration.properties` for the following:
1. The browser type
2. The URL
3. The search keyword
4. Make title verification dynamic. If search value changes, title
assertion should not fail.*/
        WebDriver driver;
        @BeforeMethod
        //1. Create new test and make setups
        public void setupMethod() {

           // 1- Open a chrome browser
           // 2- Go to: https://google.com
            driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            //1. Go to: https://google.com
            driver.get(ConfigurationReader.getProperty("googleURL"));//its dynamic
           // driver.get("google.com");
        }
    @Test
    public void google_search_test(){
        //3- Write “apple” in search box
            WebElement search= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
            search.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
        BrowserUtils.sleep(2);
            //4- Verify title:
        String expectedTitle=ConfigurationReader.getProperty("searchValue")+" - Google Search";
        //String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        BrowserUtils.sleep(2);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        BrowserUtils.sleep(2);
        Assert.assertEquals(actualTitle,expectedTitle);


    }
}



//Expected: apple - Google Search

