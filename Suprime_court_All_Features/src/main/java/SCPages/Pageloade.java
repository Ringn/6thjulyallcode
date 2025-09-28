package SCPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageloade 
{
	
	WebDriver driver;
	public Pageloade (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public String verifyurl()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
	
	public String verifytitle()
	{
		String title=driver.getTitle();
		return title;
	}
	

}
