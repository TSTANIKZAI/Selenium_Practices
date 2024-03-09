package com.cydeo.Pages;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Library_Login_Page {

    //#1-initialize the object of the class and the driver instance inside the constructor.
    public Library_Login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //#2- Use find by annotation instead of findElement method.
    @FindBy(xpath = "//button[.='Sign in']")
public WebElement signInButton;

   @FindBy(xpath = "//div[.='This field is required.']")
public WebElement fieldRequiredErrorMessage;

   @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
public WebElement enterValidEmailErrorMessage;

   @FindBy(id="inputEmail")
    public WebElement emailInput;

   @FindBy(id="inputPassword")
    public WebElement PasswordInput;

   @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement enterValidPasswordAndEmailErrorMessage;

}
/**/