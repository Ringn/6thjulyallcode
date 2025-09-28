package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Supreme_Court_Of_India_DiaryNumber_Page {
	
@FindBy(xpath="(//a[@class='btn btn-style-outline accent-color  active '])[1]") private WebElement diaryNumber;
	
	public Supreme_Court_Of_India_DiaryNumber_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void click_on_dairyNumber() 
	{
		
		diaryNumber.click();
		
		
	}
	
	

}

