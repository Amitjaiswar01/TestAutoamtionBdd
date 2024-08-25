package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;

import Utilies.TestBase;
import Utilies.Urls;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifySignInFlowFunctionality extends TestBase {

	String EmailAddress;
	String Password;
	
	@After
	public void TearDown() {
		Browser.QuitDriver();
	}
	
	@Given("Navigate the main link: https:\\/\\/magento.softwaretestingboard.com\\/")
	public void navigate_the_main_link_https_magento_softwaretestingboard_com() {
		Browser.Navigate(Urls.HomePage);
	}
	
	@When("Click on SignIn Link on the page")
	public void click_on_sign_in_link_on_the_page() {
	    Sign.SelectSignInLink();
	}
	
	@And("Click on Create an Account buttton")
	public void click_on_create_an_account_buttton() {
	    Sign.SelectCreateButton();
	}
	
	@And("Fill all the personal details and click on submit button")
	public void fill_all_the_personal_details_and_click_on_submit_button() {
		CreateAccount.FillCreateAccountForm();
		CreateAccount.SelectCreateAnAccountButton();
		EmailAddress = AccountData.getEmailAddress();
		Password = AccountData.getPassword();
	}
	
	@Then("Verify the logged in Url")
	public void verify_the_logged_in_url() {
		String ExpectedUrl = Browser.CurrentUrl();
		Assert.assertEquals("User has not successfully created account",Urls.MyAccountUrl, ExpectedUrl);
	}
	
	@When("Click on caret and signed out")
	public void click_on_caret_and_signed_out() {
	    Header.MyAccountDropdownCaret();
	    Header.SelectSignOutButton();
	}
	
	@Then("Verify the User is sign Out")
	public void verify_the_user_is_sign_out() throws InterruptedException {
		String ExpectedUrl = Browser.CurrentUrl();
		Assert.assertEquals("User has not successfully logged Out", Urls.LoggedOutUrl, ExpectedUrl);
		
		Thread.sleep(Duration.ofSeconds(5));
		
		String SuccessfullyRedirectToHome = Browser.CurrentUrl();
		Assert.assertEquals("User has not successfully logged Out", Urls.HomePage, SuccessfullyRedirectToHome);
	}
	
	@When("Again click on Sign In link")
	public void again_click_on_sign_in_link() {
	    Sign.SelectSignInLink();
	}
	
	@When("Add the register email and password")
	public void add_the_register_email_and_password() {
	    Sign.FillTheRegisteredCustomersForm(EmailAddress, Password);
	    Sign.SelectSignInButton();
	}
	
	@Then("Verify the user logged in successfully in session")
	public void verify_the_user_logged_in_successfully_in_session() {
		Assert.assertTrue("Current page is not a homepage", Home.IsCurrentPage());
	}
}
