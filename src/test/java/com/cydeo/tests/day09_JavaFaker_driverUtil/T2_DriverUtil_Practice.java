package com.cydeo.tests.day09_JavaFaker_driverUtil;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T2_DriverUtil_Practice {
   // WebDriver driver;
    //@BeforeMethod
    //public void SetupMethod(){
     //   driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
      //  driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
    @Test
    public void GoogleSearch_Test1(){
        //Driver.getDriver()--> will return me the "driver"
        //instead of writing "driver" from now on, we will write Driver.getDriver();
        Driver.getDriver().get(ConfigurationReader.getProperty("googleURL"));
        BrowserUtils.sleep(1);
        WebElement searchBox= Driver.getDriver().findElement(By.xpath("//textarea[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
        BrowserUtils.sleep(1);
        System.out.println("driver.getTitle() = " + Driver.getDriver().getTitle());
        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle=ConfigurationReader.getProperty("searchValue")+ " - Google Search";
        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }
    @Test
    public void GoogleSearch_Test2(){
        //Driver.getDriver()--> will return me the "driver"
        //instead of writing "driver" from now on, we will write Driver.getDriver();
        Driver.getDriver().get(ConfigurationReader.getProperty("googleURL"));
        BrowserUtils.sleep(1);
        WebElement searchBox= Driver.getDriver().findElement(By.xpath("//textarea[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
        BrowserUtils.sleep(1);
        System.out.println("driver.getTitle() = " + Driver.getDriver().getTitle());
        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle=ConfigurationReader.getProperty("searchValue")+ " - Google Search";
        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }
    @AfterMethod
    public void tearDownMethod(){
        //we wont be using the selenium's quit method directly anymore.
       // Driver.getDriver().quit();  -->No more using this method
        //we will use Driver.closeDriver();
        Driver.closeDriver();
    }

}

