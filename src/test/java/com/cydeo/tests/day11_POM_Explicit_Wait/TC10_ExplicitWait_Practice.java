package com.cydeo.tests.day11_POM_Explicit_Wait;

import com.cydeo.Pages.DynamicLoad7Page;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

//TC#10 : Dynamically Loaded Page Elements 7
public class TC10_ExplicitWait_Practice {

    @Test
    public void test10_wait_untilTitle_Change(){
      //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        //load7Page.doneMessage.click();
        //2. Wait until title is “Dynamic title”
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        DynamicLoad7Page dynamicLoad7Page=new DynamicLoad7Page();
        //3. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());
        //4. Assert: Image is displayed.
        Assert.assertTrue(dynamicLoad7Page.DynamicImage.isDisplayed());
    }
}
