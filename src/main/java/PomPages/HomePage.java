package PomPages;

import org.openqa.selenium.By;

import Utilies.Browser;

public class HomePage {

	private String homeMainClass = "home-main";

	// Constructor
	public Browser browser;

	public HomePage(Browser _browser) {
		browser = _browser;
	}
	
	public boolean IsCurrentPage() {
		
		boolean value = browser.Wait.ElementIsVisible(By.className(homeMainClass));
		return value;
	}
}
