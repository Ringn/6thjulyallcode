package flipkarttest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flipkart.Flipkart_BaseClass;
import flipkart.Flipkart_Home_Page;

public class Flipkart_Test extends Flipkart_BaseClass
{
	Flipkart_Home_Page home;
	@BeforeClass
	public void tc1() 
	{
		
		home=new Flipkart_Home_Page(driver);
	}
	
	@BeforeMethod
	public void browser() 
	{
		openbrowser();
		
	}
	
	@Test
	public void Search() 
	{
		home.SearchFlipkart_Home_Page_SearchBar();
		
	}
	@AfterMethod
	public void tc2() 
	{
		System.out.println("hiiii");
	}
	
	@AfterClass
	public void Closebrowser() 
	{
		
		driver.close();
	}
	
	

}
