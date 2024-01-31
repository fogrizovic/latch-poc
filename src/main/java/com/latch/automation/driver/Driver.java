package com.latch.automation.driver;

import com.latch.automation.utils.PropertyUtils;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

import static com.latch.automation.driver.DriverManager.getDriver;
import static com.latch.automation.driver.DriverManager.setDriver;
import static java.util.Objects.isNull;

public final class Driver {


    private Driver() {
    }

    public static void initDriver() throws MalformedURLException {
        if (isNull(getDriver())) {
            String mode = PropertyUtils.getProperty("mode");
            WebDriver driver = DriverFactory.get(Modes.valueOf(mode.toUpperCase()));

            setDriver(driver);
        }
    }

    public static void quitDriver() {
        getDriver().quit();
    }
}
