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
    public void shouldClickGetStarted() throws InterruptedException {
        Thread.sleep(10000);
        phoneNumberPage = getStartedPage.clickGetStarted();
        Thread.sleep(10000);

        Assertions.assertThat(phoneNumberPage.isPhoneInputDisplayed()).isTrue();
    }
}
