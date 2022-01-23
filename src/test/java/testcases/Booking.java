package testcases;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.*;
import utils.*;
import org.testng.TestNG;


public class Booking {
	private WebDriver driver;
	
	/*
	 * This framework was tested in a Linux environment. In order to reproduce the
	 * execution in your environment, make sure that the Chrome driver is set in the
	 * location cited below.
	 */
	
	@BeforeTest
	public void createDriver() {
		Webdriver aux = new Webdriver();
		driver = aux.createDriver();
	}
	
	@Test
	public void BookNewHatchBack() throws InterruptedException {
		Home a = new Home(driver);
		a.acceptCookies(driver);
	}
	
	

}
