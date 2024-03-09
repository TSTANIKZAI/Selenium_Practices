package com.cydeo.tests.day10_Upload_actions_jsexecutor;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3_ActionHover_Test {
    //TC #3: Hover Test
@Test
    public void HoveringTest(){
    //1. Go to https://practice.cydeo.com/hovers
    Driver.getDriver().get("https://practice.cydeo.com/hovers");


    WebElement image1=Driver.getDriver().findElement(By.xpath("(//img)[1]"));/*if i see the locator with same details then we need to
    select by index if there is morethan one locator with same information and they are not sibling*/
    BrowserUtils.sleep(1);
    //*. Locate all the "user" headers here.
    WebElement user1=Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
    BrowserUtils.sleep(1);
    //to be able to hover on image, we need to create Actions class object and pass 'driver' in the constructor.
    Actions actions=new Actions(Driver.getDriver());
    BrowserUtils.sleep(2);
    //2. Hover over to first image
    actions.moveToElement(image1).perform();
    BrowserUtils.sleep(1);
    //3. Assert:
    //A. “name: user1” is displayed
    Assert.assertTrue(user1.isDisplayed());
    BrowserUtils.sleep(1);
    //4. Hover over to second image
    WebElement image2=Driver.getDriver().findElement(By.xpath("(//img)[2]"));
    BrowserUtils.sleep(1);
    WebElement user2=Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
    BrowserUtils.sleep(1);
    actions.moveToElement(image2).perform();
    BrowserUtils.sleep(1);
    //5. Assert:
    //A. “name: user2” is displayed
    Assert.assertTrue(user2.isDisplayed());
    BrowserUtils.sleep(1);
    //6. Hover over to third image
    WebElement image3=Driver.getDriver().findElement(By.xpath("(//img)[3]"));
    BrowserUtils.sleep(1);
    WebElement user3=Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));
    BrowserUtils.sleep(1);
    actions.moveToElement(image3).perform();
    BrowserUtils.sleep(1);
    //7. Confirm:
    //A. “name: user3” is displayed.
    Assert.assertTrue(user3.isDisplayed());
    Driver.closeDriver();
}
}

