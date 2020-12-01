package com.qa.BECS.test;

import com.qa.BECS.pages.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BasePage {

    @BeforeMethod
    public void setup(){
        initialize();
    }
    @AfterMethod
    public void teardown(){
        closeBrowser();
    }
}
