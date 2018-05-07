package httpclient;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBodyExtractionOptions;

import services.OauthTokenService;


public class GetRequest{

	
	public GetRequest(){
		
	}
	
	public ResponseBodyExtractionOptions GetRequestWithOauth(String url){
		return given().header("Authorization", "bearer "+new OauthTokenService().getAutthentication().getAccess_token())
				.contentType("application/json")
				.expect()
	            .statusCode(200)
				.when().get(url).then().extract().body();		
	}
	
	public String makeGetRequestAndGetBody(String url){
		System.out.println("URL is : "+url);
		return given().get(url).body().asString();
	}
	
	public Response makeGetRequestAndGetResponse(String url){
		return given().get(url);
	}
	
	public int makeGetRequestAndGetStatusCode(String url){
		return given().get(url).getStatusCode();
	}
	
	public String makeGetRequestAndGetContentType(String url){
		return given().get(url).getContentType();
	}
	
	public Headers makeGetRequestAndGetHeaders(String url){
		return given().get(url).headers();
	}
	
	public String makeGetRequestAndGetHeaders(String url,String headerName){
		return given().get(url).getHeader(headerName);
	}
}
