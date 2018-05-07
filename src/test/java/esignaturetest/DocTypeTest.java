package esignaturetest;

import org.testng.annotations.Test;

import services.EsignatureService;

public class DocTypeTest {

	
	@Test
	public void getDocType(){
		EsignatureService esign = new EsignatureService();
		System.out.println(esign.getAllDocTypes());
	}
}
