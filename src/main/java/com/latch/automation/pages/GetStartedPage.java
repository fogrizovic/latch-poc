package com.latch.automation.pages;

import lombok.Getter;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;

import static com.latch.automation.utils.SeleniumUtils.click;

@Accessors(fluent = true)
@Getter
public class GetStartedPage {
    // Elements
    private static final By GET_STARTED_BTN = By.xpath("//android.widget.Button[@resource-id=\"com.hdw.james.rider:id/getStartedButton\"]");

    // Actions
    public PhoneNumberPage clickGetStarted() {
        click(GET_STARTED_BTN, "Get Started button");

        return new PhoneNumberPage();
    }
}
