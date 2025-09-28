package all_Rest;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class ParsingJSONResponseData3 
{
	    @Test
		public void testJSONResponse2() 
		{
	    	
	    		//approach3: Converting Response into JSON Object
	    		
	    		Response resp = given()    
	    				.contentType(ContentType.JSON)
	    			.when()
	    				.get("http://localhost:3000/store");
	    			
	    		//converting response into JSON Object type
	    		JSONObject jo=new JSONObject(resp.asString());  
	    		
	    		String data = jo.getJSONArray("book").getJSONObject(0).getString("title").toString();
	    		System.out.println(data);
	    	}
	    	
	    	//@Test(priority = 4)
	    	public void getAllTitlesFromResponseUsingJSONObject() 
	    	{
	    		//approach3: Converting Response into JSON Object
	    		
	    		Response resp = given()    
	    			.contentType(ContentType.JSON)
	    		.when()
	    			.get("http://localhost:3000/store");
	    			
	    		//converting response into JSON Object type
	    		JSONObject jo=new JSONObject(resp.asString());  
	    		
	    		int lastIndex = jo.getJSONArray("book").length()-1;
	    		for(int i=0; i<=lastIndex; i++)
	    		{
	    			String title = jo.getJSONArray("book").getJSONObject(i).get("title").toString();
	    			System.out.println(title);
	    		}
	    	}
	    	
	    	//@Test(priority = 5)
	    	public void verifySpecificTitleFromResponse() 
	    	{
	    		Response resp = given()    
	    			.contentType(ContentType.JSON)
	    		.when()
	    			.get("http://localhost:3000/store");
	    		
	    		JSONObject jo=new JSONObject(resp.asString());      
	    		
	    		boolean titileFound=false;
	    		String expTitle="Moby Dick";
	    		
	    		int lastIndex = jo.getJSONArray("book").length()-1;
	    		for(int i=0; i<=lastIndex; i++)
	    		{
	    			String actTitle = jo.getJSONArray("book").getJSONObject(i).getString("title");;
	    			if(actTitle.equals(expTitle)) 
	    			{
	    				titileFound=true;
	    				break;
	    			}
	    		}
	    		Assert.assertTrue(titileFound,"Failed : title not found  -   ");
	    	}
	    	
	    	
	    	@Test(priority = 5)
	    	public void verifyTotalPriceFromResponse() 
	    	{
	    		Response resp = given()    
	    			.contentType(ContentType.JSON)
	    		.when()
	    			.get("http://localhost:3000/store");
	    		JSONObject jo=new JSONObject(resp.asString());      
	    		
	    		double totalPrice=0;
	    		
	    		int lastIndex = jo.getJSONArray("book").length()-1;
	    		for(int i=0; i<=lastIndex; i++)
	    		{
	    			String price = jo.getJSONArray("book").getJSONObject(i).getString("price");
	    			totalPrice=totalPrice+ Double.parseDouble(price);
	    		}
	    		
	    		System.out.println(totalPrice);
	    		Assert.assertEquals(totalPrice, 601,"Failed : price mismatch  -   ");
	    	}	
	    

		


}




