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

public class BeautyAndMakeup extends CommonMethods {
	ExtentTest test;
	public BeautyAndMakeup(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Beauty & MakeUp')]")
	WebElement makeup;
	
	@FindBy(xpath = "//a[contains(text(),'Lips')]")
	WebElement lips;
	
	@FindBy(xpath = "//div[@class='productPane']//div[8]//div[1]//section[1]")
	WebElement lipStick;
	
	@FindAll({
		@FindBy(xpath = "//div[@class='productPane']/div[8]/div[1]/div[2]/button[2]"),
		@FindBy(xpath = "//body/div[@id='page']/div[1]/div[6]/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[8]/div[1]/div[2]/button[2]")
	})
	WebElement addMoreLipStick;
	
	public void clickMakeup() throws IOException {
		test.info("Hover and Click Beauty & MakeUp");
		try {
			if (makeup.isDisplayed()) { 
				hover(makeup);
				sleep(5000);
				makeup.click();
				sleep(7000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Beauty & MakeUp hovered and clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickMakeupPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickMakeupPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Beauty & MakeUp location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickMakeupFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickMakeupFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(makeup.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void clickLips() throws IOException {
		test.info("Click Lips");
		try {
			if (lips.isDisplayed()) { 
				lips.click();
				sleep(7000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Lips clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickLipsPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickLipsPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Lips location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickLipsFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickLipsFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(lips.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void clickLipstick() throws IOException {
		test.info("Hover and add a Lipstick to the cart");
		try {
			if (lipStick.isDisplayed()) { 
				hover(lipStick);
				sleep(5000);
				lipStick.click();
				sleep(5000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Lipstick hovered and clicked.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickLipsticksPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickLipsticksPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Lipstick location not available.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "clickLipstickFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickLipstickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(lipStick.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
	public void addTwoLipstick() throws IOException {
		test.info("Add two Lipsticks to the cart");
		try {
			if (addMoreLipStick.isDisplayed()) {
				addMoreLipStick.click();
				sleep(3000);
				
				test.pass("<p style=\"color:green; font-size:13px\"><b>Two Lipsticks added.</b></p>");
				sleep(2000);
				@SuppressWarnings("unused")
				String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "addTwoLipsticksPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addTwoLipsticksPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Two Lipsticks not added.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = Screenshot.capture(PageDriver.getCurrentDriver(), "addTwoLipsticksFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "addTwoLipsticksFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(addMoreLipStick.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
}
