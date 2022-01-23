package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ShadowElements;

public class BuildNewCar {

	private WebElement filter;
	
	private String cssSelectorFilter1 = "owcc-car-configurator[class='webcomponent aem-GridColumn aem-GridColumn--default--12']";
	private String cssSelectorFilter2 = "div:nth-child(3) > cc-app-container:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > cc-motorization:nth-child(2) > cc-motorization-filters-section:nth-child(3) > cc-motorization-filters:nth-child(1) > form:nth-child(1) > fieldset:nth-child(1) > div:nth-child(2) > div:nth-child(2) > wb-checkbox-control:nth-child(1) > label:nth-child(1)";

	
	public void clickOnFilterOpt(WebDriver driver, ShadowElements shadow, String commonArg) throws InterruptedException {
		filter = shadow.treatShadowElements(driver, commonArg, cssSelectorFilter1, cssSelectorFilter2);
		filter.click();
	}
}
