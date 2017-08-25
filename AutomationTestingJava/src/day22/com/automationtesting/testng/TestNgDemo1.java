package day22.com.automationtesting.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo1 {

	@Test
	public void testCase6() {
		Assert.assertEquals("Selenium", "WebDriver");
	}

	@Test
	public void testCase7() {
		Assert.assertEquals("Selenium", "Selenium");
	}

	@Test
	public void testCase8() {
		Assert.assertTrue(1 < 0);
	}

	@Test
	public void testCase9() {
		Assert.assertTrue(true);
	}

	@Test
	public void testCase10() {
		Assert.assertFalse(false);
	}

}
