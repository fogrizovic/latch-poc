package com.latch.automation.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class LocalDriver implements IDriver {
    @Override
    public WebDriver getDriver() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("myDevice");
        //options.setUdid("pixel6_1");
        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setApp(System.getProperty("user.dir") + "/src/test/resources/JamesRider_1.22.0.apk");
        //options.setAppPackage("com.hdw.james.rider");
        //options.setAppActivity("com.hdw.james.rider.viewlayer.login.LoginActivity");

        return new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }
}
