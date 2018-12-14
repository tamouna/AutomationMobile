package com.appium.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class Base {

	public static void main(String[] args) throws MalformedURLException {
		
		File f = new File("src");
		File fs = new File (f, "ApiDemos-debug.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
        
		//Information about the mobile phone and the app
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.VERSION, "7.1.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A8");
        capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        
        //Connection to the server
        
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
        
	}

}
