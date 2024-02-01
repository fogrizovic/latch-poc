package com.latch.automation.pages;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;

import static com.latch.automation.utils.SeleniumUtils.isDisplayed;

@Accessors(fluent = true)
@Getter
public class PhoneNumberPage {
    // Elements
    private static final By PHONE_INPUT = By.xpath("//android.widget.EditText[@resource-id=\"com.hdw.james.rider:id/input\"]");

    // Actions
    public Boolean isPhoneInputDisplayed() {
        return isDisplayed(PHONE_INPUT);
    }
}
