package com.bank.pages;

import com.bank.utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends UtilityClass {
    @CacheLookup
    @FindBy(xpath = "//div[@class='borderM box padT20 ng-scope']/div[3]/button[2]")
    WebElement clickOnDeposit;

    public void userClickOnDeposit() {
        Reporter.log("click on Deposite" + clickOnDeposit);
        clickOnElement(clickOnDeposit);

    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountToBeDeposited;

    public void enterAmountOnAmountField() {
        Reporter.log("enter amount" + amountToBeDeposited);
        sendTextToElement(amountToBeDeposited, "100");
    }


    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositAmount;

    public void clickOnDeposit() {
        Reporter.log("deposit amount" + depositAmount);
        clickOnElement(depositAmount);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement verifyText;

    public String verifyTextMessage(String text) {
        Reporter.log("verify text message" + verifyText);
        return getTextFromElement(verifyText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withDrawl;

    public void userClickOnWithDrawl() {
        Reporter.log("withDrawl" + withDrawl);
        clickOnElement(withDrawl);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement clickOnAmountToBeWithdraw;

    public void userClickOnAmountField() {
        Reporter.log("amount withdraw" + clickOnAmountToBeWithdraw);
        clickOnElement(clickOnAmountToBeWithdraw);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement withdrawAmount;

    public void userClickOnAmountToBeWithDrawn50() {
        Reporter.log("withdraw amount" + withdrawAmount);
        sendTextToElement(withdrawAmount, "50");
    }

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnAmountToBeWithdraw1;

    public void userClickOnWithdrawButton() {
        Reporter.log("withdraw anount" + clickOnAmountToBeWithdraw1);
        clickOnElement(clickOnAmountToBeWithdraw1);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement verifyTransactionMessage;

    public String verifyTransactionMessage() {
        Reporter.log("transactionMessage" + verifyTransactionMessage);
        return getTextFromElement(verifyTransactionMessage);

    }
}
