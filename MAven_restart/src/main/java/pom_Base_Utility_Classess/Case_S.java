package pom_Base_Utility_Classess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Case_S 
{
	@FindBy(xpath="(//div[@class='gen-card-content'])[2]")private WebElement cs;
	
	public Case_S(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonCaseStatus() 
	{
		cs.click();
		
	}
	

}
