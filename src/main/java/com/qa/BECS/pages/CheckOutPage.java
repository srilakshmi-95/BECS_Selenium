package com.qa.BECS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement proceed;

    //Initializing the page object
    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }
    public void continueOrder() {
        proceed.click();
    }

}
