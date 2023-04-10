package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.IcorrectLoginpage;
import com.pageobjects.LogutPage;
import com.pageobjects.RegisterPage;
import com.testbase.BaseClass;

public class EC_003Logout extends BaseClass{
	
	@Test
	public void logotcheck() {
		RegisterPage rp = new RegisterPage(driver);
		Assert.assertEquals(rp.logocheck(), true);
		rp.loginbutton();
		
		IcorrectLoginpage ip = new IcorrectLoginpage(driver);
		String expectedtext = "Login to your account";
		Assert.assertEquals(ip.textlogin(), expectedtext);
		
		ip.email(rb.getString("email"));
		ip.password(rb.getString("password"));
		ip.loginbutton();
		String expectedtext3 = "Logged in as sanjay";
		Assert.assertEquals(rp.text3(), expectedtext3);
		
		LogutPage lp=new LogutPage(driver);
		lp.logout();
		Assert.assertEquals(lp.textor(), true);
	}

}
