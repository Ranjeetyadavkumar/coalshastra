package com.coal.pageobjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeActivity {

	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Register']")
	private MobileElement Register;
	

	public HomeActivity(AndroidDriver<MobileElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
		
		public void clickOnRegistartion(){
			Register.click();
		}
}
