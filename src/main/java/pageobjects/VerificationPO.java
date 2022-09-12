package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.Constants;
import utilities.SeleniumHelpers;

public class VerificationPO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public VerificationPO(WebDriver driver) {
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

    @FindBy(xpath = "//div[@class='input-phone']/input[1]")
    private WebElement phoneLabel;


    /**
     * Get URL
     * @return URL
     * @throws InterruptedException
     */
    public String getURL() throws InterruptedException {
        selenium.hardWait(5);
        return selenium.getURL();
    }

    /**
     * Get phone number label
     * @return String phone number
     */
    public String getPhoneLabel() {
        return selenium.getInputText(phoneLabel);
    }
}
