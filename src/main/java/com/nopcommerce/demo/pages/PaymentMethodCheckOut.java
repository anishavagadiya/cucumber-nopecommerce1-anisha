package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PaymentMethodCheckOut extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentMethodCheckOut.class.getName());
    @CacheLookup
    @FindBy(css = "#paymentmethod_1")
    WebElement creditcard;
    @CacheLookup
    @FindBy(xpath = "//ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement continuebutton;

    public PaymentMethodCheckOut() {
        PageFactory.initElements(driver, this);
    }
    public void clickOnCreditCard() {
        log.info("Click on credit card " + creditcard.toString());
        clickOnElement(creditcard);
    }

    public void clickOnContinue() {
        log.info("Click on continue button " + continuebutton.toString());
        clickOnElement(continuebutton);
    }




}
