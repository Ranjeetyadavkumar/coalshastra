package com.coal.pageobjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.coal.generic.ExcelUtlities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegistrationActivity {
	


	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='First Name *']")
	private MobileElement FirstName;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Last Name *']")
	private MobileElement LastName;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Email Address *']")
	private MobileElement emailAddress;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Contact Number *']")
	private MobileElement ContactNumber;
	
	
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='Both']")
	private MobileElement NotifymeAs;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Password *']")
	private MobileElement Password;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Confirm Password *']")
	private MobileElement ConfirmPassword;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Signup']")
	private MobileElement Signupbtn;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Confirm']")
			private MobileElement Confirm;
	
	
	public RegistrationActivity(AndroidDriver<MobileElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	/**
	 * @Task: Method Will Registration the App.
	 */
	
	
	public void Registration()
	{
		
		FirstName.sendKeys(ExcelUtlities.readData("sheet2" , 1, 0));
		LastName.sendKeys(ExcelUtlities.readData("sheet2" , 1, 1));
		emailAddress.sendKeys(ExcelUtlities.readData("sheet2" , 1,2));
		ContactNumber.sendKeys(ExcelUtlities.readData("sheet2" , 1,3));
		NotifymeAs.click();
		Password.sendKeys(ExcelUtlities.readData("sheet2" , 1,5));
		ConfirmPassword.sendKeys(ExcelUtlities.readData("sheet2" , 1,6));
		//Signupbtn.sendKeys(ExcelUtlities.readData("sheet2" , 1,7));
		Signupbtn.click();
		Confirm.click();
	}
	
	
		public boolean verifyRegistration(){
			try {
				if(Confirm.isDisplayed()){
					return true;
				}
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
			
			return false;
		}
		
		public void  InvalidReg()
		{
			
			FirstName.sendKeys(ExcelUtlities.readData("sheet2" , 2, 0));
			LastName.sendKeys(ExcelUtlities.readData("sheet2" , 2, 1));
			emailAddress.sendKeys(ExcelUtlities.readData("sheet2" ,2,2));
			ContactNumber.sendKeys(ExcelUtlities.readData("sheet2" , 2,3));
			NotifymeAs.click();
			Password.sendKeys(ExcelUtlities.readData("sheet2" , 2,5));
			ConfirmPassword.sendKeys(ExcelUtlities.readData("sheet2" , 2,6));
			//Signupbtn.sendKeys(ExcelUtlities.readData("sheet" , 2,6));
			Signupbtn.click();
		}
		
		
			public boolean	VerifyInvalidReg() {
				try {
					if(Signupbtn.isDisplayed()){
						return true;
					}
				} catch (NoSuchElementException e) {
					e.printStackTrace();
				}
				
				return false;
			}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


