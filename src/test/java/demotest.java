import java.io.IOException;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import models.oauth.AuthenticationToken;
import models.oauth.Credentials;
import resourcereader.EndPointReader;
import resourcereader.ResourceJsonReader;
import services.OauthTokenService;

public class demotest {

	
	@Test
	public void Test_Resource_Reader() throws IOException{
		//Credentials data  = new Credentials(new ResourceJsonReader());
		Credentials data =  JsonPath.parse(new ResourceJsonReader().getOauthCredentials()).read("$", Credentials.class);
		System.out.println(data.getApi_key());
		System.out.println(data.getClient_id());
		System.out.println(data.getClient_secret());
		System.out.println(data.getGrant_type());
	}
	
	@Test
	public void Test_End_Point() throws IOException{
		EndPointReader endPoint = new EndPointReader();
		System.out.println(endPoint.getOauthTokenEndPoint());
	}
	
	@Test
	public void Test_Auth_Token() throws IOException{
		OauthTokenService token = new OauthTokenService();
		AuthenticationToken authentication = token.getAutthentication();
		System.out.println(authentication.getAccess_token());
		System.out.println(authentication.getExpires_in());
		System.out.println(authentication.getToken_type());
		
	}
}
