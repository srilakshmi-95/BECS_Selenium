package com.qa.BECS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {
    @FindBy(xpath = "//input[@id='ctl00_TopSearch1_txtSearch']")
    WebElement search;

    //Initializing the page object
    public SearchPage(){
        PageFactory.initElements(driver,this);
    }


}
