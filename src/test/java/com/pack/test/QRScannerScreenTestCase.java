package com.pack.test;

import io.appium.java_client.MobileElement;
import org.junit.Test;

public class QRScannerScreenTestCase extends BaseConfig{

   @Test
   public void VerifyQRScannerScreen() throws InterruptedException{

       MobileElement KuushyOption = (MobileElement) driver.findElementByAccessibilityId("Kuushy Classic\nFor lorem ipsum dolor sitamet consecuidor");
       KuushyOption.click();
       System.out.println("Element is clicked");
       Thread.sleep(2000);

       MobileElement NextBtn = (MobileElement) driver.findElementByAccessibilityId("Next");
       NextBtn.click();
       System.out.println("Element is clicked");
       Thread.sleep(2000);

       MobileElement NextBtn1 = (MobileElement) driver.findElementByAccessibilityId("Next");
       NextBtn1.click();
       System.out.println("Element is clicked");
       Thread.sleep(2000);

       MobileElement QRScannerLabel = (MobileElement) driver.findElementByAccessibilityId("QR Scanner");
       QRScannerLabel.isDisplayed();
       System.out.println("Element is displayed");
       Thread.sleep(2000);

       MobileElement Scanner = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View");
       Scanner.isDisplayed();
       System.out.println("Element is displayed");
       Thread.sleep(2000);
   }
}
