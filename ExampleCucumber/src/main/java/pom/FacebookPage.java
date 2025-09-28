package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage 
{
	@FindBy(xpath="//input[@id='email']")private WebElement Email;
	@FindBy(xpath="//input[@type='password']")private WebElement Password;
	@FindBy(xpath=" //button[@type='submit']")private WebElement Login;
	WebDriver driver;
	
	
	public FacebookPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void EnterPWD(String PWD)
	{
		Password.sendKeys(PWD);
	}
	
	public void ClickLogin()
	{
		Login.click();
	}

}
