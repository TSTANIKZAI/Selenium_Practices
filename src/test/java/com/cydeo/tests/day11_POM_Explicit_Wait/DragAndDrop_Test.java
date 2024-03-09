package com.cydeo.tests.day11_POM_Explicit_Wait;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop_Test {
    @Test
    public void drag_drop_test(){
        // TC: Guru99 Drag and Drop Test
        // 1- Open a chrome browser
        // 2- Go to: https://demo.guru99.com/test/drag_drop.html
        Driver.getDriver().get("https://demo.guru99.com/test/drag_drop.html");
        // 3- Drag “BANK” and drop into Account area under Debit Side
        WebElement bank= Driver.getDriver().findElement(By.linkText("BANK"));
        WebElement account=Driver.getDriver().findElement(By.id("bank"));
        Actions actions=new Actions(Driver.getDriver());
        actions.dragAndDrop(bank,account).perform();
        BrowserUtils.sleep(2);
        // 4- Drag “5000” and drop into Amount area under Debit Side
        WebElement fiveK=Driver.getDriver().findElement(By.linkText("5000"));
        WebElement amount=Driver.getDriver().findElement(By.id("amt7"));
        actions.dragAndDrop(fiveK,amount).perform();
        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }
}
