package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.util.Utilities;

public class AlertPage extends TestBase {
	
	Utilities utility = new Utilities();

	@FindBy ( xpath="//span[text()='Alert']") 
	WebElement hdAlert;
	
	@FindBy (xpath="//button[@class='btn btn-primary']") 
	WebElement btnOK;
	
	public AlertPage(){
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * click on OK button
	 * @return object Homepage;
	 */
	public HomePage clickOK(){
		utility.waitUntilVisible(hdAlert, 5);
		if(btnOK.isDisplayed()){
			btnOK.click();
		}
		return new HomePage();
	}
	
	/**
	 * Validate home page alert is displayed
	 * @return
	 */
	public boolean validateAlert(){
		return btnOK.isDisplayed();
	}
}
