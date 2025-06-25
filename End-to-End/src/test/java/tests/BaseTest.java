package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.out.println("Initializing WebDriver... ");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
