package com.qa.BECS.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {
   public static WebDriver driver;
   public static Properties prop;
   public static Logger logger;

public BasePage(){
   try{
      prop = new Properties();
      FileInputStream ip = new FileInputStream("C:/Users/srilakshmi/IdeaProjects" +
              "/BECS/src/main/resources/config.properties");
      prop.load(ip);
   }catch (Exception e){
      e.printStackTrace();
   }
}

public static void initialize(){
String browsername = prop.getProperty("browser");
if(browsername.equals("chrome")){
   WebDriverManager.chromedriver().setup();
   driver = new ChromeDriver();
}else if(browsername.equals("firefox")){
   WebDriverManager.firefoxdriver().setup();
   driver = new FirefoxDriver();
}
   driver.manage().deleteAllCookies();
   driver.manage().window().maximize();
   driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   driver.get(prop.getProperty("url"));
}

public static void loadLog4j(){
   String log4Jpath = System.getProperty("C:/Users/srilakshmi/IdeaProjects/BECS/src/main/resources/log4j.properties");
   PropertyConfigurator.configure(log4Jpath);
}

public static void closeBrowser(){
   driver.quit();
}

}
