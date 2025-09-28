package candy;


import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Class_BaseClass.BaseClassCandy;
import POM_Class_BaseClass.Homepagecandy;
import POM_Class_BaseClass.Pop_up;

public class TestClass2 extends BaseClassCandy 
{
	Homepagecandy candy;
	Pop_up link;
	@BeforeClass
	public void Browser()
	{
		openb();
		candy=new Homepagecandy(driver);
		link=new Pop_up(driver);
	}
	
	@Test(priority=1)
	public void clicklink() throws InterruptedException
	{
	
		link.PopUP_click_link();
		
		
		
	}
	@Test(priority=2)
	public void clickcrossb() throws InterruptedException
	{
	
       link.PopUP_click_cross();
       
	}
	
	@AfterClass
	public void CloseB()
	{
		driver.quit();
		
	}
	
	

	
}
