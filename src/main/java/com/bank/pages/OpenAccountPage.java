package com.bank.pages;

import com.bank.utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends UtilityClass {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;

    public void clickOnOpenAccount() {
        Reporter.log("click on open account" + openAccount);
        clickOnElement(openAccount);
    }

    @CacheLookup

    @FindBy(id = "userSelect")
    WebElement customerDropdown;

    public void searchAndSelectCreatedCustomer() {
        Reporter.log("search and select customer" + customerDropdown);
        selectByVisibleTextFromDropDown(customerDropdown, "Harry Potter");
    }

    @CacheLookup
    @FindBy(id = "currency")
    WebElement currencyDropDown;

    public void selectPoundInCurrency() {
        Reporter.log("select currency in pound" + currencyDropDown);
        selectByVisibleTextFromDropDown(currencyDropDown, "Pound");
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processButton;

    public void clickOnProcessButton() {
        Reporter.log("click on process button" + processButton);
        clickOnElement(processButton);
    }


    By customerTab = By.xpath("//button[normalize-space()='Customers']");


    public String getTextFromPopup() {
        return getTextFromAlert();
    }

    public void clickOnPopup() {
        acceptAlert();
    }

}
