package com.bank.pages;

import com.bank.utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends UtilityClass {
    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLogin;

    public void clickOnBankManager(){
        Reporter.log("click on button" + bankManagerLogin);
        clickOnElement(bankManagerLogin);
    }

}
