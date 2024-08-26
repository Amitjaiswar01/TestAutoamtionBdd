package PomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilies.Browser;

public class SignInPage {

	// fields
	private String _signInXpath = "//a[contains(text(),'Sign In')]";
	private String _emailFieldSelector = "[type='email']";
	private String _passwordFieldName = "login[password]";
	private String _sendName = "send";
	private String _createClassName = "create";
	private String _unregisteredEleXpath = "//div[contains(text(), \"The account sign-in\")]"; 

	// Constructor
	public Browser browser;

	public SignInPage(Browser _browser) {
			browser = _browser;
		}

	// Methods
	public void SelectSignInLink() {
		WebElement SignInLink = browser.ElementByXpath(_signInXpath);
		SignInLink.click();
	}

	public void FillTheRegisteredCustomersForm(String email, String password) {
		browser.ElementBySelector(_emailFieldSelector).sendKeys(email);
		browser.ElementByName(_passwordFieldName).sendKeys(password);
	}

	public void SelectSignInButton() {
		browser.ElementByName(_sendName).click();
	}

	public void SelectCreateButton() {
		browser.ElementBySelector("." + _createClassName).click();
	}

	public String GetSignOutText() {
		return browser.ElementByXpath("//span[contains(text(),'You are signed out')]").getText();
	}
	
	public String GetUnregisteredText() {
		browser.Wait.ElementIsVisible(By.xpath(_unregisteredEleXpath));
		return browser.ElementByXpath(_unregisteredEleXpath).getText();
	}
}
