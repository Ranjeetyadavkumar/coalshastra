package com.coal.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.coal.generic.BaseLib;
import com.coal.generic.WaitStatement;
import com.coal.pageobjects.HomeActivity;
import com.coal.pageobjects.RegistrationActivity;

public class RegistrationTest extends BaseLib {

	RegistrationActivity RegistrationAct;
	RegistrationActivity InvalidRestr;
	HomeActivity HomeAct;

	/*
	 * @Test(priority=1)
	 * 
	 * public void RegisterTest() {
	 * 
	 * HomeAct = new HomeActivity(driver); WaitStatement.hWait(2);
	 * HomeAct.clickOnRegistartion();
	 * 
	 * 
	 * }
	 */

	@Test(priority = 1)

	public void ValidRegistrationTest() {

		HomeAct = new HomeActivity(driver);
		WaitStatement.hWait(2);
		HomeAct.clickOnRegistartion();

		RegistrationAct = new RegistrationActivity(driver);
		WaitStatement.hWait(2);
		RegistrationAct.Registration();
		WaitStatement.hWait(2);
		Assert.assertTrue(RegistrationAct.verifyRegistration(), "Registration Failed");
		Reporter.log("Registration Verified", true);

	}

	
	  @Test(priority=2)
	  
	  public void InvalidRegistrationTest() { 
		  HomeAct = new HomeActivity(driver);
			WaitStatement.hWait(2);
			HomeAct.clickOnRegistartion();
	RegistrationAct = new RegistrationActivity(driver); 
	WaitStatement.hWait(2);
	 RegistrationAct.InvalidReg();
	  Assert.assertTrue(RegistrationAct.VerifyInvalidReg() ,
	 "Registration Passed"); Reporter.log("Registration" , true); }
	  
	 

}
