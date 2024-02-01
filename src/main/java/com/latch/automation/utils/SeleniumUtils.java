package com.latch.automation.utils;

import com.latch.automation.reports.ExtentLogger;
import org.openqa.selenium.By;

import static com.latch.automation.driver.DriverManager.getDriver;

public class SeleniumUtils {

    public static void click(By by, String elementName) {
        getDriver().findElement(by).click();
        ExtentLogger.pass(elementName + " clicked successfully");
    }

    public static Boolean isDisplayed(By by) {
        return getDriver().findElement(by).isDisplayed();
    }


}