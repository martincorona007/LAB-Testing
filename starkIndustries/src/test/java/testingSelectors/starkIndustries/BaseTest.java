package testingSelectors.starkIndustries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected static WebDriver driver;
	private static final String CHROME_DRIVER_PATH = "C:\\Users\\marti\\Documents\\Selenium\\drivers\\chromedriver.exe";
	
	@BeforeAll
	public static void globalSetup() {
		System.out.println("Setting up WebDriver properties...");
		//System.setProperty("webdriver.chrome.driver", "./resources/chromedriver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("Initializing WebDriver... ");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterEach
	public void shutDown() {
		if(driver != null) {
			System.out.println("Closing WebDriver... ");
			driver.quit();
		}
		
	}
	 @AfterAll
	    public static void cleanUpProcesses() {
	        System.out.println("Cleaning up ChromeDriver processes...");

	        try {
	            // Check if chromedriver.exe is running
	            Process checkProcess = Runtime.getRuntime().exec("tasklist");
	            BufferedReader reader = new BufferedReader(new InputStreamReader(checkProcess.getInputStream()));
	            String line;
	            boolean found = false;

	            while ((line = reader.readLine()) != null) {
	                if (line.toLowerCase().contains("chromedriver.exe")) {
	                    found = true;
	                    break;
	                }
	            }

	            // Only kill if it's running
	            if (found) {
	                System.out.println("ChromeDriver process found. Terminating...");
	                Process process = Runtime.getRuntime().exec(new String[]{"cmd", "/c", "taskkill /F /IM chromedriver.exe /T"});
	                int exitCode = process.waitFor();

	                if (exitCode == 0) {
	                    System.out.println("ChromeDriver process terminated successfully.");
	                } else {
	                    System.out.println("Warning: ChromeDriver process termination may have failed.");
	                }
	            } else {
	                System.out.println("No running ChromeDriver processes found.");
	            }

	        } catch (IOException | InterruptedException e) {
	            System.out.println("Error closing ChromeDriver: " + e.getMessage());
	        }
	    } 
}
