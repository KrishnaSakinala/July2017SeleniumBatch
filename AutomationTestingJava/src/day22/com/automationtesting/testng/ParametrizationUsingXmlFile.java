package day22.com.automationtesting.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationUsingXmlFile {

	@Parameters({ "suitelevelparam" })
	@Test
	public void testCase1(String param) {

		System.out.println("Parameter Value is: " + param);

	}

	@Parameters({ "testlevelparam" })
	@Test
	public void testCase2(String param) {

		System.out.println("Parameter Value is: " + param);

	}

}
