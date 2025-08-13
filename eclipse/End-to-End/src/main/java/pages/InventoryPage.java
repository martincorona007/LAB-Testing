package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	WebDriver driver;
	
	By addToCart = By.id("add-to-cart-sauce-labs-backpack");
	By cartIcon = By.className("shopping_cat_link");
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}
	public void addBackpackToChart() {
		driver.findElement(addToCart).click();
	}
	public void goToCart() {
		driver.findElement(cartIcon).click();
	}
}
