
package com.cydeo.tests.Live.DAY9;

import com.cydeo.tests.Base.TestBase;
import com.cydeo.tests.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
// TC: Guru99 Upload Test
public class UploadFile extends TestBase {
@Test
    public void upload_file_Test(){
    //1. Go to  “https://demo.guru99.com/test/upload”
    driver.get("https://demo.guru99.com/test/upload");
    //2. Upload file into Choose File
    WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
    chooseFile.sendKeys("/Users/stanikzai/Downloads/Day 2 Class Notes.txt");
    BrowserUtils.sleep(2);
    //3. Click terms of service check box
    driver.findElement(By.cssSelector("input#terms")).click();
    BrowserUtils.sleep(1);
    //4. Click Submit File button
    driver.findElement(By.cssSelector("button.btn.buttoncolor.has-spinner")).click();
    //5. Verify expected message appeared.
    // Expected: “1 file has been successfully uploaded.
    WebElement resultMassage=driver.findElement(By.xpath("//h3[@id='res']/center"));
    System.out.println(resultMassage);

    String actulaText=resultMassage.getText();
    String ExpectedText="1 file\nhas been successfully uploaded.";
    Assert.assertEquals(actulaText,ExpectedText);

}
}
