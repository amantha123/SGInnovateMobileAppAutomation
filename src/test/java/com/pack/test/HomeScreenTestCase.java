package com.pack.test;

import io.appium.java_client.MobileElement;
import org.junit.Test;

public class HomeScreenTestCase extends BaseConfig {

    @Test
    public void VerifyHomeScreen() throws InterruptedException {

        Thread.sleep(4000);
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
        el1.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("+1");
        el2.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.widget.EditText");
        el3.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);
        el3.sendKeys("Sri Lanka");
        System.out.println("Text is entered");
        Thread.sleep(2000);

        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sri Lanka");
        el4.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el4.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
        el5.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);
        el5.sendKeys("774848813");
        System.out.println("Text is entered");
        Thread.sleep(2000);
        driver.hideKeyboard();

        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
        el6.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);
        el6.sendKeys("Test@1984");
        System.out.println("Text is entered");
        Thread.sleep(2000);
        driver.hideKeyboard();

        MobileElement el7 = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc=\"Login\"]");
        el7.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView");
        el8.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Good Morning, Amantha!");
        el9.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Thank");
        el10.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Gift");
        el11.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Donate");
        el12.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("Post");
        el13.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("Invite Colleagues to Join");
        el14.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el16 = (MobileElement) driver.findElementByAccessibilityId("My Feed");
        el16.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el17 = (MobileElement) driver.findElementByAccessibilityId("My Messages");
        el16.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el18 = (MobileElement) driver.findElementByAccessibilityId("My Profile");
        el8.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el18.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el19 = (MobileElement) driver.findElementByAccessibilityId("Log Out");
        el19.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View");
        el20.click();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el21 = (MobileElement) driver.findElementByAccessibilityId("LOGOUT");
        el21.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);
    }
}
