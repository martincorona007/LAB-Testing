package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.fasterxml.jackson.databind.JsonSerializable.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
  
  //1.[What is this?] make instance de tipo WebDriver
  //                            |
  //2 [What is going to be used?] esta variable va a ser compartida por todas las instancias de BasePage Y sus clases
  protected static WebDriver driver;
  //  <---  <---         <---           <---            <---          <---
  //1. [What is this?] declaracion de una variable de la instancia wait de tipo WebDriverWait
  //|                                <->                                       |
  //2. Se incializa con una instancia de WebDriverWait utilizando el 'driver' estatico
  //                  |                     {X}                                |
  //3. [What is going to be used?] se usa para poner esperas explicitas en los elementos web
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
  

  
  static{
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
  }
  
  public BasePage(WebDriver driver){
    BasePage.driver = driver;
  }
  public static void navigateTo(String url){
    driver.get(url);
  }
  //cerrar la instancia del driver. 
  public static void closeBrowser(){
    driver.quit();
  }
  // Encuentra y devuelve un WebElement en la página utilizando un locator XPath,
    // esperando a que esté presentente en el DOM
  private WebElement Find(String locator){
    return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
  }
  public void clickElement(String locator){
    Find(locator).click();
  }
  public void write(String locator,String keysToSend){
    Find(locator).clear();
    Find(locator).sendKeys(keysToSend);
  }
}