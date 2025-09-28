package test;

import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Flipkart.Base_class;
import Flipkart.Flipkart_Home_page;
import Flipkart.Flipkart_Login_page;

public class Flipkart_Test extends Base_class {
	
	Flipkart_Login_page LP;
	Flipkart_Home_page  HP;
	@Test
	public void tc1() throws InterruptedException 
	{
		browser();
	   LP=new Flipkart_Login_page(driver);
	   HP=new Flipkart_Home_page(driver);
	}
	
	@Test
	public void tc2() 
	{
		LP.click_on_login_button();
		
	}
	
	@Test
	public void tc3() 
	{
		LP.enter_number_on_login_page();
		
	}
	
	@Test
	public void tc4() 
	{
		LP.click_on_send_otp();
		
	}

	
	@Test
	public void tc6() throws InterruptedException 
	{
		Thread.sleep(10000);
		HP.click_on_HomePage_search_bar();
		
	}
	
	@Test
	public void tc7() 
	{
		HP.click_on_ComputerType();
		
	}

}
