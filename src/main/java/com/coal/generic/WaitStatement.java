package com.coal.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * 
 * @author Ranjeet
 * @Data: 23/07/2020
 *
 */
public class WaitStatement {
	
	
	/**
	 * @Author: Ranjeet
	 * @param sec
	 * @return void
	 * @Desc: Method will wait for given time
	 */

	public static void hWait(int sec) {
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

public static void iWait(int sec, AndroidDriver<MobileElement> driver){
	driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	
}

   public static void eWait(int sec, AndroidDriver<MobileElement> driver, MobileElement ele){
	WebDriverWait wait=new WebDriverWait(driver,sec);
	wait.until(ExpectedConditions.visibilityOf(ele));	
		
		
	}
	
}
