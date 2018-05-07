package oauthtest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import models.oauth.AuthenticationToken;
import services.OauthTokenService;

public class OauthTokenTest {

	OauthTokenService oAuth;
	
	@BeforeMethod
	public void initialize(){
		oAuth = new OauthTokenService();
	}
	
	@Test
	public void Verify_Token_Is_Not_Empty(){
		AuthenticationToken tokenPojo = oAuth.getAutthentication();
		System.out.println(tokenPojo.getAccess_token());
		Assert.assertNotNull(tokenPojo.getAccess_token());
		Assert.assertNotNull(tokenPojo.getExpires_in());
		Assert.assertEquals(tokenPojo.getToken_type(), "bearer");
	}
}
