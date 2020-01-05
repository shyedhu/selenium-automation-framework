package com.shyedhu.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/** 
* This is BasePage class for building the custom method for selenium framework
* 
* @author  Shyedhu
* @version 1.0 
*/
public abstract class BasePage {
	
	public WebDriver webDriver;

	public BasePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public String getTitle() {
		return webDriver.getTitle();
	}
	/** 
	 * This custom method is used to enter text value on webPage
	 * @param webElement 
	 * @param elementText   
	*/
	public void enterText(WebElement webElement,String elementText)
	{
		webElement.sendKeys(elementText);
	}
	
	/** 
	 * This custom method is used to click the Element on webPage
	 * @param webElement  
	*/
	public void clickElement(WebElement webElement)
	{
		webElement.click();
	}
	
	/** 
	 * This custom method is used to select drop down text on webPage
	 * @param webElement  
	 * @param elementText  
	*/
	public void selectDropDownByTxt(WebElement webElement,String elementText)
	{
		Select dropDown = new Select(webElement);
		dropDown.selectByVisibleText(elementText);
	}
	
	/** 
	 * This custom method is used to select drop down index on webPage
	 * @param webElement  
	 * @param elementIndex  
	*/
	public void selectDropDownByIndex(WebElement webElement,int elementIndex)
	{
		Select dropDown = new Select(webElement);
		dropDown.selectByIndex(elementIndex);
	}
	
	/** 
	 * This custom method is used to wait for page locator on webPage
	 * @param locator  
	 * @return WebElement This returns Web Element value.
	*/
	public WebElement waitForPageLocatorLoad(By locator)
	{
		WebElement webElement = (new WebDriverWait(getWebDriver(),60)).until(ExpectedConditions.visibilityOfElementLocated(locator));
		
		return webElement;
	}
	public void waitForElement(int seconds)
	{
		try{
			Thread.sleep(seconds);	
		}
		catch(InterruptedException ie){
			//TODO
		}
	}
	public void waitForElement()
	{
		try{
			Thread.sleep(3000);	
		}
		catch(InterruptedException ie){
			//TODO
		}
	}	
	
}