package all_Rest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class ParsingJSONResponseData2 
{
	    @Test
		public void testJSONResponse2() 
		{
			//approach2: store response in a variable (with capturing response)
			
			Response resp = given()    
					.contentType(ContentType.JSON)
				.when()
					.get("http://localhost:3000/store");
			
			Assert.assertEquals(resp.getStatusCode(), 200);
			Assert.assertEquals(resp.jsonPath().getString("book[0].title")	, "savings of the country");
			
			
			
			//Note: if title is not stored in same order then this approach will not work
			//we can write conditional/looping statement
		}
		

	
	
	
	}	





