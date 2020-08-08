package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageobjects.homepage2;
import Main.Code.General;



import Main.Code.SuperClass;

public class homepage extends SuperClass {


	homepage2 obj;
	General obj2;

	@Test
	public void f() {


		driver.manage().window().fullscreen();

		obj2 = new General(driver);

		obj2.overlay_close();

		obj = new homepage2(driver);


		obj.HomepageSearchClick().sendKeys("samsung");

		obj.HomepageSearchClick().submit();	  


	}

}
