package Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Base_Class;
import Pages.Supreme_Court_Of_India_DiaryNumber_Page;
import Pages.Supreme_Court_Of_India_Home_Page;
import Pages.Suprime_Court_of_IndiaLast_Page;



public class Suprime_CourtTest extends Base_Class
{
	Supreme_Court_Of_India_Home_Page home;
	Supreme_Court_Of_India_DiaryNumber_Page Number;
	Suprime_Court_of_IndiaLast_Page lastpage;
	
	@BeforeClass
	public void openb() 
	{
		Browser();
	   home=new Supreme_Court_Of_India_Home_Page(driver);
	   Number=new Supreme_Court_Of_India_DiaryNumber_Page(driver);
	   lastpage=new Suprime_Court_of_IndiaLast_Page(driver);
	   
	}
	
	
	@Test(priority=1)
	public void casestatus() 
	{
		home.click_on_casestatus();
		
	}
	
	@Test(priority=2)
	public void diary() throws InterruptedException 
	{
		
		Thread.sleep(2000);
		Number.click_on_dairyNumber();
	
		
	}
	
	@Test(priority=3)
	public void Num() throws InterruptedException 
	{
		
	lastpage.LogIn_on_SC();
	
	Thread.sleep(5000);
		
	}
	
	@Test(priority=4)
	public void clickOnSearch() throws InterruptedException 
	{
		
	lastpage.SearchButton();
	
	Thread.sleep(5000);
		
	}
	
	@AfterClass
	public void logout() 
	{
		driver.quit();
	
		
	}
	
	

}
