package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Supreme_Court_Of_India_Home_Page {
	
	@FindBy(xpath="(//div[@class='gen-card-img show-original-img'])[2]")private WebElement caseStatus;
	
	public Supreme_Court_Of_India_Home_Page (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void click_on_casestatus() 
	{
		
		caseStatus.click();
		
		
	}
	
	

}
