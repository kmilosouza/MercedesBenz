package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowElements {

	
	// This method just treat the Accept Cookies button that is inside single shadow
		// DOM.
		public WebElement treatShadowElements(WebDriver driver, String script, String css1, String css2) throws InterruptedException {
			Thread.sleep(1000);
			WebElement shadowDomHostElement = driver.findElement(By.cssSelector(css1));
			WebElement last = (WebElement) ((JavascriptExecutor) driver).executeScript(script,shadowDomHostElement);
			Thread.sleep(1000);
			//last.findElement(By.cssSelector(css2)).click();
			WebElement result = last.findElement(By.cssSelector(css2));
			return result;
		}
		
}
