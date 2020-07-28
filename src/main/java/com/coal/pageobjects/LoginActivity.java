package com.coal.pageobjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.coal.generic.ExcelUtlities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginActivity {

	
	@AndroidFindBy(id= "com.coalshastralive.android.app:id/emailtv")
	
	private MobileElement email;
	
	@AndroidFindBy(xpath ="//android.widget.EditText[@text='Password *']")
	private MobileElement pwd;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='LOGIN']")
	private MobileElement loginbtn;
	@AndroidFindBy(xpath="//android.widget.Button[@text='ADD COMPANY']")
	private MobileElement AddCompany;
	
	public LoginActivity(AndroidDriver<MobileElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	/**
	 * @Task: Method Will Login the App.
	 */
	
	public void login()
	{
		
		email.sendKeys(ExcelUtlities.readData("sheet1" , 1, 0));
		pwd.sendKeys(ExcelUtlities.readData("sheet1" , 1, 1));
				loginbtn.click();
	}
	
	
		public boolean verifyLogin(){
			try {
				if(AddCompany.isDisplayed()){
					return true;
				}
			} catch (NoSuchElementException e) {
				e.printStackTrace();
			}
			
			return false;
	
			}
		
		public void Invalid()
		{
			
			email.sendKeys(ExcelUtlities.readData("sheet1" , 2, 0));
			pwd.sendKeys(ExcelUtlities.readData("sheet1" , 2, 1));
			loginbtn.click();
		}
		
		
			public boolean VerifyInvalidLogin(){
				try {
					if(loginbtn.isDisplayed()){
						return true;
					}
				} catch (NoSuchElementException e) {
					e.printStackTrace();
				}
				
				return false;

	

		
}
		
}
	
	


