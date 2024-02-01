package com.latch.automation;

import com.latch.automation.annotations.FrameworkAnnotation;
import com.latch.automation.pages.GetStartedPage;
import com.latch.automation.pages.PhoneNumberPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    GetStartedPage getStartedPage;
    PhoneNumberPage phoneNumberPage;

    @BeforeMethod
    public void setup() {
        getStartedPage = new GetStartedPage();
    }

    @FrameworkAnnotation(author = "fogrizovic")
    @Test(description = "Should click Get Started button")
    public void shouldClickGetStarted() {
        phoneNumberPage = getStartedPage.clickGetStarted();
        phoneNumberPage
                .enterPhoneNumber("12333333")
                .clickContinue();

        String errorMsg = phoneNumberPage.getErrorMsg();

        Assertions.assertThat(errorMsg)
                .contains("Something went wrong, please try again");

    }
}
