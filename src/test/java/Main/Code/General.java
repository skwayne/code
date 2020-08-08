package Main.Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class General {
	
WebDriver driver;

	public General(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public  void overlay_close()
	{
		
		driver.findElement(By.xpath(".//*[text()='✕']")).click();
		
	
		
	}
	
	
	

}
