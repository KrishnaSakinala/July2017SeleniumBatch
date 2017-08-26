package day22.com.automationtesting.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithMultipleParameters {

	@Test(dataProvider = "dataProviderForTestCase")
	public void testCase(String firstName, String lastName, String email) {
		System.out.println("First Name is: " + firstName);
		System.out.println("First Name is: " + lastName);
		System.out.println("First Name is: " + email);
	}

	@DataProvider
	public Object[][] dataProviderForTestCase() {

		Object[][] data = new Object[3][3];

		data[0][0] = "FirstName1";
		data[0][1] = "LastName1";
		data[0][2] = "Email1";

		data[1][0] = "FirstName2";
		data[1][1] = "LastName2";
		data[1][2] = "Email2";

		data[2][0] = "FirstName3";
		data[2][1] = "LastName3";
		data[2][2] = "Email3";

		return data;

	}

}
