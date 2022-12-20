$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("electonictest.feature");
formatter.feature({
  "line": 2,
  "name": "Electronic Test",
  "description": "As user I want to explore Computer page of nop commerce website",
  "id": "electronic-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 6196472000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should verity that product added successfully and place order successfully",
  "description": "",
  "id": "electronic-test;user-should-verity-that-product-added-successfully-and-place-order-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I mouse hoover on Electronic tab",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I mouse hoover and click on cell phone",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Verify text \"Cell phones\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on list view tab",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on NokiaLumia",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Verify title \"Nokia Lumia 1020\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Verify the price \"$349.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I Change quantity",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on add to cartbtn",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Verify message \"The product has been added to your shopping cart\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on crossbar",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "mouse hoover on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on go to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I should be able to see \"Shopping cart\" text",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Verify the Quantity \"2\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Verify the total price \"$698.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on check box",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I click on checkout",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Verify Text \"Welcome, Please Sign In!\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on register tab",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Verify  \"Register\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I enter firstname \"JO\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I enter Lastname \"Sharma\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I enter emailid \"Jo@example.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I enter Password \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I enter ConfirmPossword \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I click on register",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Verify the Message \"Your registration completed\"",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Click on Continue register tab",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 128818899,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.iMouseHooverOnElectronicTab()"
});
formatter.result({
  "duration": 160153200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.iMouseHooverAndClickOnCellPhone()"
});
formatter.result({
  "duration": 971753400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell phones",
      "offset": 13
    }
  ],
  "location": "ElectronicSteps.verifyText(String)"
});
formatter.result({
  "duration": 54721400,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.iClickOnListViewTab()"
});
formatter.result({
  "duration": 44649601,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.iClickOnNokiaLumia()"
});
formatter.result({
  "duration": 9013077901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nokia Lumia 1020",
      "offset": 14
    }
  ],
  "location": "ElectronicSteps.verifyTitle(String)"
});
formatter.result({
  "duration": 34022200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$349.00",
      "offset": 18
    }
  ],
  "location": "ElectronicSteps.verifyThePrice(String)"
});
formatter.result({
  "duration": 31023200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.iChangeQuantity()"
});
formatter.result({
  "duration": 128836800,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.iClickOnAddToCartbtn()"
});
formatter.result({
  "duration": 62021799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The product has been added to your shopping cart",
      "offset": 16
    }
  ],
  "location": "ElectronicSteps.verifyMessage(String)"
});
formatter.result({
  "duration": 416117401,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.iClickOnCrossbar()"
});
formatter.result({
  "duration": 47404700,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.mouseHooverOnShoppingCart()"
});
formatter.result({
  "duration": 1829539200,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.iClickOnGoToCartButton()"
});
formatter.result({
  "duration": 548797901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping cart",
      "offset": 25
    }
  ],
  "location": "ComputerSteps.iShouldBeAbleToSeeText(String)"
});
formatter.result({
  "duration": 55901400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "ElectronicSteps.verifyTheQuantity(String)"
});
formatter.result({
  "duration": 64062200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$698.00",
      "offset": 24
    }
  ],
  "location": "ElectronicSteps.verifyTheTotalPrice(String)"
});
formatter.result({
  "duration": 33469000,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnCheckBox()"
});
formatter.result({
  "duration": 56977900,
  "status": "passed"
});
formatter.match({
  "location": "ComputerSteps.iClickOnCheckout()"
});
formatter.result({
  "duration": 560938500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome, Please Sign In!",
      "offset": 13
    }
  ],
  "location": "ComputerSteps.verifyText(String)"
});
formatter.result({
  "duration": 45861301,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.iClickOnRegisterTab()"
});
formatter.result({
  "duration": 378048900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 9
    }
  ],
  "location": "ElectronicSteps.verify(String)"
});
formatter.result({
  "duration": 46484100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JO",
      "offset": 19
    }
  ],
  "location": "ElectronicSteps.iEnterFirstname(String)"
});
formatter.result({
  "duration": 70525900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sharma",
      "offset": 18
    }
  ],
  "location": "ElectronicSteps.iEnterLastname(String)"
});
formatter.result({
  "duration": 86359000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jo@example.com",
      "offset": 17
    }
  ],
  "location": "ElectronicSteps.iEnterEmailid(String)"
});
formatter.result({
  "duration": 77038800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 18
    }
  ],
  "location": "ElectronicSteps.iEnterPassword(String)"
});
formatter.result({
  "duration": 89475099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "ElectronicSteps.iEnterConfirmPossword(String)"
});
formatter.result({
  "duration": 73117599,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.iClickOnRegister()"
});
formatter.result({
  "duration": 642065500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your registration completed",
      "offset": 20
    }
  ],
  "location": "ElectronicSteps.verifyTheMessage(String)"
});
formatter.result({
  "duration": 51838599,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.clickOnContinueRegisterTab()"
});
formatter.result({
  "duration": 319749199,
  "status": "passed"
});
formatter.after({
  "duration": 602000,
  "status": "passed"
});
});