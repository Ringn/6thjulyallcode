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

public class TestOnlyLogin extends BaseClass
{

	LoginPage Page;
	UtilityClass UL;
	HomePage Hp;
	@BeforeMethod
	public void openb() throws InterruptedException, EncryptedDocumentException, IOException
	{
		ob();
		Page=new LoginPage(driver);
		UL=new UtilityClass();
		Hp=new HomePage(driver);
		
	}
	
	@Test
	public void test() throws EncryptedDocumentException, InterruptedException, IOException
	{
		Page.LoginPage_Login(UL.excel(4,0),UL.excel(4,1));
		Thread.sleep(5000);
		
	}
	@Test
	public void test2() throws EncryptedDocumentException, InterruptedException, IOException
	{
		Page.LoginUsingInvalidCre(UL.excel(5,0),UL.excel(5,1));
		Thread.sleep(5000);
	}
	@Test
	public void test3() throws EncryptedDocumentException, InterruptedException, IOException
	{
		Page.LoginwithblankCre(" "," ");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
