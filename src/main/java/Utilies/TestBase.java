package Utilies;

import PomPages.CreateAccount;
import PomPages.HeaderSection;
import PomPages.HomePage;
import PomPages.SignInPage;

public class TestBase {

	public Browser Browser;
	public CustomerFormDetails CustomerFormDetails;
	public CreateAccount CreateAccount;
	public SignInPage Sign;
	public StoreAccountData AccountData;
	public HeaderSection Header;
	public HomePage Home;

	public TestBase() {
		// Initialize Browser once
		Browser = new Browser();

		// Initialize dependencies
		AccountData = new StoreAccountData();
		CustomerFormDetails = new CustomerFormDetails();

		// Initialize Page Objects
		CreateAccount = new CreateAccount(Browser, CustomerFormDetails, AccountData);
		Sign = new SignInPage(Browser);
		Header = new HeaderSection(Browser);
		Home = new HomePage(Browser);
	}
}
