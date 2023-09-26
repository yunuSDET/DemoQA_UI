package com.demoqa.pages;

import com.demoqa.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="userName")
    public WebElement inputUserName;


    @FindBy(id="password")
    public WebElement inputPassword;


    @FindBy(id = "login")
    public WebElement buttonLogin;


    @FindBy(id = "newUser")
    public WebElement buttonNewUser;








}
