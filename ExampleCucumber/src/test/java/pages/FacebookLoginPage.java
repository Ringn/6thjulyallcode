package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage
{
	
	@FindBy(xpath="//input[@name='email']")WebElement un;
	@FindBy(xpath="//input[@name='pass']")WebElement pw;
	@FindBy(xpath="//button[@name='login']")WebElement loginbutton;
	

	public FacebookLoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void Enteruid(String ui) 
	{
		un.sendKeys(ui);
	}
	public void Enterpw(String pass) 
	{
		pw.sendKeys(pass);
	}
	public void clickonloginb() 
	{
		loginbutton.click();
	}
}
