package post_call;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Pojouse {
	
	@Test
	public void Tc1() 
	{
		POJO_PostRequest data=new POJO_PostRequest();
		data.setName("abc5");
		data.setLocation("Aus");
		data.setPhone("7777");
		
		String [] courses= {"c", "c++"};
		data.setCourses(courses);
		
			given()
			.contentType("application/json")
			.body(data)
		
		.when()
			.post("http://localhost:3000/students")
		
			.then()
			.statusCode(201)
			.body("name",equalTo("abc5"))
			.body("location",equalTo("Aus"))
			.body("phone",equalTo("7777"))
			.body("courses[0]",equalTo("c"))
			.body("courses[1]",equalTo("c++"))
			.header("Content-Type","application/json")
			.log().all();

		
	}

	
}
