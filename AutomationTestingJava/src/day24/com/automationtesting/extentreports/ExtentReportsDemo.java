package day24.com.automationtesting.extentreports;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemo {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void startReport() {

		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/MyOwnExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("OS", "Mac Sierra");
		extent.setSystemInfo("Host Name", "Krishna Sakinala");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User Name", "Krishna Sakinala");

		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Extent Demo Report");
		htmlReporter.config().setReportName("My Own HTML Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		htmlReporter.config().setTheme(Theme.STANDARD);

	}

	@Test
	public void testPass() {
		test = extent.createTest("testPass", "This test is for to show how pass test will be in Report");
		test.log(Status.INFO, "I am in Pass Testcase");
		test.log(Status.INFO, "Entered user name in username textbox");
		test.log(Status.INFO, "Entered password in password textbox");
		test.log(Status.INFO, "Clicked on submit button");
		Assert.assertTrue(true);
	}

	@Test
	public void testFail() {
		test = extent.createTest("testFail", "This test is for to show how fail test will be in Report");
		test.log(Status.INFO, "I am in Fail Testcase");
		Assert.assertTrue(false);
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			test.fail(result.getThrowable());
			test.fail(result.getName() + " Test Case Failed");

		} else {
			test.pass(result.getName() + " Test Case Passed");
			// test.log(Status.PASS, "");
		}
	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}
}
