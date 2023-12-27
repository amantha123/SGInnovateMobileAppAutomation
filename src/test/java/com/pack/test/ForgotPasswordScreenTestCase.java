package com.pack.test;

import io.appium.java_client.MobileElement;
import org.junit.Test;

public class ForgotPasswordScreenTestCase extends BaseConfig {

    @Test
    public void VerifyForgotPasswordScreen() throws InterruptedException {

        Thread.sleep(4000);
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
        el1.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Forgot Password?");
        el2.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el2.click();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Forgot Password");
        el3.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("+1");
        el4.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
        el5.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Next");
        el6.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

    }
}
