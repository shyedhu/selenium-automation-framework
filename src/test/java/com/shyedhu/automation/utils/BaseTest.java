package com.shyedhu.automation.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

/** 
* This is BaseTest class for selenium framework
* 
* @author  Shyedhu
* @version 1.0 
*/
public class BaseTest {
		 private static final String BASE_URL = "https://shyedhu.github.io/demo.shyedhu.com/";
		 public static WebDriver driver;
	  
	    @BeforeMethod(alwaysRun = true)
	    public void setUp() {
	    	driver = DriverFactory.getDriver();
	    	// Delete all cookies
	    	driver.manage().deleteAllCookies();  
	        driver.get(BASE_URL);
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	    }

	    @AfterMethod(alwaysRun = true)
	    public void teardown() {
	        if (driver != null)
	        {
	        	driver.quit();
	        }
	          
	    }
	
}