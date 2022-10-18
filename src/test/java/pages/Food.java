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

public class Food extends CommonMethods {
	ExtentTest test;
	public Food(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Food')]")
	WebElement foods;
	
	@FindBy(xpath = "//a[contains(text(),'Snacks')]")
	WebElement snacks;
	
	@FindBy(xpath = "//a[contains(text(),'Noodles')]")
	WebElement noodles;
	
	@FindBy(xpath = "//div[@class='productPane']//div[10]//div[1]//section[1]")
	WebElement orderNoodles;
	
	public void clickFoods() throws IOException {
		test.info("Click Food menu");
		try {
			if (foods.isDisplayed()) {
				foods.click();
				sleep(7000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Food menu clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickFoodMenuPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickFoodMenuPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Food menu location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickFoodMenuFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickFoodMenuFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(foods.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void clickSnacks() throws IOException {
		test.info("Click snacks");
		try {
			if (snacks.isDisplayed()) {
				snacks.click();
				sleep(7000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Snacks clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickSnacksPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickSnacksPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Snacks location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickSnacksFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickSnacksFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(snacks.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void clickNoodles() throws IOException {
		test.info("Click noodles");
		try {
			if (noodles.isDisplayed()) {
				noodles.click();
				sleep(7000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Noodles clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickNoodlesPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickNoodlesPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Noodles location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickNoodlesFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickNoodlesFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(noodles.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void orderANoodles() throws IOException {
		test.info("Add to bag a noodles");
		try {
			if (orderNoodles.isDisplayed()) {
				hover(orderNoodles);
				sleep(5000);
				orderNoodles.click();
				sleep(7000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Noodles added to bag.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "addNoodlesPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addNoodlesPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>This Noodles location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "addNoodlesFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addNoodlesFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(orderNoodles.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
}
