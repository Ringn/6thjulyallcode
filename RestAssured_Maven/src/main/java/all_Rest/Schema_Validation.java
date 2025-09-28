package all_Rest;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Schema_Validation {

	@Test
	public void name() 
	{
		
			given()		
			.when()
				.get("http://localhost:3000/store")			
			.then()	
			.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("StorejsonSchema.json"));
		

		
	}
}
