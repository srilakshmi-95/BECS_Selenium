package com.qa.BECS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BasePage {
    @FindBy(xpath = "//body/form[@id='aspnetForm']/div[@id='site-wrapper']/div[2]/div[3]/div[2]/div[1]/div[4]/div[5]/a[1]/input[1]")
    WebElement logout;

    //Initializing the page object
    public LogoutPage() {
        PageFactory.initElements(driver, this);
    }

    public void accountLogout() {
        logout.click();
    }

}
