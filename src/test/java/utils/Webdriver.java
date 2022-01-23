package utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {
	
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
