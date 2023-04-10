package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogutPage extends BasePage {

	public LogutPage(WebDriver driver) {
		super(driver);
		
	}
	//locators
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement btnlogout;
	
	@FindBy(xpath = "//h2[@class='or']")
	WebElement txtor;
	
	//methods
	
	public void logout() {
		btnlogout.click();
	}
	public boolean textor() {
		return txtor.isDisplayed();
	}

}
