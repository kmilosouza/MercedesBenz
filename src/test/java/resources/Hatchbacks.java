package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ShadowElements;

public class Hatchbacks {

	private WebElement hatchback; 
	private String cssSelectorHatchBacks1 = "owc-header[class='webcomponent aem-GridColumn aem-GridColumn--default--12']";
	private String cssSelectorHatchBacks2 = "header:nth-child(9) > div:nth-child(1) > nav:nth-child(3) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1) > p:nth-child(1)";

	public void clickOnHatchbackOpt(WebDriver driver, ShadowElements shadow, String commonArg) throws InterruptedException {
		hatchback = shadow.treatShadowElements(driver, commonArg, cssSelectorHatchBacks1, cssSelectorHatchBacks2);
		hatchback.click();
	}



}
