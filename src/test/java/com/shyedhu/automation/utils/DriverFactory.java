package com.shyedhu.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/** 
* This is DriverFactory class for initialise browsers
* 
* @author  Shyedhu
* @version 1.0 
*/
public class DriverFactory {
  
    public static WebDriver getDriver() {
        String browser = System.getProperty("propertyName");
      
        if (browser.equalsIgnoreCase("chrome"))
        {
        	 WebDriverManager.chromedriver().setup();
             return new ChromeDriver();
        }
        
        else if (browser.equalsIgnoreCase("firefox"))
        { 
        	    WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
        }
           
        else if (browser.equalsIgnoreCase("ie"))
        {
        	WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        	
        }
        else {
        	 WebDriverManager.chromedriver().setup();
             return new ChromeDriver();
        }
           
    }

  
}