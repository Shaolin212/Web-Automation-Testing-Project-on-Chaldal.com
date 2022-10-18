package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.PageDriver;
import pages.CheckOut;
import utilities.ExtentFactory;

public class GoToCart {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void startUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:BlueViolet; font-size:20px\"><b><em>CheckOut</em></b></p>")
				.assignAuthor("Shaolin").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0)
	public void checkout() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Go to check bag and Add item from Today's Deal.</b></p>");
		CheckOut checkOutPage = new CheckOut(childTest);
		checkOutPage.clickITEMS();
		checkOutPage.clickTodayDeal();
		checkOutPage.clickAddToCartButton();
	}
	
	@Test(priority = 1)
	public void removeItem() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Remove an item from bag.</b></p>");
		CheckOut checkOutPage = new CheckOut(childTest);
		checkOutPage.removeAnyItem();
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
