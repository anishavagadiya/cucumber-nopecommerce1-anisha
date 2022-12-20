package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//div[@class='page-title']/h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateCart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal'][text()='$2,950.00']")
    WebElement price;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement checkboxTerms;

    @CacheLookup
    @FindBy(id= "checkout")
    WebElement checkout;

    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/child::input")
    WebElement productQuantityText;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement totalPrice;
    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }
    public String verifyTheShoppingCartText() {
        log.info("Verify shopping cart text: "+shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public void updateQuantity() throws InterruptedException {
        log.info("Update quantity ");
        Thread.sleep(3000);
        WebElement Quantity = driver.findElement(By.xpath("//td[@class='quantity']/child::input"));
        Quantity.clear();
        Quantity.sendKeys("2");
    }

    public void updateShoppingCart() {
        log.info("Update shopping cart: " +updateCart.toString());
        clickOnElement(updateCart);
    }

    public String verifyTheTotalPrice() {
        log.info("Verify the total price: " +price.toString());
        return getTextFromElement(price);
    }

    public void clickOnCheckBox() {
        log.info("Click on the checkbox to accept terms:" +checkboxTerms.toString());
        clickOnElement(checkboxTerms);
    }

    public void clickOnCheckOutButton() {
        log.info("Click on checkout button " +checkout.toString());
        clickOnElement(checkout);
    }

    public String verifyProductQuantity() {
        log.info("Verify the product quantity" +productQuantityText.toString());
        //productQuantityText;
//        WebElement wb = driver.findElement(productQuantityText);
//        String actualQuantity = productQuantityText.getAttribute("value");
        String actualQuantity = productQuantityText.getAttribute("value");
        return actualQuantity;
    }

    public String verifyTotalPrice() {
        log.info("Verify the total price: "+totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    public void clickOnTermsOfService() {
        log.info("Click on term of services: "+checkboxTerms.toString());
        clickOnElement(checkboxTerms);
    }


}
