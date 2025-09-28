package StepsForPageLoadVerification;

import org.testng.Assert;

import SCPages.BaseClass;
import SCPages.Pageloade;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseClass
{
	
	Pageloade page;
	
	@Given("I Enter URL in chrome")
	public void i_enter_url_in_chrome() 
	{
		openBrowser();
		page=new Pageloade(driver);
		  
	}
	@Given("It will open the HOME page")
	public void it_will_open_the_home_page() 
	{
	    System.out.println("====i am on the home page====");
	}

	@Then("I validate the URL")
	public void i_validate_the_url() 
	{
		String result = page.verifyurl();
		
		Assert.assertEquals(result,"https://www.sci.gov.in/");
	    
	}

	@Then("I validate the Text")
	public void i_validate_the_text() 
	{
        String result = page.verifytitle();
		
		Assert.assertEquals(result,"Supreme Court of India");
	   
	}

}
