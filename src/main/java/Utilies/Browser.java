package Utilies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import DriverFile.DriverInstance;

public class Browser {

	public WebDriver Driver;
	public WebWaits Wait;

	public Browser() {

		Driver = new DriverInstance().InitializeDriver("chrome");
		Wait = new WebWaits(this);
	}

	public void Navigate(String url) {
		Driver.navigate().to(url);
		Driver.manage().window().maximize();
	}

	public WebElement ElementById(String id) {

		return Driver.findElement(By.id(id));
	}

	public WebElement ElementByClassName(String className) {

		return Driver.findElement(By.className(className));
	}

	public WebElement ElementByXpath(String xpath) {

		return Driver.findElement(By.xpath(xpath));
	}

	public WebElement ElementBySelector(String cssSelector) {

		return Driver.findElement(By.cssSelector(cssSelector));
	}

	public WebElement ElementByName(String name) {

		return Driver.findElement(By.name(name));
	}

	public String CurrentUrl() {
		return Driver.getCurrentUrl();
	}

	public void QuitDriver() {
		Driver.quit();
	}
}
