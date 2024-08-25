package Utilies;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebWaits {

	private WebDriverWait Wait;

	// Constructor
	public Browser Browser;

	public WebWaits(Browser browser) {
		Browser = browser;
		Wait = new WebDriverWait(Browser.Driver, Duration.ofSeconds(30));
	}

	public Boolean ElementIsVisible(By by) {

		Boolean value = false;

		try {
			WebElement element = Wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			if (element != null)
				value = true;
		} catch (NoSuchElementException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}

		return value;
	}
}
