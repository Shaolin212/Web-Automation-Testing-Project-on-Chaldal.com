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

public class CheckOut extends CommonMethods{
	ExtentTest test;
	public CheckOut(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//p//span[contains(text(),'ITEMS')]")
	WebElement clickBag;
	
	@FindBy(xpath = "//div[@class='top-box']")
	WebElement dropDown;
	
	@FindBy(xpath = "//div[@class='addToCartButton']")
	WebElement addToCartButton;
	
	@FindBy(xpath = "//div[@class='body']//div//div[2]//div[@title='Remove from bag']")
	WebElement removeAnItem;

	public void clickITEMS() throws IOException {
		test.info("Click ITEMS");
		try {
			if (clickBag.isDisplayed()) { 
				clickBag.click();
				sleep(7000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>ITEMS clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickITEMSPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickITEMSPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>ITEMS location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickITEMSFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickITEMSFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(clickBag.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void clickTodayDeal() throws IOException {
		test.info("Click Today's deal dropdown");
		try {
			if (dropDown.isDisplayed()) { 
				dropDown.click();
				sleep(7000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Today's deal dropdown clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickTodayDealPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickTodayDealPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Today's deal dropdown location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickTodayDealFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickTodayDealFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(dropDown.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void clickAddToCartButton() throws IOException {
		test.info("Click AddToCartButton from Today's deal");
		try {
			if (addToCartButton.isDisplayed()) { 
				addToCartButton.click();
				sleep(5000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>AddToCartButton from Today's deal clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickAddToCartButtonPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickAddToCartButtonPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>AddToCartButton from Today's deal location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickAddToCartButtonFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickAddToCartButtonFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(addToCartButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void removeAnyItem() throws IOException {
		test.info("Remove an item from bag");
		try {
			if (removeAnItem.isDisplayed()) { 
				removeAnItem.click();
				sleep(5000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Removed an item from bag.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "removeAnItemPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "removeAnItemPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Remove Item location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "removeAnItemFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "removeAnItemFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(removeAnItem.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
}
