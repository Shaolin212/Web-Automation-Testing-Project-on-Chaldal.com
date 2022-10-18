package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.Screenshot;

public class ToysAndSports extends CommonMethods {
	ExtentTest test;
	public ToysAndSports(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Toys & Sports')]")
	WebElement toys;
	
	@FindBy(xpath = "//div[contains(text(),'Plush & Stuffed Animals')]")
	WebElement stuffedToys;
	
	@FindBy(xpath = "//div[@class='productPane']//div[2]//div[1]//section[1]")
	WebElement chooseAToy;
	
	public void clickToys() throws IOException {
		test.info("Click Toys & Sports");
		try {
			if (toys.isDisplayed()) {
				toys.click();
				sleep(7000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Toys & Sports clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickToysSportsPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickToysSportsPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Toys & Sports location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickToysSportsFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickToysSportsFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(toys.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void clickStuffedToys() throws IOException {
		test.info("Click Plush & Stuffed Animals");
		try {
			if (stuffedToys.isDisplayed()) {
				stuffedToys.click();
				sleep(7000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Plush & Stuffed Animals clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickPlushStuffedAnimalsPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickPlushStuffedAnimalsPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Plush & Stuffed Animals location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickPlushStuffedAnimalsFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickPlushStuffedAnimalsFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(stuffedToys.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void chooseToy() throws IOException {
		test.info("Add Toy to bag");
		try {
			if (chooseAToy.isDisplayed()) {
				chooseAToy.click();
				sleep(7000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Toy added.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "addToyPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addToyPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>This Toy location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "addToyFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addToyFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(chooseAToy.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
}