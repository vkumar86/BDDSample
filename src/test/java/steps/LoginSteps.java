package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomepagePO;
import pageobjects.LoginPagePO;
import utilities.ThreadManager;

public class LoginSteps {
	
	
	private final WebDriver driver = ThreadManager.getDriver();
	private final HomepagePO home = new HomepagePO(driver);
	
	
	@Given("Launch login page of Amazon")
	public void launch_login_page_of_Amazon() {
	    
	}

	@When("Click on Login")
	public void click_on_Login() {
		 new LoginPagePO(driver).elementClick();
	}

	@Then("i should be navigate to login screen")
	public void i_should_be_navigate_to_login_screen() {
	   new LoginPagePO(driver).goTologin();
	}
	
	@Given("Launch CO URL")
	public void launch_CO_URL() {
	    
	}

	@When("I Input testid")
	public void i_Input_testid() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I Input testuserid")
	public void i_Input_testuserid() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I Click on {string}")
	public void i_Click_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should be navigate to password")
	public void i_should_be_navigate_to_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	

}
