package accounttest;

import org.testng.annotations.Test;

import models.accounts.AccountDetails;
import services.AccountsService;

public class AccountTest {

	@Test
	public void Test_Account_Details()
	{
		AccountsService accountservice = new AccountsService();
		AccountDetails accountDetails = accountservice.retrieveParentAccount("145396");
		System.out.println(accountDetails.getName());
	}
	
	@Test
	public void Test_Get_Client_Account_Details()
	{
		AccountsService accountservice = new AccountsService();
		AccountDetails accountDetails = accountservice.retrieveClientAccount("144879", "00");
		System.out.println(accountDetails.getAddress());
	}
	
	@Test
	public void Test_Retrieve_Client_Account_2()
	{
		AccountsService accountservice = new AccountsService();
		AccountDetails accountDetails = accountservice.retrieveClientAccount2("144879", "00", "00");
		System.out.println(accountDetails.getAddress());
	}
}
