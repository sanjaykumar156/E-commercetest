package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IcorrectLoginpage extends BasePage {

	public IcorrectLoginpage(WebDriver driver) {
		super(driver);
		
	}
	//locators
	
	@FindBy(xpath="//h2[normalize-space()='Login to your account']")
	WebElement textlogin;
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement txtemail;
	
	@FindBy(name ="password")
	WebElement txtpassword;
	
	@FindBy(xpath ="//button[normalize-space()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//p[normalize-space()='Your email or password is incorrect!']")
	WebElement failchek;
	
	
	//methods
	
	public String textlogin() {
		String actualtect = textlogin.getText();
		return actualtect;
		
	}
	public void email(String email) {
		txtemail.sendKeys(email);
	}
	public void password(String pswd) {
		txtpassword.sendKeys(pswd);
	}
	
	public void loginbutton() {
		loginbtn.click();
	}
	public String textfail() {
		String actualtext1 = failchek.getText();
		return actualtext1;
	}

}
