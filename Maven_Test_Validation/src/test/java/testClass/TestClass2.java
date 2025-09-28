package testClass;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import gui.BaseClass;

import gui.RadioButtons;

public class TestClass2 extends BaseClass 
{

	RadioButtons rb;
	@Parameters("browserName")
	@BeforeClass
	public void beforeclass(String browserName)
	{
		openBrowser(browserName);
		rb=new RadioButtons(driver);
			
	}
	
	@Test(priority=1)
	public void verifyRadioButton()
	{
		SoftAssert soft= new SoftAssert();
		boolean result1 = rb.clickonMaleandFemale1();
		soft.assertFalse(result1,"male selected");
		
		boolean result2 = rb.clickonMaleandFemale2();
		soft.assertTrue(result2,"Female is selected");
		
		soft.assertAll();
		
	}
	

	
	@AfterClass
	public void afterclass()
	{
	   driver.close();
			
	}
	

}
