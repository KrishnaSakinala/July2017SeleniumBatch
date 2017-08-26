package day22.com.automationtesting.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInSameClass {

	// Taking data from the dataprovider with in the class
	@Test(dataProvider = "xyz")
	public void testCase1(String data) {
		System.out.println("Data from the Data Provider: " + data);
	}

	// Taking data from the dataprovider from other class
	@Test(dataProvider = "abc", dataProviderClass = DataProviderClass.class)
	public void testCase2(String data) {
		System.out.println("Data from the Data Provider: " + data);
	}

	@DataProvider(name = "xyz")
	public Object[][] dataProvider() {

		return new Object[][] { { "data one" }, { "data two" } };
	}

}
