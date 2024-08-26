package PomPages;

import org.openqa.selenium.WebElement;

import Utilies.Browser;
import Utilies.CustomerDetails;
import Utilies.CustomerFormDetails;
import Utilies.StoreAccountData;

public class CreateAccount {

	// fields
	private String _createAccountLinkXpath = "//a[text()='Create an Account']";
	private String _firstNameId = "firstname";
	private String _lastNameId = "lastname";
	private String _emailName = "email";
	private String _passwordSelector = "input[title='Password']";
	private String _passwordConfirmationName = "password_confirmation";
	private String _submitClassName = "submit";

	// Constructor
	public Browser browser;
	public CustomerFormDetails customerDetails;
	public StoreAccountData accountData;

	public CreateAccount(Browser _browser, CustomerFormDetails _customerDetails, StoreAccountData _accountData) {
		browser = _browser;
		customerDetails = _customerDetails;
		accountData = _accountData;
	}

	// Methods
	public void SelectCreateAnAccountLink() {
		WebElement CreateAccountLink = browser.ElementByXpath(_createAccountLinkXpath);
		CreateAccountLink.click();
	}

	public void FillCreateAccountForm() {
		// Generate customer details
		CustomerDetails details = customerDetails.GenerateFormDeatails();

		// Store the generated customer details
		accountData.setCustomerDetails(details);

		browser.ElementBySelector("#" + _firstNameId).sendKeys(details.FirstName());
		browser.ElementBySelector("#" + _lastNameId).sendKeys(details.LastName());
		browser.ElementByName(_emailName).sendKeys(details.Email());
		browser.ElementBySelector(_passwordSelector).sendKeys(details.Password());
		browser.ElementByName(_passwordConfirmationName).sendKeys(details.ConfirmPassword());
	}

	public void SelectCreateAnAccountButton() {
		WebElement SubmitButton = browser.ElementByClassName(_submitClassName);
		SubmitButton.click();
	}
}
