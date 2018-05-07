package services;

import httpclient.GetRequest;
import models.accounts.AccountDetails;
import resourcereader.EndPointReader;

public class AccountsService {

	EndPointReader endPointReader;

	public AccountsService() {
		endPointReader = new EndPointReader();
	}

	public AccountDetails retrieveParentAccount(String accountId) {
		System.out.println(endPointReader.getAccountEndPoint(accountId));
		return new GetRequest().GetRequestWithOauth(endPointReader.getAccountEndPoint(accountId))
				.as(AccountDetails.class);
	}

	public AccountDetails retrieveClientAccount(String accountId, String locationId) {
		System.out.println(endPointReader.getClientAccountEndPoint(accountId, locationId));
		return new GetRequest().GetRequestWithOauth(endPointReader.getClientAccountEndPoint(accountId, locationId))
				.as(AccountDetails.class);
	}

	public AccountDetails retrieveClientAccount2(String accountId, String locationId, String clientId) {
		System.out.println(endPointReader.getClientAccountEndPoint2(accountId, locationId, clientId));
		return new GetRequest()
				.GetRequestWithOauth(endPointReader.getClientAccountEndPoint2(accountId, locationId, clientId))
				.as(AccountDetails.class);
	}
}
