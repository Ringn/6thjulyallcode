package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JanitriSteps 
{
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		System.out.println("on login page");
	    
	}

	@When("user enter email and password")
	public void user_enter_email_and_password() 
	{
		System.out.println("Entered email and pass");

	  
	}

	@Then("verify the successful login")
	public void verify_the_successful_login() 
	{
		System.out.println("verified the login");

		
	}
	
	@Given("user is at the login screen")
	public void user_is_at_the_login_screen() 
	{
		System.out.println("user is at login page");
	   
	}

	@Then("page title should get display")
	public void page_title_should_get_display() 
	{
		System.out.println("title is displayed");
	   
	}


}
