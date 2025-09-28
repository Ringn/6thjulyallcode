package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{

	@Given("the user is at login page")
	public void the_user_is_at_login_page() 
	{
		System.out.println("At Login Page");

	}

	@When("user enter UN;")
	public void user_enter_un() 
	{
		System.out.println("Enter Un");

	}

	@When("user enter PD")
	public void user_enter_pd() 
	{
		System.out.println("Enter PW");
	}

	@When("the user click on login button")
	public void the_user_click_on_login_button() 
	{
		System.out.println("click login btn");
	}

	@Then("the user should redirect to home page")
	public void the_user_should_redirect_to_home_page() 
	{
		System.out.println("---home page---");
	}
	
	@Then("title of page should visible")
	public void title_of_page_should_visible() 
	{
	   System.out.println("---title---");
	}


	

}
