package flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Home_Page 
{
	
	@FindBy(xpath="//input[@title='Search for Products, Brands and More']")private WebElement searchbar;

	public Flipkart_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void SearchFlipkart_Home_Page_SearchBar () 
	{
		searchbar.sendKeys("tv");
		
	}
	
}
