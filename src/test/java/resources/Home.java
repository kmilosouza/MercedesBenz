package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.*;


public class Home {
	
	private WebDriver driver;
	

	private WebElement cookiesId;
	private WebElement ourCarsId;
	String commonArg = "return arguments[0].shadowRoot";
	private String cssSelectorCookie1 = "cmm-cookie-banner[class='hydrated";
	private String cssSelectorCookie2 = "div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > button:nth-child(2)";
	
	private String cssSelectorOurCars1 = "owc-header[class='webcomponent aem-GridColumn aem-GridColumn--default--12']";
	private String cssSelectorOurCars2 = "header:nth-child(9) > div:nth-child(1) > nav:nth-child(3) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > button:nth-child(1) > p:nth-child(2)";
	
	//Constructor method
	public Home (WebDriver driver) {
		this.driver = driver;
	}
	
	public void acceptCookies(WebDriver driver) throws InterruptedException {
		cookiesId = utils.ShadowElements.treatShadowElements(driver, commonArg, cssSelectorCookie1, cssSelectorCookie2);
		cookiesId.click();
	}
	

}
