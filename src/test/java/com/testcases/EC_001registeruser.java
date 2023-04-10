package com.testcases;

import java.time.Duration;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.pageobjects.RegisterPage;
import com.testbase.BaseClass;

public class EC_001registeruser extends BaseClass{
	
	@Test
	public void registeruser() {
		Logger log = Logger.getLogger(EC_001registeruser.class);
		PropertyConfigurator.configure("log4j.properties");
		RegisterPage rp = new RegisterPage(driver);
		Assert.assertEquals(rp.logocheck(), true);
//		log.info("checking the application logo is present");
		rp.loginbutton();
		String atualtext= rp.textcheck();
		String expectedtext = "New User Signup!";
		
		if(atualtext.equals(expectedtext)) {
			Assert.assertTrue(true);
		}else {
			Assert.fail("text not matched");
		}
		rp.txtname(rb.getString("name"));
		rp.email(rb.getString("email"));
		rp.signup();
		String actualtext1 = rp.text1();
		String expectedtext1 ="ENTER ACCOUNT INFORMATION";
		Assert.assertEquals(actualtext1, expectedtext1);
		
		rp.radiobutton();
		rp.password(rb.getString("password"));
		rp.days();
		rp.months();
		rp.years();
		try {
			rp.newsletter();
		}catch(ElementClickInterceptedException e) {
			e.getCause();
		}
		
		rp.offer();
		rp.firstname("sanjay");
		rp.lastname("kumar");
		rp.company("cog");
		rp.address(rb.getString("address"));
		
		Select cou = new Select(rp.country());
		cou.selectByVisibleText("India");
		
		rp.state("ap");
		rp.city("koduru");
		rp.postal("516101");
		rp.mobile("837485965");
		rp.create();
//		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(rp.create()));
		String expectedtext2 = "ACCOUNT CREATED!";
		Assert.assertEquals(rp.text2check(), expectedtext2);
		
		rp.continuebutton();
		
		String expectedtext3 = "Logged in as sanjay";
		Assert.assertEquals(rp.text3(), expectedtext3);
		rp.delete();
		String Expectedtext4 ="ACCOUNT DELETED!";
		Assert.assertEquals(rp.text4(), Expectedtext4);
		rp.finalcontinue();

				
		
		
		
	}

}
