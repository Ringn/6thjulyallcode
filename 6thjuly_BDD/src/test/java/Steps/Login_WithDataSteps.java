package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_WithDataSteps 
{
	@Given("user is present at login page")
	public void user_is_present_at_login_page()
	{
		System.out.println("--at Login page---");
	    
	}

	@When("user enter UN as {string}")
	public void user_enter_un_as(String UN)
	{
		System.out.println("username: "+UN);

	}

	@When("user enter PWD as {string}")
	public void user_enter_pwd_as(String PW) 
	{
		System.out.println("password: "+PW);

	}

	@When("user enter pin {int}")
	public void user_enter_pin(Integer PN) 
	{
		System.out.println("Pin: "+PN);

	}

	@Then("user profile picture should display")
	public void user_profile_picture_should_display() 
	{
		System.out.println("---profile---");

	}


}
