package post_call;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.LinkedHashMap;





public class Post1 {
	
	
	@Test
	public void tc1() 
	{
		LinkedHashMap s1=new LinkedHashMap();
		s1.put("id", "4");
		s1.put("name", "jaya");
		s1.put("location", "india");
		
		String[] arr= {"java","sql"};
		s1.put("courses",arr);
	
		given()
		       .contentType("application/json")
		       .body(s1)
	    .when()
	           .post("http://localhost:3000/students")
	    .then()
	           .statusCode(201)
	           .log().all();
	           
		
	}

}
