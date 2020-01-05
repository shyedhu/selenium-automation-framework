package com.shyedhu.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.shyedhu.automation.utils.BasePage;

/** 
* This is POM(Page Object Model) class  for Register page 
* 
* POM is a design pattern to create Object Repository for Register UI elements
* 
* @author  Shyedhu
* @version 1.0 
*/
public class RegisterPage extends BasePage {
	
	@FindBy(name = "uname")
	private WebElement txtUserName;
	
	@FindBy(name = "email")
	private WebElement txtEmail;
	
	@FindBy(name = "fname")
	private WebElement txtFirstName;
	
	@FindBy(name = "lname")
	private WebElement txtLastName;
	
	@FindBy(name = "pass")
	private WebElement txtPassword;

	@FindBy(name = "re-pass")
	private WebElement txtRePassword;
	
	@FindBy(id = "male")
	private WebElement rbGender;
	
	@FindBy(tagName = "select")
	private WebElement ddlCountry;
	
	@FindBy(name = "register")
	private WebElement btnRegister;

	public RegisterPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	/** 
	 * This method is used to perform the register functionality
	 * @param userName 
	 * @param email   
	 * @param firstName  
	 * @param lastName  
	 * @param password  
	 * @param rePassword  
	 * @param country   
	*/
	public void register(String userName, String email, String firstName, String lastName, String password, String rePassword,String country){		
		waitForElement(1000);
		enterText(txtUserName,userName);
		enterText(txtEmail,email);
		enterText(txtFirstName,firstName);
		enterText(txtLastName,lastName);
		enterText(txtPassword,password);
		enterText(txtRePassword,rePassword);
		clickElement(rbGender);
		selectDropDownByTxt(ddlCountry,country);
		waitForElement(500);
		clickElement(btnRegister);
	}

}