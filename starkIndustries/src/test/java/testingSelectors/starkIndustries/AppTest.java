package testingSelectors.starkIndustries;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Unit test for simple App.
 */
public class AppTest {

	WebDriver driver;
	
    
	@BeforeEach
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver", "./resources/chromedriver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marti\\Documents\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	}
	@Test
    public void testGooglePage() {
        assertEquals("Google",driver.getTitle());
    }
	@AfterEach
	public void shutDown() {
		driver.quit();
	}
}
