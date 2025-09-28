package all_Rest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestCookies {
	
	@Test
	public void Tc1()
	{
		given()
		.when()
		      .get("https://google.com")
		      
		 .then()
		       .log().cookies()
		       .cookie("AEC","AZ6Zc-UghATEYecia1ldZMtYpU7ufHQqU0NLyyzoukvoTTeD7IB_RhlLIA")
		       	.log().all();	
		       
		//cookies value change frequently thts why it is showing error       
		
	}

}
