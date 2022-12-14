package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.support.CacheLookup;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest  extends BaseTest {

    CustomerPage customerPage;
    BankManagerLoginPage bankManagerLoginPage;
    OpenAccountPage openAccountPage ;
    CustomerLoginPage customersPage ;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        customersPage = new CustomerLoginPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        openAccountPage = new OpenAccountPage();
        customerPage = new CustomerPage();
        accountPage = new AccountPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        bankManagerLoginPage.clickOnBankManager();
        customerPage.clickOnAddCustomer1();
        customerPage.enterNameOnFirstname("mann");
        customerPage.enterNameOnLastname("Pate");
        customerPage.enterPostCode("Ha3 2rs");
        customerPage.clickOnAddCustomer2();
        String expectedText = "Customer added successfully with customer id :6";
        Assert.assertEquals(customerPage.getTextPopWindow(), expectedText, "Text Not matched");
        customerPage.clickOnPopup();
    }
    @Test(groups = {"smoke", "regression"})
    public void  bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        bankManagerLoginPage.clickOnBankManager();
        openAccountPage.clickOnOpenAccount();
        openAccountPage.searchAndSelectCreatedCustomer();
        openAccountPage.selectPoundInCurrency();
        openAccountPage.clickOnProcessButton();
        String expectedText = "Account created successfully with account Number :1016";
        Assert.assertEquals(openAccountPage.getTextFromPopup(),expectedText,"Text Not Matched");
        openAccountPage.clickOnPopup();


    }
    @Test (groups = {"regression", "regression"})
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        customersPage.clickOnCustomerLogin();
        customersPage.clickOnCustomerLogin();
        customersPage.userClickOnYourName();
        customersPage.userClickOnLoginButton();
        customersPage.verifyLogoutTab();
        customersPage.userClickOnLogOutButton();
        customersPage.verifyYourNameDisplayed("Harry potter");


    }
    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully(){
        customersPage.clickOnCustomerLogin();
        customersPage.userClickOnYourName();
        customersPage.selectYourNameFromDropDown("Harry Potter");
        customersPage.userClickOnLoginButton();
        accountPage.userClickOnDeposit();
        accountPage.enterAmountOnAmountField();
        accountPage.clickOnDeposit();
        String expectedMessage =  "Deposit Successful";
        Assert.assertEquals(accountPage.verifyTextMessage("Deposit Successful"),expectedMessage);


    }
    @Test(groups = { "regression"})
    public void customerShouldWithdrawMoneySuccessfully(){
        customersPage.clickOnCustomerLogin();
        customersPage.userClickOnYourName();
        customersPage.selectYourNameFromDropDown("Harry potter");
        customersPage.userClickOnLoginButton();
        accountPage.userClickOnWithDrawl();
        accountPage.enterAmountOnAmountField();
        accountPage.userClickOnAmountToBeWithDrawn50();
        accountPage.userClickOnWithdrawButton();
        String expectedMessage = "Transaction Failed. You can not withdraw amount more than the balance.";
        Assert.assertEquals(accountPage.verifyTransactionMessage(),expectedMessage,"Message Not Matched");


    }

}
