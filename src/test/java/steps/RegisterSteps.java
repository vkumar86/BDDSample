package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobjects.HomepagePO;
import pageobjects.RegisterPO;
import pageobjects.VerificationPO;
import utilities.Constants;
import utilities.SeleniumHelpers;
import utilities.ThreadManager;

public class RegisterSteps {

	private final WebDriver driver = ThreadManager.getDriver();
	private final HomepagePO home = new HomepagePO(driver);
	private final RegisterPO register = new RegisterPO(driver);
	private final VerificationPO verify = new VerificationPO(driver);

	@Given("user open amazon application")
	public void userOpenAmazonApplication() {
		home.goToHome();
	}
	@When("I Click on SignIn")
	public void i_Click_on_SignIn() {
		home.clickOnSign(); 
	}

	@Then("page redirected to {string}")
	public void page_redirected_to(String url) throws InterruptedException {
		Assert.assertEquals(verify.getURL(), url, "Not redirect to verification page after register");
	}

	@And("user see phone number is {string} in Verification page")
	public void user_see_phone_number_is_in_Verification_page(String phone) {
		Assert.assertEquals(verify.getPhoneLabel(), phone, "Phone not same with previous page");
	}
}
