package com.cydeo.tests.day10_Upload_actions_jsexecutor;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//TC #4: Scroll practice
public class TC4_TC5_Scroling_Practice {
    @Test
    public void TC4_TC5_ScrolingPractice(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");
        //3- Scroll down to “Powered by CYDEO”
        WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));
        //create action class object
        // 4- Scroll using Actions class “moveTo(element)” method
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(cydeoLink).perform();
        BrowserUtils.sleep(2);

        //TC #5: Scroll practice 2

        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_DOWN).perform();
        BrowserUtils.sleep(3);
        Driver.closeDriver();


    }
}
/*



*/