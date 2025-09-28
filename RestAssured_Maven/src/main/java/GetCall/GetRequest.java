package GetCall;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class GetRequest {
	
	@Test
	public void name() 
	{
		given()
		       .contentType("application/json")
		       
		       
		.when()
		       .get("https://regres.in/api/users/2")
		       
		.then()
		       .statusCode(200)
		       .log().all();
		      
		
	}

}
