package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

	public SignupPage(WebDriver driver) {
		super(driver);
		
	}
	//locators
	@FindBy(xpath="//p[normalize-space()='Email Address already exist!']")
	WebElement emailtext;
	
	//methods
	public boolean emailtext() {
		return emailtext.isDisplayed();
	}

}
