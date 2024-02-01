package com.latch.automation.pages;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;

import static com.latch.automation.utils.SeleniumUtils.*;

@Accessors(fluent = true)
@Getter
public class PhoneNumberPage {
    // Elements
    private static final By PHONE_INPUT = By.id("com.hdw.james.rider:id/input");
    private static final By CONTINUE_BTN = By.id("com.hdw.james.rider:id/continueButton");
    private static final By ERROR_MSG = By.id("com.hdw.james.rider:id/snackbar_text");

    // Actions
    public Boolean isPhoneInputDisplayed() {
        return isDisplayed(PHONE_INPUT);
    }

    public PhoneNumberPage enterPhoneNumber(String number) {
        sendKeys(PHONE_INPUT, number, "phone number input");
        return this;
    }

    public void clickContinue() {
        click(CONTINUE_BTN, "Continue button");
    }

    public String getErrorMsg() {
        return getText(ERROR_MSG);
    }
}
