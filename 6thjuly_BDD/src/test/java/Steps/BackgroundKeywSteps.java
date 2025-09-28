package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundKeywSteps 
{
	
	@Given("user is at login page")
	public void user_is_at_login_page() 
	{
	    System.out.println("--at Login page--");
	}

	@When("user enter username")
	public void user_enter_username() 
	{
	    System.out.println("Ener un");
 
	}

	@When("user enter password")
	public void user_enter_password()
	{
	    System.out.println("Ener pw");

	}

	@When("user clicks on login btn")
	public void user_clicks_on_login_btn()
	{
	    System.out.println("click login");

	}

	@Then("get title & verify")
	public void get_title_verify() 
	{
	    
	}

	@When("user click on profile tab")
	public void user_click_on_profile_tab() 
	{
	    
	}

	@Then("verify profile name")
	public void verify_profile_name() 
	{
	    System.out.println("verify progile name");

	}

	@Then("user click on logout btn")
	public void user_click_on_logout_btn() 
	{
	    System.out.println("Logout");

	}


}
