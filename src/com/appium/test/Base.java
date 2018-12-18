package com.appium.test;

import java.io.File;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	public static void main(String[] args) throws MalformedURLException{

		// TODO Auto-generated method stub
	 File f = new File("src");
     File fs = new File(f, "ApiDemos-debug.apk");
     DesiredCapabilities cap = new DesiredCapabilities();
     
     cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
     cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
     //AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    
	  
	}
	

}