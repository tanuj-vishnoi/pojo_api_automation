package services;

import httpclient.GetRequest;
import resourcereader.EndPointReader;

public class EsignatureService {

	
	EndPointReader endPointReader;

	public EsignatureService() {
		endPointReader = new EndPointReader();
	}

	public String getAllDocTypes() {
		return new GetRequest().GetRequestWithOauth(endPointReader.getListOfDocTypesEndPoint()).asString();
	}

	/*
	 * public AccountInfo getAccountInfo(String accountId){ List<Object>
	 * accountInfo =
	 * JsonPath.parse(getAllAccounts()).read("$..[?(@.account_id==" + accountId
	 * + ")]"); return
	 * JsonPath.parse(accountInfo.get(0)).read("$",AccountInfo.class); }
	 */

/*	public AccountInfo getAccountById(String accountId) {
		// System.out.println(new
		// GetRequest().GetRequestWithOauth(endPointReader.getAccountDetailEndPoint(accountId)).asString());
		return new GetRequest().GetRequestWithOauth(endPointReader.getAccountDetailEndPoint(accountId))
				.as(AccountInfo.class);
	}*/
	
}
