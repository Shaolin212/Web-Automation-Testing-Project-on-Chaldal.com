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

public class PersonalCare extends CommonMethods {
	ExtentTest test;
	public PersonalCare(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Personal Care')]")
	WebElement personalCare;
	
	@FindBy(xpath = "//div[contains(text(),\"Women's Care\")]")
	WebElement womenCare;
	
	@FindBy(xpath = "//div[contains(text(),'Female Deo')]")
	WebElement deo;
	
	@FindBy(xpath = "//div[@class='productPane']//div[11]//div[1]//section[1]")
	WebElement addDeo;
	
	@FindBy(xpath = "//input[@name='search_term_string']")
	WebElement search;
	
	@FindBy(xpath = "//div[@class='productPane']//div[15]//div[1]//section[1]//p[1]")
	WebElement handwash;
	
	public void clickPersonalCare() throws IOException {
		test.info("Click Personal Care");
		try {
			if (personalCare.isDisplayed()) {
				personalCare.click();
				sleep(7000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Personal Care clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickPersonalCarePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickPersonalCarePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Personal Care location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickPersonalCareFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickPersonalCareFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(personalCare.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void clickWomenCare() throws IOException {
		test.info("Click Women's Care");
		try {
			if (womenCare.isDisplayed()) {
				womenCare.click();
				sleep(7000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Women's Care clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickWomenCarePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickWomenCarePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Women's Care location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickWomenCareFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickWomenCareFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(womenCare.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void clickDeo() throws IOException {
		test.info("Click Female Deo");
		try {
			if (deo.isDisplayed()) {
				deo.click();
				sleep(7000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Female Deo clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickFemaleDeoPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickFemaleDeoPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Female Deo location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickFemaleDeoFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickFemaleDeoFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(deo.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void chooseDeo() throws IOException {
		test.info("Add Deo to bag");
		try {
			if (addDeo.isDisplayed()) {
				addDeo.click();
				sleep(7000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Deo added.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "addDeoPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addDeoPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>This Deo location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "addDeoFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addDeoFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(addDeo.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void searchHandwash() throws IOException {
		test.info("Search handwash");
		try {
			if (search.isDisplayed()) {
				sendText(search, "handwash");
				sleep(5000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>handwash searched.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "SearchHandwashPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SearchHandwashPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>handwash not searched.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "SearchHandwashFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SearchHandwashFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(search.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void selectHandwash() throws IOException {
		test.info("Select handwash");
		try {
			if (handwash.isDisplayed()) {
				handwash.click();
				sleep(5000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Handwash selected.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "SelectHandwashPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SelectHandwashPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Handwash location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "SelectHandwashFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SelectHandwashFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(handwash.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
}
