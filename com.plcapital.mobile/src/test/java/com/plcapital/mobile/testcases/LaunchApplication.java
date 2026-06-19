package com.plcapital.mobile.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class LaunchApplication {

    public static void main(String[] args) throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Galaxy M13");
        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.pantaloons");
        options.setAppActivity("com.pantaloons.MainActivity");

        // Optional but useful
//        options.setNoReset(true);
//        options.setNewCommandTimeout(Duration.ofSeconds(300));

        AndroidDriver driver = new AndroidDriver(
                new URL("http://127.0.0.1:4725/wd/hub"),
                options
        );
    }
}