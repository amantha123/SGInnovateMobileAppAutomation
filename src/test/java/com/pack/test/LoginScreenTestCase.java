package com.pack.test;

import io.appium.java_client.MobileElement;
import org.junit.Test;


public class LoginScreenTestCase extends BaseConfig {

    @Test
    public void VerifyLoginScreen() throws InterruptedException {

        Thread.sleep(4000);
        MobileElement backArrow = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
        backArrow.click();
        System.out.println("Element is clicked");

        MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el2.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el3 = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"Login\"]");
        el3.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Welcome to HUMAN by ShareGratitude™");
        el4.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("+1");
        el5.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
        el6.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
        el7.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Forgot Password?");
        el8.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el9 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Login\"]");
        el9.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId(" Sign Up");
        el10.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

    }
}
