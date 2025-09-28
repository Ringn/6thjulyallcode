package all_Rest;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
import java.util.Set;

public class GetAllHeaders {
	
	@Test
	public void Tc1()
	{
		Response resp = given()
		.when()
		      .get("https://google.com");
		      
		 Headers allheaders = resp.getHeaders();
		 
		
		 for(Header header:allheaders)
		 {
			 System.out.println(header.getName()+":"+header.getValue());
		 }
	}

}



