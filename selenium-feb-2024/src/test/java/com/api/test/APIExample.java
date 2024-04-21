package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class APIExample {
	
	@Test
	public void testGetAPI() {

		RestAssured.baseURI = "https://reqres.in";
		
		Response response = given()
				.when().get("/api/users?page=2");
		System.out.println(response.prettyPrint());
		response.then().statusCode(200); // Assert.assertEquals(response.getStatusCode(), 200)
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void postAPI() {
		RestAssured.baseURI = "https://reqres.in";
		Response response = given().header("Content-Type", "application/json")
                    .body("{"
                            + "    \"name\": \"morpheus\","
                            + "    \"job\": \"leader\""
                            + "}")
                    .when().post("/api/users");
            
		response.then().statusCode(201);
		System.out.println(response.prettyPrint());
		Assert.assertEquals(response.getStatusCode(), 201);
	}
	
	@Test
	public void putAPI() {
		        
        RestAssured.baseURI = "https://reqres.in";
        Response response = given().header("Content-Type", "application/json")
                     .body("{"
                            + "    \"name\": \"morpheus\","
                           + "    \"job\": \"zion resident\""
                           + "}")
             .when().put("/api/users/2");
                
             response.then().statusCode(200);
                
                System.out.println(response.prettyPrint());
                Assert.assertEquals(response.getStatusCode(), 200);
            
	}
	
	@Test
	public void deleteAPI() {
		RestAssured.baseURI = "https://reqres.in";
		Response response = given().when().delete("/api/users/2");
		System.out.println(response.prettyPrint());
		response.then().statusCode(204); // Assert.assertEquals(response.getStatusCode(), 200)
		Assert.assertEquals(response.getStatusCode(), 204);
	}
	

}


// given
// when
// then