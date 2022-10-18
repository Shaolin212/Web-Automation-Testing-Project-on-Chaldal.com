package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.BeautyAndMakeup;
import pages.Food;
import pages.HomePage;
import pages.PersonalCare;
import pages.ToysAndSports;
import utilities.ExtentFactory;

public class AddItems extends BaseDriver{
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void openUrl() throws InterruptedException {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:BlueViolet; font-size:20px\"><b><em>Add items to Cart</em></b></p>")
				.assignAuthor("Shaolin").assignDevice("Windows");
		PageDriver.getCurrentDriver().get(baseUrl);
		PageDriver.getCurrentDriver().manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority = 0)
	public void addOfferItems() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Add food from offers.</b></p>");
		
		HomePage homePage = new HomePage(childTest);
		
		homePage.clickOffer();
		homePage.clickFood();
		homePage.clickChips();
		homePage.orderPringles();
	}
	
	@Test(priority = 1)
	public void addFoodItems() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Add Noodles to the cart.</b></p>");
		
		Food foodPage = new Food(childTest);
		
		foodPage.clickFoods();
		foodPage.clickSnacks();
		foodPage.clickNoodles();
		foodPage.orderANoodles();
	}
	
	@Test(priority = 2)
	public void addBeautyItems() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Add Lipsticks to the cart.</b></p>");
		
		BeautyAndMakeup makeupPage = new BeautyAndMakeup(childTest);
		
		makeupPage.clickMakeup();
		makeupPage.clickLips();
		makeupPage.clickLipstick();
		makeupPage.addTwoLipstick();
	}
	
	@Test(priority = 3)
	public void addToyItems() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Add Toy to the cart.</b></p>");
		
		ToysAndSports toyPage = new ToysAndSports(childTest);
		
		toyPage.clickToys();
		toyPage.clickStuffedToys();
		toyPage.chooseToy();
	}
	
	@Test(priority = 4)
	public void addPersonalCareItems() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Add a Female Deo to the cart.</b></p>");
		
		PersonalCare personalCarePage = new PersonalCare(childTest);
		
		personalCarePage.clickPersonalCare();
		personalCarePage.clickWomenCare();
		personalCarePage.clickDeo();
		personalCarePage.chooseDeo();
	}
	
	@Test(priority = 5)
	public void searchAndAddItem() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:MediumBlue; font-size:20px\"><b>Search handwash and Add to the cart.</b></p>");
		
		PersonalCare personalCarePage = new PersonalCare(childTest);
		personalCarePage.searchHandwash();
		personalCarePage.selectHandwash();
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
