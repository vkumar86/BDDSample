package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.Constants;
import utilities.SeleniumHelpers;

public class HomepagePO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public HomepagePO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);

        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, Constants.PAGEFACTORY_WAIT_DURATION), this);
    }

    /*
     * All WebElements are identified by @FindBy annotation
     *
     * @FindBy can accept tagName, partialLinkText, name, linkText, id, css,
     * className, xpath as attributes.
     */

    @FindBy(id = "closeXButton")
    private WebElement closePopUpPromoButton;
    
    @FindBy(xpath = "//*[@id=\'nav-link-accountList\']")
    private WebElement sign;

    @FindBy(css = ".loggg")
    private WebElement registerButton;


    /**
     * Check if promo pop up close button is appear
     * @return true if appear
     */
    private boolean isClosePopUpAppear() {
        return selenium.waitInCaseElementVisible(closePopUpPromoButton, 1) != null;
    }

    /**
     * Click promo pop up close button if promo appear
     * @throws InterruptedException
     */
    public void clickClosePopUpIfAppear() throws InterruptedException {
        if (isClosePopUpAppear()) {
            selenium.clickOn(closePopUpPromoButton);
        }
    }

    /**
     * Click promo pop up close button if promo appear
     * @throws InterruptedException
     */
    public void clickRegister() throws InterruptedException {
        selenium.clickOn(registerButton);
    }

    /**
     * Go to Evermos Home
     */
    public void goToHome() {
        selenium.navigateToPage(Constants.APP_URL);
    }
    
    
    /**
     * Perform Click action
     */
    public void clickOnSign() {
        selenium.navigateToPage(Constants.APP_URL);
        try {
			selenium.click(sign);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
    }
    


}
