package RestAssuredExample;


import org.junit.Before;
import org.junit.Test;
 
import io.restassured.RestAssured;
 
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class UserAPIBDDTest 
{
	
	@Before
	public void setup() {
	    RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	}
	 
	
	@Test //Get
	public void testGetUserById()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		given().when().get("users/1")
		.then()
		.statusCode(200)
		.body("id", equalTo(1))
		.body("username", not(emptyOrNullString()))
		.body("email", containsString("@"))
		.log().all();
		

		
	}
	
	@Test//get
	public void testCreateUser()
	{
		String newUser="{\"name\":\"Ranki Reddy\", \"username\": \"RankiReddy\",\"email\": \"ranki.reddy@gmail.com\"}";
		given()
			.contentType("application/json")
			.body(newUser)
		.when()
			.post("/users")
		.then()
			.statusCode(201)
			.body("name",equalTo("Ranki Reddy"))
			.body("username",equalTo("RankiReddy"))
			.body("email", equalTo("ranki.reddy@gmail.com"))
			.log().all();
			
	}
	


}