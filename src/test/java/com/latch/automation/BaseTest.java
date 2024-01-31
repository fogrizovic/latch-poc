package com.latch.automation;

import com.latch.automation.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.util.Objects;

import static com.latch.automation.driver.DriverManager.getDriver;
import static com.latch.automation.driver.DriverManager.unload;
import static java.util.Objects.nonNull;

public class BaseTest {

    @BeforeMethod
    public static void setUpTest() throws MalformedURLException {
        Driver.initDriver();
    }

    @AfterMethod
    public static void tearDownTest(){
        if(nonNull(getDriver())) {
            Driver.quitDriver();
            unload();
        }
    }
}
