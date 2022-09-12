package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.Constants;
import utilities.SeleniumHelpers;

public class RegisterPO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public RegisterPO(WebDriver driver) {
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

    @FindBy(name = "telephone")
    private WebElement phoneFieldInput;

    @FindBy(css = "[placeholder='Nama Kamu']")
    private WebElement nameFieldInput;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordFieldInput;

    @FindBy(css = ".registration__block")
    private WebElement areaFieldButton;

    @FindBy(className = "searchBox__input")
    private WebElement searchAreaInput;

    @FindBy(css = ".lists > a:nth-of-type(1)")
    private WebElement firstAreaSearchResult;

    @FindBy(css = ".tnc__checkbox [type='checkbox']")
    private WebElement agreementCheckbox;

    @FindBy(xpath = "//button[contains(@class, 'btn--block') and not(@disabled='disabled')]")
    private WebElement continueRegisterButton;


    /**
     * Enter text phone number to phone field
     * @param phone is phone number
     */
    public void enterTextPhone(String phone) {
        selenium.enterText(phoneFieldInput, phone, true);
    }

    /**
     * Enter text name to name field
     * @param name is user name
     */
    public void enterTextName(String name) {
        selenium.enterText(nameFieldInput, name, true);
    }

    /**
     * Enter password text to password field
     * @param pass is password
     */
    public void enterTextPassword(String pass) {
        selenium.enterText(passwordFieldInput, pass, true);
    }

    /**
     * Set Area to desired area
     * Click area button then search area and click first shown result
     * @param area is desired area
     * @throws InterruptedException
     */
    public void setArea(String area) throws InterruptedException {
        selenium.javascriptClickOn(areaFieldButton);
        selenium.enterText(searchAreaInput, area, true);
        selenium.clickOn(firstAreaSearchResult);
    }

    /**
     * Click checkbox user agreement
     */
    public void clickTermServiceCheckbox() throws InterruptedException {
        selenium.javascriptClickOn(agreementCheckbox);
        selenium.hardWait(1);
        
    }

    /**
     * Click continue register button
     * @throws InterruptedException
     */
    public void clickContinueRegister() throws InterruptedException {
        selenium.javascriptClickOn(continueRegisterButton);
    }
}
