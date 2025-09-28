package all_Rest;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;
import java.util.Set;

public class GetAllCookies {
	
	@Test
	public void Tc1()
	{
		Response resp = given()
		.when()
		      .get("https://google.com");
		      
		 Map<String, String> cookies = resp.getCookies();
		 
		 Set<String> allcookiesname = cookies.keySet();
		 
		 for(String cookiename:allcookiesname)
		 {
			 System.out.println(cookiename+":"+cookies.get(cookiename));
		 }
	}

}


