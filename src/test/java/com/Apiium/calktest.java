package com.Apiium;
import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class calktest {
    private static AndroidDriver driver;
    private static MainPage mainPage;

    @BeforeClass
    public static void setup() throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "pixel5");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("app","C:/Сalculator.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
    }

    @Test
    public void addTest() {
        mainPage.numOne.click();
        mainPage.numFive.click();
        mainPage.numSeven.click();
        mainPage.smPlus.click();
        mainPage.numNine.click();
        mainPage.smEquals.click();
        Assert.assertEquals("66", mainPage.resultField.getText());

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }



}
