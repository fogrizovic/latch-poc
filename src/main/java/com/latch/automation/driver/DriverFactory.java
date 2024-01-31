package com.latch.automation.driver;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public final class DriverFactory {

    private DriverFactory() {
    }

    public static WebDriver get(Modes mode) throws MalformedURLException {
        WebDriver driver;

        switch (mode) {
            case LOCAL:
                driver = new LocalDriver().getDriver();
            default:
                driver = new LocalDriver().getDriver();
        }

        return driver;
    }

}
