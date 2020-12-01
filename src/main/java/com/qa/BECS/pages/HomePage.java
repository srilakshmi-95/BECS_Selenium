package com.qa.BECS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    @FindBy(xpath = "//input[@id='ctl00_TopSearch1_txtSearch']")
    WebElement search;
    @FindBy(xpath = "//input[@id='ctl00_TopSearch1_Button1']")
    WebElement searchBtn;

    //Initializing the page object
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public SearchPage searchItem(String item){
        search.sendKeys(item);
        searchBtn.click();
        return new SearchPage();
    }

}
