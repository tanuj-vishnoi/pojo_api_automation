package httpclient;

import static com.jayway.restassured.RestAssured.preemptive;

import java.util.Map;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.ResponseBodyExtractionOptions;

import models.oauth.Credentials;

public class PostRequest{

	public PostRequest(String userName,String password){
		RestAssured.authentication = preemptive().basic(userName, password);	
	}
	
	public PostRequest(){
		
	}
	
	public Object postRequestWithJsonBody(String endpoint,Credentials jsonBody){
		return RestAssured.given().accept("application/json")
        					.contentType("application/x-www-form-urlencoded")
        					.body(jsonBody)
        					.expect()
        		            .statusCode(200)
        					.when().post(endpoint).then().extract().body().as(Object.class);
	}
	
	public ResponseBodyExtractionOptions  postRequestWithJsonBody(String endpoint,Map<String,String> formParams){
		return RestAssured.given().accept("application/json")
        					.contentType("application/x-www-form-urlencoded")
        					.formParams(formParams)
        					.expect()
        		            .statusCode(200)
        					.when().post(endpoint).then().extract().body();
	}
}
