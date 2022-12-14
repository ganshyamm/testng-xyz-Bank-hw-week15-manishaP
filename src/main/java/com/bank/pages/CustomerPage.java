package com.bank.pages;

import com.bank.utility.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerPage extends UtilityClass {

    @CacheLookup
    @FindBy(xpath="//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomer;
    public void clickOnAddCustomer1(){
        Reporter.log("click on customer tab" + addCustomer );
        mouseHoverToElementAndClick(addCustomer);
    }
    @CacheLookup
            @FindBy (xpath="//input[@placeholder='First Name']")
    WebElement firstName;
    public void enterNameOnFirstname(String name){
        Reporter.log("enter first name" + firstName);
        sendTextToElement(firstName,name);
    }

    @CacheLookup
    @FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement lastname;

    public void enterNameOnLastname(String name){
        Reporter.log("enter last name"+  lastname);
        sendTextToElement(lastname,name);
    }
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    public void enterPostCode(String code){
        sendTextToElement(postCode, code);
    }
    @CacheLookup
    @FindBy(xpath="//button[@type='submit']")
    WebElement addCustomer1;

    public void clickOnAddCustomer2(){
        Reporter.log("click on customer tab" + addCustomer1 );
        mouseHoverToElementAndClick(addCustomer1);
    }
    public String getTextPopWindow(){
        return getTextFromAlert();
    }
    public void clickOnPopup(){
        acceptAlert();
    }
}
