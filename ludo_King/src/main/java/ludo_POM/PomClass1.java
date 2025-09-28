package ludo_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass1 
{
	@FindBy(xpath="")private WebElement abc;
	
	public PomClass1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void name() 
	{
		abc.click();
	}

}
