package services;

import java.util.HashMap;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;

import httpclient.PostRequest;
import models.oauth.AuthenticationToken;
import models.oauth.Credentials;
import resourcereader.EndPointReader;
import resourcereader.ResourceJsonReader;

public class OauthTokenService{

	String oauthEndPoint;
	EndPointReader endPointReader;
	
	public OauthTokenService(){
		endPointReader = new EndPointReader();
		oauthEndPoint = endPointReader.getOauthTokenEndPoint();
	}
	
	public AuthenticationToken getAutthentication(){
		Credentials cred = JsonPath.parse(new ResourceJsonReader().getOauthCredentials()).read("$", Credentials.class);
		Map<String,String> formParam = new HashMap<String, String>();
		formParam.put("grant_type", cred.getGrant_type());
		formParam.put("api_key", cred.getApi_key());
		formParam.put("client_id", cred.getClient_id());
		formParam.put("client_secret", cred.getClient_secret());
		return new PostRequest().postRequestWithJsonBody(oauthEndPoint, formParam).as(AuthenticationToken.class);
	}
	
	
	
	
}
