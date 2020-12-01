package com.qa.BECS.test;

import com.qa.BECS.pages.HomePage;
import com.qa.BECS.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarios extends BaseTest {
    LoginPage loginPage;
    HomePage homepage;

    @Test(priority = 1)
    public void verifyLoginPageTitle(){
        String title = loginPage.getLoginPageTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }
    @Test(priority = 2)
    public void verifyLoginTest(){
        homepage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
    }
}
