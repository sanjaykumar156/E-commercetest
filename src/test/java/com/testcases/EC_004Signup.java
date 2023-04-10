package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageobjects.IcorrectLoginpage;
import com.pageobjects.RegisterPage;
import com.pageobjects.SignupPage;
import com.testbase.BaseClass;

public class EC_004Signup extends BaseClass {
	
	@Test
	public void signupfailure() {
		RegisterPage rp = new RegisterPage(driver);
		IcorrectLoginpage ip = new IcorrectLoginpage(driver);
		Assert.assertEquals(rp.logocheck(), true);

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
		SignupPage sp = new SignupPage(driver);
		Assert.assertEquals(sp.emailtext(), true);

	}

}
