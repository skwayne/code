package testcase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Assertion {
  @SuppressWarnings("deprecation")
@Test
  public void f() {
	  
	  
	
	
	//Assert.assertEquals(2, 3);
	
	SoftAssert soft = new SoftAssert();
	
	soft.assertEquals('a', 'a', "Assertion success");
	

		
	soft.assertAll("All assertions working");
	
	
  }
}
