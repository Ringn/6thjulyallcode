package GetCall;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ex1_getRequest
{	
	@Test(priority = 1)
	public void getRequest_ValidID() 
	{
		given()                               // Pre-req
			.contentType("application/json") 
		.when()                              //request type  get()/post()/put()/delete()
			.get("https://reqres.in/api/users/2")
		.then()								//validation	
			.statusCode(200)
			.body("data.first_name", equalTo("Janet"))
			.body("data.last_name", equalTo("Weaver"))
			.body("data.id", equalTo(2))
			.contentType("application/json")
			.log().all();	
		
		//actual data in api
//		{
//		    "data": {
//		        "id": 2,
//		        "email": "janet.weaver@reqres.in",
//		        "first_name": "Janet",
//		        "last_name": "Weaver",
//		        "avatar": "https://reqres.in/img/faces/2-image.jpg"
//		    },
//		    "support": {
//		        "url": "https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral",
//		        "text": "Tired of writing endless social media content? Let Content Caddy generate it for you."
//		    }
//		}
	}
		
	
	@Test(priority = 2)
	public void getRequest_inValidID() 
	{
		given()                               
			.contentType("application/json") 
		.when()                             
			.get("https://reqres.in/api/users/23")
		.then()								
			.statusCode(404)
			.log().all();		
	}
}

