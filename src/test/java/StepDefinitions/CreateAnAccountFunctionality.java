package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import Utilies.TestBase;
import Utilies.Urls;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAnAccountFunctionality extends TestBase{

	/*@After
	public void TearDown() {
		Browser.QuitDriver();
	}*/
	
	@Given("Navigate to link: https:\\/\\/magento.softwaretestingboard.com\\/")
	public void navigate_to_link_https_magento_softwaretestingboard_com() {
		InitializeScript();
		Browser.Navigate(Urls.HomePage);
	}

	@When("Click on Create an Account Link")
	public void click_on_create_an_account_link() {
		Boolean a = Browser.Wait.ElementIsVisible(By.xpath("//a[text()='Create an Account']"));
		Assert.assertTrue(a);
		CreateAccount.SelectCreateAnAccountLink();
	}

	@And("Fill the form with correct details")
	public void fill_the_form_with_correct_details() {
		CreateAccount.FillCreateAccountForm();
	}

	@And("Click on Create an Account button")
	public void click_on_create_an_account_button() {
		CreateAccount.SelectCreateAnAccountButton();
	}

	@Then("User data should be created")
	public void user_data_should_be_created() {
		String ExpectedUrl = Browser.CurrentUrl();
		Assert.assertEquals("User has not successfully logged In", Urls.MyAccountUrl, ExpectedUrl);
		TearDown();
	}
}
