package com.pack.test;

import io.appium.java_client.MobileElement;
import org.junit.Test;


public class LandingScreenTestCase extends BaseConfig {

    @Test
    public void VerifyLandingScreen() throws InterruptedException {

        Thread.sleep(4000);
        MobileElement Logo = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        Logo.isDisplayed();
        System.out.println("Element is displayed");

        MobileElement Text = (MobileElement) driver.findElementByAccessibilityId("What’s your Kuushy?");
        Text.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement KuushyOption = (MobileElement) driver.findElementByAccessibilityId("Kuushy Classic\nFor lorem ipsum dolor sitamet consecuidor");
        KuushyOption.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement KuushyOption1 = (MobileElement) driver.findElementByAccessibilityId("Kuushy Gamer\nFor lorem ipsum dolor sitamet consecuidor");
        KuushyOption1.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement KuushyOption3 = (MobileElement) driver.findElementByAccessibilityId("Kuushy Deluxe\nFor lorem ipsum dolor sitamet consecuidor");
        KuushyOption3.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement NextBtn = (MobileElement) driver.findElementByAccessibilityId("Next");
        NextBtn.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement Text1 = (MobileElement) driver.findElementByAccessibilityId("Don’t have a Kuushy?");
        Text1.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement PurchaseHere = (MobileElement) driver.findElementByAccessibilityId("Purchase Here");
        PurchaseHere.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
    }
}
