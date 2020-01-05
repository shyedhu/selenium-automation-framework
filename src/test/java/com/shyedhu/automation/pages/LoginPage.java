package com.shyedhu.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.shyedhu.automation.utils.BasePage;

/** 
* This is POM(Page Object Model) class  for Login page 
* 
* POM is a design pattern to create Object Repository for Login UI elements
* 
* @author  Shyedhu
* @version 1.0 
*/
public class LoginPage extends BasePage {
	
	@FindBy(name = "uname")
	private WebElement txtUserName;

	@FindBy(name = "pass")
	private WebElement txtPassword;

	@FindBy(name = "login")
	private WebElement btnLogin;
	
	@FindBy(id = "register")
	private WebElement lnkSignUp;

	public LoginPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	/** 
	 * This method is used to perform the login functionality
	 * @param userName 
	 * @param password   
	*/
	public void login(String userName, String password){
		enterText(txtUserName,userName);
		enterText(txtPassword,password);
		clickElement(btnLogin);
	}
	
	/** 
	 * This method to click on signUp link from login page
	*/
	public void signUp(){
		clickElement(lnkSignUp);
	}

}