package testClass;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import gui.BaseClass;
import gui.Check_GUI;

public class Test_Class extends BaseClass
{
	Check_GUI gui;
	@Parameters("browserName")
	@BeforeClass
	public void beforeclass(String browserName)
	{
		openBrowser(browserName);
		gui=new Check_GUI(driver);
			
	}
	@Test(priority=1)
	public void testvisibilityName()
	{
		boolean result = gui.verifyEnternameTextBox();
		Assert.assertTrue(result,"not displayed");
		
	}
	
	@Test(priority=2)
	public void testvisibilityEmail()
	{
		boolean result = gui.verifyEnterEmailTextBox();
		Assert.assertTrue(result,"not displayed");
		
	}
	

	@Test(priority=3)
	public void EnatrvalueName()
	{
		String type = gui.EnterValueInNameTextBox();
		Assert.assertEquals("String","String");
		
	}
	
	@Test(priority=4)
	public void EnatrvalueEmail()
	{
		String type = gui.EnterValueInEmailTextBox();
		Assert.assertEquals("String","String");
		
	}
	
	@AfterClass
	public void afterclass()
	{
	   driver.close();
			
	}
	
	
	

}
