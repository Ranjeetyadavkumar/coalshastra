package com.coal.testscript;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.coal.generic.BaseLib;
import com.coal.generic.WaitStatement;
import com.coal.pageobjects.LoginActivity;


public class LoginTest extends BaseLib{
	
	
	LoginActivity LoginAct;
	LoginActivity InvalidLogin;
	@Test(description="To Validate  Valid Login Test")
	
	public void voidValidLoginTest() {
		
		LoginAct = new LoginActivity(driver);
		WaitStatement.hWait(2);
		LoginAct.login();
		WaitStatement.hWait(2);
		Assert.assertTrue(LoginAct.verifyLogin(), "Login Failed");
		Reporter.log("Login Verified", true);
		}
	
	@Test(description="To Invalidate invalid Login Test")
	public void InvalidLoginTest() {
		
		LoginAct = new LoginActivity(driver);
		WaitStatement.hWait(2);
		LoginAct.Invalid();
		WaitStatement.hWait(2);
		Assert.assertTrue(LoginAct.VerifyInvalidLogin(), "InvalidLogin Passed");
		Reporter.log("Login Verified", true);
		
	 }
		
}
	


