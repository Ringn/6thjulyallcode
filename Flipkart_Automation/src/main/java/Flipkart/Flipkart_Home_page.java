package Flipkart;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_Home_page {
	
   @FindBy(xpath="//input[@title='Search for Products, Brands and More']")private WebElement search_bar;
   @FindBy(xpath="//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li")private List<WebElement> suggestions ;

  

   public Flipkart_Home_page(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
	   
	      
   }
	
	public void click_on_HomePage_search_bar() 
	{
		search_bar.sendKeys("computers");
			
	}
	
	public void click_on_ComputerType() 
	{

		for(WebElement s1:suggestions)
		{
			System.out.println(s1.getText());
			
		}
		suggestions.get(3).click();
      	
	}
	
	
	
	

}

