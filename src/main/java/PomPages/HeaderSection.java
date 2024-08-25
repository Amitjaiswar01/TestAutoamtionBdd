package PomPages;

import Utilies.Browser;

public class HeaderSection {

	// Fields
	private String customerNameClass = "customer-name";
	private String authorizationLinkClass = "authorization-link";

	// Constructor
	public Browser browser;

	public HeaderSection(Browser _browser) {
		browser = _browser;
	}

	public void MyAccountDropdownCaret() {
		browser.ElementByClassName(customerNameClass).click();
	}

	public void SelectSignOutButton() {
		browser.ElementByClassName(authorizationLinkClass).click();
	}
}
