package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import drivers.PageDriver;

public class CommonMethods {
	public void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public void hover(WebElement element) {
		Actions action = new Actions(PageDriver.getCurrentDriver());
		action.clickAndHold(element).build().perform();
	}
	
	public void sleep(int duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
