package RestAssuredExample;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.emptyString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import org.junit.Test;

import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;


public class StatusCodeTest {
	@BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testStatusCode() {
        given()
        .when()
            .get("/posts/1")
        .then()
        .statusCode(equalTo(200));
        System.out.println("Executed testStatusCode successfully");
    }

    @Test
    public void testResponseBody() {
        given()
        .when()
            .get("/posts/1")
        .then()
            .body("userId", equalTo(1))
            .body("id", equalTo(1))
            .body("body", not(emptyString()));
        System.out.println("Executed testResponseBody successfully");
    }
}


