package Login_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//input[@name='username']")private WebElement UN;
	@FindBy(xpath="//input[@name='password']")private WebElement PW;
	@FindBy(xpath="//button[@type='submit']")private WebElement LoginButton;
	@FindBy(xpath="//img[@alt='client brand banner']")private WebElement Logo;
	@FindBy(xpath="//div[@role='alert']")private WebElement error;
	@FindBy(xpath="(//span[text()='Required'])[1]")private WebElement reqerror;
	@FindBy(xpath="(//span[text()='Required'])[2]")private WebElement req2error;

	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);	
	}
	
	public void LoginPage_Login(String user,String Pass) throws InterruptedException
	{
		UN.sendKeys(user);
		Thread.sleep(2000);
		PW.sendKeys(Pass);
		Thread.sleep(2000);
		 LoginButton.click();
		 Thread.sleep(5000);
		 if(Logo.isDisplayed())
			{
				System.out.println("successfully Login");
			}
		 else
		 {
			 System.out.println("not login");
		 }
	}
	
	public void LoginUsingInvalidCre(String user,String Pass) throws InterruptedException
	{
		UN.sendKeys(user);
		Thread.sleep(2000);
		PW.sendKeys(Pass);
		Thread.sleep(2000);
		 LoginButton.click();
		 Thread.sleep(5000);
		if(error.isDisplayed())
		{
			
			System.out.println(error.getText()+"==not login successfully");
		}
		else
		{
			System.out.println("not login");
		}
	}
	
	public void LoginwithblankCre(String user,String Pass) throws InterruptedException
	{
		UN.sendKeys(user);
		Thread.sleep(2000);
		PW.sendKeys(Pass);
		Thread.sleep(2000);
		 LoginButton.click();
		 Thread.sleep(5000);
		if(reqerror.isDisplayed())
		{
			
			System.out.println(reqerror.getText()+"==usrname is required");
		}
		else if(req2error.isDisplayed())
		{
			System.out.println(req2error.getText()+"==password is required");
		}
	}
}
