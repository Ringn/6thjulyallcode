package post_call;

import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class PostUsing_OrgJson {
	
	@Test
	public void Tc1() 
	{

		JSONObject data=new JSONObject();
		data.put("name", "abc1");
		data.put("location", "india");
		data.put("phone", "1111");
		
		String [] courses= {"c", "c++"};
		data.put("courses",courses);
		
		given()
			.contentType("application/json")
			.body(data.toString())//accept string in body
		
		.when()
			.post("http://localhost:3000/students")
		
			.then()
			.statusCode(201)
			.body("name",equalTo("abc1"))
			.body("location",equalTo("india"))
			.body("phone",equalTo("1111"))
			.body("courses[0]",equalTo("c"))
			.body("courses[1]",equalTo("c++"))
			.header("Content-Type","application/json")
			.log().all();

		
	}

}
