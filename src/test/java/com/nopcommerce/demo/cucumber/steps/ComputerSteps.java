package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;

public class ComputerSteps {
    @When("^I click on Computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnMenuTab("Computers");
    }


    @And("^I click on Desktop$")
    public void iClickOnDesktop() throws InterruptedException {
        Thread.sleep(2000);
        new HomePage().clickOnDeskTop();
    }

    @Then("^i should able to see all products in decending order$")
    public void iShouldAbleToSeeAllProductsInDecendingOrder() {
        new DeskTopPage().arrangeProductInDescendingOrder();
    }

    @And("^I select By position by \"([^\"]*)\"$")
    public void iSelectByPositionBy(String sortByName) {
        new DeskTopPage().selectSortByName(sortByName);

    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() throws InterruptedException {
        Thread.sleep(3000);
        new DeskTopPage().clickOnAddToCart();
    }

    @And("^I should be able to see Build your own computer$")
    public void iShouldBeAbleToSeeBuildYourOwnComputer() {
        Assert.assertEquals("Text is not display", "Build your own computer", new BuildYourComputerPage().VerifytheTextBuildyourowncomputer());
    }


    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor) {
        new BuildYourComputerPage().selectProcessor(processor);

    }

    @And("^I select ram \"([^\"]*)\"$")
    public void iSelectRam(String ram) {
        new BuildYourComputerPage().selectRam(ram);

    }

    @And("^I select hdd \"([^\"]*)\"$")
    public void iSelectHdd(String hdd) {
        new BuildYourComputerPage().selectHDDRadio(hdd);

    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os) {
        new BuildYourComputerPage().selectOSRadiVistaPremium();

    }

    @And("^I select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String software) {
        new BuildYourComputerPage().selectSoftware();

    }

    @And("^I should able to see  price \"([^\"]*)\"$")
    public void iShouldAbleToSeePrice(String price) {
        Assert.assertEquals("price is not matched", price, new BuildYourComputerPage().VerifythePrice());


    }


    @And("^I should Click on ADD TO CARD Button$")
    public void iShouldClickOnADDTOCARDButton() {
        new BuildYourComputerPage().clickOnAddToCartButton();
    }

    @And("^I should able to see message The product has been added to your shopping cart on Top green Bar$")
    public void iShouldAbleToSeeMessageTheProductHasBeenAddedToYourShoppingCartOnTopGreenBar() {
        Assert.assertEquals("message not display", "The product has been added to your shopping cart", new BuildYourComputerPage().VerifytheMessageOnTopGreenbar());
    }

    @And("^I should able to close clicking on cross button$")
    public void iShouldAbleToCloseClickingOnCrossButton() {
        new BuildYourComputerPage().clickOnCloseBar();
    }

    @And("^I should able to mouseHover on Shopping cart and$")
    public void iShouldAbleToMouseHoverOnShoppingCartAnd() {
        new BuildYourComputerPage().mouseHoverOnShoppingCart();
    }

    @And("^i click on GO TO CART button\\.$")
    public void iClickOnGOTOCARTButton() {
        new BuildYourComputerPage().clickOnShoppingCart();
    }

    @And("^I should be able to see \"([^\"]*)\" text$")
    public void iShouldBeAbleToSeeText(String expectedMessage) {
        Assert.assertEquals("text is not display", expectedMessage, new ShoppingCartPage().verifyTheShoppingCartText());

    }

    @And("^I should able to change Qty$")
    public void iShouldAbleToChangeQty() throws InterruptedException {
        Thread.sleep(3000);
        new ShoppingCartPage().updateQuantity();
    }

    @And("^I Should able to update quantity$")
    public void iShouldAbleToUpdateQuantity() {
        new ShoppingCartPage().updateShoppingCart();
    }

    @And("^Verify the total Total \"([^\"]*)\"$")
    public void verifyTheTotalTotal(String expectedPrice) {
        Assert.assertEquals("Total price is not display", expectedPrice, new ShoppingCartPage().verifyTheTotalPrice());

    }

    @And("^I click on check box$")
    public void iClickOnCheckBox() {
        new ShoppingCartPage().clickOnTermsOfService();
    }

    @And("^I click on checkout$")
    public void iClickOnCheckout() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }


    @And("^I click on Checkout as guest tab$")
    public void iClickOnCheckoutAsGuestTab() {
        new CheckOutAsGuestPage().clickOnAsGuestButton();
    }

    @And("^Verify Text \"([^\"]*)\"$")
    public void verifyText(String expectedText) {
        Assert.assertEquals("Text is not display", expectedText, new CheckOutAsGuestPage().VerifytheWelComeText());


    }

    @And("^i enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstName) {
        new BillingCheckOutPage().enterBillingFirstName(firstName);
    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastName) {
        new BillingCheckOutPage().enterBillingLastName(lastName);

    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new BillingCheckOutPage().enterBillingEmailAddress(email);

    }


    @And("^I select Country \"([^\"]*)\"$")
    public void iSelectCountry(String country) {
        new BillingCheckOutPage().selectCountryFromDropDown("233");

    }

    @And("^I select State$")
    public void iSelectState() {
    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city) {
        new BillingCheckOutPage().enterBillingCity(city);

    }

    @And("^I enter postal code \"([^\"]*)\"$")
    public void iEnterPostalCode(String postCode) {
        new BillingCheckOutPage().enterBillingZipcode(postCode);

    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phonenumber) {
        new BillingCheckOutPage().enterBillingPhoneNumber(phonenumber);

    }

    @And("^I enter address  \"([^\"]*)\"$")
    public void iEnterAddress(String address) {
        new BillingCheckOutPage().enterBillingAddress(address);
    }

    @And("^I click on continue$")
    public void iClickOnContinue() throws InterruptedException {
        Thread.sleep(3000);
        new BillingCheckOutPage().clickOnCheckOutButton();
    }

    @And("^I click on Radio Button Next Day Air$")
    public void iClickOnRadioButtonNextDayAir() {
        new ShippingMethodCheckOutPage().clickOnRedioButtonBextDayAir();
    }

    @And("^I click on continuebutton$")
    public void iClickOnContinuebutton() {
        new ShippingMethodCheckOutPage().clickOnContinue();
    }

    @And("^I select Radio Button Credit Card$")
    public void iSelectRadioButtonCreditCard() {
        new PaymentMethodCheckOut().clickOnCreditCard();
    }

    @And("^I click on continuetab$")
    public void iClickOnContinuetab() {
        new PaymentMethodCheckOut().clickOnContinue();
    }

    @And("^I select \"([^\"]*)\"$")
    public void iSelect(String cardtype) {
        new PaymentCheckOut().selectCardTypeFromDropDown("MasterCard");

    }

    @And("^I enter cardholder name \"([^\"]*)\"$")
    public void iEnterCardholderName(String cardHolderName) {
        new PaymentCheckOut().enterCardHolderName(cardHolderName);

    }

    @And("^I enter card number \"([^\"]*)\"$")
    public void iEnterCardNumber(String cardNumber) {
        new PaymentCheckOut().enterCardNumber(cardNumber);

    }

    @And("^I enter month \"([^\"]*)\"$")
    public void iEnterMonth(String month) {
        new PaymentCheckOut().selectExpiryMonthFromDropDown("5");
    }

    @And("^I enter Year \"([^\"]*)\"$")
    public void iEnterYear(String year) {
        new PaymentCheckOut().selectExpiryYearFromDropDown("2024");

    }

    @And("^I enter cardcode \"([^\"]*)\"$")
    public void iEnterCardcode(String cardCode) {
        new PaymentCheckOut().enterCardCode(cardCode);
    }

    @And("^I click on Continuebtn$")
    public void iClickOnContinuebtn() {
        new PaymentCheckOut().clickOnContinueButton();
    }

    @And("^Verify Payment Method is \"([^\"]*)\"$")
    public void verifyPaymentMethodIs(String expectedMethod) {
        Assert.assertEquals("method is not display", expectedMethod, new ConfirmOrderPage().VerifyCreditCardPaymentMethod());

    }

    @And("^Verify Shipping Method is \"([^\"]*)\"$")
    public void verifyShippingMethodIs(String expectedCard) {
        Assert.assertEquals("method is not display", expectedCard, new ConfirmOrderPage().verifyShippingMethod());

    }

    @And("^Verify Total is \"([^\"]*)\"$")
    public void verifyTotalIs(String expectedTotal) {
        Assert.assertEquals("method is not display", expectedTotal, new ConfirmOrderPage().verifytheTotalPrice());


    }

    @And("^I click on comfirm$")
    public void iClickOnComfirm() {
        new ConfirmOrderPage().clickOnConFirm();
    }

    @And("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String expectedText) {
        Assert.assertEquals("Text is not display", expectedText, new CompletedCheckoutPage().verifyThankYouText());

    }

    @And("^Verify the message \"([^\"]*)\"$")
    public void verifyTheMessage(String expectedMessage) {
        Assert.assertEquals("Text is not display", expectedMessage, new CompletedCheckoutPage().verifySucessOrderText());

    }

    @And("^Click on continue$")
    public void clickOnContinue() {
        new CompletedCheckoutPage().clickOnContinue();
    }


    @And("^Verify \"([^\"]*)\"$")
    public void verify(String expectedText) {
        Assert.assertEquals("welcome msg is not display", expectedText, new HomePage().verifyWelComeText());
    }
}
