package models.oauth;

import com.jayway.jsonpath.JsonPath;

import resourcereader.ResourceJsonReader;

public class Credentials {

	private String client_secret;

	private String grant_type;

	private String api_key;

	private String client_id;

	public Credentials(ResourceJsonReader resourceReader) {
		Object credentailsJson = resourceReader.getOauthCredentials();
		client_secret = JsonPath.read(credentailsJson, "$.client_secret");
		client_id = JsonPath.read(credentailsJson, "$.client_id");
		api_key = JsonPath.read(credentailsJson, "$.api_key");
		grant_type = JsonPath.read(credentailsJson, "$.grant_type");
	}

	public Credentials() {

	}

	public String getClient_secret() {
		return client_secret;
	}

	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}

	public String getGrant_type() {
		return grant_type;
	}

	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}

	public String getApi_key() {
		return api_key;
	}

	public void setApi_key(String api_key) {
		this.api_key = api_key;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	/*@Override
	public String toString() {
		return "ClassPojo [client_secret = " + client_secret + ", grant_type = " + grant_type + ", api_key = " + api_key
				+ ", client_id = " + client_id + "]";
	}*/

}
