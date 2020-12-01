package com.qa.BECS.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {
   public  WebDriver driver;
   public static Properties prop;

public BasePage(){
   try{
      prop = new Properties();
      FileInputStream ip = new FileInputStream("C:\\Users\\srilakshmi\\IdeaProjects" +
              "\\BECS\\src\\main\\resources\\config.properties");
      prop.load(ip);
   }catch (Exception e){
      e.printStackTrace();
   }
}
   public BasePage(WebDriver driver){
      this.driver = driver;
   }

public static void initialize(){
String browsername = prop.getProperty("browser");
if(browsername.equals("chrome")){
   WebDriverManager.chromedriver().setup();
}else if(browsername.equals("firefox")){
   WebDriverManager.firefoxdriver().setup();
}
   driver.manage().deleteAllCookies();
   driver.manage().window().maximize();
   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.get(prop.getProperty("url"));
}

public static void closeBrowser(){
   driver.quit();
}

}
