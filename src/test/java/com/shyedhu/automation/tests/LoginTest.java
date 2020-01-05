package com.shyedhu.automation.tests;


import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import com.shyedhu.automation.utils.BaseTest;
import com.shyedhu.automation.pages.LoginPage;
import com.shyedhu.automation.pages.HomePage;

/** 
* This is test class for login functionality
* 
* @author  Shyedhu
* @version 1.0 
*/
public class LoginTest extends BaseTest {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Test
	@Parameters({"username","pass"})
	public void testLogin(String username,String pass)
	{
		loginPage = new LoginPage(driver);
		loginPage.login(username,pass);
		homePage = new HomePage(driver);
		String welcomeText = homePage.getUserName();
		Assert.assertTrue(welcomeText.contains("Shyedhu"));
	}
}