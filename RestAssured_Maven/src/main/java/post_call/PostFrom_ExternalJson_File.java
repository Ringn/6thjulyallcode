package post_call;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
public class PostFrom_ExternalJson_File {
	
	@Test
	public void Tc1()
	{
		File data=new File("C:\\Users\\Pratiksha\\Desktop\\NewProjectRest\\RestAssured_Maven\\Externaljsonfile.json");
		
		given()
		.contentType("application/json")
		 .body(data)
	
	.when()
		.post("http://localhost:3000/students")
	
	.then()
		.statusCode(201)
		.body("name",equalTo("abc4"))
		.body("location",equalTo("pune4"))
		.body("phone",equalTo("8888"))
		.body("courses[0]",equalTo("c"))
		.body("courses[1]",equalTo("c++"))
		.header("Content-Type","application/json")
		.log().all();


		
	}
	
	

}
