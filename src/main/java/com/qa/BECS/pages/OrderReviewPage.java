package com.qa.BECS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderReviewPage extends BasePage{
    @FindBy(xpath = "//input[@id='ctl00_cpBody_ShoppingCart_lvCart_savecontinue']")
    WebElement save;

    //Initializing the page object
    public OrderReviewPage() {
        PageFactory.initElements(driver, this);
    }
    public void review() {
        save.click();
    }

}
