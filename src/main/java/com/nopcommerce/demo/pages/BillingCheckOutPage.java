package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BillingCheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(BillingCheckOutPage.class.getName());
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNamefield;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailAddressField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipCodeField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberField;
    @CacheLookup
    @FindBy(xpath = "//div[1]/button[4]")
    WebElement checkout;

    public BillingCheckOutPage() {
        PageFactory.initElements(driver, this);
    }
    public void enterBillingFirstName(String text) {
        sendTextToElement(firstNamefield, text);
    }

    public void enterBillingLastName(String text) {
        log.info("enter lastname" + text +lastNameField.toString());
        sendTextToElement(lastNameField, text);
    }

    public void enterBillingEmailAddress(String text) {
        log.info("enter email" + text + emailAddressField.toString());
        sendTextToElement(emailAddressField, text);
    }

    public void selectCountryFromDropDown(String text) {
        selectByValueFromDropDown(countryField, text);
        log.info("enter country" +text + countryField.toString());
    }

    public void selectStateFromDropDown(String text) {
        selectByValueFromDropDown(stateField, text);
        log.info("enterstate" + text+ stateField.toString());
    }

    public void enterBillingCity(String text) {
        log.info("enter city" + text + cityField.toString());
        sendTextToElement(cityField, text);
    }

    public void enterBillingAddress(String text) {
        log.info("enter Address" + text + addressField.toString());
        sendTextToElement(addressField, text);
    }

    public void enterBillingZipcode(String text) {
        log.info("enter Zipcode" + text + zipCodeField.toString());
        sendTextToElement(zipCodeField, text);
    }

    public void enterBillingPhoneNumber(String text) {
        log.info("enter phonenumber" + text + phoneNumberField.toString());
        sendTextToElement(phoneNumberField, text);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkout);
        log.info("Click on checkout" + checkout.toString());

    }


}
