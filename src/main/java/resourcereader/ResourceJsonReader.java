package resourcereader;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;

public class ResourceJsonReader {

	private Object data;
	private String domainURL;

	public ResourceJsonReader(){
		try {
			data = JsonPath.read(new File(System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
					+ File.separator + "resources" + File.separator + "environment" + File.separator + "stage.json"), "$");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		domainURL = JsonPath.read(data, "$.domain.domain_url");
	}

	public String getDomainURL() {
		return domainURL;
	}

	
	public Object getOauthCredentials() {
		return JsonPath.read(data, "$.credentials");
	}

}
