package Delete;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class Delete1 {
	
	@Test
	public void name() 
	{
		given()
		       .contentType("application/json")
		       
		       
		.when()
		       .delete("https://regres.in/api/users/3")
		       
		.then()
		       .statusCode(502)
		       .log().all();
		      
		
	}

}

