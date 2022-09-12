package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utilities.Constants;
import utilities.SeleniumHelpers;

public class LoginPagePO {
	
	WebDriver driver;
    SeleniumHelpers selenium;

    public LoginPagePO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);

        // This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, Constants.PAGEFACTORY_WAIT_DURATION), this);
    }
    
  
    
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a/div/div/div/div[2]/h2")
    private WebElement Loginsecurity;
    
    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    private WebElement searchInputbox;
    
    @FindBy(xpath = "//*[@id=\'nav-link-accountList-nav-line-1\']")
    private WebElement sign;
    
    public void goTologin() {
        selenium.navigateToPage(Constants.APP_URL);
    }
    public void elementInput() {
        selenium.enterText(searchInputbox, "laptops", false);
    }
    public void elementClick() {
        try {
			selenium.click(sign);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    }
    

}
