package com.coal.generic;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseLib {
	public AndroidDriver<MobileElement> driver;
	AppiumDriverLocalService service;
	
	/*
	 * public AndroidDriver<MobileElement> driver; AppiumDriverLocalService service;
	 * public static final String NODE_JS = "C:/Program Files/nodejs";
	 * 
	 * public static final APPIUM_JS="C:/Users/admin/Desktop/Appium-windows-1.15.0"
	 

}*/
	
	
	@BeforeMethod
	
	public void setUp() {
		
DesiredCapabilities dac = new DesiredCapabilities();

dac.setCapability("automationName","UiAutomator2");
dac.setCapability("deviceName","OPPO A1k");
dac.setCapability("newCommandTimeout","120");
dac.setCapability("platformName","Android");
dac.setCapability("platformVersion","9");
dac.setCapability("appPackage","com.coalshastralive.android.app");
dac.setCapability("appActivity","com.coalshastralive.android.app.activity.Splash_Screen_Activity");
dac.setCapability("noReset",false);


try {
	driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),dac);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
} catch (MalformedURLException e) {
	
	e.printStackTrace();
}
	}
	

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.isSuccess()) {
			Reporter.log("Test Passed:)" , true);
		}
		
		else {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source= ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(source, new File("./ScreenShot/"+result.getName()+".png"));
			} catch (IOException e1) {
			
				e1.printStackTrace();
			}
		
			if (! (driver== null)) {
				driver.closeApp();
				System.out.println("App closed");
				
			}
		}
		
	}


	
	
	
	
	
	
	
}

