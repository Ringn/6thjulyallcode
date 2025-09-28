package all_Rest;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetCookies_Info {
	
	@Test
	public void Tc1()
	{
		Response resp = given()
		.when()
		      .get("https://google.com");
		      
		 String cookie=resp.getCookie("AEC");
		 System.out.println("cookie info"+cookie);
	}

}

