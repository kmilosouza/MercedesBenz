package utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {
	
	/*
	 * This framework was tested in a Linux environment. In order to reproduce the
	 * execution in your environment, make sure that the Chrome/Firefox driver is set in the
	 * location cited below.
	 */
	
	public WebDriver createDriver() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mercedes-benz.co.uk");
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebDriver createFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver", "/usr/bin/chromedriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mercedes-benz.co.uk");
		driver.manage().window().maximize();
		return driver;
	}
}
