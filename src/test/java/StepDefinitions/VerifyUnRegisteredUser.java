package StepDefinitions;

import org.junit.Assert;
import org.testng.annotations.Test;

import Utilies.Messages;
import Utilies.TestBase;
import Utilies.Urls;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyUnRegisteredUser extends TestBase {

	@Given("Navigate to magneto homepage link")
	public void navigate_to_magneto_homepage_link() {
		InitializeScript();
		Browser.Navigate(Urls.HomePage);
	}

	@When("Click on SignIn link from the header section")
	public void click_on_sign_in_link_from_the_header_section() {
	    Sign.SelectSignInLink();
	}

	@And("Enter unregistered data")
	public void enter_unregistered_data() {
	    String email = CustomerFormDetails.GenerateFormDeatails().Email();
	    String password = CustomerFormDetails.GenerateFormDeatails().Password();
	    
	    Sign.FillTheRegisteredCustomersForm(email, password);
	}

	@And("Click on Sign in button")
	public void click_on_sign_in_button() {
		Sign.SelectSignInButton();
	}

	@Then("User shouldn't able to login on page")
	public void user_shouldn_t_able_to_login_on_page() {
	    Assert.assertEquals("Customer logged in with unregisted data", 
	    		Messages.IncorrectAccountSignUpTxt, Sign.GetUnregisteredText());
	    TearDown();
	}
}
