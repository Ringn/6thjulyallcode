package pom_Base_Utility_Classess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dn 
{
	@FindBy(xpath="//div[@class='services-links']//li")private WebElement diaryn;

	public Dn (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void diarynumber() 
	{
		diaryn.click();
	}
	
	
}
