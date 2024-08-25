package StepDefinitions;

import org.junit.Assert;

import Utilies.TestBase;
import Utilies.Urls;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerLoginFunctionality extends TestBase {

	@After
	public void TearDown() {
		Browser.QuitDriver();
	}

	@Given("Navigate the link: https:\\/\\/magento.softwaretestingboard.com\\/")
	public void navigate_the_link_https_magento_softwaretestingboard_com() {
		Browser.Navigate(Urls.HomePage);
	}

	@When("Click on Sign In Link")
	public void click_on_sign_in_link() {
		Sign.SelectSignInLink();
	}
/*
	@And("Fill form with correct details (.*) and (.*)")
	public void fill_form_with_correct_details_email_and_password(String email, String password) {
		Sign.FillTheRegisteredCustomersForm(email, password);
	}
	*/
	
	@And("Fill form with correct details")
	public void fill_form_with_correct_details() {
		String email = AccountData.FormData().getFirst();
		String password = AccountData.FormData().getLast();
		Sign.FillTheRegisteredCustomersForm(email, password);
	}

	@And("Click on Sign In button")
	public void click_on_sign_in_button() {
		Sign.SelectSignInButton();
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() {
		String ExpectedUrl = Browser.CurrentUrl();
		Assert.assertEquals("User has not successfully logged In", Urls.HomePage, ExpectedUrl);
	}
}
