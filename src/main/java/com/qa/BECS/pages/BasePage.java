package com.qa.BECS.pages;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class BasePage {
   public WebDriver driver;
   public Properties prop;

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
public static void initialize(){

}


}
