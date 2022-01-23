package testcases;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	private ShadowElements shadow;
	public String commonArg = "return arguments[0].shadowRoot";
	
	
	@BeforeTest
	public void preSetup() {
		Webdriver aux = new Webdriver();
		driver = aux.createDriver();
		shadow = new ShadowElements();
		
	}
	
	@Test
	public void BookNewHatchBack() throws InterruptedException {
		Home home = new Home(driver);
		Hatchbacks hatch = new Hatchbacks();
		OurCarsMenu ourcar = new OurCarsMenu();
		BuildNewCar newcar = new BuildNewCar();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		home.acceptCookies(driver,shadow,commonArg );
		home.clickOurCarsMenu(driver, shadow, commonArg);
		hatch.clickOnHatchbackOpt(driver, shadow, commonArg);
		
		Thread.sleep(2000);
		ourcar.aClassMenu(driver, shadow, commonArg);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)", "");
		ourcar.buildNewCarOpt(driver, shadow, commonArg);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,600)", "");
		
		Thread.sleep(3000);
		newcar.clickOnFilterOpt(driver, shadow, commonArg);
		js.executeScript("window.scrollBy(0,600)", "");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			FileUtils.copyFile(scrFile, new File("./results/screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void afterTest()  {
		driver.quit();
	}

}
