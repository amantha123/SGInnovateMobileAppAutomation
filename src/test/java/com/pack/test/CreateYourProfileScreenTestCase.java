package com.pack.test;

import io.appium.java_client.MobileElement;
import org.junit.Test;

public class CreateYourProfileScreenTestCase extends BaseConfig{

    @Test
    public void VerifyCreateYourProfileScreenTestCase() throws InterruptedException {

        MobileElement KuushyOption = (MobileElement) driver.findElementByAccessibilityId("Kuushy Classic\nFor lorem ipsum dolor sitamet consecuidor");
        KuushyOption.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement NextBtn = (MobileElement) driver.findElementByAccessibilityId("Next");
        NextBtn.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement Logo = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        Logo.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement Label = (MobileElement) driver.findElementByAccessibilityId("Create Your Profile");
        Label.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement Steps = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]");
        Steps.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement NextBtn1 = (MobileElement) driver.findElementByAccessibilityId("Next");
        NextBtn1.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement BackBtn = (MobileElement) driver.findElementByAccessibilityId("Go Back");
        BackBtn.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement Text = (MobileElement) driver.findElementByAccessibilityId("Let's Get Started\nDon’t have a Kuushy?\nPurchase Here\nCopyright © 2023");
        Text.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
    }
}
