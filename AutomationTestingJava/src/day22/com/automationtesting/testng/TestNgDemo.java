package day22.com.automationtesting.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo {

	@Test
	public void testCase1() {
		Assert.assertEquals("Selenium", "WebDriver");
	}

	@Test(enabled = false)
	public void testCase5() {
		Assert.assertFalse(false);
	}

	@Test
	public void testCase3() {
		Assert.assertTrue(1 < 0);
	}

	@Test
	public void testCase4() {
		Assert.assertTrue(true);
	}

	@Test
	public void testCase2() {
		Assert.assertEquals("Selenium", "Selenium");
	}

}
