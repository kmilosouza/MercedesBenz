package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.ShadowElements;

public class OurCarsMenu {

	private WebElement aClassId;
	private WebElement buildNcar;
	
	private String cssSelectorAclass1 = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > dh-io-vmos:nth-child(1) > div:nth-child(1)";
	private String cssSelectorAclass2 = "div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)";
	
	private String cssSelectorBuildNewCar1 = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > dh-io-vmos:nth-child(1) > div:nth-child(1)";
	private String cssSelectorBuildNewCar2 = "div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > wb-popover:nth-child(2) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)";

	public void aClassMenu (WebDriver driver, ShadowElements shadow, String commonArg) throws InterruptedException {
		Actions actions = new Actions(driver);
		aClassId = shadow.treatShadowElements(driver, commonArg, cssSelectorAclass1, cssSelectorAclass2);
		actions.moveToElement(aClassId).perform();
	}
	
	public void buildNewCarOpt (WebDriver driver, ShadowElements shadow, String commonArg) throws InterruptedException {
		buildNcar = shadow.treatShadowElements(driver, commonArg, cssSelectorBuildNewCar1, cssSelectorBuildNewCar2);
		buildNcar.click();
	}
	
}
