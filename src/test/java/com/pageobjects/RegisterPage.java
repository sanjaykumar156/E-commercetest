package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
	//locators
	
	@FindBy(xpath="//img[@alt='Website for automation practice']")
	WebElement logo;
	
	@FindBy(linkText = "Signup / Login")
	WebElement loginbtn;
	
	@FindBy(xpath ="//h2[normalize-space()='New User Signup!']")
	WebElement textcheck;
	
	@FindBy(name ="name")
	WebElement txtname;
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement txtemail;
	
	@FindBy(xpath ="//button[normalize-space()='Signup']")
	WebElement signupbtn;
	
	@FindBy(xpath ="//b[normalize-space()='Enter Account Information']")
	WebElement text1check;
	
	@FindBy(id="id_gender1")
	WebElement radioclick;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id ="days")
	WebElement selectdays;
	
	@FindBy(id ="months")
	WebElement selectmonths;
	
	@FindBy(id ="years")
	WebElement selectyears; 
	
	@FindBy(id ="newsletter")
	WebElement selectnews;
	
	@FindBy(id ="optin")
	WebElement selectoffer;
	
	@FindBy(id="first_name")
	WebElement txtfirstname;
	
	@FindBy(id="last_name")
	WebElement txtlastname;
	
	@FindBy(id="company")
	WebElement txtcompany;
	
	@FindBy(id="address1")
	WebElement txtaddress;
	
	@FindBy(id="country")
	WebElement selectcountry;
	
	@FindBy(id="state")
	WebElement txtstate;
	
	@FindBy(id="city")
	WebElement txtcity;
	
	@FindBy(id="zipcode")
	WebElement txtpincode;
	
	@FindBy(id="mobile_number")
	WebElement txtmobile;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/form/button")
	WebElement createbtn;
	
	@FindBy(xpath="//b[normalize-space()='Account Created!']")
	WebElement text2check;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement continuebtn;
	
	@FindBy(xpath="//li[10]//a[1]")
	WebElement text3check;
	
	@FindBy(xpath="//a[normalize-space()='Delete Account']")
	WebElement deletebtn;
	
	@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
	WebElement text4check;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	WebElement finalcontinurbtn;
	
	//methods
	
	public boolean logocheck() {
		return logo.isDisplayed();
		
	}
	
	public void loginbutton() {
		loginbtn.click();
	}
	public String textcheck() {
		String text = textcheck.getText();
		return text;
	}
	
	public void txtname(String name) {
		txtname.sendKeys(name);
	}
	
	public void email(String email) {
		txtemail.sendKeys(email);
	}
	public void signup() {
		signupbtn.click();
	}
	
	public String text1() {
		String text1 = text1check.getText();
		return text1;
	}
	public void radiobutton() {
		radioclick.click();
	}
	public void password(String pswd) {
		txtpassword.sendKeys(pswd);
	}
	public Select days() {
		Select d = new Select(selectdays);
		d.selectByVisibleText("4");
		return d;
	}
	
	public Select months() {
		Select m = new Select(selectmonths);
		m.selectByVisibleText("February");
		return m;
	}
	public Select years() {
		Select y = new Select(selectyears);
		y.selectByVisibleText("2000");
		return y;
	}
	public void newsletter() {
		selectnews.click();
	}
	public void offer() {
		selectoffer.click();
	}
	public void firstname(String fname) {
		txtfirstname.sendKeys(fname);
	}
	public void lastname(String lname) {
		txtlastname.sendKeys(lname);
		
	}
	public void company(String company) {
		txtcompany.sendKeys(company);
	}
	public void address(String add) {
		txtaddress.sendKeys(add);
	}
	public WebElement country() {
		return selectcountry;
		
	}
	public void state(String state) {
		txtstate.sendKeys(state);
	}
	public void city(String city) {
		txtcity.sendKeys(city);
	}
	public void postal(String post) {
		txtpincode.sendKeys(post);
	}
	public void mobile (String mob) {
		txtmobile.sendKeys(mob);
	}
	public void create() {
		createbtn.click();
		
		
	}
	public String text2check() {
		String actualtext2 = text2check.getText();
		return actualtext2;
	}
	public void continuebutton() {
		continuebtn.click();
	}
	public String text3() {
		String actualtext3= text3check.getText();
		return actualtext3;
	}
	public void delete() {
		deletebtn.click();
	}
	public String text4() {
		String actualtext4=text4check.getText();
		return actualtext4;
	}
	public void finalcontinue() {
		finalcontinurbtn.click();
	}
	
	
	

}
