package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeRangeTest {
  
 // private WebDriver driver;
 private WebDriver driver;
  @BeforeMethod
  public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
  }
  @Test
  public void nevegamosAFreeRangeTesters(){
    //driver.get("https://www.freerangetesters.com");
    driver.get("https://www.youtube.com/watch?v=RErA2OquW6Y&list=LL&index=4");
  }
  @AfterMethod
  public void testDown(){
    if(driver!=null){
      driver.quit();
    }
  }
}
