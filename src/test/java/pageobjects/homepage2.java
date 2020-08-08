package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage2 {
	
	WebDriver driver;
	
	public homepage2(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	
	public WebElement HomepageSearchClick(){

          return driver.findElement(By.xpath(".//*[contains(@title,'Search for products, brands and more')]"));

       }
	
	
}
