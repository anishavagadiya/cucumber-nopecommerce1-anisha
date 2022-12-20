package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ElectronicSteps {
    @When("^I mouse hoover on Electronic tab$")
    public void iMouseHooverOnElectronicTab() {
        new HomePage().mouseHoverOnElectronics();
    }

    @And("^I mouse hoover and click on cell phone$")
    public void iMouseHooverAndClickOnCellPhone() {
        new HomePage().mouseHoverOnCellPhoneAndClick();
    }

    @And("^Verify text \"([^\"]*)\"$")
    public void verifyText(String expextedText) {
        Assert.assertEquals("text is not display", expextedText, new CellPhonePage().verifyCellPhoneText());

    }

    @And("^I click on list view tab$")
    public void iClickOnListViewTab() {
        new CellPhonePage().clickOnList();
    }

    @And("^I click on NokiaLumia$")
    public void iClickOnNokiaLumia() throws InterruptedException {
        Thread.sleep(3000);
        new CellPhonePage().clickOnNokia();
    }

    @And("^Verify title \"([^\"]*)\"$")
    public void verifyTitle(String expectedText) {
        Assert.assertEquals("Text is not displayed", expectedText, new NokiaLumiaPage().verifyNokiaLumiaText());

    }

    @And("^Verify the price \"([^\"]*)\"$")
    public void verifyThePrice(String expectedPrice) {
        Assert.assertEquals("price is not match", expectedPrice, new NokiaLumiaPage().verifyPrice());

    }

    @And("^I Change quantity$")
    public void iChangeQuantity() {
        new NokiaLumiaPage().updateNokiaQuantity("2");
    }

    @And("^I click on add to cartbtn$")
    public void iClickOnAddToCartbtn() {
        new NokiaLumiaPage().nokiaAddToCartButton();
    }

    @And("^Verify message \"([^\"]*)\"$")
    public void verifyMessage(String expectedMesaage) {
        Assert.assertEquals("Message is not display", expectedMesaage, new NokiaLumiaPage().verifyProductAddedToTheCartMessage());

    }

    @And("^I click on crossbar$")
    public void iClickOnCrossbar() {
        new NokiaLumiaPage().clickOnCrossButton();
    }

    @And("^mouse hoover on shopping cart$")
    public void mouseHooverOnShoppingCart() {
        new NokiaLumiaPage().clickOnShoppingCart();
    }

    @And("^I click on go to cart button$")
    public void iClickOnGoToCartButton() {
        new NokiaLumiaPage().clickOnShoppingCart();
    }


    @And("^Verify the Quantity \"([^\"]*)\"$")
    public void verifyTheQuantity(String expectedQuantity) {
        Assert.assertEquals("quantity is not matched", expectedQuantity, new ShoppingCartPage().verifyProductQuantity());
    }

    @And("^Verify the total price \"([^\"]*)\"$")
    public void verifyTheTotalPrice(String expectedPrice) {
        Assert.assertEquals("Price is not match", expectedPrice, new ShoppingCartPage().verifyTotalPrice());

    }

    @And("^I click on register tab$")
    public void iClickOnRegisterTab() {
        new CheckOutAsGuestPage().clickOnARegisterTab();
    }


    @And("^Verify  \"([^\"]*)\"$")
    public void verify(String expectedText) {
        Assert.assertEquals("text is not display", expectedText, new RegisterPage().verifyRegisterText());
    }


    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("^I enter Lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastName) {
        new RegisterPage().enterLastName(lastName);

    }

    @And("^I enter emailid \"([^\"]*)\"$")
    public void iEnterEmailid(String emailId) {
        new RegisterPage().email(emailId);
    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("^I enter ConfirmPossword \"([^\"]*)\"$")
    public void iEnterConfirmPossword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @And("^I click on register$")
    public void iClickOnRegister() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("^Verify the Message \"([^\"]*)\"$")
    public void verifyTheMessage(String expectedText) {
        Assert.assertEquals("Message is not display", expectedText, new RegisterPage().verifyRegistration());
    }

    @And("^Click on Continue register tab$")
    public void clickOnContinueRegisterTab() {
        new RegisterPage().clickOnContinue();

    }
}
