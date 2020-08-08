package Main.Code;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class SuperClass {
	
	public static WebDriver driver;
 
  @BeforeSuite
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
	  
	 
	  
	  
	  
	  
  }

  @AfterSuite
  public void afterTest() {
	  
	  driver.close();
	  
  }

}
