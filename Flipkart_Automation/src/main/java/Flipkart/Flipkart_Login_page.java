package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Login_page {
	
   @FindBy(xpath="//span[text()='Login']")private WebElement login_button;
   @FindBy(xpath="//input[@class='r4vIwl BV+Dqf']")private WebElement enter_num;

   @FindBy(xpath="//button[text()='Request OTP']")private WebElement request_otp;

   public Flipkart_Login_page(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
	      
   }
	
	public void click_on_login_button() 
	{
		login_button.click();	
	}
	
	public void enter_number_on_login_page() 
	{
		enter_num.sendKeys("8378967446");	
	}
	
	public void click_on_send_otp() 
	{
		request_otp.click();	
	}
	
	
	

}
