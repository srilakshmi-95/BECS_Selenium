package com.qa.BECS.test;

import com.qa.BECS.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarios extends BaseTest {
    LoginPage loginPage;
    HomePage homepage;
    SearchPage searchpage;
    CheckOutPage checkoutpage;
    AdderssPage addresspage;
    OrderReviewPage Orderreviewpage;
    LogoutPage logoutpage;


    @Test(priority = 2)
    public void verifyLoginPageTitle(){
        loginPage = new LoginPage();
        String title = loginPage.getLoginPageTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }
    @Test(priority = 1)
    public void verifyLoginTest(){
        loginPage = new LoginPage();
        loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
    }
    @Test(priority = 3)
    public void verifySearchTest(){
        homepage = new HomePage();
        homepage.searchItem(prop.getProperty("book"));
    }
    @Test(priority = 4)
    public void verifySearchSelect(){
        searchpage = new SearchPage();
        searchpage.selectItem();
    }
    @Test(priority = 5)
    public void verifyPlaceOrder()  {
        searchpage = new SearchPage();
        searchpage.placeOrder();
    }

    @Test(priority = 6)
    public void verifyContinueOrder()  {
        checkoutpage = new CheckOutPage();
        checkoutpage.continueOrder();
    }
    @Test(priority = 7)
    public void verifyAddress()  {
        addresspage = new AdderssPage();
        addresspage.addAddress(prop.getProperty("name"), prop.getProperty("company"), prop.getProperty("street"), prop.getProperty("country"),
                prop.getProperty("state"), prop.getProperty("city"), prop.getProperty("zip"), prop.getProperty("phone"), prop.getProperty("mobile"));
    }
     @Test(priority = 8)
    public void verifyReview()  {
        Orderreviewpage = new OrderReviewPage();
        Orderreviewpage.review();
    }
    @Test(priority = 9)
    public void verifyAccountLogout() throws InterruptedException {
        logoutpage = new LogoutPage();
        logoutpage.accountLogout();
    }

}
