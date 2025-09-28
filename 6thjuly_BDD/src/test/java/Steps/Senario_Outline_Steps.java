package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Senario_Outline_Steps 
{
	
	@Given("user in at signup page")
	public void user_in_at_signup_page() 
	{
	    System.out.println("user is at sign up page");

	}

	@When("user enters {string} inside form")
	public void user_enters_inside_form(String string) 
	{
	    System.out.println("user enters inside form: "+string);

	}

	@When("user enters age as {int}")
	public void user_enters_age_as(Integer int1) 
	{
	    System.out.println("user enters age: "+int1);

	}

	@When("user confirm gender as {string}")
	public void user_confirm_gender_as(String string) 
	{
	    System.out.println("user confirm gender: "+string);

	}

	@Then("user gets created")
	public void user_gets_created() 
	{
	    System.out.println("user get created");
	}

}
