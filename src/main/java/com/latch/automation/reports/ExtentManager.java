package com.latch.automation.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {

    private static ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

    private ExtentManager() {
    }

    static ExtentTest getExtentTest() {
        return threadLocal.get();
    }

    static void setExtentTest(ExtentTest test) {
        threadLocal.set(test);
    }
}