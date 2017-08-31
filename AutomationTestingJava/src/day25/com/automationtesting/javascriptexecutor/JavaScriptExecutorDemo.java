package day25.com.automationtesting.javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/KRISHNA VOLUME/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value='selenium@gmail.com'");

		Thread.sleep(5000);

		js.executeScript("document.querySelector('#email').value='webdriver@gmail.com'");

	}
}
