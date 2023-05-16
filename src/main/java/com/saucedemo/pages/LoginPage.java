package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@name='user-name']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='login-button']")
    WebElement clickOnLogin;

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement verifyProduct;

    public void enterUserName(String username)
    {
        sendTextToElement(userNameField,username);
        log.info("Enter username : " + userNameField.toString());
    }

    public void enterPassword(String password)
    {
        sendTextToElement(passwordField,password);
        log.info("Enter password : " + passwordField.toString() + "<br>");
    }

    public void clickOnLoginButton()
    {
        clickOnElement(clickOnLogin);
        log.info("Click on login button : " +clickOnLogin + "<br>");
    }

    public String verifyProduct()
    {
        String verifyProducts = getTextFromElement(verifyProduct);
        log.info("Getting text from : " + verifyProduct.toString());
        return verifyProducts;
    }
}
