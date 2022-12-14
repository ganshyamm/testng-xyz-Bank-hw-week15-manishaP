package com.bank.pages;

import com.bank.utility.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerLoginPage extends UtilityClass {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLogin;

    public void clickOnCustomerLogin() {
        Reporter.log("click on customer login" + customerLogin);
        clickOnElement(customerLogin);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement clickOnYourName;

    public void userClickOnYourName() {
        Reporter.log("user should click on name" + clickOnYourName);
        clickOnElement(clickOnYourName);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']/child::*")
    WebElement nameFromDropDown;

    public void selectYourNameFromDropDown(String names) {
        Reporter.log("select your name" + nameFromDropDown);
        selectByVisibleTextFromDropDown( nameFromDropDown, "Harry Potter");

    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement clickOnLoginButton;

    public void userClickOnLoginButton() {
        Reporter.log("user should click " + clickOnLoginButton);
        clickOnElement(clickOnLoginButton);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement verifyLogoutTab1;

    public void verifyLogoutTab() {
        Reporter.log("verify tab" + verifyLogoutTab1);
        verifyLogoutTab();
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement clickOnLogOutButton;

    public void userClickOnLogOutButton() {
        Reporter.log("user click on logout" + clickOnLogOutButton);
        clickOnElement(clickOnLogOutButton);
    }

    @CacheLookup
    @FindBy (xpath="//select[@id='userSelect']")
    WebElement verifyYourName;
    public void verifyYourNameDisplayed(String names) {
        Reporter.log("verify name message" + verifyYourName);
        selectByVisibleTextFromDropDown( verifyYourName, "Harry Potter");


    }


}
