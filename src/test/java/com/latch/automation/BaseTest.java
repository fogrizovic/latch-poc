package com.latch.automation;

import com.latch.automation.driver.Driver;
import com.latch.automation.listeners.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.net.MalformedURLException;

import static com.latch.automation.driver.DriverManager.getDriver;
import static com.latch.automation.driver.DriverManager.unload;
import static java.util.Objects.nonNull;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeMethod
    public static void setUpTest() throws MalformedURLException {
        Driver.initDriver();
    }

    @AfterMethod
    public static void tearDownTest() {
        if (nonNull(getDriver())) {
            Driver.quitDriver();
            unload();
        }
    }
}
