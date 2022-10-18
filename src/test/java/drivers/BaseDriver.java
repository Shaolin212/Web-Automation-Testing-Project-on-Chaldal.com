package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	public static String baseUrl = "https://chaldal.com";
	public WebDriver driver = null;
	
	@BeforeSuite
	public void start() {
		String browser = System.getProperty("Browser", "Chrome");
		
		if (browser.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		PageDriver.getInstance().setDriver(driver);
	}
	
	@AfterSuite
	public void close() {
		PageDriver.getCurrentDriver().quit();
	}
}
