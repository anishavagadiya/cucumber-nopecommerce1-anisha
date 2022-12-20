package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PaymentCheckOut extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentCheckOut.class.getName());
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement cardType;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameField;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumberField;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonthField;
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYearField;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCodeField;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continuebutton;

    public PaymentCheckOut() {
        PageFactory.initElements(driver, this);
    }
    public void selectCardTypeFromDropDown(String text) {
        log.info("Select card from drop down " +cardType.toString());
        selectByValueFromDropDown(cardType, text);
    }

    public void enterCardHolderName(String text) {
        log.info("Enter the cardholder name in name field "+cardHolderNameField.toString());
        sendTextToElement(cardHolderNameField, text);
    }

    public void enterCardNumber(String text) {
        log.info("Enter the card number in number field "+cardNumberField.toString());
        sendTextToElement(cardNumberField, text);
    }

    public void selectExpiryMonthFromDropDown(String text) {
        log.info("Select the expiry month from list " +expireMonthField.toString());
        selectByValueFromDropDown(expireMonthField, text);
    }

    public void selectExpiryYearFromDropDown(String text) {
        log.info("Select the expiry year from list "+expireYearField.toString());
        selectByValueFromDropDown(expireYearField, text);
    }

    public void enterCardCode(String text) {
        log.info("Enter card code "+cardCodeField.toString());
        sendTextToElement(cardCodeField, text);
    }

    public void clickOnContinueButton() {
        log.info("Click on continue button " +continuebutton.toString());
        clickOnElement(continuebutton);
    }



}
