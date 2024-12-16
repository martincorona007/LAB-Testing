package com.hellofuture.tutorial.HelloFuture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
	 WebDriver driver;
	@BeforeEach
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
    @Test
    public void testGooglePage() {
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.clear();
        searchbox.sendKeys("Introduction to Accent Reduction");
        searchbox.submit();
        
        
        //driver.manage().timeouts().implicitlyWait(3500, TimeUnit.SECONDS);
        // Explicit wait for the title to contain the expected text
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5)); // 10 seconds timeout
        System.out.println(">>>> "+driver.getTitle());
        wait.until(ExpectedConditions.titleContains("Introduction to Accent Reduction - Buscar con Google"));

        assertEquals("Introduction to Accent Reduction - Buscar con Google", driver.getTitle());
       
    }
    @AfterEach
    public void tearDown() {
    	driver.quit();
    }
}
