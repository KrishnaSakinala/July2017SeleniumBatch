package day22.com.automationtesting.testng;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "abc")
	public Object[][] dataProvider() {

		return new Object[][] { { "data three" }, { "data four" } };
	}

}
