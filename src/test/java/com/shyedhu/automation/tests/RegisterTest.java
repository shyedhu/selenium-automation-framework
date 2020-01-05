package com.shyedhu.automation.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import com.shyedhu.automation.utils.BaseTest;
import com.shyedhu.automation.utils.DataHelper;
import com.shyedhu.automation.pages.LoginPage;
import com.shyedhu.automation.pages.RegisterPage;
import com.shyedhu.automation.pages.HomePage;

/** 
* This is test class for Register functionality
* 
* @author  Shyedhu
* @version 1.0 
*/
public class RegisterTest extends BaseTest {
	
	LoginPage loginPage;
	RegisterPage registerPage;
	HomePage homePage;

	@Test(dataProvider="RegisterProvider",dataProviderClass=DataHelper.class)
	public void testRegister(String userName, String email, String firstName, String lastName, String password, String rePassword,String country)  
	{
		loginPage = new LoginPage(driver);
		loginPage.signUp();
		registerPage = new RegisterPage(driver);
		registerPage.register(userName,email,firstName,lastName,password,rePassword,country);
		homePage = new HomePage(driver);
		String welcomeText = homePage.getUserName();
		Assert.assertTrue(welcomeText.contains("Shyedhu"));
	}
	
}