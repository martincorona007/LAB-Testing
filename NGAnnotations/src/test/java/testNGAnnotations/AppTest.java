package testNGAnnotations;


import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Unit test for simple App.
 */
public class AppTest {

	// Write your code here
		@AfterSuite
		public void afterSuite(){
			System.out.println("After Suite has been executed as no.9");
		}
		@BeforeClass
		public void beforeClass(){
			System.out.println("Before Class has been executed as no.3");
		}
		@BeforeTest
		public void beforeTest(){
			System.out.println("Before Test has been executed as no.2");
		}
		@BeforeMethod
		public void beforeMethod(){
			System.out.println("Before Method has been executed as no.4");
		}
		@Test
		public void GetPageTitle(){
			System.out.println("Test has been executed as no.5");
		}
		@AfterMethod
		public void afterMethod(){
			System.out.println("After Method has been executed as no.6");
		}
		@AfterTest
		public void afterTest(){
			System.out.println("After Test has been executed as no.8");
		}
		@BeforeSuite
		public void beforeSuite(){
			System.out.println("Before Suite has been executed as no.1");
		}
		@AfterClass
		public void afterClass(){
			System.out.println("After Class has been executed as no.7");
		}
}
