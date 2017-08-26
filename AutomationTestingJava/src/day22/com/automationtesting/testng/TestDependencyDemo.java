package day22.com.automationtesting.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependencyDemo {

	@Test
	public void testCase1() {
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = { "testCase1" })
	public void testCase2() {
		Assert.assertEquals(1, 2);
	}

}
