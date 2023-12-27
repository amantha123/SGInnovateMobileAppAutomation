package com.pack.test;

import io.appium.java_client.MobileElement;
import org.junit.Test;

public class UserViewingEmailsPasswordsTestCase extends BaseConfig {

    @Test
    public void VerifyUserViewingEmailsPasswords() throws InterruptedException {

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

        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("My Profile");
        el8.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Preferences");
        el9.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Emails & Passwords");
        el10.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView");
        el11.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
        el12.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("Email Setup by Private Group");
        el12.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el13.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("Personal");
        el14.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el14.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el15 = (MobileElement) driver.findElementByAccessibilityId("Add");
        el15.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el16 = (MobileElement) driver.findElementByAccessibilityId("Personal");
        el16.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el17 = (MobileElement) driver.findElementByAccessibilityId("Work");
        el17.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el17.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el18 = (MobileElement) driver.findElementByAccessibilityId("Add");
        el18.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el19 = (MobileElement) driver.findElementByAccessibilityId("Work");
        el19.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el20 = (MobileElement) driver.findElementByAccessibilityId("Email Setup by Private Group");
        el20.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el21 = (MobileElement) driver.findElementByAccessibilityId("Change Password");
        el21.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el21.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
        el22.isDisplayed();
        System.out.println("Element is displayed");

        MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
        el22.isDisplayed();
        System.out.println("Element is displayed");

        MobileElement el24 = (MobileElement) driver.findElementByAccessibilityId("Forgot Password?");
        el22.isDisplayed();
        System.out.println("Element is displayed");

        MobileElement el25 = (MobileElement) driver.findElementByAccessibilityId("Save");
        el25.isDisplayed();
        System.out.println("Element is displayed");

        MobileElement el26 = (MobileElement) driver.findElementByAccessibilityId("Change Password");
        el26.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el27 = (MobileElement) driver.findElementByAccessibilityId("Delete Profile");
        el27.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);
        el27.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        driver.navigate().back();
        driver.navigate().back();

        MobileElement el28 = (MobileElement) driver.findElementByAccessibilityId("Log Out");
        el28.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

        MobileElement el29 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View");
        el29.isDisplayed();
        System.out.println("Element is displayed");
        Thread.sleep(2000);

        MobileElement el30 = (MobileElement) driver.findElementByAccessibilityId("LOGOUT");
        el30.click();
        System.out.println("Element is clicked");
        Thread.sleep(2000);

    }
}
