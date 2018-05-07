package resourcereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.jayway.jsonpath.JsonPath;

public class EndPointReader {

	private Object endPoints;
	private String parameterReplacementRegex = "\\$\\{.+?\\}";
	private String domain_url;

	public EndPointReader() {
		endPoints = JsonPath.read(readFromStream().toString(), "$");
		domain_url = new ResourceJsonReader().getDomainURL();

	}

	// ************************************** OAuth End Points ************************************************

	public String getOauthTokenEndPoint() {
		return domain_url + JsonPath.read(endPoints, "$.oauth.token_url");
	}

	// ******************************************* Auth End Points  ***************************

	public String getAllAccountsEndPoint() {
		return domain_url + JsonPath.read(endPoints, "$.auth.accounts.get_allaccounts");
	}
	
	public String getAccountDetailEndPoint(String accountId) {
		return (domain_url + JsonPath.read(endPoints, "$.auth.accounts.get_account")).replaceFirst("\\$\\{.+?\\}", accountId);
	}
	
	public String getListOfDocTypesEndPoint(){
		return domain_url+JsonPath.read(endPoints, "$.esignature.get_list_of_doctypes");
	}
	

	// *****************************************************************************************

	// ******************************************* Accounts End Points ***************************

		public String getAccountEndPoint(String accountId) {
			return (domain_url + JsonPath.read(endPoints, "$.accounts.account_id")).replaceFirst("\\$\\{.+?\\}", accountId);
		}
		

		public String getClientAccountEndPoint(String accountId, String locationId) {
			
			return ((domain_url + JsonPath.read(endPoints, "$.accounts.location_id")).replaceFirst("\\$\\{.+?\\}", accountId)).replaceFirst("\\$\\{.+?\\}", locationId);
		}
		
		public String getClientAccountEndPoint2(String accountId, String locationId, String clientId) {

			return (((domain_url + JsonPath.read(endPoints, "$.accounts.client_id")).replaceFirst("\\$\\{.+?\\}", accountId)).replaceFirst("\\$\\{.+?\\}", locationId)).replaceFirst("\\$\\{.+?\\}",clientId);
		
		}

   // *****************************************************************************************

	
	// *************************** Students ***********************************************************
		
	
	public String createNewStudentEndPoint(){
		return domain_url + JsonPath.read(endPoints, "$.students.create_new_student");
	}
	
	public String cancelStudentEndPoint(String accountId,String alternativeId){
		return ((domain_url + JsonPath.read(endPoints,"$.students.cancel_a_student")).replaceAll(parameterReplacementRegex, accountId)).replaceFirst(parameterReplacementRegex, alternativeId);
	}
	
	public String getStudentInformationEndPoint(String accountId,String studentId){
		return ((domain_url + JsonPath.read(endPoints, "$.students.get_student_information")).replaceAll(parameterReplacementRegex, accountId)).replaceFirst(parameterReplacementRegex, studentId);
	}
	
	public String getStudentStausEndPoint(String accountId,String studentId){
		return ((domain_url + JsonPath.read(endPoints, "$.students.retrieve_current_student_status")).replaceAll(parameterReplacementRegex, accountId)).replaceFirst(parameterReplacementRegex, studentId);
	}
	
	//**************************************************************************************************
	
	private StringBuilder readFromStream() {
		InputStream in = getClass().getResourceAsStream("/endpoints/endpoints.json");
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String line = "";
		StringBuilder responseStrBuilder = new StringBuilder();
		try {
			while ((line = reader.readLine()) != null) {

				responseStrBuilder.append(line);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return responseStrBuilder;
	}

	

}
