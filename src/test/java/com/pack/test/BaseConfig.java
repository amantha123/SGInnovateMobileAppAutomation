package com.pack.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseConfig {

    public static AppiumDriver<MobileElement> driver;
    WebDriverWait wait;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 5");
        caps.setCapability(MobileCapabilityType.APP, "/Users/amantha1/Documents/Sharegratitude Mobile Automation/App/HUMAN_DEV_base.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(url, caps);
        wait = new WebDriverWait(driver, 10);
        driver.context("NATIVE_APP");
        System.out.println("Started....");
    }

    public static void scrollToTheElement(String elementName) throws InterruptedException {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()))"+
            ".scrollIntoView(new UiSelector().textContains(\""+ elementName +"\").instacen((0));"));
        Thread.sleep(2000);
    }

    @After
    public void tearDown() {
        System.out.println("Finish");
        driver.quit();
    }
}
