package com.qa.BECS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BasePage {
    @FindBy(id ="ctl00_lnkbtnLogout")
    WebElement logout;

    //Initializing the page object
    public LogoutPage() {
        PageFactory.initElements(driver, this);
    }

    public void accountLogout() throws InterruptedException {
        Thread.sleep(2000);
        logout.click();
    }

}
