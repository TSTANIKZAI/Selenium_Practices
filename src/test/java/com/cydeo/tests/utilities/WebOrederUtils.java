package com.cydeo.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebOrederUtils {
    public static String ReturnOrderDate(WebDriver driver, String CustomerName){
        String Locater="//td[.='"+CustomerName+"']/following-sibling::td[3]";//Here we will copy first all line o
        //Locater for an element, then we will replace or make dynamic
        WebElement CustomerDateCell=driver.findElement(By.xpath(Locater));
        return CustomerDateCell.getText();
       /* String MiddleName="Tariq";
        String FullName="Mohammad"+MiddleName+"Stanikzai";
        System.out.println("Full Name= "+FullName);*/

    }
    public static void OrderVerify(WebDriver driver, String CustomerName, String ExpectedOrderDate) {
        String Locator = "//td[.='" + CustomerName + "']/following-sibling::td[3]";
        WebElement CustomerDateCell = driver.findElement(By.xpath(Locator));
        String actualOrderDate = CustomerDateCell.getText();
        Assert.assertEquals(actualOrderDate, ExpectedOrderDate);

    }
    /*Method #1 info:
• Name: returnOrderDate ()
• Return type: String
• Arg1: WebDriver driver
• Arg2: String costumerName
This method should accept a costumerName and return the costumer order date
as a String.*/


}
/*TC #2: Web table practice Task1 cont.
1. Create a new class called WebTableUtils.
2. Create two methods to verify order

Method #2 info:
• Name: orderVerify ()
• Return type: void
• Arg1: WebDriver driver
• Arg2: String costumerName
• Arg3: String expectedOrderDate
This method should accept above mentioned arguments and internally assert
expectedOrderDate matching actualOrderDate.*/