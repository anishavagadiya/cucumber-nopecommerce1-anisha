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

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktop;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutButton;
    @CacheLookup
    @FindBy(xpath = "//div/ul[@class='top-menu notmobile']/li[2]/a[@href='/electronics']")
    WebElement electronicMouseHover;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellPhoneClick;
    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }
//    public void selectMenu(String menu) {
//        String mainmenu = menu.toLowerCase();
//        String expression = "//a[@href ='/" + mainmenu + "']";
//        driver.findElement(By.xpath(expression)).click();
//        String currentUrl = driver.getCurrentUrl();
//        //  Assert.assertEquals("Navigated successfully", currentUrl,"Do not Navigate" + menu);
//
//    }
public void clickOnMenuTab(String tab) {
    for (WebElement menu : topMenuList) {
        if (menu.getText().contains(tab)) {
           // log.info("Click on '" + tab + "' tab <br>");
            clickOnElement(menu);
            break;
        }
    }
}


    public void clickOnDeskTop() {
        log.info("Click on Desktop" + desktop.toString());
        clickOnElement(desktop);
    }

    public void mouseHoverOnElectronics() {
        log.info("Mouse hover on electronics" + electronicMouseHover.toString());
        mouseHoverToElement(electronicMouseHover);

    }

    public void mouseHoverOnCellPhoneAndClick() {
        log.info("click on cellphone" + cellPhoneClick.toString());
        mouseHoverToElementAndClick(cellPhoneClick);

    }

    public String verifyWelComeText() {
        log.info("Verify welcome Text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnLogOut() {
        log.info("Click on Logout" + logoutButton.toString());
        clickOnElement(logoutButton);
    }


}
