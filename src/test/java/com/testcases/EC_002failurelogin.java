package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.IcorrectLoginpage;
import com.pageobjects.RegisterPage;
import com.testbase.BaseClass;

public class EC_002failurelogin extends BaseClass {
	
	@Test
	public void incorrectlogin() {
		RegisterPage rp = new RegisterPage(driver);
		Assert.assertEquals(rp.logocheck(), true);
		rp.loginbutton();
		
		IcorrectLoginpage ip = new IcorrectLoginpage(driver);
		String expectedtext = "Login to your account";
		Assert.assertEquals(ip.textlogin(), expectedtext);
		
		ip.email("avbffgj@gmail.com");
		ip.password("fgytui");
		ip.loginbutton();
		String expectedtext1= "Your email or password is incorrect!";
		Assert.assertEquals(ip.textfail(), expectedtext1);
	}

}
