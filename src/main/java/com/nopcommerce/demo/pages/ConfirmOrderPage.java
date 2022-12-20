package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ConfirmOrderPage extends Utility {
    private static final Logger log = LogManager.getLogger(ConfirmOrderPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement paymentMethod;
    @CacheLookup
    @FindBy(xpath = "//div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement shippingtMethod;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[4]/td[2]/span[1]/strong[1]")
    WebElement price;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmbutton;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement secondDayAir;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[4]/td[2]/span[1]/strong[1]")
    WebElement verifyprice;

    public ConfirmOrderPage() {
        PageFactory.initElements(driver, this);
    }
    public String VerifyCreditCardPaymentMethod() {
        log.info("Verify creditcard payment method" + paymentMethod.toString());
        return getTextFromElement(paymentMethod);
    }

    public String verifyShippingMethod() {
        log.info("Verify shipping method" + shippingtMethod.toString());
        return getTextFromElement(shippingtMethod);
    }

    public String verifytheTotalPrice() {
        log.info("verify total price" + price.toString());
        return getTextFromElement(price);
    }

    public void clickOnConFirm() {
        log.info("click on confirm" + confirmbutton.toString());
        clickOnElement(confirmbutton);
    }

    public String VerifyShippingMethod2ndDayAir() {
        log.info("verify shipping method" + secondDayAir.toString());
        return getTextFromElement(secondDayAir);
    }

    public String VerifytheNokiaTotalPrice() {
        log.info("verify nokia total price" + verifyprice.toString());
        return getTextFromElement(verifyprice);
    }


}
