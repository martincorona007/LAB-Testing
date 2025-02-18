package com.hellofuture.tutorial.testProjectNameArticatID;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marti\\Documents\\Selenium\\drivers\\chromedriver-win64\\chromedriver.exe");

        //Creating webdriver instance
        WebDriver driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Open web application
        driver.get("https://elenastepuro.github.io/test_env/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Enter data into textboxes
        driver.findElement(By.id("change_id")).sendKeys("test_id");
        driver.findElement(By.id("change_className")).sendKeys("test_class");
        driver.findElement(By.id("Submit")).click();
        //driver.findElement(By.id("change_id")).sendKeys("updated_test_id");
        //driver.findElement(By.id("change_className")).sendKeys("updated_test_class");
    }
}
