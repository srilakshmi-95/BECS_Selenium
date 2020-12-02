package com.qa.BECS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {
    @FindBy(xpath = "//body/form[@id='aspnetForm']/div[@id='site-wrapper']/div[2]/div[3]/div[2]/div[1]/div[4]/div[5]/a[1]/input[1]")
    WebElement book;
    @FindBy(xpath = "//input[@id='BookCart_lvCart_imgPayment']")
    WebElement buy;

    //Initializing the page object
    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectItem() {
        book.click();
    }

    public void placeOrder() {
        driver.switchTo().frame("cbox1606909541347");
        try {
            Thread.sleep(2000);
            buy.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}