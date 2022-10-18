package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.Screenshot;

public class HomePage extends CommonMethods{
	ExtentTest test;
	public HomePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//ul[@class='misc-menu']//li[1]//div[1]")
	WebElement offers;
	
	@FindBy(xpath = "//body/div[@id='page']/div[@class='app catalog navOpen chaldal-theme']/div[@class='everythingElseWrapper']/section[@class='bodyTable']/div/div[@id='your-offers']/div[@class='mainTile']/a[3]/div[1]/div[1]/span[2]")
	WebElement food;
	
	@FindAll({
		@FindBy(xpath = "//span[normalize-space()='Chips & Pretzels']")
	})
	WebElement chips;
	
	@FindBy(xpath = "//section[@class='addButtonWrapper border-radius-small'][1]")
	WebElement pringles;
	
	public void clickOffer() throws IOException {
		test.info("Click offers");
		try {
			if (offers.isDisplayed()) {
				offers.click();
				sleep(5000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Offers menu clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickOffersPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickOffersPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Offers loaction not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickOffersFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickOffersFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(offers.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void clickFood() throws IOException {
		test.info("Click food");
		try {
			if (food.isDisplayed()) {
				food.click();
				sleep(5000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Food clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickFoodPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickFoodPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Food location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickFoodFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickFoodFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(food.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void clickChips() throws IOException {
		test.info("Click Chips & Pretzels");
		try {
			if (chips.isDisplayed()) {
				chips.click();
				sleep(5000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Chips & Pretzels clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickChips&PretzelsPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickChips&PretzelsPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Chips & Pretzels location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickChips&PretzelsFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickChips&PretzelsFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(chips.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	
	public void orderPringles() throws IOException {
		test.info("Choose pringles");
		try {
			if (pringles.isDisplayed()) {
				//addPringles.click();
				pringles.click();
				sleep(5000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Pringles choosed.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "selectPringlesPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectPringlesPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Pringles location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "selectPringlesFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectPringlesFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(pringles.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
}
