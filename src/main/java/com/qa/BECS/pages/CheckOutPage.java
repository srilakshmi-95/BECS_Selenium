package com.qa.BECS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BasePage {
    @FindBy(xpath = "//a[@href='shippingoption.aspx']")
    WebElement proceed;

    //Initializing the page object
    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }
    public void continueOrder() {
        try {
            Thread.sleep(2000);
            proceed.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
