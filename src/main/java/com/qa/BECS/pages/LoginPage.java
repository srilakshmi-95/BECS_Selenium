package com.qa.BECS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtEmail']")
    WebElement email;
    @FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_txtPassword']")
    WebElement password;
    @FindBy(xpath = "//input[@id='ctl00_phBody_SignIn_btnLogin']")
    WebElement login;

    //Initializing the page object
    public LoginPage(){
        PageFactory.initElements(driver,this);
        logger = Logger.getLogger(LoginPage.class.getName());
    }
    public String getLoginPageTitle(){
        return driver.getTitle();
    }
    public void login(String id, String pwd){
        logger.info("Logging into account");
        email.sendKeys(id);
        password.sendKeys(pwd);
        login.click();
    }

}
