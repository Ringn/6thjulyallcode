package gui;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtons 
{

	
	@FindBy(xpath="//input[@id='male']")private WebElement male;
	@FindBy(xpath="//input[@id='female']")private WebElement female;
    
	WebDriverWait wait;
	public RadioButtons(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
	public boolean clickonMaleandFemale1()
	{
		male.click();
		female.click();
		boolean resultf = male.isSelected();
		return resultf;
		
	}
	
	public boolean clickonMaleandFemale2()
	{
		boolean resultt = female.isSelected();
		return resultt;
	}
	
}
