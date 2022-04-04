package com.Apiium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {
    public AndroidDriver driver;
    public MainPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(id ="com.google.android.calculator:id/result" )
    public WebElement resultField;

    @FindBy(id = "com.google.android.calculator:id/digit_1")
    public WebElement numOne;

    @FindBy(id = "com.google.android.calculator:id/digit_2")
    public WebElement numTwo;

    @FindBy(id = "com.google.android.calculator:id/digit_3")
    public WebElement numThree;

    @FindBy(id = "com.google.android.calculator:id/digit_4")
    public WebElement numFour;

    @FindBy(id = "com.google.android.calculator:id/digit_5")
    public WebElement numFive;

    @FindBy(id = "com.google.android.calculator:id/digit_6")
    public WebElement numSix;

    @FindBy(id = "com.google.android.calculator:id/digit_7")
    public WebElement numSeven;

    @FindBy(id = "com.google.android.calculator:id/digit_8")
    public WebElement numEight;

    @FindBy(id = "com.google.android.calculator:id/digit_9")
    public WebElement numNine;

    @FindBy(id = "com.google.android.calculator:id/digit_0")
    public WebElement numZero;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    public WebElement smPlus;

    @FindBy(id = "com.google.android.calculator:id/eq")
    public WebElement smEquals;

}
