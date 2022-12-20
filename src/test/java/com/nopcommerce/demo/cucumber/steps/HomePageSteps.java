package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.junit.Assert;

public class HomePageSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Computers Tab$")
    public void iClickOnComputersTab() {
        new HomePage().clickOnMenuTab("Computer");
    }

    @And("^I should navigate to computer page successfully$")
    public void iShouldNavigateToComputerPageSuccessfully() {
    }
}
