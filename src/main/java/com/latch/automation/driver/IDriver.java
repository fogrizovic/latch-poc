package com.latch.automation.driver;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public interface IDriver {

    public WebDriver getDriver() throws MalformedURLException;
}
