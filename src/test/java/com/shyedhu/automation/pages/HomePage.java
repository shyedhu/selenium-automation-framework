package com.shyedhu.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.shyedhu.automation.utils.BasePage;

/** 
* This is POM(Page Object Model) class  for Home page 
* 
* POM is a design pattern to create Object Repository for Home UI elements
* 
* @author  Shyedhu
* @version 1.0 
*/
public class HomePage extends BasePage {
	
	@FindBy(tagName = "body")
	private WebElement txtBody;

	public HomePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	/** 
	 * This method is used to get the user name text.  
	 * @return String This returns user name text. 
	*/
	public String getUserName(){
		waitForElement();
		return txtBody.getText();	
		
	}
    

}