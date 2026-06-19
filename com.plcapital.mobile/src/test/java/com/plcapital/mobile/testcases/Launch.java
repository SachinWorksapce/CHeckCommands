package com.plcapital.mobile.testcases;

	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.android.AndroidDriver;

	public class Launch {

	    public static void main(String[] args) throws MalformedURLException, InterruptedException {

	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setCapability("appium:deviceName", "Galaxy M13");
	        cap.setCapability("appium:platformName", "Android");
	        cap.setCapability("appium:automationName", "UiAutomator2");
	        cap.setCapability("appium:appPackage", "com.adityabirlahealth.insurance");
	        cap.setCapability("appium:appActivity", "com.adityabirlahealth.insurance.Login.SplashActivity");
	        cap.setCapability("appium:noReset", true);
	        AndroidDriver driver = new AndroidDriver(        
	                new URL("http://127.0.0.1:4725/wd/hub"),
	                cap
	        );
	        
	        
	        Thread.sleep(4000);
	        
	    }
	}

