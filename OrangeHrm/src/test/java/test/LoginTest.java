package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Login_Page.BaseClass;
import Login_Page.LoginPage;
import Login_Page.UtilityClass;
import homepage.HomePage;

public class LoginTest extends BaseClass
{
	LoginPage Page;
	UtilityClass UL;
	HomePage Hp;
	@BeforeClass
	public void openb() throws InterruptedException, EncryptedDocumentException, IOException
	{
		ob();
		Page=new LoginPage(driver);
		UL=new UtilityClass();
		Hp=new HomePage(driver);
		Page.LoginPage_Login(UL.excel(4,0),UL.excel(4,1));
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	public void test() throws EncryptedDocumentException, InterruptedException, IOException
	{
		Hp.homepagetest();
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void test2() throws EncryptedDocumentException, InterruptedException, IOException
	{
		Hp.homepagecliambutton();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	

}
