package com.latch.automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.latch.automation.driver.DriverManager.getDriver;

public class Tests extends BaseTest {

    @Test
    public void firstTest() throws InterruptedException {
        Thread.sleep(10000);
        getDriver().findElement(By.xpath("//android.widget.Button[@resource-id=\"com.hdw.james.rider:id/getStartedButton\"]")).click();
        Thread.sleep(10000);

    }
}
