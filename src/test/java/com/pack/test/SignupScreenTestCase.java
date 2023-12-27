package com.pack.test;

import io.appium.java_client.MobileElement;
import org.junit.Test;

public class SignupScreenTestCase extends BaseConfig {

    @Test
    public void VerifySignupScreen() throws InterruptedException {

        Thread.sleep(4000);
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
        el1.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId(" Sign Up");
        el2.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el2.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el3.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Create Your Profile");
        el4.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Just in case, let’s confirm that you are Human! ");
        el5.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("+1");
        el6.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
        el7.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Next");
        el8.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Terms of Service");
        el9.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el9.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);
        driver.navigate().back();

        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Acceptable Use Policy");
        el10.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el10.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);
        driver.navigate().back();

        MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Privacy Policy");
        el11.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el11.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);
        driver.navigate().back();

    }
}
