package all_Rest;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetHeader_Info {
	
	@Test
	public void Tc1()
	{
		Response resp = given()
		.when()
		      .get("https://google.com");
		      
		 String header=resp.getHeader("Content-Type");
		 System.out.println("header info "+header);
	}

}


