package com.qa.BECS.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdderssPage extends BasePage{
    @FindBy(xpath = "//input[@id='ctl00_cpBody_txtNewRecipientName']")
    WebElement name;
    @FindBy(xpath = "//input[@id='ctl00_cpBody_txtNewCompanyName']")
    WebElement company;
    @FindBy(xpath = "//textarea[@id='ctl00_cpBody_txtNewAddress']")
    WebElement street;
    @FindBy(xpath = "//select[@id='ctl00_cpBody_ddlNewCountry']")
    WebElement country;
    @FindBy(xpath = "//select[@id='ctl00_cpBody_ddlNewState']")
    WebElement state;
    @FindBy(xpath = "//input[@id='ctl00_cpBody_txtNewCity']")
    WebElement city;
    @FindBy(xpath = "//input[@id='ctl00_cpBody_txtNewPincode']")
    WebElement zip;
    @FindBy(xpath = "//input[@id='ctl00_cpBody_txtNewPhone']")
    WebElement phone;
    @FindBy(xpath = "//input[@id='ctl00_cpBody_txtNewMobile']")
    WebElement mobile;
    @FindBy(xpath = "//input[@id='ctl00_cpBody_imgSaveNew']")
    WebElement save;

    //Initializing the page object
    public AdderssPage() {
        PageFactory.initElements(driver, this);
    }

    public void addAddress(String na, String comp, String str,
                           String cou,String sta, String cit,String zi, String ph,String mob) {
        name.sendKeys(na);
        company.sendKeys(comp);
        street.sendKeys(str);
        Select select = new Select(country);
        select.selectByVisibleText(cou);
        Select select1 = new Select(state);
        select.selectByVisibleText(sta);
        city.sendKeys(cit);
        zip.sendKeys(zi);
        phone.sendKeys(ph);
        mobile.sendKeys(mob);
    }

}
