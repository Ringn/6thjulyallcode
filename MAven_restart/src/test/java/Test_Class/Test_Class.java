package Test_Class;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class extends Base_Class
{
	Case_S c1;
	Dn d1;
	@BeforeMethod
	public void openBrowser() 
	{
		ob();
		c1=new Case_S(driver);
		d1=new Dn(driver);
	}
	@Test
	public void ClickCS() throws InterruptedException 
	{
		c1.clickonCaseStatus();
		Thread.sleep(2000);
		d1.diarynumber();
	}
	
	@AfterMethod
	public void closeBrowser() 
	{
		//driver.close();
	}

}
