package DriverFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInstance {

	public WebDriver driver1;
	public WebDriver driver;

	public WebDriver InitializeDriver(String type) {

		if (type.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (type.equals("edge")) {
			driver = new EdgeDriver();
		} else if (type.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		return driver;
	}

}
