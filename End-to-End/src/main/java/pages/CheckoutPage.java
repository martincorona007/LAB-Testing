package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By zipCode = By.id("postal-code");
	By continueBtn = By.id("continue");
	By finishBtn = By.id("finish");
	
	public void enterUserDetails(String fName,String lName,String zip) {
		driver.findElement(firstName).sendKeys(fName);
		driver.findElement(lastName).sendKeys(lName);
		driver.findElement(zipCode).sendKeys(zip);
	}
	public void continueCheckout() {
		driver.findElement(continueBtn).click();
	}
	public void finishCheckout() {
		driver.findElement(finishBtn).click();
	}
}
