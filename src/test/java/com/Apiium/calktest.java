package com.Apiium;
import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

@RunWith(Parameterized.class)
public class calktest {
    private static AndroidDriver driver;
    private static MainPage mainPage;


    @Parameterized.Parameters
    public static Collection <Object> data(){
        return Arrays.asList(new Object[][]{
                {1,2,"3"}, {3,4,"7"}, {5,6,"11"}
        });
    }

    private int firstI;
    private int secondI;
    private String resultNum;


    public calktest(int firstI, int secondI, String resultNum) throws MalformedURLException{
        this.firstI=firstI;
        this.secondI=secondI;
        this.resultNum=resultNum;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "pixel5");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("app","C:/Сalculator.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        mainPage.numOne.click();





    }


    @Test
    public void addTest() {
        ArrayList<WebElement> nums = new ArrayList();
        nums.add(mainPage.numZero);
        nums.add(mainPage.numOne);
        nums.add(mainPage.numTwo);
        nums.add(mainPage.numThree);
        nums.add(mainPage.numFour);
        nums.add(mainPage.numFive);
        nums.add(mainPage.numSix);
        WebElement x = nums.get(firstI);
        WebElement y = nums.get(secondI);
        x.click();
        mainPage.smPlus.click();
        y.click();
        mainPage.smEquals.click();
        Assert.assertEquals(resultNum, mainPage.resultField.getText());

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }



}
