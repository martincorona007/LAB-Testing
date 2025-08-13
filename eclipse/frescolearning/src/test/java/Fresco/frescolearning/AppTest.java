package Fresco.frescolearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     * 
     */
	private static final String CHROME_DRIVER_PATH = "C:\\Users\\marti\\Documents\\Selenium\\drivers\\chromedriver.exe";
	
    @Test
    public void AppTest()throws InterruptedException{

	    System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
        ChromeOptions opts=new ChromeOptions();
        opts.addArguments("start-maximized","window-size=1920,1080","--headless","--no-sandbox","--disable-gpu","--disable-dev-shm-usage");
        WebDriver driver=new ChromeDriver(opts);
		System.out.println("Chromedriver Driver launched in headless mode");
		
		// Write your script here
		
		driver.get("https://google.com");
		Thread.sleep(5000);
		System.out.println("Launch Browser is sucessful");
		System.out.println("Page Tittle: "+driver.getTitle());
		
		  
		  
		  
	

		//Searching for "Fresco Play" in Google search
			
		driver.findElement(By.("")).sendKeys("Fresco Play");
		driver.findElement(By.("")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		System.out.println("Page Title : " + driver.getTitle());
		
    }
}
