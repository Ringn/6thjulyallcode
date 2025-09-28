package all_Rest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Path_And_Query_Parameter {
	
	@Test
	public void Tc1() 
	{
		//https://reqres.in---> domain server
				//api/users---->path
			    // page=2&id=5---->query
		given()
		      .pathParam("mypath","users")
		      .queryParam("page","2")
		      .queryParam("id","5")
		      
		.when()
		      .get("https://reqres.in/api/{mypath}")
		
		.then()
		       .statusCode(200)
		       .log().all();
	}
	
	

}
