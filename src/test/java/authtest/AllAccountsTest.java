package authtest;

import org.testng.annotations.Test;

import models.auth.AccountInfo;
import services.AuthServices;

public class AllAccountsTest {

	AuthServices authService;
	
	@Test
	public void GetAllAccounts(){
		authService = new AuthServices();
		System.out.println(authService.getAllAccounts());
	}
	
	@Test
	public void Get_Account_By_Id(){
		authService = new AuthServices();
		AccountInfo accountInfo =  authService.getAccountById("141982");
		System.out.println(accountInfo.getAccount_id());
	}
}
