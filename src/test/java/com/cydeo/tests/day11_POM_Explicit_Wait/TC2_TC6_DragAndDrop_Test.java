package com.cydeo.tests.day11_POM_Explicit_Wait;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC2_TC6_DragAndDrop_Test {
  //TC2 #: Drag and drop default value verification
  @Test
  public void DragAndDrop_TC2(){
    //1. Go to https://practice.cydeo.com/drag_and_drop_circles
    Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
    BrowserUtils.sleep(1);
    // 2. Verify big circle default text is as below.
    WebElement DefaultCircleText=Driver.getDriver().findElement(By.id("droptarget"));
    String actualCircleText=DefaultCircleText.getText();
    String expectedCircleText="Drag the small circle here.";
    BrowserUtils.sleep(1);
    System.out.println("Actual Circle Text = " + actualCircleText);
    // 3. Assert:
    //-Text in big circle changed to: “Drag the small circle here.”
    Assert.assertTrue(actualCircleText.equals(expectedCircleText));
    BrowserUtils.sleep(1);
    Driver.closeDriver();
  }

  //TC3 #: Drag and drop into the big circle
  @Test
  public void DragAndDrop_TC3(){
  // 1. Go to https://practice.cydeo.com/drag_and_drop_circles
    Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
    BrowserUtils.sleep(1);
  //2. Drag and drop the small circle to bigger circle.
    WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
    WebElement BiggerCircle=Driver.getDriver().findElement(By.id("droptarget"));
    BrowserUtils.sleep(3);
    Actions actions=new Actions(Driver.getDriver());
    actions.dragAndDrop(smallCircle,BiggerCircle).perform();
    BrowserUtils.sleep(2);
    //3. Assert:
    //-Text in big circle changed to: “You did great!”
    WebElement TextAfterDrop=Driver.getDriver().findElement(By.id("droptarget"));
    String actualTextAfterDrop=TextAfterDrop.getText();
    String expectedTextAfterDrop="You did great!";
    System.out.println("Actual Text After Drop: " + actualTextAfterDrop);
    BrowserUtils.sleep(2);
    Assert.assertEquals(actualTextAfterDrop,expectedTextAfterDrop);
    BrowserUtils.sleep(2);
    Driver.closeDriver();
  }

  //TC4 #: Click and hold
  @Test
  public void ClickAndHold_TC4(){
   // 1. Go to https://practice.cydeo.com/drag_and_drop_circles
    Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
    //2. Click and hold the small circle.
    WebElement ClickAndHoldScircle=Driver.getDriver().findElement(By.id("draggable"));
    WebElement AnyWhere=Driver.getDriver().findElement(By.xpath("//nav[@class='navbar navbar-expand-sm bg-light']"));
    Actions actions=new Actions(Driver.getDriver());
    actions.clickAndHold(ClickAndHoldScircle).moveToElement(AnyWhere).perform();
    BrowserUtils.sleep(2);
    //3. Assert:
    //-Text in big circle changed to: “Drop here.
    WebElement TextAfterClickAndHold=Driver.getDriver().findElement(By.id("droptarget"));
    String actualTextAfterClickAndHold=TextAfterClickAndHold.getText();
    String expectedTextAfterClickAndHold="Drop here.";
    Assert.assertEquals(actualTextAfterClickAndHold,expectedTextAfterClickAndHold);
    System.out.println("actualTextAfterClickAndHold = " + actualTextAfterClickAndHold);

    Driver.closeDriver();
  }
//TC5 #: Drag and drop outside of the big circle
  @Test
  public void DragAndDrop_outsideOfCircle_TC5(){
    // 1. Go to https://practice.cydeo.com/drag_and_drop_circles
    Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
    //2. Click and hold the small circle.
    WebElement smallCircle1=Driver.getDriver().findElement(By.id("draggable"));
    WebElement OutSideOfCircle=Driver.getDriver().findElement(By.xpath("//nav[@class='navbar navbar-expand-sm bg-light']"));
    Actions actions=new Actions(Driver.getDriver());
    actions.dragAndDrop(smallCircle1,OutSideOfCircle).release().perform();
    BrowserUtils.sleep(2);
    //3. Assert:
    //-Text in big circle changed to: “Try again!”
    WebElement TextAfterDragAndDrop=Driver.getDriver().findElement(By.id("droptarget"));
    String actualTextAfterDragAndDrop=TextAfterDragAndDrop.getText();
    String expectedTextAfterDragAndDrop="Try again!";
    System.out.println("Actual Text AfterDrag And Drop = " + actualTextAfterDragAndDrop);
    Assert.assertEquals(actualTextAfterDragAndDrop,expectedTextAfterDragAndDrop);
    Driver.closeDriver();
  }
// TC6 #: Drag and hover
  @Test
  public void DragAndHover_TC6(){
    // 1. Go to https://practice.cydeo.com/drag_and_drop_circles
    Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
    BrowserUtils.sleep(1);
    // 2. Drag the small circle on top of the big circle, hold it, and verify.
    WebElement smallCircle2=Driver.getDriver().findElement(By.id("draggable"));
    WebElement BiggerCircle2=Driver.getDriver().findElement(By.id("droptarget"));
    BrowserUtils.sleep(3);
    Actions actions=new Actions(Driver.getDriver());
    actions.clickAndHold(smallCircle2).moveToElement(BiggerCircle2).perform();
    BrowserUtils.sleep(2);
    //3. Assert:
    // -Text in big circle changed to: “Now drop...”
    WebElement TextAfterDragAndHover=Driver.getDriver().findElement(By.id("droptarget"));
    String actualTextAfterDragAndHover=TextAfterDragAndHover.getText();
    String expectedTextAfterDragAndHover="Now drop...";
    System.out.println("ActualText After Drag And Hover = " + actualTextAfterDragAndHover);
    BrowserUtils.sleep(2);
    Assert.assertEquals(actualTextAfterDragAndHover,expectedTextAfterDragAndHover);
    BrowserUtils.sleep(2);
    Driver.closeDriver();
  }
}
