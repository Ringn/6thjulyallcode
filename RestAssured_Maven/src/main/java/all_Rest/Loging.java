package all_Rest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Loging {
	
	@Test
	public void Tc1() 
	{
		given()
		      .contentType("application/json")
		      
		.when()
		      .get("https://reqres.in/api/users?page=2&id=5")
		
		.then()
		       
		       .log().body() //gets only body
		       .log().cookies()//gets only cookies
		       .log().headers()//gets only headers
		       .log().all();//get all things
	}
	
	

}
